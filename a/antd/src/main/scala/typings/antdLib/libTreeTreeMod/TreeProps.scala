package typings
package antdLib.libTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeProps extends js.Object {
  /** 是否自动展开父节点 */
  var autoExpandParent: js.UndefOr[scala.Boolean] = js.undefined
  var blockNode: js.UndefOr[scala.Boolean] = js.undefined
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
  var onDragEnd: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit]] = js.undefined
  var onDragEnter: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit]] = js.undefined
  var onDragLeave: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit]] = js.undefined
  var onDragOver: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit]] = js.undefined
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
      /* info */ antdLib.Anon_Event, 
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
  var switcherIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
}

object TreeProps {
  @scala.inline
  def apply(
    autoExpandParent: js.UndefOr[scala.Boolean] = js.undefined,
    blockNode: js.UndefOr[scala.Boolean] = js.undefined,
    checkStrictly: js.UndefOr[scala.Boolean] = js.undefined,
    checkable: js.UndefOr[scala.Boolean] = js.undefined,
    checkedKeys: js.Array[java.lang.String] | antdLib.Anon_Checked = null,
    children: reactLib.reactMod.ReactNs.ReactNode | js.Array[reactLib.reactMod.ReactNs.ReactNode] = null,
    className: java.lang.String = null,
    defaultCheckedKeys: js.Array[java.lang.String] = null,
    defaultExpandAll: js.UndefOr[scala.Boolean] = js.undefined,
    defaultExpandParent: js.UndefOr[scala.Boolean] = js.undefined,
    defaultExpandedKeys: js.Array[java.lang.String] = null,
    defaultSelectedKeys: js.Array[java.lang.String] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    expandedKeys: js.Array[java.lang.String] = null,
    filterAntTreeNode: js.Function1[/* node */ AntTreeNode, scala.Boolean] = null,
    filterTreeNode: js.Function1[/* node */ AntTreeNode, scala.Boolean] = null,
    icon: js.Function1[/* nodeProps */ AntdTreeNodeAttribute, reactLib.reactMod.ReactNs.ReactNode] = null,
    loadData: js.Function1[/* node */ AntTreeNode, js.Thenable[_]] = null,
    loadedKeys: js.Array[java.lang.String] = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    onCheck: js.Function2[
      /* checkedKeys */ js.Array[java.lang.String] | antdLib.Anon_Checked, 
      /* e */ AntTreeNodeCheckedEvent, 
      scala.Unit
    ] = null,
    onClick: js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* node */ AntTreeNode, 
      scala.Unit
    ] = null,
    onDoubleClick: js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* node */ AntTreeNode, 
      scala.Unit
    ] = null,
    onDragEnd: js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit] = null,
    onDragEnter: js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit] = null,
    onDragLeave: js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit] = null,
    onDragOver: js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit] = null,
    onDragStart: js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit] = null,
    onDrop: js.Function1[/* options */ AntTreeNodeDropEvent, scala.Unit] = null,
    onExpand: js.Function2[
      /* expandedKeys */ js.Array[java.lang.String], 
      /* info */ AntTreeNodeExpandedEvent, 
      scala.Unit | js.Thenable[_]
    ] = null,
    onLoaded: js.Function2[
      /* loadedKeys */ js.Array[java.lang.String], 
      /* info */ antdLib.Anon_Event, 
      scala.Unit
    ] = null,
    onRightClick: js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit] = null,
    onSelect: js.Function2[
      /* selectedKeys */ js.Array[java.lang.String], 
      /* e */ AntTreeNodeSelectedEvent, 
      scala.Unit
    ] = null,
    prefixCls: java.lang.String = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selectedKeys: js.Array[java.lang.String] = null,
    showIcon: js.UndefOr[scala.Boolean] = js.undefined,
    showLine: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    switcherIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null
  ): TreeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoExpandParent)) __obj.updateDynamic("autoExpandParent")(autoExpandParent)
    if (!js.isUndefined(blockNode)) __obj.updateDynamic("blockNode")(blockNode)
    if (!js.isUndefined(checkStrictly)) __obj.updateDynamic("checkStrictly")(checkStrictly)
    if (!js.isUndefined(checkable)) __obj.updateDynamic("checkable")(checkable)
    if (checkedKeys != null) __obj.updateDynamic("checkedKeys")(checkedKeys.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultCheckedKeys != null) __obj.updateDynamic("defaultCheckedKeys")(defaultCheckedKeys)
    if (!js.isUndefined(defaultExpandAll)) __obj.updateDynamic("defaultExpandAll")(defaultExpandAll)
    if (!js.isUndefined(defaultExpandParent)) __obj.updateDynamic("defaultExpandParent")(defaultExpandParent)
    if (defaultExpandedKeys != null) __obj.updateDynamic("defaultExpandedKeys")(defaultExpandedKeys)
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys)
    if (filterAntTreeNode != null) __obj.updateDynamic("filterAntTreeNode")(filterAntTreeNode)
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(filterTreeNode)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (loadData != null) __obj.updateDynamic("loadData")(loadData)
    if (loadedKeys != null) __obj.updateDynamic("loadedKeys")(loadedKeys)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onCheck != null) __obj.updateDynamic("onCheck")(onCheck)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onExpand != null) __obj.updateDynamic("onExpand")(onExpand)
    if (onLoaded != null) __obj.updateDynamic("onLoaded")(onLoaded)
    if (onRightClick != null) __obj.updateDynamic("onRightClick")(onRightClick)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys)
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon)
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine)
    if (style != null) __obj.updateDynamic("style")(style)
    if (switcherIcon != null) __obj.updateDynamic("switcherIcon")(switcherIcon)
    __obj.asInstanceOf[TreeProps]
  }
}

