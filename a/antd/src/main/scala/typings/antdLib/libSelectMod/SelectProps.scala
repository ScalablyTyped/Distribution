package typings
package antdLib.libSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps[T] extends AbstractSelectProps {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var clearIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var defaultValue: js.UndefOr[T] = js.undefined
  var firstActiveValue: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var getInputElement: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactElement[_]]] = js.undefined
  var labelInValue: js.UndefOr[scala.Boolean] = js.undefined
  var maxTagCount: js.UndefOr[scala.Double] = js.undefined
  var maxTagPlaceholder: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactNode | (js.Function1[/* omittedValues */ js.Array[T], reactLib.reactMod.ReactNs.ReactNode])
  ] = js.undefined
  var menuItemSelectedIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var mode: js.UndefOr[
    antdLib.antdLibStrings.default | antdLib.antdLibStrings.multiple | antdLib.antdLibStrings.tags | antdLib.antdLibStrings.combobox | java.lang.String
  ] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* value */ T, 
      /* option */ reactLib.reactMod.ReactNs.ReactElement[_] | js.Array[reactLib.reactMod.ReactNs.ReactElement[_]], 
      scala.Unit
    ]
  ] = js.undefined
  var onDeselect: js.UndefOr[js.Function1[/* value */ T, _]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onInputKeyDown: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLInputElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      _
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      _
    ]
  ] = js.undefined
  var onPopupScroll: js.UndefOr[reactLib.reactMod.ReactNs.UIEventHandler[reactLib.HTMLDivElement]] = js.undefined
  var onSelect: js.UndefOr[
    js.Function2[/* value */ T, /* option */ reactLib.reactMod.ReactNs.ReactElement[_], _]
  ] = js.undefined
  var optionFilterProp: js.UndefOr[java.lang.String] = js.undefined
  var optionLabelProp: js.UndefOr[java.lang.String] = js.undefined
  var removeIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var suffixIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
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
    clearIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    defaultActiveFirstOption: js.UndefOr[scala.Boolean] = js.undefined,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: T = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownClassName: java.lang.String = null,
    dropdownMatchSelectWidth: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownMenuStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    dropdownRender: js.Function2[
      /* menu */ js.UndefOr[reactLib.reactMod.ReactNs.ReactNode], 
      /* props */ js.UndefOr[SelectProps[SelectValue]], 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    dropdownStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    filterOption: scala.Boolean | (js.Function2[
      /* inputValue */ java.lang.String, 
      /* option */ reactLib.reactMod.ReactNs.ReactElement[OptionProps], 
      _
    ]) = null,
    firstActiveValue: java.lang.String | js.Array[java.lang.String] = null,
    getInputElement: js.Function0[reactLib.reactMod.ReactNs.ReactElement[_]] = null,
    getPopupContainer: js.Function1[/* triggerNode */ js.UndefOr[reactLib.Element], reactLib.HTMLElement] = null,
    id: java.lang.String = null,
    labelInValue: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    maxTagCount: scala.Int | scala.Double = null,
    maxTagPlaceholder: reactLib.reactMod.ReactNs.ReactNode | (js.Function1[/* omittedValues */ js.Array[T], reactLib.reactMod.ReactNs.ReactNode]) = null,
    menuItemSelectedIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    mode: antdLib.antdLibStrings.default | antdLib.antdLibStrings.multiple | antdLib.antdLibStrings.tags | antdLib.antdLibStrings.combobox | java.lang.String = null,
    notFoundContent: reactLib.reactMod.ReactNs.ReactNode = null,
    onBlur: js.Function1[/* value */ T, scala.Unit] = null,
    onChange: js.Function2[
      /* value */ T, 
      /* option */ reactLib.reactMod.ReactNs.ReactElement[_] | js.Array[reactLib.reactMod.ReactNs.ReactElement[_]], 
      scala.Unit
    ] = null,
    onDeselect: js.Function1[/* value */ T, _] = null,
    onDropdownVisibleChange: js.Function1[/* open */ scala.Boolean, scala.Unit] = null,
    onFocus: js.Function0[scala.Unit] = null,
    onInputKeyDown: js.Function1[
      /* e */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLInputElement], 
      scala.Unit
    ] = null,
    onMouseEnter: js.Function1[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      _
    ] = null,
    onMouseLeave: js.Function1[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      _
    ] = null,
    onPopupScroll: reactLib.reactMod.ReactNs.UIEventHandler[reactLib.HTMLDivElement] = null,
    onSearch: js.Function1[/* value */ java.lang.String, _] = null,
    onSelect: js.Function2[/* value */ T, /* option */ reactLib.reactMod.ReactNs.ReactElement[_], _] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    optionFilterProp: java.lang.String = null,
    optionLabelProp: java.lang.String = null,
    placeholder: java.lang.String | reactLib.reactMod.ReactNs.ReactNode = null,
    prefixCls: java.lang.String = null,
    removeIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    showAction: java.lang.String | js.Array[java.lang.String] = null,
    showArrow: js.UndefOr[scala.Boolean] = js.undefined,
    showSearch: js.UndefOr[scala.Boolean] = js.undefined,
    size: /* import warning: ImportType.apply Failed type conversion: ['default', 'large', 'small'][number] */ js.Any = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    suffixIcon: reactLib.reactMod.ReactNs.ReactNode = null,
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
    if (dropdownRender != null) __obj.updateDynamic("dropdownRender")(dropdownRender)
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle)
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (firstActiveValue != null) __obj.updateDynamic("firstActiveValue")(firstActiveValue.asInstanceOf[js.Any])
    if (getInputElement != null) __obj.updateDynamic("getInputElement")(getInputElement)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(getPopupContainer)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(labelInValue)) __obj.updateDynamic("labelInValue")(labelInValue)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (maxTagCount != null) __obj.updateDynamic("maxTagCount")(maxTagCount.asInstanceOf[js.Any])
    if (maxTagPlaceholder != null) __obj.updateDynamic("maxTagPlaceholder")(maxTagPlaceholder.asInstanceOf[js.Any])
    if (menuItemSelectedIcon != null) __obj.updateDynamic("menuItemSelectedIcon")(menuItemSelectedIcon.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(onDeselect)
    if (onDropdownVisibleChange != null) __obj.updateDynamic("onDropdownVisibleChange")(onDropdownVisibleChange)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onInputKeyDown != null) __obj.updateDynamic("onInputKeyDown")(onInputKeyDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onPopupScroll != null) __obj.updateDynamic("onPopupScroll")(onPopupScroll)
    if (onSearch != null) __obj.updateDynamic("onSearch")(onSearch)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (optionFilterProp != null) __obj.updateDynamic("optionFilterProp")(optionFilterProp)
    if (optionLabelProp != null) __obj.updateDynamic("optionLabelProp")(optionLabelProp)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.asInstanceOf[js.Any])
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow)
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tokenSeparators != null) __obj.updateDynamic("tokenSeparators")(tokenSeparators)
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps[T]]
  }
}

