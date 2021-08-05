package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelUpdatedEvent
  extends StObject
     with AgGridEvent {
  
  /** If true, the grid will try and animate the rows to the new positions */
  var animate: Boolean
  
  /** If true, the grid has new data loaded, eg user called setRowData(), otherwise
    * it's the same data but sorted or filtered, in which case this is true, and rows
    * can animate around (eg rowNode id 24 is the same row node as last time). */
  var keepRenderedRows: Boolean
  
  /** If true, then this update was a result of setRowData() getting called. This
    * gets the grid to scroll to the top again. */
  var newData: Boolean
  
  /** True when pagination and a new page is navigated to. */
  var newPage: Boolean
}
object ModelUpdatedEvent {
  
  inline def apply(
    animate: Boolean,
    api: GridApi,
    columnApi: ColumnApi,
    keepRenderedRows: Boolean,
    newData: Boolean,
    newPage: Boolean,
    `type`: String
  ): ModelUpdatedEvent = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], keepRenderedRows = keepRenderedRows.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], newPage = newPage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelUpdatedEvent]
  }
  
  extension [Self <: ModelUpdatedEvent](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setKeepRenderedRows(value: Boolean): Self = StObject.set(x, "keepRenderedRows", value.asInstanceOf[js.Any])
    
    inline def setNewData(value: Boolean): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
    
    inline def setNewPage(value: Boolean): Self = StObject.set(x, "newPage", value.asInstanceOf[js.Any])
  }
}
