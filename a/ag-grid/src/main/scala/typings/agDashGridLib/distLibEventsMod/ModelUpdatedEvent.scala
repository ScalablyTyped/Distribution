package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelUpdatedEvent extends AgGridEvent {
  /** If true, the grid will try and animate the rows to the new positions */
  var animate: scala.Boolean
  /** If true, the grid has new data loaded, eg user called setRowData(), otherwise
    * it's the same data but sorted or filtered, in which case this is true, and rows
    * can animate around (eg rowNode id 24 is the same row node as last time). */
  var keepRenderedRows: scala.Boolean
  /** If true, then this update was a result of setRowData() getting called. This
    * gets the grid to scroll to the top again. */
  var newData: scala.Boolean
  /** True when pagination and a new page is navigated to. */
  var newPage: scala.Boolean
}

object ModelUpdatedEvent {
  @scala.inline
  def apply(
    animate: scala.Boolean,
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    keepRenderedRows: scala.Boolean,
    newData: scala.Boolean,
    newPage: scala.Boolean,
    `type`: java.lang.String
  ): ModelUpdatedEvent = {
    val __obj = js.Dynamic.literal(animate = animate, api = api, columnApi = columnApi, keepRenderedRows = keepRenderedRows, newData = newData, newPage = newPage)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ModelUpdatedEvent]
  }
}

