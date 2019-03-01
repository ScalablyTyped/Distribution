package typings
package antdLib.libAutoDashCompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteProps
  extends antdLib.libSelectMod.AbstractSelectProps {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var backfill: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[
    ValidInputElement | reactLib.reactMod.ReactNs.ReactElement[antdLib.libInputInputMod.InputProps] | reactLib.reactMod.ReactNs.ReactElement[antdLib.libSelectMod.OptionProps] | js.Array[reactLib.reactMod.ReactNs.ReactElement[antdLib.libSelectMod.OptionProps]]
  ] = js.undefined
  var dataSource: js.UndefOr[js.Array[DataSourceItemType]] = js.undefined
  var defaultValue: js.UndefOr[antdLib.libSelectMod.SelectValue] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* value */ antdLib.libSelectMod.SelectValue, scala.Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ antdLib.libSelectMod.SelectValue, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSelect: js.UndefOr[
    js.Function2[/* value */ antdLib.libSelectMod.SelectValue, /* option */ js.Object, _]
  ] = js.undefined
  var optionLabelProp: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[antdLib.libSelectMod.SelectValue] = js.undefined
}

object AutoCompleteProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[scala.Boolean] = js.undefined,
    autoClearSearchValue: js.UndefOr[scala.Boolean] = js.undefined,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    backfill: js.UndefOr[scala.Boolean] = js.undefined,
    children: ValidInputElement | reactLib.reactMod.ReactNs.ReactElement[antdLib.libInputInputMod.InputProps] | reactLib.reactMod.ReactNs.ReactElement[antdLib.libSelectMod.OptionProps] | js.Array[reactLib.reactMod.ReactNs.ReactElement[antdLib.libSelectMod.OptionProps]] = null,
    choiceTransitionName: java.lang.String = null,
    className: java.lang.String = null,
    dataSource: js.Array[DataSourceItemType] = null,
    defaultActiveFirstOption: js.UndefOr[scala.Boolean] = js.undefined,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: antdLib.libSelectMod.SelectValue = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownClassName: java.lang.String = null,
    dropdownMatchSelectWidth: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownMenuStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    dropdownRender: js.Function2[
      /* menu */ js.UndefOr[reactLib.reactMod.ReactNs.ReactNode], 
      /* props */ js.UndefOr[antdLib.libSelectMod.SelectProps[antdLib.libSelectMod.SelectValue]], 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    dropdownStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    filterOption: scala.Boolean | (js.Function2[
      /* inputValue */ java.lang.String, 
      /* option */ reactLib.reactMod.ReactNs.ReactElement[antdLib.libSelectMod.OptionProps], 
      _
    ]) = null,
    getPopupContainer: js.Function1[/* triggerNode */ js.UndefOr[reactLib.Element], reactLib.HTMLElement] = null,
    id: java.lang.String = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    notFoundContent: reactLib.reactMod.ReactNs.ReactNode = null,
    onBlur: js.Function1[/* value */ antdLib.libSelectMod.SelectValue, scala.Unit] = null,
    onChange: js.Function1[/* value */ antdLib.libSelectMod.SelectValue, scala.Unit] = null,
    onDropdownVisibleChange: js.Function1[/* open */ scala.Boolean, scala.Unit] = null,
    onFocus: js.Function0[scala.Unit] = null,
    onSearch: js.Function1[/* value */ java.lang.String, _] = null,
    onSelect: js.Function2[/* value */ antdLib.libSelectMod.SelectValue, /* option */ js.Object, _] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    optionLabelProp: java.lang.String = null,
    placeholder: java.lang.String | reactLib.reactMod.ReactNs.ReactNode = null,
    prefixCls: java.lang.String = null,
    showAction: java.lang.String | js.Array[java.lang.String] = null,
    showArrow: js.UndefOr[scala.Boolean] = js.undefined,
    showSearch: js.UndefOr[scala.Boolean] = js.undefined,
    size: /* import warning: ImportType.apply Failed type conversion: ['default', 'large', 'small'][number] */ js.Any = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    transitionName: java.lang.String = null,
    value: antdLib.libSelectMod.SelectValue = null
  ): AutoCompleteProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (!js.isUndefined(autoClearSearchValue)) __obj.updateDynamic("autoClearSearchValue")(autoClearSearchValue)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(backfill)) __obj.updateDynamic("backfill")(backfill)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (choiceTransitionName != null) __obj.updateDynamic("choiceTransitionName")(choiceTransitionName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
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
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(getPopupContainer)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onDropdownVisibleChange != null) __obj.updateDynamic("onDropdownVisibleChange")(onDropdownVisibleChange)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onSearch != null) __obj.updateDynamic("onSearch")(onSearch)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (optionLabelProp != null) __obj.updateDynamic("optionLabelProp")(optionLabelProp)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow)
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteProps]
  }
}

