package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationChangedEvent extends AgGridEvent {
  var animate: Boolean
  var keepRenderedRows: Boolean
  var newData: Boolean
  var newPage: Boolean
}

object PaginationChangedEvent {
  @scala.inline
  def apply(
    animate: Boolean,
    api: GridApi,
    columnApi: ColumnApi,
    keepRenderedRows: Boolean,
    newData: Boolean,
    newPage: Boolean,
    `type`: String
  ): PaginationChangedEvent = {
    val __obj = js.Dynamic.literal(animate = animate, api = api, columnApi = columnApi, keepRenderedRows = keepRenderedRows, newData = newData, newPage = newPage)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PaginationChangedEvent]
  }
}

