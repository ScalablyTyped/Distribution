package typings.agGrid

import typings.agGrid.columnMod.Column
import typings.agGrid.gridCellMod.GridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridRowMod {
  
  @JSImport("ag-grid/dist/lib/entities/gridRow", "GridRow")
  @js.native
  class GridRow protected () extends StObject {
    def this(rowIndex: Double, floating: String) = this()
    
    def before(otherSelection: GridRow): Boolean = js.native
    
    def equals(otherSelection: GridRow): Boolean = js.native
    
    var floating: String = js.native
    
    def getGridCell(column: Column): GridCell = js.native
    
    def isFloatingBottom(): Boolean = js.native
    
    def isFloatingTop(): Boolean = js.native
    
    def isNotFloating(): Boolean = js.native
    
    var rowIndex: Double = js.native
  }
}
