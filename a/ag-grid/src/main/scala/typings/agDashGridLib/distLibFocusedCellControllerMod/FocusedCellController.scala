package typings
package agDashGridLib.distLibFocusedCellControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/focusedCellController", "FocusedCellController")
@js.native
class FocusedCellController () extends js.Object {
  var columnApi: js.Any = js.native
  var columnController: js.Any = js.native
  var eventService: js.Any = js.native
  var focusedCell: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  def clearFocusedCell(): scala.Unit = js.native
  def getFocusCellToUseAfterRefresh(): agDashGridLib.distLibEntitiesGridCellMod.GridCell = js.native
  def getFocusedCell(): agDashGridLib.distLibEntitiesGridCellMod.GridCell = js.native
  /* private */ def getGridCellForDomElement(eBrowserCell: js.Any): js.Any = js.native
  /* private */ def init(): js.Any = js.native
  def isAnyCellFocused(): scala.Boolean = js.native
  def isCellFocused(gridCell: agDashGridLib.distLibEntitiesGridCellMod.GridCell): scala.Boolean = js.native
  def isRowFocused(rowIndex: scala.Double, floating: java.lang.String): scala.Boolean = js.native
  def isRowNodeFocused(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Boolean = js.native
  /* private */ def onCellFocused(forceBrowserFocus: js.Any): js.Any = js.native
  def setFocusedCell(
    rowIndex: scala.Double,
    colKey: agDashGridLib.distLibEntitiesColumnMod.Column,
    floating: java.lang.String
  ): scala.Unit = js.native
  def setFocusedCell(
    rowIndex: scala.Double,
    colKey: agDashGridLib.distLibEntitiesColumnMod.Column,
    floating: java.lang.String,
    forceBrowserFocus: scala.Boolean
  ): scala.Unit = js.native
  def setFocusedCell(rowIndex: scala.Double, colKey: java.lang.String, floating: java.lang.String): scala.Unit = js.native
  def setFocusedCell(
    rowIndex: scala.Double,
    colKey: java.lang.String,
    floating: java.lang.String,
    forceBrowserFocus: scala.Boolean
  ): scala.Unit = js.native
}

