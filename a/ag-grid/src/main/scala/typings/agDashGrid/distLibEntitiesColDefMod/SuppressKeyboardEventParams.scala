package typings.agDashGrid.distLibEntitiesColDefMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuppressKeyboardEventParams extends IsColumnFuncParams {
  var editing: Boolean
  var event: KeyboardEvent
}

object SuppressKeyboardEventParams {
  @scala.inline
  def apply(
    api: GridApi,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    editing: Boolean,
    event: KeyboardEvent,
    node: RowNode
  ): SuppressKeyboardEventParams = {
    val __obj = js.Dynamic.literal(api = api, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, editing = editing, event = event, node = node)
  
    __obj.asInstanceOf[SuppressKeyboardEventParams]
  }
}

