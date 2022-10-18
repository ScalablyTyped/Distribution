package typings.atlaskitTree

import typings.atlaskitTree.distTypesTypesMod.FlattenedItem
import typings.atlaskitTree.distTypesTypesMod.ItemId
import typings.atlaskitTree.distTypesTypesMod.Path
import typings.atlaskitTree.distTypesTypesMod.TreeData
import typings.atlaskitTree.distTypesTypesMod.TreeDestinationPosition
import typings.atlaskitTree.distTypesTypesMod.TreeItem
import typings.atlaskitTree.distTypesTypesMod.TreeItemData
import typings.atlaskitTree.distTypesTypesMod.TreeSourcePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTreeMod {
  
  @JSImport("@atlaskit/tree/dist/types/utils/tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flattenTree(tree: TreeData): js.Array[FlattenedItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenTree")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlattenedItem]]
  inline def flattenTree(tree: TreeData, path: Path): js.Array[FlattenedItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenTree")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenedItem]]
  
  inline def getItem(tree: TreeData, path: Path): TreeItem = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[TreeItem]
  
  inline def getParent(tree: TreeData, path: Path): TreeItem = (^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[TreeItem]
  
  inline def getTreePosition(tree: TreeData, path: Path): TreeSourcePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("getTreePosition")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[TreeSourcePosition]
  
  inline def moveItemOnTree(tree: TreeData, from: TreeSourcePosition, to: TreeDestinationPosition): TreeData = (^.asInstanceOf[js.Dynamic].applyDynamic("moveItemOnTree")(tree.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[TreeData]
  
  inline def mutateTree(tree: TreeData, itemId: ItemId, mutation: TreeItemMutation): TreeData = (^.asInstanceOf[js.Dynamic].applyDynamic("mutateTree")(tree.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any], mutation.asInstanceOf[js.Any])).asInstanceOf[TreeData]
  
  trait TreeItemMutation extends StObject {
    
    var children: js.UndefOr[js.Array[ItemId]] = js.undefined
    
    var data: js.UndefOr[TreeItemData] = js.undefined
    
    var hasChildren: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[ItemId] = js.undefined
    
    var isChildrenLoading: js.UndefOr[Boolean] = js.undefined
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
  }
  object TreeItemMutation {
    
    inline def apply(): TreeItemMutation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeItemMutation]
    }
    
    extension [Self <: TreeItemMutation](x: Self) {
      
      inline def setChildren(value: js.Array[ItemId]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ItemId*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: TreeItemData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
      
      inline def setHasChildrenUndefined: Self = StObject.set(x, "hasChildren", js.undefined)
      
      inline def setId(value: ItemId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsChildrenLoading(value: Boolean): Self = StObject.set(x, "isChildrenLoading", value.asInstanceOf[js.Any])
      
      inline def setIsChildrenLoadingUndefined: Self = StObject.set(x, "isChildrenLoading", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    }
  }
}
