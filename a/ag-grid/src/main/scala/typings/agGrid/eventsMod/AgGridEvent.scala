package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgGridEvent extends AgEvent {
  var api: GridApi = js.native
  var columnApi: ColumnApi = js.native
}

object AgGridEvent {
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, `type`: String): AgGridEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgGridEvent]
  }
  @scala.inline
  implicit class AgGridEventOps[Self <: AgGridEvent] (val x: Self) extends AnyVal {
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
    def setApi(value: GridApi): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnApi(value: ColumnApi): Self = this.set("columnApi", value.asInstanceOf[js.Any])
  }
  
}

