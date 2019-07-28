package typings.antd.libSelectMod

import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractSelectProps extends js.Object {
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var autoClearSearchValue: js.UndefOr[Boolean] = js.undefined
  var choiceTransitionName: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dropdownClassName: js.UndefOr[String] = js.undefined
  var dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined
  var dropdownMenuStyle: js.UndefOr[CSSProperties] = js.undefined
  var dropdownRender: js.UndefOr[
    js.Function2[
      /* menu */ js.UndefOr[ReactNode], 
      /* props */ js.UndefOr[SelectProps[SelectValue]], 
      ReactNode
    ]
  ] = js.undefined
  var dropdownStyle: js.UndefOr[CSSProperties] = js.undefined
  var filterOption: js.UndefOr[
    Boolean | (js.Function2[/* inputValue */ String, /* option */ ReactElement, Boolean])
  ] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var notFoundContent: js.UndefOr[ReactNode | Null] = js.undefined
  var onDropdownVisibleChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[String | ReactNode] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var showAction: js.UndefOr[String | js.Array[String]] = js.undefined
  var showArrow: js.UndefOr[Boolean] = js.undefined
  var showSearch: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[typings.antd.antdStrings.default | large | small] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
}

object AbstractSelectProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoClearSearchValue: js.UndefOr[Boolean] = js.undefined,
    choiceTransitionName: String = null,
    className: String = null,
    defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdownClassName: String = null,
    dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined,
    dropdownMenuStyle: CSSProperties = null,
    dropdownRender: (/* menu */ js.UndefOr[ReactNode], /* props */ js.UndefOr[SelectProps[SelectValue]]) => ReactNode = null,
    dropdownStyle: CSSProperties = null,
    filterOption: Boolean | (js.Function2[/* inputValue */ String, /* option */ ReactElement, Boolean]) = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    id: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    notFoundContent: ReactNode = null,
    onDropdownVisibleChange: /* open */ Boolean => Unit = null,
    onSearch: /* value */ String => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: String | ReactNode = null,
    prefixCls: String = null,
    showAction: String | js.Array[String] = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    size: typings.antd.antdStrings.default | large | small = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    transitionName: String = null
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

