package typings.agGrid.rowNodeMod

import typings.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellChangedEvent extends RowNodeEvent {
  var column: Column = js.native
  var newValue: js.Any = js.native
}

object CellChangedEvent {
  @scala.inline
  def apply(column: Column, newValue: js.Any, node: RowNode, `type`: String): CellChangedEvent = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellChangedEvent]
  }
  @scala.inline
  implicit class CellChangedEventOps[Self <: CellChangedEvent] (val x: Self) extends AnyVal {
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
    def setColumn(value: Column): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewValue(value: js.Any): Self = this.set("newValue", value.asInstanceOf[js.Any])
  }
  
}

