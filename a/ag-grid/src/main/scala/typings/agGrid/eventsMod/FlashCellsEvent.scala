package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashCellsEvent extends AgGridEvent {
  var cells: js.Any
}

object FlashCellsEvent {
  @scala.inline
  def apply(api: GridApi, cells: js.Any, columnApi: ColumnApi, `type`: String): FlashCellsEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashCellsEvent]
  }
}

