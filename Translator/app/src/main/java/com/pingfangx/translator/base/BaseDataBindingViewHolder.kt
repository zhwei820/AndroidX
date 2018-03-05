package com.pingfangx.translator.base

import android.databinding.ViewDataBinding

/**
 * DataBinding的view holder
 *
 * @author 刘汝寿
 * @date 2017/9/10
 */
abstract class BaseDataBindingViewHolder<Bean>(binding: ViewDataBinding) : BaseViewHolder<Bean>(binding.root) {
    val mBinding = binding
}