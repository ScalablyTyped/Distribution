package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelUpdatedEvent extends AgGridEvent {
  
  /** If true, the grid will try and animate the rows to the new positions */
  var animate: Boolean = js.native
  
  /** If true, the grid has new data loaded, eg user called setRowData(), otherwise
    * it's the same data but sorted or filtered, in which case this is true, and rows
    * can animate around (eg rowNode id 24 is the same row node as last time). */
  var keepRenderedRows: Boolean = js.native
  
  /** If true, then this update was a result of setRowData() getting called. This
    * gets the grid to scroll to the top again. */
  var newData: Boolean = js.native
  
  /** True when pagination and a new page is navigated to. */
  var newPage: Boolean = js.native
}
object ModelUpdatedEvent {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ModelUpdatedEventMutableBuilder[Self <: ModelUpdatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepRenderedRows(value: Boolean): Self = StObject.set(x, "keepRenderedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewData(value: Boolean): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPage(value: Boolean): Self = StObject.set(x, "newPage", value.asInstanceOf[js.Any])
  }
}
