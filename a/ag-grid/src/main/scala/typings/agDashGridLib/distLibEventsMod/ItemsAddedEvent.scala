package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsAddedEvent extends AgGridEvent {
  var items: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode]
}

object ItemsAddedEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    items: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode],
    `type`: java.lang.String
  ): ItemsAddedEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, items = items)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ItemsAddedEvent]
  }
}

