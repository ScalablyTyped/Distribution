package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnEverythingChangedEvent extends AgGridEvent {
  var source: String
}

object ColumnEverythingChangedEvent {
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, source: String, `type`: String): ColumnEverythingChangedEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnEverythingChangedEvent]
  }
}

