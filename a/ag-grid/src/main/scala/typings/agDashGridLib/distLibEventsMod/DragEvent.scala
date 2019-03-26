package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragEvent extends AgGridEvent

object DragEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    `type`: java.lang.String
  ): DragEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DragEvent]
  }
}

