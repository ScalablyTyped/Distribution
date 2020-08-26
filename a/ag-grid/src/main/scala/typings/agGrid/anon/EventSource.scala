package typings.agGrid.anon

import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSource extends js.Object {
  var column: js.UndefOr[typings.agGrid.columnMod.Column] = js.native
  var ePopup: HTMLElement = js.native
  var eventSource: HTMLElement = js.native
  var keepWithinBounds: js.UndefOr[Boolean] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var nudgeX: js.UndefOr[Double] = js.native
  var nudgeY: js.UndefOr[Double] = js.native
  var rowNode: js.UndefOr[RowNode] = js.native
  var `type`: String = js.native
}

object EventSource {
  @scala.inline
  def apply(ePopup: HTMLElement, eventSource: HTMLElement, `type`: String): EventSource = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSource]
  }
  @scala.inline
  implicit class EventSourceOps[Self <: EventSource] (val x: Self) extends AnyVal {
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
    def setEPopup(value: HTMLElement): Self = this.set("ePopup", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventSource(value: HTMLElement): Self = this.set("eventSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: typings.agGrid.columnMod.Column): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setKeepWithinBounds(value: Boolean): Self = this.set("keepWithinBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepWithinBounds: Self = this.set("keepWithinBounds", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setNudgeX(value: Double): Self = this.set("nudgeX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNudgeX: Self = this.set("nudgeX", js.undefined)
    @scala.inline
    def setNudgeY(value: Double): Self = this.set("nudgeY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNudgeY: Self = this.set("nudgeY", js.undefined)
    @scala.inline
    def setRowNode(value: RowNode): Self = this.set("rowNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowNode: Self = this.set("rowNode", js.undefined)
  }
  
}

