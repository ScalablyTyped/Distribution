package typings.atlaskitTree

import typings.atlaskitTree.anon.DestinationPosition
import typings.atlaskitTree.distTypesComponentsTreeTreeTypesMod.DragState
import typings.atlaskitTree.distTypesTypesMod.FlattenedTree
import typings.atlaskitTree.distTypesTypesMod.TreeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsTreeTreeUtilsMod {
  
  @JSImport("@atlaskit/tree/dist/types/components/Tree/Tree-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateFinalDropPositions(tree: TreeData, flattenedTree: FlattenedTree, dragState: DragState): DestinationPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateFinalDropPositions")(tree.asInstanceOf[js.Any], flattenedTree.asInstanceOf[js.Any], dragState.asInstanceOf[js.Any])).asInstanceOf[DestinationPosition]
}
