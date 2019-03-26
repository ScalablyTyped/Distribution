package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashCellsEvent extends AgGridEvent {
  var cells: js.Any
}

object FlashCellsEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    cells: js.Any,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    `type`: java.lang.String
  ): FlashCellsEvent = {
    val __obj = js.Dynamic.literal(api = api, cells = cells, columnApi = columnApi)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FlashCellsEvent]
  }
}

