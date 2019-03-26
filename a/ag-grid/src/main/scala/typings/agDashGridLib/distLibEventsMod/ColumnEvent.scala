package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnEvent extends AgGridEvent {
  var column: agDashGridLib.distLibEntitiesColumnMod.Column
  var columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column]
  var source: ColumnEventType
}

object ColumnEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column],
    source: ColumnEventType,
    `type`: java.lang.String
  ): ColumnEvent = {
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, columns = columns, source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnEvent]
  }
}

