package typings.atlaskitTree

import typings.atlaskitTree.typesMod.FlattenedItem
import typings.atlaskitTree.typesMod.FlattenedTree
import typings.atlaskitTree.typesMod.ItemId
import typings.atlaskitTree.typesMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flatTreeMod {
  
  @JSImport("@atlaskit/tree/dist/types/utils/flat-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDestinationPath(flattenedTree: FlattenedTree, sourceIndex: Double, destinationIndex: Double): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("getDestinationPath")(flattenedTree.asInstanceOf[js.Any], sourceIndex.asInstanceOf[js.Any], destinationIndex.asInstanceOf[js.Any])).asInstanceOf[Path]
  inline def getDestinationPath(flattenedTree: FlattenedTree, sourceIndex: Double, destinationIndex: Double, level: Double): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("getDestinationPath")(flattenedTree.asInstanceOf[js.Any], sourceIndex.asInstanceOf[js.Any], destinationIndex.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Path]
  
  inline def getFlatItemPath(flattenedTree: FlattenedTree, sourceIndex: Double): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("getFlatItemPath")(flattenedTree.asInstanceOf[js.Any], sourceIndex.asInstanceOf[js.Any])).asInstanceOf[Path]
  
  inline def getIndexById(flattenedTree: FlattenedTree, id: ItemId): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndexById")(flattenedTree.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getItemById(flattenedTree: FlattenedTree, id: ItemId): js.UndefOr[FlattenedItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemById")(flattenedTree.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FlattenedItem]]
  
  inline def getSourcePath(flattenedTree: FlattenedTree, sourceIndex: Double): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourcePath")(flattenedTree.asInstanceOf[js.Any], sourceIndex.asInstanceOf[js.Any])).asInstanceOf[Path]
}
