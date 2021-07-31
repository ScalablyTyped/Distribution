package typings.atlaskitTree

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.atlaskitTree.anon.Children
import typings.atlaskitTree.atlaskitTreeBooleans.`false`
import typings.atlaskitTree.atlaskitTreeNumbers.`35`
import typings.atlaskitTree.atlaskitTreeStrings.`border-box`
import typings.atlaskitTree.atlaskitTreeStrings.fixed
import typings.atlaskitTree.atlaskitTreeStrings.none
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactBeautifulDnd.mod.DraggableProvidedDragHandleProps
import typings.reactBeautifulDnd.mod.DraggableStateSnapshot
import typings.reactBeautifulDnd.mod.NotDraggingStyle
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@atlaskit/tree", JSImport.Default)
  @js.native
  class default ()
    extends Component[TreeProps, TreeState, js.Any]
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@atlaskit/tree", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@atlaskit/tree", "default.defaultProps.isDragEnabled")
      @js.native
      def isDragEnabled: `false` = js.native
      @scala.inline
      def isDragEnabled_=(x: `false`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDragEnabled")(x.asInstanceOf[js.Any])
      
      @JSImport("@atlaskit/tree", "default.defaultProps.isNestingEnabled")
      @js.native
      def isNestingEnabled: `false` = js.native
      @scala.inline
      def isNestingEnabled_=(x: `false`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isNestingEnabled")(x.asInstanceOf[js.Any])
      
      @JSImport("@atlaskit/tree", "default.defaultProps.offsetPerLevel")
      @js.native
      def offsetPerLevel: `35` = js.native
      @scala.inline
      def offsetPerLevel_=(x: `35`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offsetPerLevel")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def onCollapse(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCollapse")().asInstanceOf[Unit]
      
      @scala.inline
      def onDragEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDragEnd")().asInstanceOf[Unit]
      
      @scala.inline
      def onDragStart(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDragStart")().asInstanceOf[Unit]
      
      @scala.inline
      def onExpand(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onExpand")().asInstanceOf[Unit]
      
      @scala.inline
      def renderItem(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("renderItem")().asInstanceOf[Unit]
      
      @JSImport("@atlaskit/tree", "default.defaultProps.tree")
      @js.native
      def tree: Children = js.native
      @scala.inline
      def tree_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tree")(x.asInstanceOf[js.Any])
    }
  }
  
  @scala.inline
  def moveItemOnTree(tree: TreeData, from: TreeSourcePosition, to: TreeDestinationPosition): TreeData = (^.asInstanceOf[js.Dynamic].applyDynamic("moveItemOnTree")(tree.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[TreeData]
  
  @scala.inline
  def mutateTree(tree: TreeData, itemId: ItemId, mutation: TreeItemMutation): TreeData = (^.asInstanceOf[js.Dynamic].applyDynamic("mutateTree")(tree.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any], mutation.asInstanceOf[js.Any])).asInstanceOf[TreeData]
  
  trait FlattenedItem extends StObject {
    
    var item: TreeItem
    
    var path: Path
  }
  object FlattenedItem {
    
    @scala.inline
    def apply(item: TreeItem, path: Path): FlattenedItem = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlattenedItem]
    }
    
    @scala.inline
    implicit class FlattenedItemMutableBuilder[Self <: FlattenedItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: TreeItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
  
  type FlattenedTree = js.Array[FlattenedItem]
  
  type ItemId = js.Any
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type Path = js.Array[Double]
  
  trait RenderItemParams extends StObject {
    
    var depth: Double
    
    var item: TreeItem
    
    def onCollapse(itemId: ItemId): Unit
    
    def onExpand(itemId: ItemId): Unit
    
    var provided: TreeDraggableProvided
    
    var snapshot: DraggableStateSnapshot
  }
  object RenderItemParams {
    
    @scala.inline
    def apply(
      depth: Double,
      item: TreeItem,
      onCollapse: ItemId => Unit,
      onExpand: ItemId => Unit,
      provided: TreeDraggableProvided,
      snapshot: DraggableStateSnapshot
    ): RenderItemParams = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onCollapse = js.Any.fromFunction1(onCollapse), onExpand = js.Any.fromFunction1(onExpand), provided = provided.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderItemParams]
    }
    
    @scala.inline
    implicit class RenderItemParamsMutableBuilder[Self <: RenderItemParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: TreeItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCollapse(value: ItemId => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExpand(value: ItemId => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProvided(value: TreeDraggableProvided): Self = StObject.set(x, "provided", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshot(value: DraggableStateSnapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    }
  }
  
  type Tree = Component[TreeProps, TreeState, js.Any]
  
  trait TreeData extends StObject {
    
    var items: StringDictionary[TreeItem] & NumberDictionary[TreeItem]
    
    var rootId: ItemId
  }
  object TreeData {
    
    @scala.inline
    def apply(items: StringDictionary[TreeItem] & NumberDictionary[TreeItem], rootId: ItemId): TreeData = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeData]
    }
    
    @scala.inline
    implicit class TreeDataMutableBuilder[Self <: TreeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: StringDictionary[TreeItem] & NumberDictionary[TreeItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootId(value: ItemId): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeDestinationPosition extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    var parentId: ItemId
  }
  object TreeDestinationPosition {
    
    @scala.inline
    def apply(parentId: ItemId): TreeDestinationPosition = {
      val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeDestinationPosition]
    }
    
    @scala.inline
    implicit class TreeDestinationPositionMutableBuilder[Self <: TreeDestinationPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setParentId(value: ItemId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeDraggableProps extends StObject {
    
    // used for shared global styles
    var `data-react-beautiful-dnd-draggable`: String
    
    // Props that can be spread onto the element directly
    // inline style
    var style: js.UndefOr[TreeDraggableStyle] = js.undefined
  }
  object TreeDraggableProps {
    
    @scala.inline
    def apply(`data-react-beautiful-dnd-draggable`: String): TreeDraggableProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("data-react-beautiful-dnd-draggable")(`data-react-beautiful-dnd-draggable`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeDraggableProps]
    }
    
    @scala.inline
    implicit class TreeDraggablePropsMutableBuilder[Self <: TreeDraggableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setData-react-beautiful-dnd-draggable`(value: String): Self = StObject.set(x, "data-react-beautiful-dnd-draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: TreeDraggableStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait TreeDraggableProvided extends StObject {
    
    // will be null if the draggable is disabled
    var dragHandleProps: js.UndefOr[DraggableProvidedDragHandleProps] = js.native
    
    var draggableProps: TreeDraggableProps = js.native
    
    // The following props will be removed once we move to react 16
    def innerRef(): Unit = js.native
    def innerRef(element: HTMLElement): Unit = js.native
  }
  
  type TreeDraggableStyle = NotDraggingStyle | TreeDraggingStyle
  
  /* Inlined parent @atlaskit/tree.@atlaskit/tree.Omit<react-beautiful-dnd.react-beautiful-dnd.DraggingStyle, 'transition'> */
  trait TreeDraggingStyle extends StObject {
    
    var boxSizing: `border-box`
    
    var height: Double
    
    var left: Double
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var paddingLeft: Double
    
    var pointerEvents: none
    
    var position: fixed
    
    var top: Double
    
    var transform: js.UndefOr[String] = js.undefined
    
    var transition: none | String
    
    var width: Double
    
    var zIndex: Double
  }
  object TreeDraggingStyle {
    
    @scala.inline
    def apply(
      height: Double,
      left: Double,
      paddingLeft: Double,
      top: Double,
      transition: none | String,
      width: Double,
      zIndex: Double
    ): TreeDraggingStyle = {
      val __obj = js.Dynamic.literal(boxSizing = "border-box", height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], pointerEvents = "none", position = "fixed", top = top.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeDraggingStyle]
    }
    
    @scala.inline
    implicit class TreeDraggingStyleMutableBuilder[Self <: TreeDraggingStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoxSizing(value: `border-box`): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEvents(value: none): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: fixed): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTransition(value: none | String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeItem extends StObject {
    
    var children: js.Array[ItemId]
    
    var data: js.UndefOr[TreeItemData] = js.undefined
    
    var hasChildren: js.UndefOr[Boolean] = js.undefined
    
    var id: ItemId
    
    var isChildrenLoading: js.UndefOr[Boolean] = js.undefined
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
  }
  object TreeItem {
    
    @scala.inline
    def apply(children: js.Array[ItemId], id: ItemId): TreeItem = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeItem]
    }
    
    @scala.inline
    implicit class TreeItemMutableBuilder[Self <: TreeItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ItemId]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ItemId*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setData(value: TreeItemData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasChildrenUndefined: Self = StObject.set(x, "hasChildren", js.undefined)
      
      @scala.inline
      def setId(value: ItemId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChildrenLoading(value: Boolean): Self = StObject.set(x, "isChildrenLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChildrenLoadingUndefined: Self = StObject.set(x, "isChildrenLoading", js.undefined)
      
      @scala.inline
      def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    }
  }
  
  type TreeItemData = js.Any
  
  trait TreeItemMutation extends StObject {
    
    var children: js.UndefOr[js.Array[ItemId]] = js.undefined
    
    var data: js.UndefOr[TreeItemData] = js.undefined
    
    var hasChildren: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[ItemId] = js.undefined
    
    var isChildrenLoading: js.UndefOr[Boolean] = js.undefined
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
  }
  object TreeItemMutation {
    
    @scala.inline
    def apply(): TreeItemMutation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeItemMutation]
    }
    
    @scala.inline
    implicit class TreeItemMutationMutableBuilder[Self <: TreeItemMutation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ItemId]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ItemId*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setData(value: TreeItemData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasChildrenUndefined: Self = StObject.set(x, "hasChildren", js.undefined)
      
      @scala.inline
      def setId(value: ItemId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsChildrenLoading(value: Boolean): Self = StObject.set(x, "isChildrenLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChildrenLoadingUndefined: Self = StObject.set(x, "isChildrenLoading", js.undefined)
      
      @scala.inline
      def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    }
  }
  
  @js.native
  trait TreeProps extends StObject {
    
    /** Boolean to turn on drag&drop re-ordering on the tree */
    var isDragEnabled: Boolean = js.native
    
    /** Boolean to turn on hovering while dragging */
    var isNestingEnabled: Boolean = js.native
    
    /** Number of pixel is used to scaffold the tree by the consumer. */
    var offsetPerLevel: Double = js.native
    
    /** Function that will be called when a parent item needs to be collapsed. */
    def onCollapse(itemId: ItemId, path: Path): Unit = js.native
    
    /** Function that will be called when the user finishes dragging. */
    def onDragEnd(sourcePosition: TreeSourcePosition): Unit = js.native
    def onDragEnd(sourcePosition: TreeSourcePosition, destinationPosition: TreeDestinationPosition): Unit = js.native
    
    /** Function that will be called when the user starts dragging. */
    def onDragStart(itemId: ItemId): Unit = js.native
    
    /** Function that will be called when a parent item needs to be expanded. */
    def onExpand(itemId: ItemId, path: Path): Unit = js.native
    
    /** Function that will be called to render a single item. */
    def renderItem(itemProps: RenderItemParams): ReactNode = js.native
    
    /** The tree data structure. */
    var tree: TreeData = js.native
  }
  
  trait TreeSourcePosition extends StObject {
    
    var index: Double
    
    var parentId: ItemId
  }
  object TreeSourcePosition {
    
    @scala.inline
    def apply(index: Double, parentId: ItemId): TreeSourcePosition = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeSourcePosition]
    }
    
    @scala.inline
    implicit class TreeSourcePositionMutableBuilder[Self <: TreeSourcePosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentId(value: ItemId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeState extends StObject {
    
    // Id of the currently dragged item
    var draggedItemId: ItemId
    
    /** The flattened tree data structure transformed from props.tree */
    var flattenedTree: FlattenedTree
  }
  object TreeState {
    
    @scala.inline
    def apply(draggedItemId: ItemId, flattenedTree: FlattenedTree): TreeState = {
      val __obj = js.Dynamic.literal(draggedItemId = draggedItemId.asInstanceOf[js.Any], flattenedTree = flattenedTree.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeState]
    }
    
    @scala.inline
    implicit class TreeStateMutableBuilder[Self <: TreeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDraggedItemId(value: ItemId): Self = StObject.set(x, "draggedItemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenedTree(value: FlattenedTree): Self = StObject.set(x, "flattenedTree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenedTreeVarargs(value: FlattenedItem*): Self = StObject.set(x, "flattenedTree", js.Array(value :_*))
    }
  }
}
