package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.Anon_Checked
import typings.antd.Anon_Event
import typings.antd.esTreeDirectoryTreeMod.DirectoryTreeProps
import typings.antd.esTreeDirectoryTreeMod.ExpandAction
import typings.antd.esTreeDirectoryTreeMod.default
import typings.antd.esTreeTreeMod.AntTreeNode
import typings.antd.esTreeTreeMod.AntTreeNodeCheckedEvent
import typings.antd.esTreeTreeMod.AntTreeNodeDragEnterEvent
import typings.antd.esTreeTreeMod.AntTreeNodeDropEvent
import typings.antd.esTreeTreeMod.AntTreeNodeExpandedEvent
import typings.antd.esTreeTreeMod.AntTreeNodeMouseEvent
import typings.antd.esTreeTreeMod.AntTreeNodeSelectedEvent
import typings.antd.esTreeTreeMod.AntdTreeNodeAttribute
import typings.antd.esTreeTreeMod.TreeNodeNormal
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, style, draggable, className, disabled, multiple */
object DirectoryTree
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esTreeDirectoryTreeMod.default].asInstanceOf[String | js.Object]
  def apply(
    autoExpandParent: js.UndefOr[Boolean] = js.undefined,
    blockNode: js.UndefOr[Boolean] = js.undefined,
    checkStrictly: js.UndefOr[Boolean] = js.undefined,
    checkable: js.UndefOr[Boolean] = js.undefined,
    checkedKeys: js.Array[String] | Anon_Checked = null,
    defaultCheckedKeys: js.Array[String] = null,
    defaultExpandAll: js.UndefOr[Boolean] = js.undefined,
    defaultExpandParent: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    expandAction: ExpandAction = null,
    expandedKeys: js.Array[String] = null,
    filterAntTreeNode: /* node */ AntTreeNode => Boolean = null,
    filterTreeNode: /* node */ AntTreeNode => Boolean = null,
    icon: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactNode]) | ReactNode = null,
    loadData: /* node */ AntTreeNode => js.Thenable[Unit] = null,
    loadedKeys: js.Array[String] = null,
    onCheck: (/* checkedKeys */ js.Array[String] | Anon_Checked, /* e */ AntTreeNodeCheckedEvent) => Unit = null,
    onClick: (/* e */ MouseEvent[HTMLElement, NativeMouseEvent], /* node */ AntTreeNode) => Unit = null,
    onDoubleClick: (/* e */ MouseEvent[HTMLElement, NativeMouseEvent], /* node */ AntTreeNode) => Unit = null,
    onDragEnd: /* options */ AntTreeNodeMouseEvent => Unit = null,
    onDragEnter: /* options */ AntTreeNodeDragEnterEvent => Unit = null,
    onDragLeave: /* options */ AntTreeNodeMouseEvent => Unit = null,
    onDragOver: /* options */ AntTreeNodeMouseEvent => Unit = null,
    onDragStart: /* options */ AntTreeNodeMouseEvent => Unit = null,
    onDrop: /* options */ AntTreeNodeDropEvent => Unit = null,
    onExpand: (/* expandedKeys */ js.Array[String], /* info */ AntTreeNodeExpandedEvent) => Unit | js.Thenable[Unit] = null,
    onLoad: (/* loadedKeys */ js.Array[String], /* info */ Anon_Event) => Unit = null,
    onRightClick: /* options */ AntTreeNodeMouseEvent => Unit = null,
    onSelect: (/* selectedKeys */ js.Array[String], /* e */ AntTreeNodeSelectedEvent) => Unit = null,
    prefixCls: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectedKeys: js.Array[String] = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    showLine: js.UndefOr[Boolean] = js.undefined,
    switcherIcon: ReactElement = null,
    treeData: js.Array[TreeNodeNormal] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoExpandParent)) __obj.updateDynamic("autoExpandParent")(autoExpandParent)
    if (!js.isUndefined(blockNode)) __obj.updateDynamic("blockNode")(blockNode)
    if (!js.isUndefined(checkStrictly)) __obj.updateDynamic("checkStrictly")(checkStrictly)
    if (!js.isUndefined(checkable)) __obj.updateDynamic("checkable")(checkable)
    if (checkedKeys != null) __obj.updateDynamic("checkedKeys")(checkedKeys.asInstanceOf[js.Any])
    if (defaultCheckedKeys != null) __obj.updateDynamic("defaultCheckedKeys")(defaultCheckedKeys)
    if (!js.isUndefined(defaultExpandAll)) __obj.updateDynamic("defaultExpandAll")(defaultExpandAll)
    if (!js.isUndefined(defaultExpandParent)) __obj.updateDynamic("defaultExpandParent")(defaultExpandParent)
    if (defaultExpandedKeys != null) __obj.updateDynamic("defaultExpandedKeys")(defaultExpandedKeys)
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys)
    if (expandAction != null) __obj.updateDynamic("expandAction")(expandAction)
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys)
    if (filterAntTreeNode != null) __obj.updateDynamic("filterAntTreeNode")(js.Any.fromFunction1(filterAntTreeNode))
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(js.Any.fromFunction1(filterTreeNode))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1(loadData))
    if (loadedKeys != null) __obj.updateDynamic("loadedKeys")(loadedKeys)
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
    if (switcherIcon != null) __obj.updateDynamic("switcherIcon")(switcherIcon)
    if (treeData != null) __obj.updateDynamic("treeData")(treeData)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DirectoryTreeProps
}

