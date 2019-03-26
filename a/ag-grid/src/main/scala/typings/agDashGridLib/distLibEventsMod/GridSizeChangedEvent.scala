package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridSizeChangedEvent extends AgGridEvent {
  var clientHeight: scala.Double
  var clientWidth: scala.Double
}

object GridSizeChangedEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    clientHeight: scala.Double,
    clientWidth: scala.Double,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    `type`: java.lang.String
  ): GridSizeChangedEvent = {
    val __obj = js.Dynamic.literal(api = api, clientHeight = clientHeight, clientWidth = clientWidth, columnApi = columnApi)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GridSizeChangedEvent]
  }
}

