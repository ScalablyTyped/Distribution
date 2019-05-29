package typings
package antdLib.esSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps[T] extends AbstractSelectProps {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var clearIcon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var defaultValue: js.UndefOr[T] = js.undefined
  var firstActiveValue: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var getInputElement: js.UndefOr[js.Function0[reactLib.reactMod.ReactElement[_]]] = js.undefined
  var labelInValue: js.UndefOr[scala.Boolean] = js.undefined
  var maxTagCount: js.UndefOr[scala.Double] = js.undefined
  var maxTagPlaceholder: js.UndefOr[
    reactLib.reactMod.ReactNode | (js.Function1[/* omittedValues */ js.Array[T], reactLib.reactMod.ReactNode])
  ] = js.undefined
  var maxTagTextLength: js.UndefOr[scala.Double] = js.undefined
  var menuItemSelectedIcon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var mode: js.UndefOr[
    antdLib.antdLibStrings.default | antdLib.antdLibStrings.multiple | antdLib.antdLibStrings.tags | antdLib.antdLibStrings.combobox | java.lang.String
  ] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* value */ T, 
      /* option */ reactLib.reactMod.ReactElement[_] | js.Array[reactLib.reactMod.ReactElement[_]], 
      scala.Unit
    ]
  ] = js.undefined
  var onDeselect: js.UndefOr[js.Function1[/* value */ T, _]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onInputKeyDown: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLInputElement], scala.Unit]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      _
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      _
    ]
  ] = js.undefined
  var onPopupScroll: js.UndefOr[reactLib.reactMod.UIEventHandler[stdLib.HTMLDivElement]] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* value */ T, /* option */ reactLib.reactMod.ReactElement[_], _]] = js.undefined
  var optionFilterProp: js.UndefOr[java.lang.String] = js.undefined
  var optionLabelProp: js.UndefOr[java.lang.String] = js.undefined
  var removeIcon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var suffixIcon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var tokenSeparators: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var value: js.UndefOr[T] = js.undefined
}

object SelectProps {
  @scala.inline
  def apply[T](
    allowClear: js.UndefOr[scala.Boolean] = js.undefined,
    autoClearSearchValue: js.UndefOr[scala.Boolean] = js.undefined,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    choiceTransitionName: java.lang.String = null,
    className: java.lang.String = null,
    clearIcon: reactLib.reactMod.ReactNode = null,
    defaultActiveFirstOption: js.UndefOr[scala.Boolean] = js.undefined,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: T = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownClassName: java.lang.String = null,
    dropdownMatchSelectWidth: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownMenuStyle: reactLib.reactMod.CSSProperties = null,
    dropdownRender: (/* menu */ js.UndefOr[reactLib.reactMod.ReactNode], /* props */ js.UndefOr[SelectProps[SelectValue]]) => reactLib.reactMod.ReactNode = null,
    dropdownStyle: reactLib.reactMod.CSSProperties = null,
    filterOption: scala.Boolean | (js.Function2[
      /* inputValue */ java.lang.String, 
      /* option */ reactLib.reactMod.ReactElement[OptionProps], 
      _
    ]) = null,
    firstActiveValue: java.lang.String | js.Array[java.lang.String] = null,
    getInputElement: () => reactLib.reactMod.ReactElement[_] = null,
    getPopupContainer: /* triggerNode */ stdLib.HTMLElement => stdLib.HTMLElement = null,
    id: java.lang.String = null,
    labelInValue: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    maxTagCount: scala.Int | scala.Double = null,
    maxTagPlaceholder: reactLib.reactMod.ReactNode | (js.Function1[/* omittedValues */ js.Array[T], reactLib.reactMod.ReactNode]) = null,
    maxTagTextLength: scala.Int | scala.Double = null,
    menuItemSelectedIcon: reactLib.reactMod.ReactNode = null,
    mode: antdLib.antdLibStrings.default | antdLib.antdLibStrings.multiple | antdLib.antdLibStrings.tags | antdLib.antdLibStrings.combobox | java.lang.String = null,
    notFoundContent: reactLib.reactMod.ReactNode = null,
    onBlur: /* value */ T => scala.Unit = null,
    onChange: (/* value */ T, /* option */ reactLib.reactMod.ReactElement[_] | js.Array[reactLib.reactMod.ReactElement[_]]) => scala.Unit = null,
    onDeselect: /* value */ T => _ = null,
    onDropdownVisibleChange: /* open */ scala.Boolean => scala.Unit = null,
    onFocus: () => scala.Unit = null,
    onInputKeyDown: /* e */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLInputElement] => scala.Unit = null,
    onMouseEnter: /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLInputElement, reactLib.NativeMouseEvent] => _ = null,
    onMouseLeave: /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLInputElement, reactLib.NativeMouseEvent] => _ = null,
    onPopupScroll: reactLib.reactMod.UIEventHandler[stdLib.HTMLDivElement] = null,
    onSearch: /* value */ java.lang.String => _ = null,
    onSelect: (/* value */ T, /* option */ reactLib.reactMod.ReactElement[_]) => _ = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    optionFilterProp: java.lang.String = null,
    optionLabelProp: java.lang.String = null,
    placeholder: java.lang.String | reactLib.reactMod.ReactNode = null,
    prefixCls: java.lang.String = null,
    removeIcon: reactLib.reactMod.ReactNode = null,
    showAction: java.lang.String | js.Array[java.lang.String] = null,
    showArrow: js.UndefOr[scala.Boolean] = js.undefined,
    showSearch: js.UndefOr[scala.Boolean] = js.undefined,
    size: antdLib.antdLibStrings.default | antdLib.antdLibStrings.large | antdLib.antdLibStrings.small = null,
    style: reactLib.reactMod.CSSProperties = null,
    suffixIcon: reactLib.reactMod.ReactNode = null,
    tabIndex: scala.Int | scala.Double = null,
    tokenSeparators: js.Array[java.lang.String] = null,
    transitionName: java.lang.String = null,
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
    if (onPopupScroll != null) __obj.updateDynamic("onPopupScroll")(onPopupScroll)
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (optionFilterProp != null) __obj.updateDynamic("optionFilterProp")(optionFilterProp)
    if (optionLabelProp != null) __obj.updateDynamic("optionLabelProp")(optionLabelProp)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.asInstanceOf[js.Any])
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

