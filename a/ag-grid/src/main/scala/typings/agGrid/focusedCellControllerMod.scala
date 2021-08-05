package typings.agGrid

import typings.agGrid.columnMod.Column
import typings.agGrid.gridCellMod.GridCell
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusedCellControllerMod {
  
  @JSImport("ag-grid/dist/lib/focusedCellController", "FocusedCellController")
  @js.native
  class FocusedCellController () extends StObject {
    
    def clearFocusedCell(): Unit = js.native
    
    /* private */ var columnApi: js.Any = js.native
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    /* private */ var focusedCell: js.Any = js.native
    
    def getFocusCellToUseAfterRefresh(): GridCell = js.native
    
    def getFocusedCell(): GridCell = js.native
    
    /* private */ def getGridCellForDomElement(eBrowserCell: js.Any): js.Any = js.native
    
    /* private */ var gridApi: js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
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
}
