package typings.agGrid.sortServiceMod

import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/rowNodes/sortService", "SortService")
@js.native
class SortService () extends js.Object {
  
  var columnController: js.Any = js.native
  
  /* private */ def compareRowNodes(sortOptions: js.Any, sortedNodeA: js.Any, sortedNodeB: js.Any): js.Any = js.native
  
  /* private */ def getValue(nodeA: js.Any, column: js.Any): js.Any = js.native
  
  var gridOptionsWrapper: js.Any = js.native
  
  def init(): Unit = js.native
  
  var postSortFunc: js.Any = js.native
  
  /* private */ def pullDownDataForHideOpenParents(rowNode: js.Any, clearOperation: js.Any): js.Any = js.native
  
  def sort(rowNode: RowNode, sortOptions: js.Array[SortOption]): Unit = js.native
  
  def sortAccordingToColumnsState(rowNode: RowNode): Unit = js.native
  
  var sortController: js.Any = js.native
  
  /* private */ def updateChildIndexes(rowNode: js.Any): js.Any = js.native
  
  var valueService: js.Any = js.native
}
