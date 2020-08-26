package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewportChangedEvent extends AgGridEvent {
  var firstRow: Double = js.native
  var lastRow: Double = js.native
}

object ViewportChangedEvent {
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, firstRow: Double, lastRow: Double, `type`: String): ViewportChangedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], firstRow = firstRow.asInstanceOf[js.Any], lastRow = lastRow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportChangedEvent]
  }
  @scala.inline
  implicit class ViewportChangedEventOps[Self <: ViewportChangedEvent] (val x: Self) extends AnyVal {
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
    def setFirstRow(value: Double): Self = this.set("firstRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastRow(value: Double): Self = this.set("lastRow", value.asInstanceOf[js.Any])
  }
  
}

