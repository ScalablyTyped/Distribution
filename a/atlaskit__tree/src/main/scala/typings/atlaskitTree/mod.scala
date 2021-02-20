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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
      
      @JSImport("@atlaskit/tree", "default.defaultProps.onCollapse")
      @js.native
      def onCollapse(): Unit = js.native
      
      @JSImport("@atlaskit/tree", "default.defaultProps.onDragEnd")
      @js.native
      def onDragEnd(): Unit = js.native
      
      @JSImport("@atlaskit/tree", "default.defaultProps.onDragStart")
      @js.native
      def onDragStart(): Unit = js.native
      
      @JSImport("@atlaskit/tree", "default.defaultProps.onExpand")
      @js.native
      def onExpand(): Unit = js.native
      
      @JSImport("@atlaskit/tree", "default.defaultProps.renderItem")
      @js.native
      def renderItem(): Unit = js.native
      
      @JSImport("@atlaskit/tree", "default.defaultProps.tree")
      @js.native
      def tree: Children = js.native
      @scala.inline
      def tree_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tree")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@atlaskit/tree", "moveItemOnTree")
  @js.native
  def moveItemOnTree(tree: TreeData, from: TreeSourcePosition, to: TreeDestinationPosition): TreeData = js.native
  
  @JSImport("@atlaskit/tree", "mutateTree")
  @js.native
  def mutateTree(tree: TreeData, itemId: ItemId, mutation: TreeItemMutation): TreeData = js.native
  
  @js.native
  trait FlattenedItem extends StObject {
    
    var item: TreeItem = js.native
    
    var path: Path = js.native
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
  
  @js.native
  trait RenderItemParams extends StObject {
    
    var depth: Double = js.native
    
    var item: TreeItem = js.native
    
    def onCollapse(itemId: ItemId): Unit = js.native
    
    def onExpand(itemId: ItemId): Unit = js.native
    
    var provided: TreeDraggableProvided = js.native
    
    var snapshot: DraggableStateSnapshot = js.native
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
  
  @js.native
  trait TreeData extends StObject {
    
    var items: StringDictionary[TreeItem] with NumberDictionary[TreeItem] = js.native
    
    var rootId: ItemId = js.native
  }
  object TreeData {
    
    @scala.inline
    def apply(items: StringDictionary[TreeItem] with NumberDictionary[TreeItem], rootId: ItemId): TreeData = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeData]
    }
    
    @scala.inline
    implicit class TreeDataMutableBuilder[Self <: TreeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: StringDictionary[TreeItem] with NumberDictionary[TreeItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootId(value: ItemId): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TreeDestinationPosition extends StObject {
    
    var index: js.UndefOr[Double] = js.native
    
    var parentId: ItemId = js.native
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
  
  @js.native
  trait TreeDraggableProps extends StObject {
    
    // used for shared global styles
    var `data-react-beautiful-dnd-draggable`: String = js.native
    
    // Props that can be spread onto the element directly
    // inline style
    var style: js.UndefOr[TreeDraggableStyle] = js.native
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
  @js.native
  trait TreeDraggingStyle extends StObject {
    
    var boxSizing: `border-box` = js.native
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var paddingLeft: Double = js.native
    
    var pointerEvents: none = js.native
    
    var position: fixed = js.native
    
    var top: Double = js.native
    
    var transform: js.UndefOr[String] = js.native
    
    var transition: none | String = js.native
    
    var width: Double = js.native
    
    var zIndex: Double = js.native
  }
  object TreeDraggingStyle {
    
    @scala.inline
    def apply(
      boxSizing: `border-box`,
      height: Double,
      left: Double,
      paddingLeft: Double,
      pointerEvents: none,
      position: fixed,
      top: Double,
      transition: none | String,
      width: Double,
      zIndex: Double
    ): TreeDraggingStyle = {
      val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], pointerEvents = pointerEvents.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
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
  
  @js.native
  trait TreeItem extends StObject {
    
    var children: js.Array[ItemId] = js.native
    
    var data: js.UndefOr[TreeItemData] = js.native
    
    var hasChildren: js.UndefOr[Boolean] = js.native
    
    var id: ItemId = js.native
    
    var isChildrenLoading: js.UndefOr[Boolean] = js.native
    
    var isExpanded: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait TreeItemMutation extends StObject {
    
    var children: js.UndefOr[js.Array[ItemId]] = js.native
    
    var data: js.UndefOr[TreeItemData] = js.native
    
    var hasChildren: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[ItemId] = js.native
    
    var isChildrenLoading: js.UndefOr[Boolean] = js.native
    
    var isExpanded: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait TreeSourcePosition extends StObject {
    
    var index: Double = js.native
    
    var parentId: ItemId = js.native
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
  
  @js.native
  trait TreeState extends StObject {
    
    // Id of the currently dragged item
    var draggedItemId: ItemId = js.native
    
    /** The flattened tree data structure transformed from props.tree */
    var flattenedTree: FlattenedTree = js.native
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
