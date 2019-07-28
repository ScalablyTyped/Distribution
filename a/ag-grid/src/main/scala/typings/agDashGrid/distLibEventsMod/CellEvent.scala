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

trait CellEvent extends RowEvent {
  var colDef: ColDef
  var column: Column
  var value: js.Any
}

object CellEvent {
  @scala.inline
  def apply(
    api: GridApi,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    node: RowNode,
    rowIndex: Double,
    rowPinned: String,
    `type`: String,
    value: js.Any,
    event: Event = null
  ): CellEvent = {
    val __obj = js.Dynamic.literal(api = api, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, node = node, rowIndex = rowIndex, rowPinned = rowPinned, value = value)
    __obj.updateDynamic("type")(`type`)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[CellEvent]
  }
}

