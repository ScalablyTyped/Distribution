package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibGridApiMod.GridApi
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
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, firstRow = firstRow, lastRow = lastRow)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ViewportChangedEvent]
  }
}

