package typings.atlaskitTree

import typings.atlaskitTree.atlaskitTreeStrings.none
import typings.atlaskitTree.typesMod.ItemId
import typings.atlaskitTree.typesMod.Path
import typings.atlaskitTree.typesMod.TreeItem
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeItemTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typings.atlaskitTree.atlaskitTreeStrings.mouse
    - typings.atlaskitTree.atlaskitTreeStrings.key
    - typings.atlaskitTree.atlaskitTreeStrings.touch
  */
  type DragActionType = _DragActionType | Null
  
  @js.native
  trait Props extends StObject {
    
    var item: TreeItem = js.native
    
    def itemRef(itemId: ItemId): Unit = js.native
    def itemRef(itemId: ItemId, element: HTMLElement): Unit = js.native
    
    var offsetPerLevel: Double = js.native
    
    def onCollapse(itemId: ItemId, path: Path): Unit = js.native
    
    def onExpand(itemId: ItemId, path: Path): Unit = js.native
    
    var path: Path = js.native
    
    var provided: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableProvided */ Any = js.native
    
    def renderItem(item: RenderItemParams): ReactNode = js.native
    
    var snapshot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any = js.native
  }
  
  trait RenderItemParams extends StObject {
    
    var depth: Double
    
    var item: TreeItem
    
    def onCollapse(itemId: ItemId): Unit
    
    def onExpand(itemId: ItemId): Unit
    
    var provided: TreeDraggableProvided
    
    var snapshot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any
  }
  object RenderItemParams {
    
    inline def apply(
      depth: Double,
      item: TreeItem,
      onCollapse: ItemId => Unit,
      onExpand: ItemId => Unit,
      provided: TreeDraggableProvided,
      snapshot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any
    ): RenderItemParams = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onCollapse = js.Any.fromFunction1(onCollapse), onExpand = js.Any.fromFunction1(onExpand), provided = provided.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderItemParams]
    }
    
    extension [Self <: RenderItemParams](x: Self) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setItem(value: TreeItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setOnCollapse(value: ItemId => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
      
      inline def setOnExpand(value: ItemId => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
      
      inline def setProvided(value: TreeDraggableProvided): Self = StObject.set(x, "provided", value.asInstanceOf[js.Any])
      
      inline def setSnapshot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any
      ): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TreeDraggableProvided extends StObject {
    
    var dragHandleProps: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableProvidedDragHandleProps */ Any) | Null = js.native
    
    var draggableProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableProvidedDraggableProps */ Any = js.native
    
    def innerRef(): Unit = js.native
    def innerRef(el: HTMLElement): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggingStyle * / any */ trait TreeDraggingStyle extends StObject {
    
    var paddingLeft: Double
    
    var transition: none | String
  }
  object TreeDraggingStyle {
    
    inline def apply(paddingLeft: Double, transition: none | String): TreeDraggingStyle = {
      val __obj = js.Dynamic.literal(paddingLeft = paddingLeft.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeDraggingStyle]
    }
    
    extension [Self <: TreeDraggingStyle](x: Self) {
      
      inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: none | String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    }
  }
  
  trait _DragActionType extends StObject
}
