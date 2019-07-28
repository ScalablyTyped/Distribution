package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColDefMod.ColDef
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellValueChangedEvent extends CellEvent {
  var newValue: js.Any
  var oldValue: js.Any
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
    value: js.Any,
    event: Event = null
  ): CellValueChangedEvent = {
    val __obj = js.Dynamic.literal(api = api, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, newValue = newValue, node = node, oldValue = oldValue, rowIndex = rowIndex, rowPinned = rowPinned, value = value)
    __obj.updateDynamic("type")(`type`)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[CellValueChangedEvent]
  }
}

