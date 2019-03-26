package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowEvent extends AgGridEvent {
  var context: js.Any
  var data: js.Any
  var event: js.UndefOr[stdLib.Event] = js.undefined
  var node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  var rowIndex: scala.Double
  var rowPinned: java.lang.String
}

object RowEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    context: js.Any,
    data: js.Any,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    rowIndex: scala.Double,
    rowPinned: java.lang.String,
    `type`: java.lang.String,
    event: stdLib.Event = null
  ): RowEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, context = context, data = data, node = node, rowIndex = rowIndex, rowPinned = rowPinned)
    __obj.updateDynamic("type")(`type`)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[RowEvent]
  }
}

