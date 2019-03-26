package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellFocusedEvent extends AgGridEvent {
  var column: agDashGridLib.distLibEntitiesColumnMod.Column
  var floating: java.lang.String
  var forceBrowserFocus: scala.Boolean
  var rowIndex: scala.Double
  var rowPinned: java.lang.String
}

object CellFocusedEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    floating: java.lang.String,
    forceBrowserFocus: scala.Boolean,
    rowIndex: scala.Double,
    rowPinned: java.lang.String,
    `type`: java.lang.String
  ): CellFocusedEvent = {
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, floating = floating, forceBrowserFocus = forceBrowserFocus, rowIndex = rowIndex, rowPinned = rowPinned)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CellFocusedEvent]
  }
}

