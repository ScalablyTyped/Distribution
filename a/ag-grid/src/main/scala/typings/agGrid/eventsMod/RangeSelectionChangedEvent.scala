package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSelectionChangedEvent extends AgGridEvent {
  
  var finished: Boolean = js.native
  
  var started: Boolean = js.native
}
object RangeSelectionChangedEvent {
  
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, finished: Boolean, started: Boolean, `type`: String): RangeSelectionChangedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectionChangedEvent]
  }
  
  @scala.inline
  implicit class RangeSelectionChangedEventMutableBuilder[Self <: RangeSelectionChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
  }
}
