package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnRequestEvent extends AgGridEvent {
  var columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column]
}

object ColumnRequestEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column],
    `type`: java.lang.String
  ): ColumnRequestEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, columns = columns)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnRequestEvent]
  }
}

