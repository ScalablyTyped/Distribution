package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDragEvent extends AgGridEvent {
  var event: stdLib.MouseEvent
  var node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  var overIndex: scala.Double
  var overNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  var vDirection: java.lang.String
  var y: scala.Double
}

object RowDragEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    event: stdLib.MouseEvent,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    overIndex: scala.Double,
    overNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    `type`: java.lang.String,
    vDirection: java.lang.String,
    y: scala.Double
  ): RowDragEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, event = event, node = node, overIndex = overIndex, overNode = overNode, vDirection = vDirection, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RowDragEvent]
  }
}

