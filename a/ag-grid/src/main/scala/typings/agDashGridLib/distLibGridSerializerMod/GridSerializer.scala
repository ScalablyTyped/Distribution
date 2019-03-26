package typings
package agDashGridLib.distLibGridSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/gridSerializer", "GridSerializer")
@js.native
class GridSerializer () extends js.Object {
  var balancedColumnTreeBuilder: js.Any = js.native
  var columnController: js.Any = js.native
  var displayedGroupCreator: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var pinnedRowModel: js.Any = js.native
  var rowModel: js.Any = js.native
  var selectionController: js.Any = js.native
  /* private */ def doAddHeaderHeader[T](gridSerializingSession: js.Any, displayedGroups: js.Any): js.Any = js.native
  def recursivelyAddHeaderGroups[T](
    displayedGroups: js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild],
    gridSerializingSession: GridSerializingSession[T]
  ): scala.Unit = js.native
  def serialize[T](gridSerializingSession: GridSerializingSession[T]): java.lang.String = js.native
  def serialize[T](
    gridSerializingSession: GridSerializingSession[T],
    params: agDashGridLib.distLibExportParamsMod.ExportParams[T]
  ): java.lang.String = js.native
}

