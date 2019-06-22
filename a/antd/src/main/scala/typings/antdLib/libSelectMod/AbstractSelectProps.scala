package typings
package antdLib.libSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractSelectProps extends js.Object {
  var allowClear: js.UndefOr[scala.Boolean] = js.undefined
  var autoClearSearchValue: js.UndefOr[scala.Boolean] = js.undefined
  var choiceTransitionName: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultActiveFirstOption: js.UndefOr[scala.Boolean] = js.undefined
  var defaultOpen: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dropdownClassName: js.UndefOr[java.lang.String] = js.undefined
  var dropdownMatchSelectWidth: js.UndefOr[scala.Boolean] = js.undefined
  var dropdownMenuStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var dropdownRender: js.UndefOr[
    js.Function2[
      /* menu */ js.UndefOr[reactLib.reactMod.ReactNode], 
      /* props */ js.UndefOr[SelectProps[SelectValue]], 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var dropdownStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var filterOption: js.UndefOr[
    scala.Boolean | (js.Function2[
      /* inputValue */ java.lang.String, 
      /* option */ reactLib.reactMod.ReactElement, 
      scala.Boolean
    ])
  ] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ stdLib.HTMLElement, stdLib.HTMLElement]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  var notFoundContent: js.UndefOr[reactLib.reactMod.ReactNode | scala.Null] = js.undefined
  var onDropdownVisibleChange: js.UndefOr[js.Function1[/* open */ scala.Boolean, scala.Unit]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var placeholder: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNode] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var showAction: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var showArrow: js.UndefOr[scala.Boolean] = js.undefined
  var showSearch: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    antdLib.antdLibStrings.default | antdLib.antdLibStrings.large | antdLib.antdLibStrings.small
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
}

object AbstractSelectProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[scala.Boolean] = js.undefined,
    autoClearSearchValue: js.UndefOr[scala.Boolean] = js.undefined,
    choiceTransitionName: java.lang.String = null,
    className: java.lang.String = null,
    defaultActiveFirstOption: js.UndefOr[scala.Boolean] = js.undefined,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownClassName: java.lang.String = null,
    dropdownMatchSelectWidth: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownMenuStyle: reactLib.reactMod.CSSProperties = null,
    dropdownRender: (/* menu */ js.UndefOr[reactLib.reactMod.ReactNode], /* props */ js.UndefOr[SelectProps[SelectValue]]) => reactLib.reactMod.ReactNode = null,
    dropdownStyle: reactLib.reactMod.CSSProperties = null,
    filterOption: scala.Boolean | (js.Function2[
      /* inputValue */ java.lang.String, 
      /* option */ reactLib.reactMod.ReactElement, 
      scala.Boolean
    ]) = null,
    getPopupContainer: /* triggerNode */ stdLib.HTMLElement => stdLib.HTMLElement = null,
    id: java.lang.String = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    notFoundContent: reactLib.reactMod.ReactNode = null,
    onDropdownVisibleChange: /* open */ scala.Boolean => scala.Unit = null,
    onSearch: /* value */ java.lang.String => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: java.lang.String | reactLib.reactMod.ReactNode = null,
    prefixCls: java.lang.String = null,
    showAction: java.lang.String | js.Array[java.lang.String] = null,
    showArrow: js.UndefOr[scala.Boolean] = js.undefined,
    showSearch: js.UndefOr[scala.Boolean] = js.undefined,
    size: antdLib.antdLibStrings.default | antdLib.antdLibStrings.large | antdLib.antdLibStrings.small = null,
    style: reactLib.reactMod.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    transitionName: java.lang.String = null
  ): AbstractSelectProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (!js.isUndefined(autoClearSearchValue)) __obj.updateDynamic("autoClearSearchValue")(autoClearSearchValue)
    if (choiceTransitionName != null) __obj.updateDynamic("choiceTransitionName")(choiceTransitionName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName)
    if (!js.isUndefined(dropdownMatchSelectWidth)) __obj.updateDynamic("dropdownMatchSelectWidth")(dropdownMatchSelectWidth)
    if (dropdownMenuStyle != null) __obj.updateDynamic("dropdownMenuStyle")(dropdownMenuStyle)
    if (dropdownRender != null) __obj.updateDynamic("dropdownRender")(js.Any.fromFunction2(dropdownRender))
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle)
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onDropdownVisibleChange != null) __obj.updateDynamic("onDropdownVisibleChange")(js.Any.fromFunction1(onDropdownVisibleChange))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow)
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    __obj.asInstanceOf[AbstractSelectProps]
  }
}

