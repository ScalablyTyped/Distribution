package typings.atlaskitTree

import typings.atlaskitTree.anon.DestinationPosition
import typings.atlaskitTree.treeTypesMod.DragState
import typings.atlaskitTree.typesMod.FlattenedTree
import typings.atlaskitTree.typesMod.TreeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeUtilsMod {
  
  @JSImport("@atlaskit/tree/dist/types/components/Tree/Tree-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateFinalDropPositions(tree: TreeData, flattenedTree: FlattenedTree, dragState: DragState): DestinationPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateFinalDropPositions")(tree.asInstanceOf[js.Any], flattenedTree.asInstanceOf[js.Any], dragState.asInstanceOf[js.Any])).asInstanceOf[DestinationPosition]
}
