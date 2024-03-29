package typings.agGrid

import typings.agGrid.columnMod.Column
import typings.agGrid.gridRowMod.GridRow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridCellMod {
  
  @JSImport("ag-grid/dist/lib/entities/gridCell", "GridCell")
  @js.native
  class GridCell protected () extends StObject {
    def this(gridCellDef: GridCellDef) = this()
    
    var column: Column = js.native
    
    def createId(): String = js.native
    
    def equals(other: GridCell): Boolean = js.native
    
    var floating: String = js.native
    
    def getGridCellDef(): GridCellDef = js.native
    
    def getGridRow(): GridRow = js.native
    
    var rowIndex: Double = js.native
  }
  
  trait GridCellDef extends StObject {
    
    var column: Column
    
    var floating: String
    
    var rowIndex: Double
  }
  object GridCellDef {
    
    inline def apply(column: Column, floating: String, rowIndex: Double): GridCellDef = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], floating = floating.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridCellDef]
    }
    
    extension [Self <: GridCellDef](x: Self) {
      
      inline def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setFloating(value: String): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
}
