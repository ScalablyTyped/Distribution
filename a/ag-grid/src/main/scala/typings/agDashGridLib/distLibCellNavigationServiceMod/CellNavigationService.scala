package typings
package agDashGridLib.distLibCellNavigationServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/cellNavigationService", "CellNavigationService")
@js.native
class CellNavigationService () extends js.Object {
  var columnController: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var pinnedRowModel: js.Any = js.native
  var rowModel: js.Any = js.native
  /* private */ def getCellAbove(lastCell: js.Any): js.Any = js.native
  /* private */ def getCellBelow(lastCell: js.Any): js.Any = js.native
  /* private */ def getCellToLeft(lastCell: js.Any): js.Any = js.native
  /* private */ def getCellToRight(lastCell: js.Any): js.Any = js.native
  /* private */ def getLastBodyCell(): js.Any = js.native
  /* private */ def getLastFloatingTopRow(): js.Any = js.native
  def getNextCellToFocus(key: js.Any, lastCellToFocus: agDashGridLib.distLibEntitiesGridCellMod.GridCell): agDashGridLib.distLibEntitiesGridCellMod.GridCell = js.native
  def getNextTabbedCell(gridCell: agDashGridLib.distLibEntitiesGridCellMod.GridCell, backwards: scala.Boolean): agDashGridLib.distLibEntitiesGridCellMod.GridCell = js.native
  def getNextTabbedCellBackwards(gridCell: agDashGridLib.distLibEntitiesGridCellMod.GridCell): agDashGridLib.distLibEntitiesGridCellMod.GridCell = js.native
  def getNextTabbedCellForwards(gridCell: agDashGridLib.distLibEntitiesGridCellMod.GridCell): agDashGridLib.distLibEntitiesGridCellMod.GridCell = js.native
  /* private */ def getRowAbove(lastRow: js.Any): js.Any = js.native
  def getRowBelow(lastRow: agDashGridLib.distLibEntitiesGridRowMod.GridRow): agDashGridLib.distLibEntitiesGridRowMod.GridRow = js.native
  /* private */ def isCellGoodToFocusOn(gridCell: js.Any): js.Any = js.native
  /* private */ def isLastRowInContainer(gridRow: js.Any): js.Any = js.native
}

