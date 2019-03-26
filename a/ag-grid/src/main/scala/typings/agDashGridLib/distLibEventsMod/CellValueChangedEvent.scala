package typings
package agDashGridLib.distLibEventsMod

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
    api: agDashGridLib.distLibGridApiMod.GridApi,
    colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    context: js.Any,
    data: js.Any,
    newValue: js.Any,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    oldValue: js.Any,
    rowIndex: scala.Double,
    rowPinned: java.lang.String,
    `type`: java.lang.String,
    value: js.Any,
    event: stdLib.Event = null
  ): CellValueChangedEvent = {
    val __obj = js.Dynamic.literal(api = api, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, newValue = newValue, node = node, oldValue = oldValue, rowIndex = rowIndex, rowPinned = rowPinned, value = value)
    __obj.updateDynamic("type")(`type`)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[CellValueChangedEvent]
  }
}

