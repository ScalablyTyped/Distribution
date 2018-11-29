package typings
package antdLib.libCascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CascaderProps extends js.Object {
  /** 是否支持清除*/
  var allowClear: js.UndefOr[scala.Boolean] = js.undefined
  /** 当此项为 true 时，点选每级菜单选项值都会发生变化 */
  var changeOnSelect: js.UndefOr[scala.Boolean] = js.undefined
  /** 自定义类名 */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** 默认的选中项 */
  var defaultValue: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** 禁用*/
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** 选择后展示的渲染函数 */
  var displayRender: js.UndefOr[
    js.Function2[
      /* label */ js.Array[java.lang.String], 
      /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /** 次级菜单的展开方式，可选 'click' 和 'hover' */
  var expandTrigger: js.UndefOr[CascaderExpandTrigger] = js.undefined
  /** use this after antd@3.7.0 */
  var fieldNames: js.UndefOr[FieldNamesType] = js.undefined
  /** typo props name before antd@3.7.0 */
  var filedNames: js.UndefOr[FieldNamesType] = js.undefined
  var getPopupContainer: js.UndefOr[
    js.Function1[/* triggerNode */ js.UndefOr[reactLib.HTMLElement], reactLib.HTMLElement]
  ] = js.undefined
  var inputPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var loadData: js.UndefOr[
    js.Function1[/* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]], scala.Unit]
  ] = js.undefined
  var notFoundContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** 选择完成后的回调 */
  var onChange: js.UndefOr[
    js.Function2[
      /* value */ js.Array[java.lang.String], 
      /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]], 
      scala.Unit
    ]
  ] = js.undefined
  /** 浮层可见变化时回调 */
  var onPopupVisibleChange: js.UndefOr[js.Function1[/* popupVisible */ scala.Boolean, scala.Unit]] = js.undefined
  /** 可选项数据源 */
  var options: js.Array[CascaderOptionType]
  /** 输入框占位文本*/
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /** 自定义浮层类名 */
  var popupClassName: js.UndefOr[java.lang.String] = js.undefined
  /** 浮层预设位置：`bottomLeft` `bottomRight` `topLeft` `topRight` */
  var popupPlacement: js.UndefOr[java.lang.String] = js.undefined
  var popupVisible: js.UndefOr[scala.Boolean] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var showSearch: js.UndefOr[scala.Boolean | ShowSearchType] = js.undefined
  /** 输入框大小，可选 `large` `default` `small` */
  var size: js.UndefOr[java.lang.String] = js.undefined
  /** 自定义样式 */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var suffixIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** 指定选中项 */
  var value: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

