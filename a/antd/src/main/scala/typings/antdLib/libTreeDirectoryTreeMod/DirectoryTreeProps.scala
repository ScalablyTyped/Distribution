package typings
package antdLib.libTreeDirectoryTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryTreeProps
  extends antdLib.libTreeTreeMod.TreeProps {
  var expandAction: js.UndefOr[ExpandAction] = js.undefined
}

object DirectoryTreeProps {
  @scala.inline
  def apply(
    autoExpandParent: js.UndefOr[scala.Boolean] = js.undefined,
    blockNode: js.UndefOr[scala.Boolean] = js.undefined,
    checkStrictly: js.UndefOr[scala.Boolean] = js.undefined,
    checkable: js.UndefOr[scala.Boolean] = js.undefined,
    checkedKeys: js.Array[java.lang.String] | antdLib.Anon_Checked = null,
    children: reactLib.reactMod.ReactNode | js.Array[reactLib.reactMod.ReactNode] = null,
    className: java.lang.String = null,
    defaultCheckedKeys: js.Array[java.lang.String] = null,
    defaultExpandAll: js.UndefOr[scala.Boolean] = js.undefined,
    defaultExpandParent: js.UndefOr[scala.Boolean] = js.undefined,
    defaultExpandedKeys: js.Array[java.lang.String] = null,
    defaultSelectedKeys: js.Array[java.lang.String] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    expandAction: ExpandAction = null,
    expandedKeys: js.Array[java.lang.String] = null,
    filterAntTreeNode: /* node */ antdLib.libTreeTreeMod.AntTreeNode => scala.Boolean = null,
    filterTreeNode: /* node */ antdLib.libTreeTreeMod.AntTreeNode => scala.Boolean = null,
    icon: /* nodeProps */ antdLib.libTreeTreeMod.AntdTreeNodeAttribute => reactLib.reactMod.ReactNode = null,
    loadData: /* node */ antdLib.libTreeTreeMod.AntTreeNode => js.Thenable[_] = null,
    loadedKeys: js.Array[java.lang.String] = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    onCheck: (/* checkedKeys */ js.Array[java.lang.String] | antdLib.Anon_Checked, /* e */ antdLib.libTreeTreeMod.AntTreeNodeCheckedEvent) => scala.Unit = null,
    onClick: (/* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* node */ antdLib.libTreeTreeMod.AntTreeNode) => scala.Unit = null,
    onDoubleClick: (/* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* node */ antdLib.libTreeTreeMod.AntTreeNode) => scala.Unit = null,
    onDragEnd: /* options */ antdLib.libTreeTreeMod.AntTreeNodeMouseEvent => scala.Unit = null,
    onDragEnter: /* options */ antdLib.libTreeTreeMod.AntTreeNodeDragEnterEvent => scala.Unit = null,
    onDragLeave: /* options */ antdLib.libTreeTreeMod.AntTreeNodeMouseEvent => scala.Unit = null,
    onDragOver: /* options */ antdLib.libTreeTreeMod.AntTreeNodeMouseEvent => scala.Unit = null,
    onDragStart: /* options */ antdLib.libTreeTreeMod.AntTreeNodeMouseEvent => scala.Unit = null,
    onDrop: /* options */ antdLib.libTreeTreeMod.AntTreeNodeDropEvent => scala.Unit = null,
    onExpand: (/* expandedKeys */ js.Array[java.lang.String], /* info */ antdLib.libTreeTreeMod.AntTreeNodeExpandedEvent) => scala.Unit | js.Thenable[_] = null,
    onLoad: (/* loadedKeys */ js.Array[java.lang.String], /* info */ antdLib.Anon_EventLoad) => scala.Unit = null,
    onRightClick: /* options */ antdLib.libTreeTreeMod.AntTreeNodeMouseEvent => scala.Unit = null,
    onSelect: (/* selectedKeys */ js.Array[java.lang.String], /* e */ antdLib.libTreeTreeMod.AntTreeNodeSelectedEvent) => scala.Unit = null,
    prefixCls: java.lang.String = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selectedKeys: js.Array[java.lang.String] = null,
    showIcon: js.UndefOr[scala.Boolean] = js.undefined,
    showLine: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    switcherIcon: reactLib.reactMod.ReactElement = null
  ): DirectoryTreeProps = {
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
    if (expandAction != null) __obj.updateDynamic("expandAction")(expandAction)
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys)
    if (filterAntTreeNode != null) __obj.updateDynamic("filterAntTreeNode")(js.Any.fromFunction1(filterAntTreeNode))
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(js.Any.fromFunction1(filterTreeNode))
    if (icon != null) __obj.updateDynamic("icon")(js.Any.fromFunction1(icon))
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
    __obj.asInstanceOf[DirectoryTreeProps]
  }
}

