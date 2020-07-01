package typings.antd.cascaderMod

import typings.antd.sizeContextMod.SizeType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascaderProps extends js.Object {
  /** 是否支持清除 */
  var allowClear: js.UndefOr[Boolean] = js.undefined
  /** 自动获取焦点 */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  /** whether has border style */
  var bordered: js.UndefOr[Boolean] = js.undefined
  /** 当此项为 true 时，点选每级菜单选项值都会发生变化 */
  var changeOnSelect: js.UndefOr[Boolean] = js.undefined
  /** 自定义类名 */
  var className: js.UndefOr[String] = js.undefined
  /** 默认的选中项 */
  var defaultValue: js.UndefOr[CascaderValueType] = js.undefined
  /** 禁用 */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** 选择后展示的渲染函数 */
  var displayRender: js.UndefOr[
    js.Function2[
      /* label */ js.Array[String], 
      /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]], 
      ReactNode
    ]
  ] = js.undefined
  var dropdownRender: js.UndefOr[js.Function1[/* menus */ ReactNode, ReactNode]] = js.undefined
  var expandIcon: js.UndefOr[ReactNode] = js.undefined
  /** 次级菜单的展开方式，可选 'click' 和 'hover' */
  var expandTrigger: js.UndefOr[CascaderExpandTrigger] = js.undefined
  /** use this after antd@3.7.0 */
  var fieldNames: js.UndefOr[FieldNamesType] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var inputPrefixCls: js.UndefOr[String] = js.undefined
  var loadData: js.UndefOr[
    js.Function1[/* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]], Unit]
  ] = js.undefined
  var notFoundContent: js.UndefOr[ReactNode] = js.undefined
  /** 选择完成后的回调 */
  var onChange: js.UndefOr[
    js.Function2[
      /* value */ CascaderValueType, 
      /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]], 
      Unit
    ]
  ] = js.undefined
  /** 浮层可见变化时回调 */
  var onPopupVisibleChange: js.UndefOr[js.Function1[/* popupVisible */ Boolean, Unit]] = js.undefined
  /** 可选项数据源 */
  var options: js.Array[CascaderOptionType]
  /** 输入框占位文本 */
  var placeholder: js.UndefOr[String] = js.undefined
  /** 自定义浮层类名 */
  var popupClassName: js.UndefOr[String] = js.undefined
  /** 浮层预设位置：`bottomLeft` `bottomRight` `topLeft` `topRight` */
  var popupPlacement: js.UndefOr[String] = js.undefined
  var popupVisible: js.UndefOr[Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var showSearch: js.UndefOr[Boolean | ShowSearchType] = js.undefined
  /** 输入框大小，可选 `large` `default` `small` */
  var size: js.UndefOr[SizeType] = js.undefined
  /** 自定义样式 */
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suffixIcon: js.UndefOr[ReactNode] = js.undefined
  /** 指定选中项 */
  var value: js.UndefOr[CascaderValueType] = js.undefined
}

object CascaderProps {
  @scala.inline
  def apply(
    options: js.Array[CascaderOptionType],
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    bordered: js.UndefOr[Boolean] = js.undefined,
    changeOnSelect: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultValue: CascaderValueType = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayRender: (/* label */ js.Array[String], /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]]) => ReactNode = null,
    dropdownRender: /* menus */ ReactNode => ReactNode = null,
    expandIcon: ReactNode = null,
    expandTrigger: CascaderExpandTrigger = null,
    fieldNames: FieldNamesType = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    inputPrefixCls: String = null,
    loadData: /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]] => Unit = null,
    notFoundContent: ReactNode = null,
    onChange: (/* value */ CascaderValueType, /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]]) => Unit = null,
    onPopupVisibleChange: /* popupVisible */ Boolean => Unit = null,
    placeholder: String = null,
    popupClassName: String = null,
    popupPlacement: String = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    showSearch: Boolean | ShowSearchType = null,
    size: SizeType = null,
    style: CSSProperties = null,
    suffixIcon: ReactNode = null,
    value: CascaderValueType = null
  ): CascaderProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(changeOnSelect)) __obj.updateDynamic("changeOnSelect")(changeOnSelect.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (displayRender != null) __obj.updateDynamic("displayRender")(js.Any.fromFunction2(displayRender))
    if (dropdownRender != null) __obj.updateDynamic("dropdownRender")(js.Any.fromFunction1(dropdownRender))
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (expandTrigger != null) __obj.updateDynamic("expandTrigger")(expandTrigger.asInstanceOf[js.Any])
    if (fieldNames != null) __obj.updateDynamic("fieldNames")(fieldNames.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (inputPrefixCls != null) __obj.updateDynamic("inputPrefixCls")(inputPrefixCls.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1(loadData))
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onPopupVisibleChange != null) __obj.updateDynamic("onPopupVisibleChange")(js.Any.fromFunction1(onPopupVisibleChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupPlacement != null) __obj.updateDynamic("popupPlacement")(popupPlacement.asInstanceOf[js.Any])
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible.get.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (showSearch != null) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderProps]
  }
}

