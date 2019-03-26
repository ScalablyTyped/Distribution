package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationChangedEvent extends AgGridEvent {
  var animate: scala.Boolean
  var keepRenderedRows: scala.Boolean
  var newData: scala.Boolean
  var newPage: scala.Boolean
}

object PaginationChangedEvent {
  @scala.inline
  def apply(
    animate: scala.Boolean,
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    keepRenderedRows: scala.Boolean,
    newData: scala.Boolean,
    newPage: scala.Boolean,
    `type`: java.lang.String
  ): PaginationChangedEvent = {
    val __obj = js.Dynamic.literal(animate = animate, api = api, columnApi = columnApi, keepRenderedRows = keepRenderedRows, newData = newData, newPage = newPage)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PaginationChangedEvent]
  }
}

