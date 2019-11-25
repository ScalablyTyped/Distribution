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
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridSizeChangedEvent]
  }
}

