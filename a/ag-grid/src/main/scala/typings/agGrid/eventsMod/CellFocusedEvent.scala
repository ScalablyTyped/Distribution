package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellFocusedEvent extends AgGridEvent {
  
  var column: Column = js.native
  
  var floating: String = js.native
  
  var forceBrowserFocus: Boolean = js.native
  
  var rowIndex: Double = js.native
  
  var rowPinned: String = js.native
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
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], floating = floating.asInstanceOf[js.Any], forceBrowserFocus = forceBrowserFocus.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowPinned = rowPinned.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellFocusedEvent]
  }
  
  @scala.inline
  implicit class CellFocusedEventMutableBuilder[Self <: CellFocusedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloating(value: String): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceBrowserFocus(value: Boolean): Self = StObject.set(x, "forceBrowserFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowPinned(value: String): Self = StObject.set(x, "rowPinned", value.asInstanceOf[js.Any])
  }
}
