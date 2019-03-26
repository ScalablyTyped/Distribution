package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnEverythingChangedEvent extends AgGridEvent {
  var source: java.lang.String
}

object ColumnEverythingChangedEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    source: java.lang.String,
    `type`: java.lang.String
  ): ColumnEverythingChangedEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnEverythingChangedEvent]
  }
}

