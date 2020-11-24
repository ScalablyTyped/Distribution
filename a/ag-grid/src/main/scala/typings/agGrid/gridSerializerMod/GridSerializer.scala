package typings.agGrid.gridSerializerMod

import typings.agGrid.columnGroupChildMod.ColumnGroupChild
import typings.agGrid.exportParamsMod.ExportParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/gridSerializer", "GridSerializer")
@js.native
class GridSerializer () extends js.Object {
  
  var balancedColumnTreeBuilder: js.Any = js.native
  
  var columnController: js.Any = js.native
  
  var displayedGroupCreator: js.Any = js.native
  
  /* private */ def doAddHeaderHeader[T](gridSerializingSession: js.Any, displayedGroups: js.Any): js.Any = js.native
  
  var gridOptionsWrapper: js.Any = js.native
  
  var pinnedRowModel: js.Any = js.native
  
  def recursivelyAddHeaderGroups[T](displayedGroups: js.Array[ColumnGroupChild], gridSerializingSession: GridSerializingSession[T]): Unit = js.native
  
  var rowModel: js.Any = js.native
  
  var selectionController: js.Any = js.native
  
  def serialize[T](gridSerializingSession: GridSerializingSession[T]): String = js.native
  def serialize[T](gridSerializingSession: GridSerializingSession[T], params: ExportParams[T]): String = js.native
}
