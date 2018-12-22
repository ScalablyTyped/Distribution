package typings
package antdLib.libTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TreeProps extends js.Object {
  /** 是否自动展开父节点 */
  var autoExpandParent: js.UndefOr[scala.Boolean] = js.undefined
  /** checkable状态下节点选择完全受控（父子节点选中状态不再关联）*/
  var checkStrictly: js.UndefOr[scala.Boolean] = js.undefined
  /** 是否支持选中 */
  var checkable: js.UndefOr[scala.Boolean] = js.undefined
  /** （受控）选中复选框的树节点 */
  var checkedKeys: js.UndefOr[js.Array[java.lang.String] | antdLib.Anon_Checked] = js.undefined
  var children: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactNode | js.Array[reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** 默认选中复选框的树节点 */
  var defaultCheckedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** 默认展开所有树节点 */
  var defaultExpandAll: js.UndefOr[scala.Boolean] = js.undefined
  /** 默认展开对应树节点 */
  var defaultExpandParent: js.UndefOr[scala.Boolean] = js.undefined
  /** 默认展开指定的树节点 */
  var defaultExpandedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** 默认选中的树节点 */
  var defaultSelectedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** 是否禁用树 */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** 设置节点可拖拽（IE>8）*/
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /** （受控）展开指定的树节点 */
  var expandedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** filter some AntTreeNodes as you need. it should return true */
  var filterAntTreeNode: js.UndefOr[js.Function1[/* node */ AntTreeNode, scala.Boolean]] = js.undefined
  var filterTreeNode: js.UndefOr[js.Function1[/* node */ AntTreeNode, scala.Boolean]] = js.undefined
  var icon: js.UndefOr[
    js.Function1[/* nodeProps */ AntdTreeNodeAttribute, reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
  /** 异步加载数据 */
  var loadData: js.UndefOr[js.Function1[/* node */ AntTreeNode, js.Thenable[_]]] = js.undefined
  var loadedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** 是否支持多选 */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  /** 点击复选框触发 */
  var onCheck: js.UndefOr[
    js.Function2[
      /* checkedKeys */ js.Array[java.lang.String] | antdLib.Anon_Checked, 
      /* e */ AntTreeNodeCheckedEvent, 
      scala.Unit
    ]
  ] = js.undefined
  /** 单击树节点触发 */
  var onClick: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* node */ AntTreeNode, 
      scala.Unit
    ]
  ] = js.undefined
  /** 双击树节点触发 */
  var onDoubleClick: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* node */ AntTreeNode, 
      scala.Unit
    ]
  ] = js.undefined
  /** dragenter 触发时调用 */
  var onDragEnter: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit]] = js.undefined
  /** dragleave 触发时调用 */
  var onDragLeave: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit]] = js.undefined
  /** dragover 触发时调用 */
  var onDragOver: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit]] = js.undefined
  /** 开始拖拽时调用 */
  var onDragStart: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit]] = js.undefined
  /** drop 触发时调用 */
  var onDrop: js.UndefOr[js.Function1[/* options */ AntTreeNodeDropEvent, scala.Unit]] = js.undefined
  /** 展开/收起节点时触发 */
  var onExpand: js.UndefOr[
    js.Function2[
      /* expandedKeys */ js.Array[java.lang.String], 
      /* info */ AntTreeNodeExpandedEvent, 
      scala.Unit | js.Thenable[_]
    ]
  ] = js.undefined
  var onLoaded: js.UndefOr[
    js.Function2[
      /* loadedKeys */ js.Array[java.lang.String], 
      /* info */ antdLib.Anon_Node, 
      scala.Unit
    ]
  ] = js.undefined
  /** 响应右键点击 */
  var onRightClick: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit]] = js.undefined
  /** 点击树节点触发 */
  var onSelect: js.UndefOr[
    js.Function2[
      /* selectedKeys */ js.Array[java.lang.String], 
      /* e */ AntTreeNodeSelectedEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  /** （受控）设置选中的树节点 */
  var selectedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var showIcon: js.UndefOr[scala.Boolean] = js.undefined
  var showLine: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

