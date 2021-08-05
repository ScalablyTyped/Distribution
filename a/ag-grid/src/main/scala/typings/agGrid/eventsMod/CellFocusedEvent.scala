package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellFocusedEvent
  extends StObject
     with AgGridEvent {
  
  var column: Column
  
  var floating: String
  
  var forceBrowserFocus: Boolean
  
  var rowIndex: Double
  
  var rowPinned: String
}
object CellFocusedEvent {
  
  inline def apply(
    api: GridApi,
    column: Column,
    columnApi: ColumnApi,
    floating: String,
    forceBrowserFocus: Boolean,
    rowIndex: Double,
    rowPinned: String,
    `type`: String
  ): CellFocusedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], floating = floating.asInstanceOf[js.Any], forceBrowserFocus = forceBrowserFocus.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowPinned = rowPinned.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellFocusedEvent]
  }
  
  extension [Self <: CellFocusedEvent](x: Self) {
    
    inline def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setFloating(value: String): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
    
    inline def setForceBrowserFocus(value: Boolean): Self = StObject.set(x, "forceBrowserFocus", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowPinned(value: String): Self = StObject.set(x, "rowPinned", value.asInstanceOf[js.Any])
  }
}
