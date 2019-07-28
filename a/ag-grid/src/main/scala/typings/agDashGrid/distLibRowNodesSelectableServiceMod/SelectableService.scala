package typings.agDashGrid.distLibRowNodesSelectableServiceMod

import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowNodes/selectableService", "SelectableService")
@js.native
class SelectableService () extends js.Object {
  var gridOptionsWrapper: js.Any = js.native
  var groupSelectsChildren: js.Any = js.native
  var isRowSelectableFunc: js.Any = js.native
  def init(): Unit = js.native
  /* private */ def recurseDown(children: js.Any, nextChildrenFunc: js.Any): js.Any = js.native
  def updateSelectableAfterFiltering(rowNode: RowNode): Unit = js.native
  def updateSelectableAfterGrouping(rowNode: RowNode): Unit = js.native
}

