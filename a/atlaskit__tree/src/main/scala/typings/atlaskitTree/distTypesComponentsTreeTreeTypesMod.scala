package typings.atlaskitTree

import typings.atlaskitTree.distTypesComponentsTreeItemTreeItemTypesMod.RenderItemParams
import typings.atlaskitTree.distTypesTypesMod.FlattenedItem
import typings.atlaskitTree.distTypesTypesMod.FlattenedTree
import typings.atlaskitTree.distTypesTypesMod.ItemId
import typings.atlaskitTree.distTypesTypesMod.Path
import typings.atlaskitTree.distTypesTypesMod.TreeData
import typings.atlaskitTree.distTypesTypesMod.TreeDestinationPosition
import typings.atlaskitTree.distTypesTypesMod.TreeItem
import typings.atlaskitTree.distTypesTypesMod.TreeSourcePosition
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsTreeTreeTypesMod {
  
  trait Combine extends StObject {
    
    var draggableId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableId */ Any
    
    var droppableId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DroppableId */ Any
  }
  object Combine {
    
    inline def apply(
      draggableId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableId */ Any,
      droppableId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DroppableId */ Any
    ): Combine = {
      val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], droppableId = droppableId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Combine]
    }
    
    extension [Self <: Combine](x: Self) {
      
      inline def setDraggableId(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableId */ Any
      ): Self = StObject.set(x, "draggableId", value.asInstanceOf[js.Any])
      
      inline def setDroppableId(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DroppableId */ Any
      ): Self = StObject.set(x, "droppableId", value.asInstanceOf[js.Any])
    }
  }
  
  trait DragState extends StObject {
    
    var combine: js.UndefOr[Combine] = js.undefined
    
    var destination: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableLocation */ Any
      ] = js.undefined
    
    var horizontalLevel: js.UndefOr[Double] = js.undefined
    
    var mode: String
    
    var source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableLocation */ Any
  }
  object DragState {
    
    inline def apply(
      mode: String,
      source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableLocation */ Any
    ): DragState = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragState]
    }
    
    extension [Self <: DragState](x: Self) {
      
      inline def setCombine(value: Combine): Self = StObject.set(x, "combine", value.asInstanceOf[js.Any])
      
      inline def setCombineUndefined: Self = StObject.set(x, "combine", js.undefined)
      
      inline def setDestination(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableLocation */ Any
      ): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setHorizontalLevel(value: Double): Self = StObject.set(x, "horizontalLevel", value.asInstanceOf[js.Any])
      
      inline def setHorizontalLevelUndefined: Self = StObject.set(x, "horizontalLevel", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setSource(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableLocation */ Any
      ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Props extends StObject {
    
    /** Boolean to turn on drag&drop re-ordering on the tree */
    var isDragEnabled: Boolean | (js.Function1[/* item */ TreeItem, Boolean]) = js.native
    
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
    def renderItem(item: RenderItemParams): ReactNode = js.native
    
    /** The tree data structure. */
    var tree: TreeData = js.native
  }
  
  trait State extends StObject {
    
    var draggedItemId: js.UndefOr[ItemId] = js.undefined
    
    /** The flattened tree data structure transformed from props.tree */
    var flattenedTree: FlattenedTree
  }
  object State {
    
    inline def apply(flattenedTree: FlattenedTree): State = {
      val __obj = js.Dynamic.literal(flattenedTree = flattenedTree.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setDraggedItemId(value: ItemId): Self = StObject.set(x, "draggedItemId", value.asInstanceOf[js.Any])
      
      inline def setDraggedItemIdUndefined: Self = StObject.set(x, "draggedItemId", js.undefined)
      
      inline def setFlattenedTree(value: FlattenedTree): Self = StObject.set(x, "flattenedTree", value.asInstanceOf[js.Any])
      
      inline def setFlattenedTreeVarargs(value: FlattenedItem*): Self = StObject.set(x, "flattenedTree", js.Array(value*))
    }
  }
}
