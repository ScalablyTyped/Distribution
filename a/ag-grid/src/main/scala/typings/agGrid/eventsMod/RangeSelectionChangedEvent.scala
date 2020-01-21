package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectionChangedEvent extends AgGridEvent {
  var finished: Boolean
  var started: Boolean
}

object RangeSelectionChangedEvent {
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, finished: Boolean, started: Boolean, `type`: String): RangeSelectionChangedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectionChangedEvent]
  }
}

