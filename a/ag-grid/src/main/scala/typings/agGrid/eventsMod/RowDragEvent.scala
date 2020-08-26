package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowDragEvent extends AgGridEvent {
  var event: MouseEvent = js.native
  var node: RowNode = js.native
  var overIndex: Double = js.native
  var overNode: RowNode = js.native
  var vDirection: String = js.native
  var y: Double = js.native
}

object RowDragEvent {
  @scala.inline
  def apply(
    api: GridApi,
    columnApi: ColumnApi,
    event: MouseEvent,
    node: RowNode,
    overIndex: Double,
    overNode: RowNode,
    `type`: String,
    vDirection: String,
    y: Double
  ): RowDragEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], overIndex = overIndex.asInstanceOf[js.Any], overNode = overNode.asInstanceOf[js.Any], vDirection = vDirection.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDragEvent]
  }
  @scala.inline
  implicit class RowDragEventOps[Self <: RowDragEvent] (val x: Self) extends AnyVal {
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
    def setEvent(value: MouseEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: RowNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverIndex(value: Double): Self = this.set("overIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverNode(value: RowNode): Self = this.set("overNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setVDirection(value: String): Self = this.set("vDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

