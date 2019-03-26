package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportChangedEvent extends AgGridEvent {
  var firstRow: scala.Double
  var lastRow: scala.Double
}

object ViewportChangedEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    firstRow: scala.Double,
    lastRow: scala.Double,
    `type`: java.lang.String
  ): ViewportChangedEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, firstRow = firstRow, lastRow = lastRow)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ViewportChangedEvent]
  }
}

