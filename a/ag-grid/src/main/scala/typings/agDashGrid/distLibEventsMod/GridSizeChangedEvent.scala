package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridSizeChangedEvent extends AgGridEvent {
  var clientHeight: Double
  var clientWidth: Double
}

object GridSizeChangedEvent {
  @scala.inline
  def apply(api: GridApi, clientHeight: Double, clientWidth: Double, columnApi: ColumnApi, `type`: String): GridSizeChangedEvent = {
    val __obj = js.Dynamic.literal(api = api, clientHeight = clientHeight, clientWidth = clientWidth, columnApi = columnApi)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GridSizeChangedEvent]
  }
}

