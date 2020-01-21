package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsAddedEvent extends AgGridEvent {
  var items: js.Array[RowNode]
}

object ItemsAddedEvent {
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, items: js.Array[RowNode], `type`: String): ItemsAddedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsAddedEvent]
  }
}

