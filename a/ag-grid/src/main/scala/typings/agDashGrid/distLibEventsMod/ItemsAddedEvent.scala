package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsAddedEvent extends AgGridEvent {
  var items: js.Array[RowNode]
}

object ItemsAddedEvent {
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, items: js.Array[RowNode], `type`: String): ItemsAddedEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, items = items)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ItemsAddedEvent]
  }
}

