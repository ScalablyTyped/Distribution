package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esCascaderMod.CascaderExpandTrigger
import typings.antd.esCascaderMod.CascaderOptionType
import typings.antd.esCascaderMod.CascaderProps
import typings.antd.esCascaderMod.FieldNamesType
import typings.antd.esCascaderMod.ShowSearchType
import typings.antd.esCascaderMod.default
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, placeholder, className, disabled */
object Cascader
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esCascaderMod.default].asInstanceOf[String | js.Object]
  def apply(
    options: js.Array[CascaderOptionType],
    allowClear: js.UndefOr[Boolean] = js.undefined,
    changeOnSelect: js.UndefOr[Boolean] = js.undefined,
    defaultValue: js.Array[String] = null,
    displayRender: (/* label */ js.Array[String], /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]]) => TagMod[Any] = null,
    expandTrigger: CascaderExpandTrigger = null,
    fieldNames: FieldNamesType = null,
    filedNames: FieldNamesType = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    inputPrefixCls: String = null,
    loadData: /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]] => Unit = null,
    notFoundContent: TagMod[Any] = null,
    onChange: (/* value */ js.Array[String], /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]]) => Unit = null,
    onPopupVisibleChange: /* popupVisible */ Boolean => Unit = null,
    popupClassName: String = null,
    popupPlacement: String = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    showSearch: Boolean | ShowSearchType = null,
    size: String = null,
    suffixIcon: TagMod[Any] = null,
    value: js.Array[String] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(options = options)
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (!js.isUndefined(changeOnSelect)) __obj.updateDynamic("changeOnSelect")(changeOnSelect)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (displayRender != null) __obj.updateDynamic("displayRender")(js.Any.fromFunction2(displayRender))
    if (expandTrigger != null) __obj.updateDynamic("expandTrigger")(expandTrigger)
    if (fieldNames != null) __obj.updateDynamic("fieldNames")(fieldNames)
    if (filedNames != null) __obj.updateDynamic("filedNames")(filedNames)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (inputPrefixCls != null) __obj.updateDynamic("inputPrefixCls")(inputPrefixCls)
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1(loadData))
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onPopupVisibleChange != null) __obj.updateDynamic("onPopupVisibleChange")(js.Any.fromFunction1(onPopupVisibleChange))
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName)
    if (popupPlacement != null) __obj.updateDynamic("popupPlacement")(popupPlacement)
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (showSearch != null) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon)
    if (value != null) __obj.updateDynamic("value")(value)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CascaderProps
}

