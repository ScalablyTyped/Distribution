package typings.agDashGrid.distLibFocusedCellControllerMod

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesGridCellMod.GridCell
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
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
  def clearFocusedCell(): Unit = js.native
  def getFocusCellToUseAfterRefresh(): GridCell = js.native
  def getFocusedCell(): GridCell = js.native
  /* private */ def getGridCellForDomElement(eBrowserCell: js.Any): js.Any = js.native
  /* private */ def init(): js.Any = js.native
  def isAnyCellFocused(): Boolean = js.native
  def isCellFocused(gridCell: GridCell): Boolean = js.native
  def isRowFocused(rowIndex: Double, floating: String): Boolean = js.native
  def isRowNodeFocused(rowNode: RowNode): Boolean = js.native
  /* private */ def onCellFocused(forceBrowserFocus: js.Any): js.Any = js.native
  def setFocusedCell(rowIndex: Double, colKey: String, floating: String): Unit = js.native
  def setFocusedCell(rowIndex: Double, colKey: String, floating: String, forceBrowserFocus: Boolean): Unit = js.native
  def setFocusedCell(rowIndex: Double, colKey: Column, floating: String): Unit = js.native
  def setFocusedCell(rowIndex: Double, colKey: Column, floating: String, forceBrowserFocus: Boolean): Unit = js.native
}

