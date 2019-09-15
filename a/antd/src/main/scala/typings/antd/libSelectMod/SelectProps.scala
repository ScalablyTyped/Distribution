package typings.antd.libSelectMod

import typings.antd.antdStrings.combobox
import typings.antd.antdStrings.large
import typings.antd.antdStrings.multiple
import typings.antd.antdStrings.small
import typings.antd.antdStrings.tags
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.UIEvent
import typings.react.reactMod.UIEventHandler
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps[T] extends AbstractSelectProps {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var clearIcon: js.UndefOr[ReactNode] = js.undefined
  var defaultValue: js.UndefOr[T] = js.undefined
  var firstActiveValue: js.UndefOr[String | js.Array[String]] = js.undefined
  var getInputElement: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  /** @deprecated Use `searchValue` instead. */
  var inputValue: js.UndefOr[String] = js.undefined
  var labelInValue: js.UndefOr[Boolean] = js.undefined
  var maxTagCount: js.UndefOr[Double] = js.undefined
  var maxTagPlaceholder: js.UndefOr[ReactNode | (js.Function1[/* omittedValues */ js.Array[T], ReactNode])] = js.undefined
  var maxTagTextLength: js.UndefOr[Double] = js.undefined
  var menuItemSelectedIcon: js.UndefOr[ReactNode] = js.undefined
  var mode: js.UndefOr[typings.antd.antdStrings.default | multiple | tags | combobox | String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* value */ T, /* option */ ReactElement | js.Array[ReactElement], Unit]
  ] = js.undefined
  var onDeselect: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onInputKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLInputElement], Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLInputElement, NativeMouseEvent], Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLInputElement, NativeMouseEvent], Unit]] = js.undefined
  var onPopupScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* value */ T, /* option */ ReactElement, Unit]] = js.undefined
  var optionFilterProp: js.UndefOr[String] = js.undefined
  var optionLabelProp: js.UndefOr[String] = js.undefined
  var removeIcon: js.UndefOr[ReactNode] = js.undefined
  var searchValue: js.UndefOr[String] = js.undefined
  var suffixIcon: js.UndefOr[ReactNode] = js.undefined
  var tokenSeparators: js.UndefOr[js.Array[String]] = js.undefined
  var value: js.UndefOr[T] = js.undefined
}

object SelectProps {
  @scala.inline
  def apply[T](
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoClearSearchValue: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    choiceTransitionName: String = null,
    className: String = null,
    clearIcon: ReactNode = null,
    defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: T = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdownClassName: String = null,
    dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined,
    dropdownMenuStyle: CSSProperties = null,
    dropdownRender: (/* menu */ js.UndefOr[ReactNode], /* props */ js.UndefOr[SelectProps[SelectValue]]) => ReactNode = null,
    dropdownStyle: CSSProperties = null,
    filterOption: Boolean | (js.Function2[/* inputValue */ String, /* option */ ReactElement, Boolean]) = null,
    firstActiveValue: String | js.Array[String] = null,
    getInputElement: () => ReactElement = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    id: String = null,
    inputValue: String = null,
    labelInValue: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    maxTagCount: Int | Double = null,
    maxTagPlaceholder: ReactNode | (js.Function1[/* omittedValues */ js.Array[T], ReactNode]) = null,
    maxTagTextLength: Int | Double = null,
    menuItemSelectedIcon: ReactNode = null,
    mode: typings.antd.antdStrings.default | multiple | tags | combobox | String = null,
    notFoundContent: ReactNode = null,
    onBlur: /* value */ T => Unit = null,
    onChange: (/* value */ T, /* option */ ReactElement | js.Array[ReactElement]) => Unit = null,
    onDeselect: /* value */ T => Unit = null,
    onDropdownVisibleChange: /* open */ Boolean => Unit = null,
    onFocus: () => Unit = null,
    onInputKeyDown: /* e */ KeyboardEvent[HTMLInputElement] => Unit = null,
    onMouseEnter: /* e */ MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: /* e */ MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit = null,
    onPopupScroll: UIEvent[HTMLDivElement] => Unit = null,
    onSearch: /* value */ String => Unit = null,
    onSelect: (/* value */ T, /* option */ ReactElement) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    optionFilterProp: String = null,
    optionLabelProp: String = null,
    placeholder: String | ReactNode = null,
    prefixCls: String = null,
    removeIcon: ReactNode = null,
    searchValue: String = null,
    showAction: String | js.Array[String] = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    size: typings.antd.antdStrings.default | large | small = null,
    style: CSSProperties = null,
    suffixIcon: ReactNode = null,
    tabIndex: Int | Double = null,
    tokenSeparators: js.Array[String] = null,
    transitionName: String = null,
    value: T = null
  ): SelectProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (!js.isUndefined(autoClearSearchValue)) __obj.updateDynamic("autoClearSearchValue")(autoClearSearchValue)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (choiceTransitionName != null) __obj.updateDynamic("choiceTransitionName")(choiceTransitionName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName)
    if (!js.isUndefined(dropdownMatchSelectWidth)) __obj.updateDynamic("dropdownMatchSelectWidth")(dropdownMatchSelectWidth)
    if (dropdownMenuStyle != null) __obj.updateDynamic("dropdownMenuStyle")(dropdownMenuStyle)
    if (dropdownRender != null) __obj.updateDynamic("dropdownRender")(js.Any.fromFunction2(dropdownRender))
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle)
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (firstActiveValue != null) __obj.updateDynamic("firstActiveValue")(firstActiveValue.asInstanceOf[js.Any])
    if (getInputElement != null) __obj.updateDynamic("getInputElement")(js.Any.fromFunction0(getInputElement))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue)
    if (!js.isUndefined(labelInValue)) __obj.updateDynamic("labelInValue")(labelInValue)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (maxTagCount != null) __obj.updateDynamic("maxTagCount")(maxTagCount.asInstanceOf[js.Any])
    if (maxTagPlaceholder != null) __obj.updateDynamic("maxTagPlaceholder")(maxTagPlaceholder.asInstanceOf[js.Any])
    if (maxTagTextLength != null) __obj.updateDynamic("maxTagTextLength")(maxTagTextLength.asInstanceOf[js.Any])
    if (menuItemSelectedIcon != null) __obj.updateDynamic("menuItemSelectedIcon")(menuItemSelectedIcon.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onDropdownVisibleChange != null) __obj.updateDynamic("onDropdownVisibleChange")(js.Any.fromFunction1(onDropdownVisibleChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onInputKeyDown != null) __obj.updateDynamic("onInputKeyDown")(js.Any.fromFunction1(onInputKeyDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onPopupScroll != null) __obj.updateDynamic("onPopupScroll")(js.Any.fromFunction1(onPopupScroll))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (optionFilterProp != null) __obj.updateDynamic("optionFilterProp")(optionFilterProp)
    if (optionLabelProp != null) __obj.updateDynamic("optionLabelProp")(optionLabelProp)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.asInstanceOf[js.Any])
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue)
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow)
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tokenSeparators != null) __obj.updateDynamic("tokenSeparators")(tokenSeparators)
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps[T]]
  }
}

