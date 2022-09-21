package typings.antd.anon

import typings.antd.directoryTreeMod.ExpandAction
import typings.antd.treeTreeMod.AntTreeNode
import typings.antd.treeTreeMod.AntTreeNodeProps
import typings.antd.treeTreeMod.AntdTreeNodeAttribute
import typings.antd.treeTreeMod.DraggableConfig
import typings.antd.treeTreeMod.DraggableFn
import typings.antd.treeTreeMod.SwitcherIcon
import typings.rcTree.anon.DragNode
import typings.rcTree.anon.Event
import typings.rcTree.anon.EventNode
import typings.rcTree.anon.Expanded
import typings.rcTree.anon.ExpandedKeys
import typings.rcTree.anon.Node
import typings.rcTree.contextTypesMod.NodeDragEventParams
import typings.rcTree.contextTypesMod.NodeMouseEventHandler
import typings.rcTree.contextTypesMod.NodeMouseEventParams
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.EventDataNode
import typings.rcTree.interfaceMod.FieldNames
import typings.rcTree.interfaceMod.IconType
import typings.rcTree.treeMod.AllowDrop
import typings.rcTree.treeMod.AllowDropOptions
import typings.rcTree.treeMod.CheckInfo
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.ReactNode
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react.react.PropsWithChildren<antd.antd/lib/tree/DirectoryTree.DirectoryTreeProps<any>>> */
trait PartialPropsWithChildrenD extends StObject {
  
  var activeKey: js.UndefOr[typings.rcTree.interfaceMod.Key] = js.undefined
  
  var allowDrop: js.UndefOr[AllowDrop[Any]] = js.undefined
  
  var autoExpandParent: js.UndefOr[Boolean] = js.undefined
  
  var blockNode: js.UndefOr[Boolean] = js.undefined
  
  var checkStrictly: js.UndefOr[Boolean] = js.undefined
  
  var checkable: js.UndefOr[Boolean] = js.undefined
  
