package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellFocusedEvent extends AgGridEvent {
  var column: Column
  var floating: String
  var forceBrowserFocus: Boolean
  var rowIndex: Double
  var rowPinned: String
}

object CellFocusedEvent {
  @scala.inline
  def apply(
    api: GridApi,
    column: Column,
    columnApi: ColumnApi,
    floating: String,
    forceBrowserFocus: Boolean,
    rowIndex: Double,
    rowPinned: String,
    `type`: String
  ): CellFocusedEvent = {
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, floating = floating, forceBrowserFocus = forceBrowserFocus, rowIndex = rowIndex, rowPinned = rowPinned)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CellFocusedEvent]
  }
}

