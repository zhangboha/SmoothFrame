package com.sjkj.myapplication.fragment.childFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sjkj.myapplication.R;

public class FmOneTwo extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View make_view = inflater.inflate(R.layout.fm_one_two, null);
        return make_view;
    }


}
