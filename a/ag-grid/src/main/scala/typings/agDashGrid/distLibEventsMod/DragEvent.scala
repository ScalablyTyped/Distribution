package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragEvent extends AgGridEvent

object DragEvent {
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, `type`: String): DragEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DragEvent]
  }
}

