package com.example.android_th2.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.android_th2.fragment.HistoryFragment;
import com.example.android_th2.fragment.HomeFragment;
import com.example.android_th2.fragment.SearchFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new HomeFragment();
            case 1: return new HistoryFragment();
            case 2: return new SearchFragment();

        }
        return new HomeFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }


    // trường hợp tablayout
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "HÔM NAY";
            case 1:
                return "LỊCH SỬ";
            case 2:
                return "TÌM KIẾM";
        }
        return null;
    }
}
