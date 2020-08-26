package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashCellsEvent extends AgGridEvent {
  var cells: js.Any = js.native
}

object FlashCellsEvent {
  @scala.inline
  def apply(api: GridApi, cells: js.Any, columnApi: ColumnApi, `type`: String): FlashCellsEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashCellsEvent]
  }
  @scala.inline
  implicit class FlashCellsEventOps[Self <: FlashCellsEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCells(value: js.Any): Self = this.set("cells", value.asInstanceOf[js.Any])
  }
  
}

