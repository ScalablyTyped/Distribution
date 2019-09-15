package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.esSelectMod.SelectProps
import typings.antd.esSelectMod.SelectValue
import typings.antd.esSelectMod.default
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.UIEvent
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: tabIndex, style, open, id, className, disabled, autoFocus, mode */
object Select
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esSelectMod.default[js.Any]].asInstanceOf[String | js.Object]
  def apply[T](
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoClearSearchValue: js.UndefOr[Boolean] = js.undefined,
    choiceTransitionName: String = null,
    clearIcon: TagMod[Any] = null,
    defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: T = null,
    dropdownClassName: String = null,
    dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined,
    dropdownMenuStyle: CSSProperties = null,
    dropdownRender: (/* menu */ js.UndefOr[ReactNode], /* props */ js.UndefOr[SelectProps[SelectValue]]) => ReactNode = null,
    dropdownStyle: CSSProperties = null,
    filterOption: Boolean | (js.Function2[/* inputValue */ String, /* option */ ReactElement, Boolean]) = null,
    firstActiveValue: String | js.Array[String] = null,
    getInputElement: () => slinky.core.facade.ReactElement = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    inputValue: String = null,
    labelInValue: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    maxTagCount: Int | Double = null,
    maxTagPlaceholder: TagMod[Any] | (js.Function1[/* omittedValues */ js.Array[T], TagMod[Any]]) = null,
    maxTagTextLength: Int | Double = null,
    menuItemSelectedIcon: TagMod[Any] = null,
    notFoundContent: ReactNode = null,
    onBlur: /* value */ T => Unit = null,
    onChange: (/* value */ T, /* option */ slinky.core.facade.ReactElement | js.Array[slinky.core.facade.ReactElement]) => Unit = null,
    onDeselect: /* value */ T => Unit = null,
    onDropdownVisibleChange: /* open */ Boolean => Unit = null,
    onFocus: () => Unit = null,
    onInputKeyDown: /* e */ KeyboardEvent[HTMLInputElement] => Unit = null,
    onMouseEnter: /* e */ MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: /* e */ MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit = null,
    onPopupScroll: UIEvent[HTMLDivElement] => Unit = null,
    onSearch: /* value */ String => Unit = null,
    onSelect: (/* value */ T, /* option */ slinky.core.facade.ReactElement) => Unit = null,
    optionFilterProp: String = null,
    optionLabelProp: String = null,
    placeholder: String | ReactNode = null,
    prefixCls: String = null,
    removeIcon: TagMod[Any] = null,
    searchValue: String = null,
    showAction: String | js.Array[String] = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    size: typings.antd.antdStrings.default | large | small = null,
    suffixIcon: TagMod[Any] = null,
    tokenSeparators: js.Array[String] = null,
    transitionName: String = null,
    value: T = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (!js.isUndefined(autoClearSearchValue)) __obj.updateDynamic("autoClearSearchValue")(autoClearSearchValue)
    if (choiceTransitionName != null) __obj.updateDynamic("choiceTransitionName")(choiceTransitionName)
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon)
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName)
    if (!js.isUndefined(dropdownMatchSelectWidth)) __obj.updateDynamic("dropdownMatchSelectWidth")(dropdownMatchSelectWidth)
    if (dropdownMenuStyle != null) __obj.updateDynamic("dropdownMenuStyle")(dropdownMenuStyle)
    if (dropdownRender != null) __obj.updateDynamic("dropdownRender")(js.Any.fromFunction2(dropdownRender))
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle)
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (firstActiveValue != null) __obj.updateDynamic("firstActiveValue")(firstActiveValue.asInstanceOf[js.Any])
    if (getInputElement != null) __obj.updateDynamic("getInputElement")(js.Any.fromFunction0(getInputElement))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue)
    if (!js.isUndefined(labelInValue)) __obj.updateDynamic("labelInValue")(labelInValue)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (maxTagCount != null) __obj.updateDynamic("maxTagCount")(maxTagCount.asInstanceOf[js.Any])
    if (maxTagPlaceholder != null) __obj.updateDynamic("maxTagPlaceholder")(maxTagPlaceholder.asInstanceOf[js.Any])
    if (maxTagTextLength != null) __obj.updateDynamic("maxTagTextLength")(maxTagTextLength.asInstanceOf[js.Any])
    if (menuItemSelectedIcon != null) __obj.updateDynamic("menuItemSelectedIcon")(menuItemSelectedIcon)
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
    if (optionFilterProp != null) __obj.updateDynamic("optionFilterProp")(optionFilterProp)
    if (optionLabelProp != null) __obj.updateDynamic("optionLabelProp")(optionLabelProp)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon)
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue)
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow)
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon)
    if (tokenSeparators != null) __obj.updateDynamic("tokenSeparators")(tokenSeparators)
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typings.antd.esSelectMod.default[js.Any]]]
  }
  type Props = SelectProps[js.Any]
}

