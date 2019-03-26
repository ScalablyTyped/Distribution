package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectionChangedEvent extends AgGridEvent {
  var finished: scala.Boolean
  var started: scala.Boolean
}

object RangeSelectionChangedEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    finished: scala.Boolean,
    started: scala.Boolean,
    `type`: java.lang.String
  ): RangeSelectionChangedEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, finished = finished, started = started)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RangeSelectionChangedEvent]
  }
}

