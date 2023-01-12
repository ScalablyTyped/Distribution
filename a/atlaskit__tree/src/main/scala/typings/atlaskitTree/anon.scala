package typings.atlaskitTree

import typings.atlaskitTree.distTypesTypesMod.FlattenedItem
import typings.atlaskitTree.distTypesTypesMod.ItemId
import typings.atlaskitTree.distTypesTypesMod.Path
import typings.atlaskitTree.distTypesTypesMod.TreeDestinationPosition
import typings.atlaskitTree.distTypesTypesMod.TreeSourcePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.Array[scala.Nothing]
  }
  object Children {
    
    inline def apply(children: js.Array[scala.Nothing]): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[scala.Nothing]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: scala.Nothing*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait DestinationPosition extends StObject {
    
    var destinationPosition: js.UndefOr[TreeDestinationPosition] = js.undefined
    
    var sourcePosition: TreeSourcePosition
  }
  object DestinationPosition {
    
    inline def apply(sourcePosition: TreeSourcePosition): DestinationPosition = {
      val __obj = js.Dynamic.literal(sourcePosition = sourcePosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[DestinationPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestinationPosition] (val x: Self) extends AnyVal {
      
      inline def setDestinationPosition(value: TreeDestinationPosition): Self = StObject.set(x, "destinationPosition", value.asInstanceOf[js.Any])
      
      inline def setDestinationPositionUndefined: Self = StObject.set(x, "destinationPosition", js.undefined)
      
      inline def setSourcePosition(value: TreeSourcePosition): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
    }
  }
  
  trait DraggedItemId extends StObject {
    
    var draggedItemId: js.UndefOr[ItemId] = js.undefined
    
    var flattenedTree: js.Array[FlattenedItem]
  }
  object DraggedItemId {
    
    inline def apply(flattenedTree: js.Array[FlattenedItem]): DraggedItemId = {
      val __obj = js.Dynamic.literal(flattenedTree = flattenedTree.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraggedItemId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DraggedItemId] (val x: Self) extends AnyVal {
      
      inline def setDraggedItemId(value: ItemId): Self = StObject.set(x, "draggedItemId", value.asInstanceOf[js.Any])
      
      inline def setDraggedItemIdUndefined: Self = StObject.set(x, "draggedItemId", js.undefined)
      
      inline def setFlattenedTree(value: js.Array[FlattenedItem]): Self = StObject.set(x, "flattenedTree", value.asInstanceOf[js.Any])
      
      inline def setFlattenedTreeVarargs(value: FlattenedItem*): Self = StObject.set(x, "flattenedTree", js.Array(value*))
    }
  }
  
  trait FlatItem extends StObject {
    
    var flatItem: FlattenedItem
    
    var path: Path
    
    var provided: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableProvided */ Any
    
    var snapshot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any
  }
  object FlatItem {
    
    inline def apply(
      flatItem: FlattenedItem,
      path: Path,
      provided: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableProvided */ Any,
      snapshot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any
    ): FlatItem = {
      val __obj = js.Dynamic.literal(flatItem = flatItem.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], provided = provided.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlatItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlatItem] (val x: Self) extends AnyVal {
      
      inline def setFlatItem(value: FlattenedItem): Self = StObject.set(x, "flatItem", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setProvided(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableProvided */ Any
      ): Self = StObject.set(x, "provided", value.asInstanceOf[js.Any])
      
      inline def setSnapshot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any
      ): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlattenedTree extends StObject {
    
    var draggedItemId: Unit
    
    var flattenedTree: js.Array[scala.Nothing]
  }
  object FlattenedTree {
    
    inline def apply(draggedItemId: Unit, flattenedTree: js.Array[scala.Nothing]): FlattenedTree = {
      val __obj = js.Dynamic.literal(draggedItemId = draggedItemId.asInstanceOf[js.Any], flattenedTree = flattenedTree.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlattenedTree]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlattenedTree] (val x: Self) extends AnyVal {
      
      inline def setDraggedItemId(value: Unit): Self = StObject.set(x, "draggedItemId", value.asInstanceOf[js.Any])
      
      inline def setFlattenedTree(value: js.Array[scala.Nothing]): Self = StObject.set(x, "flattenedTree", value.asInstanceOf[js.Any])
      
      inline def setFlattenedTreeVarargs(value: scala.Nothing*): Self = StObject.set(x, "flattenedTree", js.Array(value*))
    }
  }
  
  trait IsDragEnabled extends StObject {
    
    var isDragEnabled: Boolean
    
    var isNestingEnabled: Boolean
    
    var offsetPerLevel: Double
    
    def onCollapse(): Unit
    
    def onDragEnd(): Unit
    
    def onDragStart(): Unit
    
    def onExpand(): Unit
    
    def renderItem(): Unit
    
    var tree: Children
  }
  object IsDragEnabled {
    
    inline def apply(
      isDragEnabled: Boolean,
      isNestingEnabled: Boolean,
      offsetPerLevel: Double,
      onCollapse: () => Unit,
      onDragEnd: () => Unit,
      onDragStart: () => Unit,
      onExpand: () => Unit,
      renderItem: () => Unit,
      tree: Children
    ): IsDragEnabled = {
      val __obj = js.Dynamic.literal(isDragEnabled = isDragEnabled.asInstanceOf[js.Any], isNestingEnabled = isNestingEnabled.asInstanceOf[js.Any], offsetPerLevel = offsetPerLevel.asInstanceOf[js.Any], onCollapse = js.Any.fromFunction0(onCollapse), onDragEnd = js.Any.fromFunction0(onDragEnd), onDragStart = js.Any.fromFunction0(onDragStart), onExpand = js.Any.fromFunction0(onExpand), renderItem = js.Any.fromFunction0(renderItem), tree = tree.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsDragEnabled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsDragEnabled] (val x: Self) extends AnyVal {
      
      inline def setIsDragEnabled(value: Boolean): Self = StObject.set(x, "isDragEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsNestingEnabled(value: Boolean): Self = StObject.set(x, "isNestingEnabled", value.asInstanceOf[js.Any])
      
      inline def setOffsetPerLevel(value: Double): Self = StObject.set(x, "offsetPerLevel", value.asInstanceOf[js.Any])
      
      inline def setOnCollapse(value: () => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction0(value))
      
      inline def setOnDragEnd(value: () => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction0(value))
      
      inline def setOnDragStart(value: () => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction0(value))
      
      inline def setOnExpand(value: () => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction0(value))
      
      inline def setRenderItem(value: () => Unit): Self = StObject.set(x, "renderItem", js.Any.fromFunction0(value))
      
      inline def setTree(value: Children): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    }
  }
}
