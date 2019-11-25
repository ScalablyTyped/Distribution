package typings.antd.esAutoDashCompleteMod

import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.esSelectMod.SelectProps
import typings.antd.esSelectMod.SelectValue
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent antd.antd/es/_util/type.Omit<antd.antd/es/select.AbstractSelectProps, 'loading'> */
trait AutoCompleteProps extends js.Object {
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var autoClearSearchValue: js.UndefOr[Boolean] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var backfill: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ValidInputElement | ReactElement | js.Array[ReactElement]] = js.undefined
  var choiceTransitionName: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Array[DataSourceItemType]] = js.undefined
  var defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[SelectValue] = js.undefined
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
  var notFoundContent: js.UndefOr[ReactNode] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* value */ SelectValue, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ SelectValue, Unit]] = js.undefined
  var onDropdownVisibleChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* value */ SelectValue, /* option */ js.Object, _]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var optionLabelProp: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String | ReactNode] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var showAction: js.UndefOr[String | js.Array[String]] = js.undefined
  var showArrow: js.UndefOr[Boolean] = js.undefined
  var showSearch: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[typings.antd.antdStrings.default | large | small] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[SelectValue] = js.undefined
}

object AutoCompleteProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoClearSearchValue: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backfill: js.UndefOr[Boolean] = js.undefined,
    children: ValidInputElement | ReactElement | js.Array[ReactElement] = null,
    choiceTransitionName: String = null,
    className: String = null,
    dataSource: js.Array[DataSourceItemType] = null,
    defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: SelectValue = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdownClassName: String = null,
    dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined,
    dropdownMenuStyle: CSSProperties = null,
    dropdownRender: (/* menu */ js.UndefOr[ReactNode], /* props */ js.UndefOr[SelectProps[SelectValue]]) => ReactNode = null,
    dropdownStyle: CSSProperties = null,
    filterOption: Boolean | (js.Function2[/* inputValue */ String, /* option */ ReactElement, Boolean]) = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    id: String = null,
    notFoundContent: ReactNode = null,
    onBlur: /* value */ SelectValue => Unit = null,
    onChange: /* value */ SelectValue => Unit = null,
    onDropdownVisibleChange: /* open */ Boolean => Unit = null,
    onFocus: () => Unit = null,
    onSearch: /* value */ String => Unit = null,
    onSelect: (/* value */ SelectValue, /* option */ js.Object) => _ = null,
    open: js.UndefOr[Boolean] = js.undefined,
    optionLabelProp: String = null,
    placeholder: String | ReactNode = null,
    prefixCls: String = null,
    showAction: String | js.Array[String] = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    size: typings.antd.antdStrings.default | large | small = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    transitionName: String = null,
    value: SelectValue = null
  ): AutoCompleteProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (!js.isUndefined(autoClearSearchValue)) __obj.updateDynamic("autoClearSearchValue")(autoClearSearchValue.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(backfill)) __obj.updateDynamic("backfill")(backfill.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (choiceTransitionName != null) __obj.updateDynamic("choiceTransitionName")(choiceTransitionName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownMatchSelectWidth)) __obj.updateDynamic("dropdownMatchSelectWidth")(dropdownMatchSelectWidth.asInstanceOf[js.Any])
    if (dropdownMenuStyle != null) __obj.updateDynamic("dropdownMenuStyle")(dropdownMenuStyle.asInstanceOf[js.Any])
    if (dropdownRender != null) __obj.updateDynamic("dropdownRender")(js.Any.fromFunction2(dropdownRender))
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDropdownVisibleChange != null) __obj.updateDynamic("onDropdownVisibleChange")(js.Any.fromFunction1(onDropdownVisibleChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (optionLabelProp != null) __obj.updateDynamic("optionLabelProp")(optionLabelProp.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteProps]
  }
}

