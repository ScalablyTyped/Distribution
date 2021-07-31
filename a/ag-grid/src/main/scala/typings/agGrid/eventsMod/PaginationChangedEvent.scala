package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginationChangedEvent
  extends StObject
     with AgGridEvent {
  
  var animate: Boolean
  
  var keepRenderedRows: Boolean
  
  var newData: Boolean
  
  var newPage: Boolean
}
object PaginationChangedEvent {
  
  @scala.inline
  def apply(
    animate: Boolean,
    api: GridApi,
    columnApi: ColumnApi,
    keepRenderedRows: Boolean,
    newData: Boolean,
    newPage: Boolean,
    `type`: String
  ): PaginationChangedEvent = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], keepRenderedRows = keepRenderedRows.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], newPage = newPage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationChangedEvent]
  }
  
  @scala.inline
  implicit class PaginationChangedEventMutableBuilder[Self <: PaginationChangedEvent] (val x: Self) extends AnyVal {
    
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
