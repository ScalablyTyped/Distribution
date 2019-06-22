package typings
package antdLib.esTreeTreeMod

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
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
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
    (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, reactLib.reactMod.ReactNode]) | reactLib.reactMod.ReactNode
  ] = js.undefined
  /** 异步加载数据 */
  var loadData: js.UndefOr[js.Function1[/* node */ AntTreeNode, js.Thenable[scala.Unit]]] = js.undefined
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
      /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* node */ AntTreeNode, 
      scala.Unit
    ]
  ] = js.undefined
  /** 双击树节点触发 */
  var onDoubleClick: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* node */ AntTreeNode, 
      scala.Unit
    ]
  ] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit]] = js.undefined
  var onDragEnter: js.UndefOr[js.Function1[/* options */ AntTreeNodeDragEnterEvent, scala.Unit]] = js.undefined
  var onDragLeave: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit]] = js.undefined
  var onDragOver: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, scala.Unit]] = js.undefined
  var onDrop: js.UndefOr[js.Function1[/* options */ AntTreeNodeDropEvent, scala.Unit]] = js.undefined
  /** 展开/收起节点时触发 */
  var onExpand: js.UndefOr[
    js.Function2[
      /* expandedKeys */ js.Array[java.lang.String], 
      /* info */ AntTreeNodeExpandedEvent, 
      scala.Unit | js.Thenable[scala.Unit]
    ]
  ] = js.undefined
  var onLoad: js.UndefOr[
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
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var switcherIcon: js.UndefOr[reactLib.reactMod.ReactElement] = js.undefined
}

object TreeProps {
  @scala.inline
  def apply(
    autoExpandParent: js.UndefOr[scala.Boolean] = js.undefined,
    blockNode: js.UndefOr[scala.Boolean] = js.undefined,
    checkStrictly: js.UndefOr[scala.Boolean] = js.undefined,
    checkable: js.UndefOr[scala.Boolean] = js.undefined,
    checkedKeys: js.Array[java.lang.String] | antdLib.Anon_Checked = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    defaultCheckedKeys: js.Array[java.lang.String] = null,
    defaultExpandAll: js.UndefOr[scala.Boolean] = js.undefined,
    defaultExpandParent: js.UndefOr[scala.Boolean] = js.undefined,
    defaultExpandedKeys: js.Array[java.lang.String] = null,
    defaultSelectedKeys: js.Array[java.lang.String] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    expandedKeys: js.Array[java.lang.String] = null,
    filterAntTreeNode: /* node */ AntTreeNode => scala.Boolean = null,
    filterTreeNode: /* node */ AntTreeNode => scala.Boolean = null,
    icon: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, reactLib.reactMod.ReactNode]) | reactLib.reactMod.ReactNode = null,
    loadData: /* node */ AntTreeNode => js.Thenable[scala.Unit] = null,
    loadedKeys: js.Array[java.lang.String] = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    onCheck: (/* checkedKeys */ js.Array[java.lang.String] | antdLib.Anon_Checked, /* e */ AntTreeNodeCheckedEvent) => scala.Unit = null,
    onClick: (/* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* node */ AntTreeNode) => scala.Unit = null,
    onDoubleClick: (/* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* node */ AntTreeNode) => scala.Unit = null,
    onDragEnd: /* options */ AntTreeNodeMouseEvent => scala.Unit = null,
    onDragEnter: /* options */ AntTreeNodeDragEnterEvent => scala.Unit = null,
    onDragLeave: /* options */ AntTreeNodeMouseEvent => scala.Unit = null,
    onDragOver: /* options */ AntTreeNodeMouseEvent => scala.Unit = null,
    onDragStart: /* options */ AntTreeNodeMouseEvent => scala.Unit = null,
    onDrop: /* options */ AntTreeNodeDropEvent => scala.Unit = null,
    onExpand: (/* expandedKeys */ js.Array[java.lang.String], /* info */ AntTreeNodeExpandedEvent) => scala.Unit | js.Thenable[scala.Unit] = null,
    onLoad: (/* loadedKeys */ js.Array[java.lang.String], /* info */ antdLib.Anon_Event) => scala.Unit = null,
    onRightClick: /* options */ AntTreeNodeMouseEvent => scala.Unit = null,
    onSelect: (/* selectedKeys */ js.Array[java.lang.String], /* e */ AntTreeNodeSelectedEvent) => scala.Unit = null,
    prefixCls: java.lang.String = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selectedKeys: js.Array[java.lang.String] = null,
    showIcon: js.UndefOr[scala.Boolean] = js.undefined,
    showLine: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    switcherIcon: reactLib.reactMod.ReactElement = null
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
    if (filterAntTreeNode != null) __obj.updateDynamic("filterAntTreeNode")(js.Any.fromFunction1(filterAntTreeNode))
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(js.Any.fromFunction1(filterTreeNode))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1(loadData))
    if (loadedKeys != null) __obj.updateDynamic("loadedKeys")(loadedKeys)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onCheck != null) __obj.updateDynamic("onCheck")(js.Any.fromFunction2(onCheck))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction2(onDoubleClick))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction2(onLoad))
    if (onRightClick != null) __obj.updateDynamic("onRightClick")(js.Any.fromFunction1(onRightClick))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
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

