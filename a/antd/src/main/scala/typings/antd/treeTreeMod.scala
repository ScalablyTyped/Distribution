package typings.antd

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.antd.anon.Checked
import typings.antd.anon.ShowLeafIcon
import typings.antd.antdStrings.check
import typings.antd.antdStrings.select_
import typings.antd.directoryTreeMod.DirectoryTreeProps
import typings.rcTree.anon.Event
import typings.rcTree.anon.EventNode
import typings.rcTree.anon.Expanded
import typings.rcTree.anon.Node
import typings.rcTree.anon.NodeDragEventParamsHTMLDi
import typings.rcTree.anon.NodeDragEventParamsHTMLDiDragNode
import typings.rcTree.contextTypesMod.NodeDragEventParams
import typings.rcTree.contextTypesMod.NodeMouseEventHandler
import typings.rcTree.contextTypesMod.NodeMouseEventParams
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.EventDataNode
import typings.rcTree.interfaceMod.Key
import typings.rcTree.treeMod.CheckInfo
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.DragEvent
import typings.react.mod.FC
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeTreeMod extends Shortcut {
  
  @JSImport("antd/lib/tree/Tree", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  type AntTreeNode = Component[AntTreeNodeProps, js.Object, js.Any]
  
  trait AntTreeNodeBaseEvent extends StObject {
    
    var nativeEvent: MouseEvent
    
    var node: AntTreeNode
  }
  object AntTreeNodeBaseEvent {
    
    inline def apply(nativeEvent: MouseEvent, node: AntTreeNode): AntTreeNodeBaseEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeBaseEvent]
    }
    
    extension [Self <: AntTreeNodeBaseEvent](x: Self) {
      
      inline def setNativeEvent(value: MouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      inline def setNode(value: AntTreeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait AntTreeNodeCheckedEvent
    extends StObject
       with AntTreeNodeBaseEvent {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var checkedNodes: js.UndefOr[js.Array[AntTreeNode]] = js.undefined
    
    var event: check
  }
  object AntTreeNodeCheckedEvent {
    
    inline def apply(nativeEvent: MouseEvent, node: AntTreeNode): AntTreeNodeCheckedEvent = {
      val __obj = js.Dynamic.literal(event = "check", nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeCheckedEvent]
    }
    
    extension [Self <: AntTreeNodeCheckedEvent](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedNodes(value: js.Array[AntTreeNode]): Self = StObject.set(x, "checkedNodes", value.asInstanceOf[js.Any])
      
      inline def setCheckedNodesUndefined: Self = StObject.set(x, "checkedNodes", js.undefined)
      
      inline def setCheckedNodesVarargs(value: AntTreeNode*): Self = StObject.set(x, "checkedNodes", js.Array(value :_*))
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setEvent(value: check): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  trait AntTreeNodeDragEnterEvent
    extends StObject
       with AntTreeNodeMouseEvent {
    
    var expandedKeys: js.Array[Key]
  }
  object AntTreeNodeDragEnterEvent {
    
    inline def apply(event: DragEvent[HTMLElement], expandedKeys: js.Array[Key], node: AntTreeNode): AntTreeNodeDragEnterEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeDragEnterEvent]
    }
    
    extension [Self <: AntTreeNodeDragEnterEvent](x: Self) {
      
      inline def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
    }
  }
  
  trait AntTreeNodeDropEvent extends StObject {
    
    var dragNode: AntTreeNode
    
    var dragNodesKeys: js.Array[Key]
    
    var dropPosition: Double
    
    var dropToGap: js.UndefOr[Boolean] = js.undefined
    
    var event: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent]
    
    var node: AntTreeNode
  }
  object AntTreeNodeDropEvent {
    
    inline def apply(
      dragNode: AntTreeNode,
      dragNodesKeys: js.Array[Key],
      dropPosition: Double,
      event: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent],
      node: AntTreeNode
    ): AntTreeNodeDropEvent = {
      val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeDropEvent]
    }
    
    extension [Self <: AntTreeNodeDropEvent](x: Self) {
      
      inline def setDragNode(value: AntTreeNode): Self = StObject.set(x, "dragNode", value.asInstanceOf[js.Any])
      
      inline def setDragNodesKeys(value: js.Array[Key]): Self = StObject.set(x, "dragNodesKeys", value.asInstanceOf[js.Any])
      
      inline def setDragNodesKeysVarargs(value: Key*): Self = StObject.set(x, "dragNodesKeys", js.Array(value :_*))
      
      inline def setDropPosition(value: Double): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      inline def setDropToGap(value: Boolean): Self = StObject.set(x, "dropToGap", value.asInstanceOf[js.Any])
      
      inline def setDropToGapUndefined: Self = StObject.set(x, "dropToGap", js.undefined)
      
      inline def setEvent(value: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setNode(value: AntTreeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait AntTreeNodeExpandedEvent
    extends StObject
       with AntTreeNodeBaseEvent {
    
    var expanded: js.UndefOr[Boolean] = js.undefined
  }
  object AntTreeNodeExpandedEvent {
    
    inline def apply(nativeEvent: MouseEvent, node: AntTreeNode): AntTreeNodeExpandedEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeExpandedEvent]
    }
    
    extension [Self <: AntTreeNodeExpandedEvent](x: Self) {
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    }
  }
  
  trait AntTreeNodeMouseEvent extends StObject {
    
    var event: DragEvent[HTMLElement]
    
    var node: AntTreeNode
  }
  object AntTreeNodeMouseEvent {
    
    inline def apply(event: DragEvent[HTMLElement], node: AntTreeNode): AntTreeNodeMouseEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeMouseEvent]
    }
    
    extension [Self <: AntTreeNodeMouseEvent](x: Self) {
      
      inline def setEvent(value: DragEvent[HTMLElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setNode(value: AntTreeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait AntTreeNodeProps
    extends StObject
       with /* customProp */ StringDictionary[js.Any] {
    
    var checkable: js.UndefOr[Boolean] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var eventKey: js.UndefOr[String] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[(js.Function1[/* treeNode */ AntdTreeNodeAttribute, ReactNode]) | ReactNode] = js.undefined
    
    var isLeaf: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String | ReactNode] = js.undefined
  }
  object AntTreeNodeProps {
    
    inline def apply(): AntTreeNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AntTreeNodeProps]
    }
    
    extension [Self <: AntTreeNodeProps](x: Self) {
      
      inline def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      inline def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEventKey(value: String): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setIcon(value: (js.Function1[/* treeNode */ AntdTreeNodeAttribute, ReactNode]) | ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* treeNode */ AntdTreeNodeAttribute => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTitle(value: String | ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait AntTreeNodeSelectedEvent
    extends StObject
       with AntTreeNodeBaseEvent {
    
    var event: select_
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var selectedNodes: js.UndefOr[js.Array[DataNode]] = js.undefined
  }
  object AntTreeNodeSelectedEvent {
    
    inline def apply(nativeEvent: MouseEvent, node: AntTreeNode): AntTreeNodeSelectedEvent = {
      val __obj = js.Dynamic.literal(event = "select", nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeSelectedEvent]
    }
    
    extension [Self <: AntTreeNodeSelectedEvent](x: Self) {
      
      inline def setEvent(value: select_): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedNodes(value: js.Array[DataNode]): Self = StObject.set(x, "selectedNodes", value.asInstanceOf[js.Any])
      
      inline def setSelectedNodesUndefined: Self = StObject.set(x, "selectedNodes", js.undefined)
      
      inline def setSelectedNodesVarargs(value: DataNode*): Self = StObject.set(x, "selectedNodes", js.Array(value :_*))
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  trait AntdTreeNodeAttribute extends StObject {
    
    var checked: Boolean
    
    var children: ReactNode
    
    var className: String
    
    var disableCheckbox: Boolean
    
    var disabled: Boolean
    
    var dragOver: Boolean
    
    var dragOverGapBottom: Boolean
    
    var dragOverGapTop: Boolean
    
    var eventKey: String
    
    var expanded: Boolean
    
    var halfChecked: Boolean
    
    var isLeaf: Boolean
    
    var pos: String
    
    var prefixCls: String
    
    var selectable: Boolean
    
    var selected: Boolean
    
    var title: ReactNode
  }
  object AntdTreeNodeAttribute {
    
    inline def apply(
      checked: Boolean,
      className: String,
      disableCheckbox: Boolean,
      disabled: Boolean,
      dragOver: Boolean,
      dragOverGapBottom: Boolean,
      dragOverGapTop: Boolean,
      eventKey: String,
      expanded: Boolean,
      halfChecked: Boolean,
      isLeaf: Boolean,
      pos: String,
      prefixCls: String,
      selectable: Boolean,
      selected: Boolean
    ): AntdTreeNodeAttribute = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disableCheckbox = disableCheckbox.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dragOver = dragOver.asInstanceOf[js.Any], dragOverGapBottom = dragOverGapBottom.asInstanceOf[js.Any], dragOverGapTop = dragOverGapTop.asInstanceOf[js.Any], eventKey = eventKey.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntdTreeNodeAttribute]
    }
    
    extension [Self <: AntdTreeNodeAttribute](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDragOver(value: Boolean): Self = StObject.set(x, "dragOver", value.asInstanceOf[js.Any])
      
      inline def setDragOverGapBottom(value: Boolean): Self = StObject.set(x, "dragOverGapBottom", value.asInstanceOf[js.Any])
      
      inline def setDragOverGapTop(value: Boolean): Self = StObject.set(x, "dragOverGapTop", value.asInstanceOf[js.Any])
      
      inline def setEventKey(value: String): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setHalfChecked(value: Boolean): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[TreeProps & RefAttributes[typings.rcTree.mod.default]] {
    
    var DirectoryTree: ForwardRefExoticComponent[DirectoryTreeProps & RefAttributes[typings.rcTree.mod.default]] = js.native
    
    var TreeNode: FC[TreeNodeProps] = js.native
  }
  
  type TreeNodeNormal = DataNode
  
  /* Inlined parent std.Omit<rc-tree.rc-tree.TreeProps, 'prefixCls' | 'showLine'> */
  trait TreeProps extends StObject {
    
    /** 是否自动展开父节点 */
    var autoExpandParent: js.UndefOr[Boolean] = js.undefined
    
    var blockNode: js.UndefOr[Boolean] = js.undefined
    
    /** checkable状态下节点选择完全受控（父子节点选中状态不再关联） */
    var checkStrictly: js.UndefOr[Boolean] = js.undefined
    
    /** 是否支持选中 */
    var checkable: js.UndefOr[Boolean] = js.undefined
    
    /** （受控）选中复选框的树节点 */
    var checkedKeys: js.UndefOr[js.Array[Key] | Checked] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** 默认选中复选框的树节点 */
    var defaultCheckedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    /** 默认展开所有树节点 */
    var defaultExpandAll: js.UndefOr[Boolean] = js.undefined
    
    /** 默认展开对应树节点 */
    var defaultExpandParent: js.UndefOr[Boolean] = js.undefined
    
    /** 默认展开指定的树节点 */
    var defaultExpandedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    /** 默认选中的树节点 */
    var defaultSelectedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    /** 是否禁用树 */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** 设置节点可拖拽（IE>8） */
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    /** （受控）展开指定的树节点 */
    var expandedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    /** 点击树节点触发 */
    var filterAntTreeNode: js.UndefOr[js.Function1[/* node */ AntTreeNode, Boolean]] = js.undefined
    
    var filterTreeNode: js.UndefOr[js.Function1[/* treeNode */ EventDataNode, Boolean]] = js.undefined
    
    var focusable: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var icon: js.UndefOr[(js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactNode]) | ReactNode] = js.undefined
    
    var itemHeight: js.UndefOr[Double] = js.undefined
    
    var loadData: js.UndefOr[js.Function1[/* treeNode */ EventDataNode, js.Promise[Unit]]] = js.undefined
    
    var loadedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var motion: js.UndefOr[js.Any] = js.undefined
    
    /** 是否支持多选 */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var onActiveChange: js.UndefOr[js.Function1[/* key */ Key, Unit]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onCheck: js.UndefOr[
        js.Function2[
          /* checked */ typings.rcTree.anon.Checked | js.Array[Key], 
          /* info */ CheckInfo, 
          Unit
        ]
      ] = js.undefined
    
    var onClick: js.UndefOr[NodeMouseEventHandler[HTMLSpanElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[NodeMouseEventHandler[HTMLSpanElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[HTMLDivElement], Unit]] = js.undefined
    
    var onDragEnter: js.UndefOr[js.Function1[/* info */ NodeDragEventParamsHTMLDi, Unit]] = js.undefined
    
    var onDragLeave: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[HTMLDivElement], Unit]] = js.undefined
    
    var onDragOver: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[HTMLDivElement], Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[HTMLDivElement], Unit]] = js.undefined
    
    var onDrop: js.UndefOr[js.Function1[/* info */ NodeDragEventParamsHTMLDiDragNode, Unit]] = js.undefined
    
    var onExpand: js.UndefOr[js.Function2[/* expandedKeys */ js.Array[Key], /* info */ Expanded, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function2[/* loadedKeys */ js.Array[Key], /* info */ Node, Unit]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function1[/* info */ NodeMouseEventParams[HTMLSpanElement], Unit]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function1[/* info */ NodeMouseEventParams[HTMLSpanElement], Unit]] = js.undefined
    
    var onRightClick: js.UndefOr[js.Function1[/* info */ EventNode, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function2[/* selectedKeys */ js.Array[Key], /* info */ Event, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    /** （受控）设置选中的树节点 */
    var selectedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    var showLine: js.UndefOr[Boolean | ShowLeafIcon] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var switcherIcon: js.UndefOr[ReactElement] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var titleRender: js.UndefOr[js.Function1[/* node */ DataNode, ReactNode]] = js.undefined
    
    var treeData: js.UndefOr[js.Array[DataNode]] = js.undefined
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object TreeProps {
    
    inline def apply(): TreeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeProps]
    }
    
    extension [Self <: TreeProps](x: Self) {
      
      inline def setAutoExpandParent(value: Boolean): Self = StObject.set(x, "autoExpandParent", value.asInstanceOf[js.Any])
      
      inline def setAutoExpandParentUndefined: Self = StObject.set(x, "autoExpandParent", js.undefined)
      
      inline def setBlockNode(value: Boolean): Self = StObject.set(x, "blockNode", value.asInstanceOf[js.Any])
      
      inline def setBlockNodeUndefined: Self = StObject.set(x, "blockNode", js.undefined)
      
      inline def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
      
      inline def setCheckStrictlyUndefined: Self = StObject.set(x, "checkStrictly", js.undefined)
      
      inline def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setCheckedKeys(value: js.Array[Key] | Checked): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      inline def setCheckedKeysUndefined: Self = StObject.set(x, "checkedKeys", js.undefined)
      
      inline def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultCheckedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedKeysUndefined: Self = StObject.set(x, "defaultCheckedKeys", js.undefined)
      
      inline def setDefaultCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultCheckedKeys", js.Array(value :_*))
      
      inline def setDefaultExpandAll(value: Boolean): Self = StObject.set(x, "defaultExpandAll", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandAllUndefined: Self = StObject.set(x, "defaultExpandAll", js.undefined)
      
      inline def setDefaultExpandParent(value: Boolean): Self = StObject.set(x, "defaultExpandParent", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandParentUndefined: Self = StObject.set(x, "defaultExpandParent", js.undefined)
      
      inline def setDefaultExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultExpandedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedKeysUndefined: Self = StObject.set(x, "defaultExpandedKeys", js.undefined)
      
      inline def setDefaultExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultExpandedKeys", js.Array(value :_*))
      
      inline def setDefaultSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultSelectedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedKeysUndefined: Self = StObject.set(x, "defaultSelectedKeys", js.undefined)
      
      inline def setDefaultSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultSelectedKeys", js.Array(value :_*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      inline def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
      
      inline def setFilterAntTreeNode(value: /* node */ AntTreeNode => Boolean): Self = StObject.set(x, "filterAntTreeNode", js.Any.fromFunction1(value))
      
      inline def setFilterAntTreeNodeUndefined: Self = StObject.set(x, "filterAntTreeNode", js.undefined)
      
      inline def setFilterTreeNode(value: /* treeNode */ EventDataNode => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction1(value))
      
      inline def setFilterTreeNodeUndefined: Self = StObject.set(x, "filterTreeNode", js.undefined)
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIcon(value: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactNode]) | ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* nodeProps */ AntdTreeNodeAttribute => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      inline def setLoadData(value: /* treeNode */ EventDataNode => js.Promise[Unit]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      inline def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      inline def setLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
      
      inline def setLoadedKeysUndefined: Self = StObject.set(x, "loadedKeys", js.undefined)
      
      inline def setLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "loadedKeys", js.Array(value :_*))
      
      inline def setMotion(value: js.Any): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnActiveChange(value: /* key */ Key => Unit): Self = StObject.set(x, "onActiveChange", js.Any.fromFunction1(value))
      
      inline def setOnActiveChangeUndefined: Self = StObject.set(x, "onActiveChange", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCheck(value: (/* checked */ typings.rcTree.anon.Checked | js.Array[Key], /* info */ CheckInfo) => Unit): Self = StObject.set(x, "onCheck", js.Any.fromFunction2(value))
      
      inline def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
      
      inline def setOnClick(
        value: (/* e */ typings.react.mod.MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextMenu(value: typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnDoubleClick(
        value: (/* e */ typings.react.mod.MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit
      ): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction2(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDragEnd(value: /* info */ NodeDragEventParams[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: /* info */ NodeDragEventParamsHTMLDi => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragLeave(value: /* info */ NodeDragEventParams[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: /* info */ NodeDragEventParams[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: /* info */ NodeDragEventParams[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDrop(value: /* info */ NodeDragEventParamsHTMLDiDragNode => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnExpand(value: (/* expandedKeys */ js.Array[Key], /* info */ Expanded) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
      
      inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnLoad(value: (/* loadedKeys */ js.Array[Key], /* info */ Node) => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction2(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnMouseEnter(value: /* info */ NodeMouseEventParams[HTMLSpanElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* info */ NodeMouseEventParams[HTMLSpanElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnRightClick(value: /* info */ EventNode => Unit): Self = StObject.set(x, "onRightClick", js.Any.fromFunction1(value))
      
      inline def setOnRightClickUndefined: Self = StObject.set(x, "onRightClick", js.undefined)
      
      inline def setOnSelect(value: (/* selectedKeys */ js.Array[Key], /* info */ Event) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setShowLine(value: Boolean | ShowLeafIcon): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
      
      inline def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwitcherIcon(value: ReactElement): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitleRender(value: /* node */ DataNode => ReactNode): Self = StObject.set(x, "titleRender", js.Any.fromFunction1(value))
      
      inline def setTitleRenderUndefined: Self = StObject.set(x, "titleRender", js.undefined)
      
      inline def setTreeData(value: js.Array[DataNode]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      inline def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
      
      inline def setTreeDataVarargs(value: DataNode*): Self = StObject.set(x, "treeData", js.Array(value :_*))
      
      inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `treeTreeMod.foo` */
  override def _to: CompoundedComponent = default
}
