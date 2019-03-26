package typings
package agDashGridLib.distLibEntitiesColDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuppressKeyboardEventParams extends IsColumnFuncParams {
  var editing: scala.Boolean
  var event: stdLib.KeyboardEvent
}

object SuppressKeyboardEventParams {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    colDef: ColDef,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    context: js.Any,
    data: js.Any,
    editing: scala.Boolean,
    event: stdLib.KeyboardEvent,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  ): SuppressKeyboardEventParams = {
    val __obj = js.Dynamic.literal(api = api, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, editing = editing, event = event, node = node)
  
    __obj.asInstanceOf[SuppressKeyboardEventParams]
  }
}

