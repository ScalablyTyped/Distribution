package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasteEndEvent extends AgGridEvent {
  var source: String = js.native
}

object PasteEndEvent {
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, source: String, `type`: String): PasteEndEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasteEndEvent]
  }
  @scala.inline
  implicit class PasteEndEventOps[Self <: PasteEndEvent] (val x: Self) extends AnyVal {
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
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

