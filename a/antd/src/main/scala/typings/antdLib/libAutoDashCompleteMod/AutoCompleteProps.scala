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
    ValidInputElement | reactLib.reactMod.ReactElement[antdLib.libInputInputMod.InputProps] | reactLib.reactMod.ReactElement[antdLib.libSelectMod.OptionProps] | js.Array[reactLib.reactMod.ReactElement[antdLib.libSelectMod.OptionProps]]
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
    children: ValidInputElement | reactLib.reactMod.ReactElement[antdLib.libInputInputMod.InputProps] | reactLib.reactMod.ReactElement[antdLib.libSelectMod.OptionProps] | js.Array[reactLib.reactMod.ReactElement[antdLib.libSelectMod.OptionProps]] = null,
    choiceTransitionName: java.lang.String = null,
    className: java.lang.String = null,
    dataSource: js.Array[DataSourceItemType] = null,
    defaultActiveFirstOption: js.UndefOr[scala.Boolean] = js.undefined,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: antdLib.libSelectMod.SelectValue = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownClassName: java.lang.String = null,
    dropdownMatchSelectWidth: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownMenuStyle: reactLib.reactMod.CSSProperties = null,
    dropdownRender: (/* menu */ js.UndefOr[reactLib.reactMod.ReactNode], /* props */ js.UndefOr[antdLib.libSelectMod.SelectProps[antdLib.libSelectMod.SelectValue]]) => reactLib.reactMod.ReactNode = null,
    dropdownStyle: reactLib.reactMod.CSSProperties = null,
    filterOption: scala.Boolean | (js.Function2[
      /* inputValue */ java.lang.String, 
      /* option */ reactLib.reactMod.ReactElement[antdLib.libSelectMod.OptionProps], 
      _
    ]) = null,
    getPopupContainer: /* triggerNode */ stdLib.HTMLElement => stdLib.HTMLElement = null,
    id: java.lang.String = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    notFoundContent: reactLib.reactMod.ReactNode = null,
    onBlur: /* value */ antdLib.libSelectMod.SelectValue => scala.Unit = null,
    onChange: /* value */ antdLib.libSelectMod.SelectValue => scala.Unit = null,
    onDropdownVisibleChange: /* open */ scala.Boolean => scala.Unit = null,
    onFocus: () => scala.Unit = null,
    onSearch: /* value */ java.lang.String => _ = null,
    onSelect: (/* value */ antdLib.libSelectMod.SelectValue, /* option */ js.Object) => _ = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    optionLabelProp: java.lang.String = null,
    placeholder: java.lang.String | reactLib.reactMod.ReactNode = null,
    prefixCls: java.lang.String = null,
    showAction: java.lang.String | js.Array[java.lang.String] = null,
    showArrow: js.UndefOr[scala.Boolean] = js.undefined,
    showSearch: js.UndefOr[scala.Boolean] = js.undefined,
    size: /* import warning: ImportType.apply Failed type conversion: ['default', 'large', 'small'][number] */ js.Any = null,
    style: reactLib.reactMod.CSSProperties = null,
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
    if (dropdownRender != null) __obj.updateDynamic("dropdownRender")(js.Any.fromFunction2(dropdownRender))
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle)
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDropdownVisibleChange != null) __obj.updateDynamic("onDropdownVisibleChange")(js.Any.fromFunction1(onDropdownVisibleChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
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

