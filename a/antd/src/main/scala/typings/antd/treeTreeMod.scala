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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeTreeMod extends Shortcut {
  
  @JSImport("antd/lib/tree/Tree", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  type AntTreeNode = Component[AntTreeNodeProps, js.Object, js.Any]
  
  @js.native
  trait AntTreeNodeBaseEvent extends StObject {
    
    var nativeEvent: MouseEvent = js.native
    
    var node: AntTreeNode = js.native
  }
  object AntTreeNodeBaseEvent {
    
    @scala.inline
    def apply(nativeEvent: MouseEvent, node: AntTreeNode): AntTreeNodeBaseEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeBaseEvent]
    }
    
    @scala.inline
    implicit class AntTreeNodeBaseEventMutableBuilder[Self <: AntTreeNodeBaseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNativeEvent(value: MouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: AntTreeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AntTreeNodeCheckedEvent extends AntTreeNodeBaseEvent {
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var checkedNodes: js.UndefOr[js.Array[AntTreeNode]] = js.native
    
    var event: check = js.native
  }
  object AntTreeNodeCheckedEvent {
    
    @scala.inline
    def apply(event: check, nativeEvent: MouseEvent, node: AntTreeNode): AntTreeNodeCheckedEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeCheckedEvent]
    }
    
    @scala.inline
    implicit class AntTreeNodeCheckedEventMutableBuilder[Self <: AntTreeNodeCheckedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedNodes(value: js.Array[AntTreeNode]): Self = StObject.set(x, "checkedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedNodesUndefined: Self = StObject.set(x, "checkedNodes", js.undefined)
      
      @scala.inline
      def setCheckedNodesVarargs(value: AntTreeNode*): Self = StObject.set(x, "checkedNodes", js.Array(value :_*))
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setEvent(value: check): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AntTreeNodeDragEnterEvent extends AntTreeNodeMouseEvent {
    
    var expandedKeys: js.Array[Key] = js.native
  }
  object AntTreeNodeDragEnterEvent {
    
    @scala.inline
    def apply(event: DragEvent[HTMLElement], expandedKeys: js.Array[Key], node: AntTreeNode): AntTreeNodeDragEnterEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeDragEnterEvent]
    }
    
    @scala.inline
    implicit class AntTreeNodeDragEnterEventMutableBuilder[Self <: AntTreeNodeDragEnterEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
    }
  }
  
  @js.native
  trait AntTreeNodeDropEvent extends StObject {
    
    var dragNode: AntTreeNode = js.native
    
    var dragNodesKeys: js.Array[Key] = js.native
    
    var dropPosition: Double = js.native
    
    var dropToGap: js.UndefOr[Boolean] = js.native
    
    var event: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent] = js.native
    
    var node: AntTreeNode = js.native
  }
  object AntTreeNodeDropEvent {
    
    @scala.inline
    def apply(
      dragNode: AntTreeNode,
      dragNodesKeys: js.Array[Key],
      dropPosition: Double,
      event: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent],
      node: AntTreeNode
    ): AntTreeNodeDropEvent = {
      val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeDropEvent]
    }
    
    @scala.inline
    implicit class AntTreeNodeDropEventMutableBuilder[Self <: AntTreeNodeDropEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDragNode(value: AntTreeNode): Self = StObject.set(x, "dragNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragNodesKeys(value: js.Array[Key]): Self = StObject.set(x, "dragNodesKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragNodesKeysVarargs(value: Key*): Self = StObject.set(x, "dragNodesKeys", js.Array(value :_*))
      
      @scala.inline
      def setDropPosition(value: Double): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropToGap(value: Boolean): Self = StObject.set(x, "dropToGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropToGapUndefined: Self = StObject.set(x, "dropToGap", js.undefined)
      
      @scala.inline
      def setEvent(value: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: AntTreeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AntTreeNodeExpandedEvent extends AntTreeNodeBaseEvent {
    
    var expanded: js.UndefOr[Boolean] = js.native
  }
  object AntTreeNodeExpandedEvent {
    
    @scala.inline
    def apply(nativeEvent: MouseEvent, node: AntTreeNode): AntTreeNodeExpandedEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeExpandedEvent]
    }
    
    @scala.inline
    implicit class AntTreeNodeExpandedEventMutableBuilder[Self <: AntTreeNodeExpandedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    }
  }
  
  @js.native
  trait AntTreeNodeMouseEvent extends StObject {
    
    var event: DragEvent[HTMLElement] = js.native
    
    var node: AntTreeNode = js.native
  }
  object AntTreeNodeMouseEvent {
    
    @scala.inline
    def apply(event: DragEvent[HTMLElement], node: AntTreeNode): AntTreeNodeMouseEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeMouseEvent]
    }
    
    @scala.inline
    implicit class AntTreeNodeMouseEventMutableBuilder[Self <: AntTreeNodeMouseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: DragEvent[HTMLElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: AntTreeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AntTreeNodeProps
    extends /* customProp */ StringDictionary[js.Any] {
    
    var checkable: js.UndefOr[Boolean] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disableCheckbox: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var eventKey: js.UndefOr[String] = js.native
    
    var expanded: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[(js.Function1[/* treeNode */ AntdTreeNodeAttribute, ReactNode]) | ReactNode] = js.native
    
    var isLeaf: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[String | ReactNode] = js.native
  }
  object AntTreeNodeProps {
    
    @scala.inline
    def apply(): AntTreeNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AntTreeNodeProps]
    }
    
    @scala.inline
    implicit class AntTreeNodePropsMutableBuilder[Self <: AntTreeNodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEventKey(value: String): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setIcon(value: (js.Function1[/* treeNode */ AntdTreeNodeAttribute, ReactNode]) | ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* treeNode */ AntdTreeNodeAttribute => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setTitle(value: String | ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait AntTreeNodeSelectedEvent extends AntTreeNodeBaseEvent {
    
    var event: select_ = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var selectedNodes: js.UndefOr[js.Array[DataNode]] = js.native
  }
  object AntTreeNodeSelectedEvent {
    
    @scala.inline
    def apply(event: select_, nativeEvent: MouseEvent, node: AntTreeNode): AntTreeNodeSelectedEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeSelectedEvent]
    }
    
    @scala.inline
    implicit class AntTreeNodeSelectedEventMutableBuilder[Self <: AntTreeNodeSelectedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: select_): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedNodes(value: js.Array[DataNode]): Self = StObject.set(x, "selectedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedNodesUndefined: Self = StObject.set(x, "selectedNodes", js.undefined)
      
      @scala.inline
      def setSelectedNodesVarargs(value: DataNode*): Self = StObject.set(x, "selectedNodes", js.Array(value :_*))
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  @js.native
  trait AntdTreeNodeAttribute extends StObject {
    
    var checked: Boolean = js.native
    
    var children: ReactNode = js.native
    
    var className: String = js.native
    
    var disableCheckbox: Boolean = js.native
    
    var disabled: Boolean = js.native
    
    var dragOver: Boolean = js.native
    
    var dragOverGapBottom: Boolean = js.native
    
    var dragOverGapTop: Boolean = js.native
    
    var eventKey: String = js.native
    
    var expanded: Boolean = js.native
    
    var halfChecked: Boolean = js.native
    
    var isLeaf: Boolean = js.native
    
    var pos: String = js.native
    
    var prefixCls: String = js.native
    
    var selectable: Boolean = js.native
    
    var selected: Boolean = js.native
    
    var title: ReactNode = js.native
  }
  object AntdTreeNodeAttribute {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class AntdTreeNodeAttributeMutableBuilder[Self <: AntdTreeNodeAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOver(value: Boolean): Self = StObject.set(x, "dragOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOverGapBottom(value: Boolean): Self = StObject.set(x, "dragOverGapBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOverGapTop(value: Boolean): Self = StObject.set(x, "dragOverGapTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKey(value: String): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfChecked(value: Boolean): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait CompoundedComponent
    extends ForwardRefExoticComponent[TreeProps with RefAttributes[typings.rcTree.mod.default]] {
    
    var DirectoryTree: ForwardRefExoticComponent[DirectoryTreeProps with RefAttributes[typings.rcTree.mod.default]] = js.native
    
    var TreeNode: FC[TreeNodeProps] = js.native
  }
  
  type TreeNodeNormal = DataNode
  
  /* Inlined parent std.Omit<rc-tree.rc-tree.TreeProps, 'prefixCls' | 'showLine'> */
  @js.native
  trait TreeProps extends StObject {
    
    /** 是否自动展开父节点 */
    var autoExpandParent: js.UndefOr[Boolean] = js.native
    
    var blockNode: js.UndefOr[Boolean] = js.native
    
    /** checkable状态下节点选择完全受控（父子节点选中状态不再关联） */
    var checkStrictly: js.UndefOr[Boolean] = js.native
    
    /** 是否支持选中 */
    var checkable: js.UndefOr[Boolean] = js.native
    
    /** （受控）选中复选框的树节点 */
    var checkedKeys: js.UndefOr[js.Array[Key] | Checked] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /** 默认选中复选框的树节点 */
    var defaultCheckedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    /** 默认展开所有树节点 */
    var defaultExpandAll: js.UndefOr[Boolean] = js.native
    
    /** 默认展开对应树节点 */
    var defaultExpandParent: js.UndefOr[Boolean] = js.native
    
    /** 默认展开指定的树节点 */
    var defaultExpandedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    /** 默认选中的树节点 */
    var defaultSelectedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    /** 是否禁用树 */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** 设置节点可拖拽（IE>8） */
    var draggable: js.UndefOr[Boolean] = js.native
    
    /** （受控）展开指定的树节点 */
    var expandedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    /** 点击树节点触发 */
    var filterAntTreeNode: js.UndefOr[js.Function1[/* node */ AntTreeNode, Boolean]] = js.native
    
    var filterTreeNode: js.UndefOr[js.Function1[/* treeNode */ EventDataNode, Boolean]] = js.native
    
    var focusable: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var icon: js.UndefOr[(js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactNode]) | ReactNode] = js.native
    
    var itemHeight: js.UndefOr[Double] = js.native
    
    var loadData: js.UndefOr[js.Function1[/* treeNode */ EventDataNode, js.Promise[Unit]]] = js.native
    
    var loadedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var motion: js.UndefOr[js.Any] = js.native
    
    /** 是否支持多选 */
    var multiple: js.UndefOr[Boolean] = js.native
    
    var onActiveChange: js.UndefOr[js.Function1[/* key */ Key, Unit]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onCheck: js.UndefOr[
        js.Function2[
          /* checked */ typings.rcTree.anon.Checked | js.Array[Key], 
          /* info */ CheckInfo, 
          Unit
        ]
      ] = js.native
    
    var onClick: js.UndefOr[NodeMouseEventHandler[HTMLSpanElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onDoubleClick: js.UndefOr[NodeMouseEventHandler[HTMLSpanElement]] = js.native
    
    var onDragEnd: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[HTMLDivElement], Unit]] = js.native
    
    var onDragEnter: js.UndefOr[js.Function1[/* info */ NodeDragEventParamsHTMLDi, Unit]] = js.native
    
    var onDragLeave: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[HTMLDivElement], Unit]] = js.native
    
    var onDragOver: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[HTMLDivElement], Unit]] = js.native
    
    var onDragStart: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[HTMLDivElement], Unit]] = js.native
    
    var onDrop: js.UndefOr[js.Function1[/* info */ NodeDragEventParamsHTMLDiDragNode, Unit]] = js.native
    
    var onExpand: js.UndefOr[js.Function2[/* expandedKeys */ js.Array[Key], /* info */ Expanded, Unit]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onLoad: js.UndefOr[js.Function2[/* loadedKeys */ js.Array[Key], /* info */ Node, Unit]] = js.native
    
    var onMouseEnter: js.UndefOr[js.Function1[/* info */ NodeMouseEventParams[HTMLSpanElement], Unit]] = js.native
    
    var onMouseLeave: js.UndefOr[js.Function1[/* info */ NodeMouseEventParams[HTMLSpanElement], Unit]] = js.native
    
    var onRightClick: js.UndefOr[js.Function1[/* info */ EventNode, Unit]] = js.native
    
    var onSelect: js.UndefOr[js.Function2[/* selectedKeys */ js.Array[Key], /* info */ Event, Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    /** （受控）设置选中的树节点 */
    var selectedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var showIcon: js.UndefOr[Boolean] = js.native
    
    var showLine: js.UndefOr[Boolean | ShowLeafIcon] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var switcherIcon: js.UndefOr[ReactElement] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var titleRender: js.UndefOr[js.Function1[/* node */ DataNode, ReactNode]] = js.native
    
    var treeData: js.UndefOr[js.Array[DataNode]] = js.native
    
    var virtual: js.UndefOr[Boolean] = js.native
  }
  object TreeProps {
    
    @scala.inline
    def apply(): TreeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeProps]
    }
    
    @scala.inline
    implicit class TreePropsMutableBuilder[Self <: TreeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoExpandParent(value: Boolean): Self = StObject.set(x, "autoExpandParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoExpandParentUndefined: Self = StObject.set(x, "autoExpandParent", js.undefined)
      
      @scala.inline
      def setBlockNode(value: Boolean): Self = StObject.set(x, "blockNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockNodeUndefined: Self = StObject.set(x, "blockNode", js.undefined)
      
      @scala.inline
      def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckStrictlyUndefined: Self = StObject.set(x, "checkStrictly", js.undefined)
      
      @scala.inline
      def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setCheckedKeys(value: js.Array[Key] | Checked): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedKeysUndefined: Self = StObject.set(x, "checkedKeys", js.undefined)
      
      @scala.inline
      def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultCheckedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedKeysUndefined: Self = StObject.set(x, "defaultCheckedKeys", js.undefined)
      
      @scala.inline
      def setDefaultCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultCheckedKeys", js.Array(value :_*))
      
      @scala.inline
      def setDefaultExpandAll(value: Boolean): Self = StObject.set(x, "defaultExpandAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExpandAllUndefined: Self = StObject.set(x, "defaultExpandAll", js.undefined)
      
      @scala.inline
      def setDefaultExpandParent(value: Boolean): Self = StObject.set(x, "defaultExpandParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExpandParentUndefined: Self = StObject.set(x, "defaultExpandParent", js.undefined)
      
      @scala.inline
      def setDefaultExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultExpandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExpandedKeysUndefined: Self = StObject.set(x, "defaultExpandedKeys", js.undefined)
      
      @scala.inline
      def setDefaultExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultExpandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setDefaultSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultSelectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedKeysUndefined: Self = StObject.set(x, "defaultSelectedKeys", js.undefined)
      
      @scala.inline
      def setDefaultSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultSelectedKeys", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      @scala.inline
      def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setFilterAntTreeNode(value: /* node */ AntTreeNode => Boolean): Self = StObject.set(x, "filterAntTreeNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterAntTreeNodeUndefined: Self = StObject.set(x, "filterAntTreeNode", js.undefined)
      
      @scala.inline
      def setFilterTreeNode(value: /* treeNode */ EventDataNode => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterTreeNodeUndefined: Self = StObject.set(x, "filterTreeNode", js.undefined)
      
      @scala.inline
      def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIcon(value: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactNode]) | ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* nodeProps */ AntdTreeNodeAttribute => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      @scala.inline
      def setLoadData(value: /* treeNode */ EventDataNode => js.Promise[Unit]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      @scala.inline
      def setLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedKeysUndefined: Self = StObject.set(x, "loadedKeys", js.undefined)
      
      @scala.inline
      def setLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "loadedKeys", js.Array(value :_*))
      
      @scala.inline
      def setMotion(value: js.Any): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setOnActiveChange(value: /* key */ Key => Unit): Self = StObject.set(x, "onActiveChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActiveChangeUndefined: Self = StObject.set(x, "onActiveChange", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCheck(value: (/* checked */ typings.rcTree.anon.Checked | js.Array[Key], /* info */ CheckInfo) => Unit): Self = StObject.set(x, "onCheck", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (/* e */ typings.react.mod.MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(
        value: (/* e */ typings.react.mod.MouseEvent[HTMLSpanElement, NativeMouseEvent], /* node */ EventDataNode) => Unit
      ): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDragEnd(value: /* info */ NodeDragEventParams[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: /* info */ NodeDragEventParamsHTMLDi => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: /* info */ NodeDragEventParams[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: /* info */ NodeDragEventParams[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: /* info */ NodeDragEventParams[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDrop(value: /* info */ NodeDragEventParamsHTMLDiDragNode => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnExpand(value: (/* expandedKeys */ js.Array[Key], /* info */ Expanded) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnLoad(value: (/* loadedKeys */ js.Array[Key], /* info */ Node) => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: /* info */ NodeMouseEventParams[HTMLSpanElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: /* info */ NodeMouseEventParams[HTMLSpanElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnRightClick(value: /* info */ EventNode => Unit): Self = StObject.set(x, "onRightClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRightClickUndefined: Self = StObject.set(x, "onRightClick", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (/* selectedKeys */ js.Array[Key], /* info */ Event) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      @scala.inline
      def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
      
      @scala.inline
      def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      @scala.inline
      def setShowLine(value: Boolean | ShowLeafIcon): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSwitcherIcon(value: ReactElement): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitleRender(value: /* node */ DataNode => ReactNode): Self = StObject.set(x, "titleRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleRenderUndefined: Self = StObject.set(x, "titleRender", js.undefined)
      
      @scala.inline
      def setTreeData(value: js.Array[DataNode]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
      
      @scala.inline
      def setTreeDataVarargs(value: DataNode*): Self = StObject.set(x, "treeData", js.Array(value :_*))
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `treeTreeMod.foo` */
  override def _to: CompoundedComponent = default
}
