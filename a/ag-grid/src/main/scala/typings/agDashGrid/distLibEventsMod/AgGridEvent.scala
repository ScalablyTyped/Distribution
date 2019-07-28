package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgGridEvent extends AgEvent {
  var api: GridApi
  var columnApi: ColumnApi
}

object AgGridEvent {
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, `type`: String): AgGridEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AgGridEvent]
  }
}

