package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgGridEvent extends AgEvent {
  var api: agDashGridLib.distLibGridApiMod.GridApi
  var columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi
}

object AgGridEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    `type`: java.lang.String
  ): AgGridEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AgGridEvent]
  }
}

