package typings.atlaskitTree

import typings.atlaskitTree.distTypesTypesMod.TreeData
import typings.atlaskitTree.distTypesTypesMod.TreeDestinationPosition
import typings.atlaskitTree.distTypesTypesMod.TreeSourcePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsMoveItemOnTreeMod {
  
  @JSImport("@atlaskit/tree/dist/types/utils/moveItemOnTree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def moveItemOnTree(tree: TreeData, from: TreeSourcePosition, to: TreeDestinationPosition): TreeData = (^.asInstanceOf[js.Dynamic].applyDynamic("moveItemOnTree")(tree.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[TreeData]
}
