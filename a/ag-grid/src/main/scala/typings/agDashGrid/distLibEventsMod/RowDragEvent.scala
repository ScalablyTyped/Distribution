package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDragEvent extends AgGridEvent {
  var event: MouseEvent
  var node: RowNode
  var overIndex: Double
  var overNode: RowNode
  var vDirection: String
  var y: Double
}

object RowDragEvent {
  @scala.inline
  def apply(
    api: GridApi,
    columnApi: ColumnApi,
    event: MouseEvent,
    node: RowNode,
    overIndex: Double,
    overNode: RowNode,
    `type`: String,
    vDirection: String,
    y: Double
  ): RowDragEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, event = event, node = node, overIndex = overIndex, overNode = overNode, vDirection = vDirection, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RowDragEvent]
  }
}

