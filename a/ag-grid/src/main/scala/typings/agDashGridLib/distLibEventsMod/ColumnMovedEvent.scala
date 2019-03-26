package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnMovedEvent extends ColumnEvent {
  var toIndex: scala.Double
}

object ColumnMovedEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column],
    source: ColumnEventType,
    toIndex: scala.Double,
    `type`: java.lang.String
  ): ColumnMovedEvent = {
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, columns = columns, source = source, toIndex = toIndex)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnMovedEvent]
  }
}

