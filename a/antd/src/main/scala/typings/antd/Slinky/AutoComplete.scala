package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.esAutoDashCompleteMod.AutoCompleteProps
import typings.antd.esAutoDashCompleteMod.DataSourceItemType
import typings.antd.esSelectMod.SelectProps
import typings.antd.esSelectMod.SelectValue
import typings.react.reactMod.CSSProperties
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: tabIndex, style, open, autoFocus, id, className, disabled */
object AutoComplete
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.antd.esMod.AutoComplete] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esMod.AutoComplete].asInstanceOf[String | js.Object]
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoClearSearchValue: js.UndefOr[Boolean] = js.undefined,
    backfill: js.UndefOr[Boolean] = js.undefined,
    choiceTransitionName: String = null,
    dataSource: js.Array[DataSourceItemType] = null,
    defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: SelectValue = null,
    dropdownClassName: String = null,
    dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined,
    dropdownMenuStyle: CSSProperties = null,
    dropdownRender: (/* menu */ js.UndefOr[TagMod[Any]], /* props */ js.UndefOr[SelectProps[SelectValue]]) => TagMod[Any] = null,
    dropdownStyle: CSSProperties = null,
    filterOption: Boolean | (js.Function2[/* inputValue */ String, /* option */ ReactElement, Boolean]) = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    notFoundContent: TagMod[Any] = null,
    onBlur: /* value */ SelectValue => Unit = null,
    onChange: /* value */ SelectValue => Unit = null,
    onDropdownVisibleChange: /* open */ Boolean => Unit = null,
    onFocus: () => Unit = null,
    onSearch: /* value */ String => Unit = null,
    onSelect: (/* value */ SelectValue, /* option */ js.Object) => _ = null,
    optionLabelProp: String = null,
    placeholder: String | TagMod[Any] = null,
    prefixCls: String = null,
    showAction: String | js.Array[String] = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    size: default | large | small = null,
    transitionName: String = null,
    value: SelectValue = null
  ): BuildingComponent[tag.type, typings.antd.esMod.AutoComplete] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (!js.isUndefined(autoClearSearchValue)) __obj.updateDynamic("autoClearSearchValue")(autoClearSearchValue)
    if (!js.isUndefined(backfill)) __obj.updateDynamic("backfill")(backfill)
    if (choiceTransitionName != null) __obj.updateDynamic("choiceTransitionName")(choiceTransitionName)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName)
    if (!js.isUndefined(dropdownMatchSelectWidth)) __obj.updateDynamic("dropdownMatchSelectWidth")(dropdownMatchSelectWidth)
    if (dropdownMenuStyle != null) __obj.updateDynamic("dropdownMenuStyle")(dropdownMenuStyle)
    if (dropdownRender != null) __obj.updateDynamic("dropdownRender")(js.Any.fromFunction2(dropdownRender))
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle)
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDropdownVisibleChange != null) __obj.updateDynamic("onDropdownVisibleChange")(js.Any.fromFunction1(onDropdownVisibleChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (optionLabelProp != null) __obj.updateDynamic("optionLabelProp")(optionLabelProp)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow)
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AutoCompleteProps
}

