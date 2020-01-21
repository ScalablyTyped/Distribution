package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnRequestEvent extends AgGridEvent {
  var columns: js.Array[Column]
}

object ColumnRequestEvent {
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, columns: js.Array[Column], `type`: String): ColumnRequestEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnRequestEvent]
  }
}

