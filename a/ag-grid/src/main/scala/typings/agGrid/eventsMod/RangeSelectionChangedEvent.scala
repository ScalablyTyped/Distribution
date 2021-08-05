package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeSelectionChangedEvent
  extends StObject
     with AgGridEvent {
  
  var finished: Boolean
  
  var started: Boolean
}
object RangeSelectionChangedEvent {
  
  inline def apply(api: GridApi, columnApi: ColumnApi, finished: Boolean, started: Boolean, `type`: String): RangeSelectionChangedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectionChangedEvent]
  }
  
  extension [Self <: RangeSelectionChangedEvent](x: Self) {
    
    inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
  }
}