  var checkedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key] | Checked] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var defaultCheckedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.undefined
  
  var defaultExpandAll: js.UndefOr[Boolean] = js.undefined
  
  var defaultExpandParent: js.UndefOr[Boolean] = js.undefined
  
  var defaultExpandedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.undefined
  
  var defaultSelectedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var draggable: js.UndefOr[DraggableFn | Boolean | DraggableConfig] = js.undefined
  
  var dropIndicatorRender: js.UndefOr[js.Function1[/* props */ typings.rcTree.anon.Direction, ReactNode]] = js.undefined
  
  var expandAction: js.UndefOr[ExpandAction] = js.undefined
  
  var expandedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.undefined
  
  var fieldNames: js.UndefOr[FieldNames] = js.undefined
  
  var filterAntTreeNode: js.UndefOr[js.Function1[/* node */ AntTreeNode, Boolean]] = js.undefined
  
  var filterTreeNode: js.UndefOr[js.Function1[/* treeNode */ EventDataNode[Any], Boolean]] = js.undefined
  
  var focusable: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var icon: js.UndefOr[
    (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactNode]) | ReactNode | IconType
  ] = js.undefined
  
  var itemHeight: js.UndefOr[Double] = js.undefined
  
  var loadData: js.UndefOr[js.Function1[/* treeNode */ EventDataNode[Any], js.Promise[Any]]] = js.undefined
  
  var loadedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.undefined
  
  var motion: js.UndefOr[Any] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var onActiveChange: js.UndefOr[js.Function1[/* key */ typings.rcTree.interfaceMod.Key, Unit]] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
  
  var onCheck: js.UndefOr[
    js.Function2[
      /* checked */ typings.rcTree.anon.Checked | js.Array[typings.rcTree.interfaceMod.Key], 
      /* info */ CheckInfo[Any], 
      Unit
    ]
  ] = js.undefined
  
  var onClick: js.UndefOr[NodeMouseEventHandler[DataNode, HTMLSpanElement]] = js.undefined
  
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  
  var onDoubleClick: js.UndefOr[NodeMouseEventHandler[DataNode, HTMLSpanElement]] = js.undefined
  
  var onDragEnd: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[Any, HTMLDivElement], Unit]] = js.undefined
  
  var onDragEnter: js.UndefOr[
    js.Function1[/* info */ (NodeDragEventParams[Any, HTMLDivElement]) & ExpandedKeys, Unit]
  ] = js.undefined
  
  var onDragLeave: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[Any, HTMLDivElement], Unit]] = js.undefined
  
  var onDragOver: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[Any, HTMLDivElement], Unit]] = js.undefined
  
  var onDragStart: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[Any, HTMLDivElement], Unit]] = js.undefined
  
  var onDrop: js.UndefOr[
    js.Function1[/* info */ (NodeDragEventParams[Any, HTMLDivElement]) & DragNode[Any], Unit]
  ] = js.undefined
  
  var onExpand: js.UndefOr[
    js.Function2[
      /* expandedKeys */ js.Array[typings.rcTree.interfaceMod.Key], 
      /* info */ Expanded[Any], 
      Unit
    ]
  ] = js.undefined
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
  
  var onLoad: js.UndefOr[
    js.Function2[
      /* loadedKeys */ js.Array[typings.rcTree.interfaceMod.Key], 
      /* info */ Node[Any], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[js.Function1[/* info */ NodeMouseEventParams[Any, HTMLSpanElement], Unit]] = js.undefined
  
  var onMouseLeave: js.UndefOr[js.Function1[/* info */ NodeMouseEventParams[Any, HTMLSpanElement], Unit]] = js.undefined
  
  var onRightClick: js.UndefOr[js.Function1[/* info */ EventNode[Any], Unit]] = js.undefined
  
  var onScroll: js.UndefOr[UIEventHandler[HTMLElement]] = js.undefined
  
  var onSelect: js.UndefOr[
    js.Function2[
      /* selectedKeys */ js.Array[typings.rcTree.interfaceMod.Key], 
      /* info */ Event[Any], 
      Unit
    ]
  ] = js.undefined
  
  var prefixCls: js.UndefOr[String] = js.undefined
  
  var rootClassName: js.UndefOr[String] = js.undefined
  
  var rootStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  var selectedKeys: js.UndefOr[js.Array[typings.rcTree.interfaceMod.Key]] = js.undefined
  
  var showIcon: js.UndefOr[Boolean] = js.undefined
  
  var showLine: js.UndefOr[Boolean | ShowLeafIcon] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var switcherIcon: js.UndefOr[SwitcherIcon | IconType] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  var titleRender: js.UndefOr[js.Function1[/* node */ Any, ReactNode]] = js.undefined
  
  var treeData: js.UndefOr[js.Array[Any]] = js.undefined
  
  var virtual: js.UndefOr[Boolean] = js.undefined
}
object PartialPropsWithChildrenD {
  
  inline def apply(): PartialPropsWithChildrenD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPropsWithChildrenD]
  }
  
  extension [Self <: PartialPropsWithChildrenD](x: Self) {
    
    inline def setActiveKey(value: typings.rcTree.interfaceMod.Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    
    inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
    
    inline def setAllowDrop(value: /* options */ AllowDropOptions[Any] => Boolean): Self = StObject.set(x, "allowDrop", js.Any.fromFunction1(value))
    
    inline def setAllowDropUndefined: Self = StObject.set(x, "allowDrop", js.undefined)
    
    inline def setAutoExpandParent(value: Boolean): Self = StObject.set(x, "autoExpandParent", value.asInstanceOf[js.Any])
    
    inline def setAutoExpandParentUndefined: Self = StObject.set(x, "autoExpandParent", js.undefined)
    
    inline def setBlockNode(value: Boolean): Self = StObject.set(x, "blockNode", value.asInstanceOf[js.Any])
    
    inline def setBlockNodeUndefined: Self = StObject.set(x, "blockNode", js.undefined)
    
    inline def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
    
    inline def setCheckStrictlyUndefined: Self = StObject.set(x, "checkStrictly", js.undefined)
    
    inline def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
    
    inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
    
    inline def setCheckedKeys(value: js.Array[typings.rcTree.interfaceMod.Key] | Checked): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
    
    inline def setCheckedKeysUndefined: Self = StObject.set(x, "checkedKeys", js.undefined)
    
    inline def setCheckedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "checkedKeys", js.Array(value*))
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDefaultCheckedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "defaultCheckedKeys", value.asInstanceOf[js.Any])
    
    inline def setDefaultCheckedKeysUndefined: Self = StObject.set(x, "defaultCheckedKeys", js.undefined)
    
    inline def setDefaultCheckedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "defaultCheckedKeys", js.Array(value*))
    
    inline def setDefaultExpandAll(value: Boolean): Self = StObject.set(x, "defaultExpandAll", value.asInstanceOf[js.Any])
    
    inline def setDefaultExpandAllUndefined: Self = StObject.set(x, "defaultExpandAll", js.undefined)
    
    inline def setDefaultExpandParent(value: Boolean): Self = StObject.set(x, "defaultExpandParent", value.asInstanceOf[js.Any])
    
    inline def setDefaultExpandParentUndefined: Self = StObject.set(x, "defaultExpandParent", js.undefined)
    
    inline def setDefaultExpandedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "defaultExpandedKeys", value.asInstanceOf[js.Any])
    
    inline def setDefaultExpandedKeysUndefined: Self = StObject.set(x, "defaultExpandedKeys", js.undefined)
    
    inline def setDefaultExpandedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "defaultExpandedKeys", js.Array(value*))
    
    inline def setDefaultSelectedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "defaultSelectedKeys", value.asInstanceOf[js.Any])
    
    inline def setDefaultSelectedKeysUndefined: Self = StObject.set(x, "defaultSelectedKeys", js.undefined)
    
    inline def setDefaultSelectedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "defaultSelectedKeys", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDraggable(value: DraggableFn | Boolean | DraggableConfig): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableFunction1(value: /* node */ DataNode => Boolean): Self = StObject.set(x, "draggable", js.Any.fromFunction1(value))
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setDropIndicatorRender(value: /* props */ typings.rcTree.anon.Direction => ReactNode): Self = StObject.set(x, "dropIndicatorRender", js.Any.fromFunction1(value))
    
    inline def setDropIndicatorRenderUndefined: Self = StObject.set(x, "dropIndicatorRender", js.undefined)
    
    inline def setExpandAction(value: ExpandAction): Self = StObject.set(x, "expandAction", value.asInstanceOf[js.Any])
    
    inline def setExpandActionUndefined: Self = StObject.set(x, "expandAction", js.undefined)
    
    inline def setExpandedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
    
    inline def setExpandedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
    
    inline def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
    
    inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
    
    inline def setFilterAntTreeNode(value: /* node */ AntTreeNode => Boolean): Self = StObject.set(x, "filterAntTreeNode", js.Any.fromFunction1(value))
    
    inline def setFilterAntTreeNodeUndefined: Self = StObject.set(x, "filterAntTreeNode", js.undefined)
    
    inline def setFilterTreeNode(value: /* treeNode */ EventDataNode[Any] => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction1(value))
    
    inline def setFilterTreeNodeUndefined: Self = StObject.set(x, "filterTreeNode", js.undefined)
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIcon(value: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactNode]) | ReactNode | IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconFunction1(
      value: (/* nodeProps */ AntdTreeNodeAttribute) | (/* props */ TreeNodeProps[DataNode]) => ReactNode
    ): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
    
    inline def setLoadData(value: /* treeNode */ EventDataNode[Any] => js.Promise[Any]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
    
    inline def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
    
    inline def setLoadedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
    
    inline def setLoadedKeysUndefined: Self = StObject.set(x, "loadedKeys", js.undefined)
    
    inline def setLoadedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "loadedKeys", js.Array(value*))
    
    inline def setMotion(value: Any): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
    
    inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setOnActiveChange(value: /* key */ typings.rcTree.interfaceMod.Key => Unit): Self = StObject.set(x, "onActiveChange", js.Any.fromFunction1(value))
    
    inline def setOnActiveChangeUndefined: Self = StObject.set(x, "onActiveChange", js.undefined)
    
    inline def setOnBlur(value: FocusEvent[HTMLDivElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCheck(
      value: (/* checked */ typings.rcTree.anon.Checked | js.Array[typings.rcTree.interfaceMod.Key], /* info */ CheckInfo[Any]) => Unit
    ): Self = StObject.set(x, "onCheck", js.Any.fromFunction2(value))
    
    inline def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
    
    inline def setOnClick(
      value: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[DataNode]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnContextMenu(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnDoubleClick(
      value: (/* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode[DataNode]) => Unit
    ): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction2(value))
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnDragEnd(value: /* info */ NodeDragEventParams[Any, HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragEnter(value: /* info */ (NodeDragEventParams[Any, HTMLDivElement]) & ExpandedKeys => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
    
    inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    inline def setOnDragLeave(value: /* info */ NodeDragEventParams[Any, HTMLDivElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnDragOver(value: /* info */ NodeDragEventParams[Any, HTMLDivElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
    
    inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    inline def setOnDragStart(value: /* info */ NodeDragEventParams[Any, HTMLDivElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDrop(value: /* info */ (NodeDragEventParams[Any, HTMLDivElement]) & DragNode[Any] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnExpand(
      value: (/* expandedKeys */ js.Array[typings.rcTree.interfaceMod.Key], /* info */ Expanded[Any]) => Unit
    ): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
    
    inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    
    inline def setOnFocus(value: FocusEvent[HTMLDivElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnLoad(value: (/* loadedKeys */ js.Array[typings.rcTree.interfaceMod.Key], /* info */ Node[Any]) => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction2(value))
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnMouseEnter(value: /* info */ NodeMouseEventParams[Any, HTMLSpanElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: /* info */ NodeMouseEventParams[Any, HTMLSpanElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnRightClick(value: /* info */ EventNode[Any] => Unit): Self = StObject.set(x, "onRightClick", js.Any.fromFunction1(value))
    
    inline def setOnRightClickUndefined: Self = StObject.set(x, "onRightClick", js.undefined)
    
    inline def setOnScroll(value: UIEvent[HTMLElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSelect(
      value: (/* selectedKeys */ js.Array[typings.rcTree.interfaceMod.Key], /* info */ Event[Any]) => Unit
    ): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    inline def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
    
    inline def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    
    inline def setRootStyle(value: CSSProperties): Self = StObject.set(x, "rootStyle", value.asInstanceOf[js.Any])
    
    inline def setRootStyleUndefined: Self = StObject.set(x, "rootStyle", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSelectedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
    
    inline def setSelectedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
    
    inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
    
    inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
    
    inline def setShowLine(value: Boolean | ShowLeafIcon): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
    
    inline def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSwitcherIcon(value: SwitcherIcon | IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
    
    inline def setSwitcherIconFunction1(value: (/* props */ AntTreeNodeProps) | (/* props */ TreeNodeProps[DataNode]) => ReactNode): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
    
    inline def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTitleRender(value: /* node */ Any => ReactNode): Self = StObject.set(x, "titleRender", js.Any.fromFunction1(value))
    
    inline def setTitleRenderUndefined: Self = StObject.set(x, "titleRender", js.undefined)
    
    inline def setTreeData(value: js.Array[Any]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    inline def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
    
    inline def setTreeDataVarargs(value: Any*): Self = StObject.set(x, "treeData", js.Array(value*))
    
    inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
  }
}
