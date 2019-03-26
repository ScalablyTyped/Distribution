package typings
package agDashGridLib.distLibRowNodesSelectableServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowNodes/selectableService", "SelectableService")
@js.native
class SelectableService () extends js.Object {
  var gridOptionsWrapper: js.Any = js.native
  var groupSelectsChildren: js.Any = js.native
  var isRowSelectableFunc: js.Any = js.native
  def init(): scala.Unit = js.native
  /* private */ def recurseDown(children: js.Any, nextChildrenFunc: js.Any): js.Any = js.native
  def updateSelectableAfterFiltering(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Unit = js.native
  def updateSelectableAfterGrouping(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Unit = js.native
}

