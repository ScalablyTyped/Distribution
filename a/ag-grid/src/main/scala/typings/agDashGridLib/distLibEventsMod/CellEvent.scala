package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellEvent extends RowEvent {
  var colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef
  var column: agDashGridLib.distLibEntitiesColumnMod.Column
  var value: js.Any
}

object CellEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    context: js.Any,
    data: js.Any,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    rowIndex: scala.Double,
    rowPinned: java.lang.String,
    `type`: java.lang.String,
    value: js.Any,
    event: stdLib.Event = null
  ): CellEvent = {
    val __obj = js.Dynamic.literal(api = api, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, node = node, rowIndex = rowIndex, rowPinned = rowPinned, value = value)
    __obj.updateDynamic("type")(`type`)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[CellEvent]
  }
}

