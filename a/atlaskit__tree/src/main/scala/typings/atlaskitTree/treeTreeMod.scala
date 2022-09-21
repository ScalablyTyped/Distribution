package typings.atlaskitTree

import typings.atlaskitTree.anon.DraggedItemId
import typings.atlaskitTree.anon.FlatItem
import typings.atlaskitTree.anon.FlattenedTree
import typings.atlaskitTree.anon.IsDragEnabled
import typings.atlaskitTree.treeTypesMod.DragState
import typings.atlaskitTree.treeTypesMod.Props
import typings.atlaskitTree.treeTypesMod.State
import typings.atlaskitTree.typesMod.FlattenedItem
import typings.atlaskitTree.typesMod.ItemId
import typings.atlaskitTree.typesMod.Path
import typings.atlaskitTree.typesMod.TreeData
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeTreeMod {
  
  @JSImport("@atlaskit/tree/dist/types/components/Tree/Tree", JSImport.Default)
  @js.native
  open class default () extends Tree
  /* static members */
  object default {
    
    @JSImport("@atlaskit/tree/dist/types/components/Tree/Tree", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def closeParentIfNeeded(tree: TreeData): TreeData = ^.asInstanceOf[js.Dynamic].applyDynamic("closeParentIfNeeded")(tree.asInstanceOf[js.Any]).asInstanceOf[TreeData]
    inline def closeParentIfNeeded(tree: TreeData, draggedItemId: ItemId): TreeData = (^.asInstanceOf[js.Dynamic].applyDynamic("closeParentIfNeeded")(tree.asInstanceOf[js.Any], draggedItemId.asInstanceOf[js.Any])).asInstanceOf[TreeData]
    
    @JSImport("@atlaskit/tree/dist/types/components/Tree/Tree", "default.defaultProps")
    @js.native
    def defaultProps: IsDragEnabled = js.native
    inline def defaultProps_=(x: IsDragEnabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: Props, state: State): DraggedItemId = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DraggedItemId]
  }
  
  @js.native
  trait Tree extends Component[Props, State, Any] {
    
    def calculateEffectivePath(
      flatItem: FlattenedItem,
      snapshot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any
    ): Path = js.native
    
    var containerElement: js.UndefOr[HTMLElement] = js.native
    
    var dragState: js.UndefOr[DragState] = js.native
    
    var expandTimer: typings.atlaskitTree.delayedFunctionMod.default = js.native
    
    def getDroppedLevel(): js.UndefOr[Double] = js.native
    
    def isExpandable(item: FlattenedItem): Boolean = js.native
    
    var itemsElement: Record[ItemId, js.UndefOr[HTMLElement]] = js.native
    
    def onDragEnd(
      result: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DropResult */ Any
    ): Unit = js.native
    
    def onDragStart(
      result: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DragStart */ Any
    ): Unit = js.native
    
    def onDragUpdate(
      update: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DragUpdate */ Any
    ): Unit = js.native
    
    def onDropAnimating(): Unit = js.native
    
    def onPointerMove(): Unit = js.native
    
    def patchDroppableProvided(
      provided: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DroppableProvided */ Any
    ): Any = js.native
    
    def renderDraggableItem(flatItem: FlattenedItem): js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableProvided */ /* provided */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ /* snapshot */ Any, 
        Element
      ] = js.native
    
    def renderItem(flatItem: FlattenedItem, index: Double): ReactNode = js.native
    
    def renderItems(): js.Array[ReactNode] = js.native
    
    def renderTreeItem(hasFlatItemPathProvidedSnapshot: FlatItem): Element = js.native
    
    def setItemRef(itemId: ItemId): Unit = js.native
    def setItemRef(itemId: ItemId, el: HTMLElement): Unit = js.native
    
    @JSName("state")
    var state_Tree: FlattenedTree = js.native
  }
}
