package typings.atlaskitTree

import typings.atlaskitTree.anon.ItemRemoved
import typings.atlaskitTree.distTypesTypesMod.FlattenedItem
import typings.atlaskitTree.distTypesTypesMod.ItemId
import typings.atlaskitTree.distTypesTypesMod.Path
import typings.atlaskitTree.distTypesTypesMod.TreeData
import typings.atlaskitTree.distTypesTypesMod.TreeDestinationPosition
import typings.atlaskitTree.distTypesTypesMod.TreeItem
import typings.atlaskitTree.distTypesTypesMod.TreeSourcePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTreeMod {
  
  @JSImport("@atlaskit/tree/dist/types/utils/tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addItemToTree(tree: TreeData, position: TreeDestinationPosition, item: ItemId): TreeData = (^.asInstanceOf[js.Dynamic].applyDynamic("addItemToTree")(tree.asInstanceOf[js.Any], position.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[TreeData]
  
  inline def flattenTree(tree: TreeData): js.Array[FlattenedItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenTree")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlattenedItem]]
  inline def flattenTree(tree: TreeData, path: Path): js.Array[FlattenedItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenTree")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenedItem]]
  
  inline def getItem(tree: TreeData, path: Path): TreeItem = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[TreeItem]
  
  inline def getParent(tree: TreeData, path: Path): TreeItem = (^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[TreeItem]
  
  inline def getTreePosition(tree: TreeData, path: Path): TreeSourcePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("getTreePosition")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[TreeSourcePosition]
  
  inline def removeItemFromTree(tree: TreeData, position: TreeSourcePosition): ItemRemoved = (^.asInstanceOf[js.Dynamic].applyDynamic("removeItemFromTree")(tree.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[ItemRemoved]
}
