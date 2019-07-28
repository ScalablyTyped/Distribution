package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowEvent extends AgGridEvent {
  var context: js.Any
  var data: js.Any
  var event: js.UndefOr[Event] = js.undefined
  var node: RowNode
  var rowIndex: Double
  var rowPinned: String
}

object RowEvent {
  @scala.inline
  def apply(
    api: GridApi,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    node: RowNode,
    rowIndex: Double,
    rowPinned: String,
    `type`: String,
    event: Event = null
  ): RowEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, context = context, data = data, node = node, rowIndex = rowIndex, rowPinned = rowPinned)
    __obj.updateDynamic("type")(`type`)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[RowEvent]
  }
}

