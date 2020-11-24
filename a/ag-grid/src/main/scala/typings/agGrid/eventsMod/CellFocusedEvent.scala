package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
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
  implicit class CellFocusedEventOps[Self <: CellFocusedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumn(value: Column): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloating(value: String): Self = this.set("floating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceBrowserFocus(value: Boolean): Self = this.set("forceBrowserFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowPinned(value: String): Self = this.set("rowPinned", value.asInstanceOf[js.Any])
  }
}
