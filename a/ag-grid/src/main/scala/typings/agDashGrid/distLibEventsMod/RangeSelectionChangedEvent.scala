package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibGridApiMod.GridApi
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
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, finished = finished, started = started)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RangeSelectionChangedEvent]
  }
}

