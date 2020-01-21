package typings.agGrid

import typings.agGrid.gridCellMod.GridCell
import typings.agGrid.gridRowMod.GridRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/cellNavigationService", JSImport.Namespace)
@js.native
object cellNavigationServiceMod extends js.Object {
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
    def getNextCellToFocus(key: js.Any, lastCellToFocus: GridCell): GridCell = js.native
    def getNextTabbedCell(gridCell: GridCell, backwards: Boolean): GridCell = js.native
    def getNextTabbedCellBackwards(gridCell: GridCell): GridCell = js.native
    def getNextTabbedCellForwards(gridCell: GridCell): GridCell = js.native
    /* private */ def getRowAbove(lastRow: js.Any): js.Any = js.native
    def getRowBelow(lastRow: GridRow): GridRow = js.native
    /* private */ def isCellGoodToFocusOn(gridCell: js.Any): js.Any = js.native
    /* private */ def isLastRowInContainer(gridRow: js.Any): js.Any = js.native
  }
  
}

