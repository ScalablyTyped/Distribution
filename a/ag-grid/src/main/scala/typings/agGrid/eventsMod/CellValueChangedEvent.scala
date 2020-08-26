package typings.agGrid.eventsMod

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellValueChangedEvent extends CellEvent {
  var newValue: js.Any = js.native
  var oldValue: js.Any = js.native
}

object CellValueChangedEvent {
  @scala.inline
  def apply(
    api: GridApi,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    newValue: js.Any,
    node: RowNode,
    oldValue: js.Any,
    rowIndex: Double,
    rowPinned: String,
    `type`: String,
    value: js.Any
  ): CellValueChangedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowPinned = rowPinned.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellValueChangedEvent]
  }
  @scala.inline
  implicit class CellValueChangedEventOps[Self <: CellValueChangedEvent] (val x: Self) extends AnyVal {
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
    def setNewValue(value: js.Any): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: js.Any): Self = this.set("oldValue", value.asInstanceOf[js.Any])
  }
  
}

