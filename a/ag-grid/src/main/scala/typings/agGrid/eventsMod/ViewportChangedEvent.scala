package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportChangedEvent extends AgGridEvent {
  var firstRow: Double
  var lastRow: Double
}

object ViewportChangedEvent {
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, firstRow: Double, lastRow: Double, `type`: String): ViewportChangedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], firstRow = firstRow.asInstanceOf[js.Any], lastRow = lastRow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportChangedEvent]
  }
}

