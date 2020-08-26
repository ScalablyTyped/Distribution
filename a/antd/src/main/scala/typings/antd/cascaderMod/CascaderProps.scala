package typings.antd.cascaderMod

import typings.antd.sizeContextMod.SizeType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CascaderProps extends js.Object {
  /** 是否支持清除 */
  var allowClear: js.UndefOr[Boolean] = js.native
  /** 自动获取焦点 */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /** whether has border style */
  var bordered: js.UndefOr[Boolean] = js.native
  /** 当此项为 true 时，点选每级菜单选项值都会发生变化 */
  var changeOnSelect: js.UndefOr[Boolean] = js.native
  /** 自定义类名 */
  var className: js.UndefOr[String] = js.native
  /** 默认的选中项 */
  var defaultValue: js.UndefOr[CascaderValueType] = js.native
  /** 禁用 */
  var disabled: js.UndefOr[Boolean] = js.native
  /** 选择后展示的渲染函数 */
  var displayRender: js.UndefOr[
    js.Function2[
      /* label */ js.Array[String], 
      /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]], 
      ReactNode
    ]
  ] = js.native
  var dropdownRender: js.UndefOr[js.Function1[/* menus */ ReactNode, ReactNode]] = js.native
  var expandIcon: js.UndefOr[ReactNode] = js.native
  /** 次级菜单的展开方式，可选 'click' 和 'hover' */
  var expandTrigger: js.UndefOr[CascaderExpandTrigger] = js.native
  /** use this after antd@3.7.0 */
  var fieldNames: js.UndefOr[FieldNamesType] = js.native
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
  var inputPrefixCls: js.UndefOr[String] = js.native
  var loadData: js.UndefOr[
    js.Function1[/* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]], Unit]
  ] = js.native
  var notFoundContent: js.UndefOr[ReactNode] = js.native
  /** 选择完成后的回调 */
  var onChange: js.UndefOr[
    js.Function2[
      /* value */ CascaderValueType, 
      /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]], 
      Unit
    ]
  ] = js.native
  /** 浮层可见变化时回调 */
  var onPopupVisibleChange: js.UndefOr[js.Function1[/* popupVisible */ Boolean, Unit]] = js.native
  /** 可选项数据源 */
  var options: js.Array[CascaderOptionType] = js.native
  /** 输入框占位文本 */
  var placeholder: js.UndefOr[String] = js.native
  /** 自定义浮层类名 */
  var popupClassName: js.UndefOr[String] = js.native
  /** 浮层预设位置：`bottomLeft` `bottomRight` `topLeft` `topRight` */
  var popupPlacement: js.UndefOr[String] = js.native
  var popupVisible: js.UndefOr[Boolean] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var showSearch: js.UndefOr[Boolean | ShowSearchType] = js.native
  /** 输入框大小，可选 `large` `default` `small` */
  var size: js.UndefOr[SizeType] = js.native
  /** 自定义样式 */
  var style: js.UndefOr[CSSProperties] = js.native
  var suffixIcon: js.UndefOr[ReactNode] = js.native
  /** 指定选中项 */
  var value: js.UndefOr[CascaderValueType] = js.native
}

object CascaderProps {
  @scala.inline
  def apply(options: js.Array[CascaderOptionType]): CascaderProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderProps]
  }
  @scala.inline
  implicit class CascaderPropsOps[Self <: CascaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOptionsVarargs(value: CascaderOptionType*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[CascaderOptionType]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowClear(value: Boolean): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClear: Self = this.set("allowClear", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    @scala.inline
    def setChangeOnSelect(value: Boolean): Self = this.set("changeOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeOnSelect: Self = this.set("changeOnSelect", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: (String | Double)*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: CascaderValueType): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisplayRender(
      value: (/* label */ js.Array[String], /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]]) => ReactNode
    ): Self = this.set("displayRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDisplayRender: Self = this.set("displayRender", js.undefined)
    @scala.inline
    def setDropdownRender(value: /* menus */ ReactNode => ReactNode): Self = this.set("dropdownRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDropdownRender: Self = this.set("dropdownRender", js.undefined)
    @scala.inline
    def setExpandIcon(value: ReactNode): Self = this.set("expandIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandIcon: Self = this.set("expandIcon", js.undefined)
    @scala.inline
    def setExpandTrigger(value: CascaderExpandTrigger): Self = this.set("expandTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandTrigger: Self = this.set("expandTrigger", js.undefined)
    @scala.inline
    def setFieldNames(value: FieldNamesType): Self = this.set("fieldNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldNames: Self = this.set("fieldNames", js.undefined)
    @scala.inline
    def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    @scala.inline
    def setInputPrefixCls(value: String): Self = this.set("inputPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputPrefixCls: Self = this.set("inputPrefixCls", js.undefined)
    @scala.inline
    def setLoadData(value: /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]] => Unit): Self = this.set("loadData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoadData: Self = this.set("loadData", js.undefined)
    @scala.inline
    def setNotFoundContent(value: ReactNode): Self = this.set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundContent: Self = this.set("notFoundContent", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* value */ CascaderValueType, /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnPopupVisibleChange(value: /* popupVisible */ Boolean => Unit): Self = this.set("onPopupVisibleChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPopupVisibleChange: Self = this.set("onPopupVisibleChange", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPopupClassName(value: String): Self = this.set("popupClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupClassName: Self = this.set("popupClassName", js.undefined)
    @scala.inline
    def setPopupPlacement(value: String): Self = this.set("popupPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupPlacement: Self = this.set("popupPlacement", js.undefined)
    @scala.inline
    def setPopupVisible(value: Boolean): Self = this.set("popupVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupVisible: Self = this.set("popupVisible", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setShowSearch(value: Boolean | ShowSearchType): Self = this.set("showSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSearch: Self = this.set("showSearch", js.undefined)
    @scala.inline
    def setSize(value: SizeType): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSuffixIcon(value: ReactNode): Self = this.set("suffixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffixIcon: Self = this.set("suffixIcon", js.undefined)
    @scala.inline
    def setValueVarargs(value: (String | Double)*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: CascaderValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

