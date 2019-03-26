package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnGroupOpenedEvent extends AgGridEvent {
  var columnGroup: agDashGridLib.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup
}

object ColumnGroupOpenedEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    columnGroup: agDashGridLib.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup,
    `type`: java.lang.String
  ): ColumnGroupOpenedEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, columnGroup = columnGroup)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnGroupOpenedEvent]
  }
}

