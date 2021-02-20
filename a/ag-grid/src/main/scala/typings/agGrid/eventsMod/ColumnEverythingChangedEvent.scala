package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnEverythingChangedEvent extends AgGridEvent {
  
  var source: String = js.native
}
object ColumnEverythingChangedEvent {
  
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, source: String, `type`: String): ColumnEverythingChangedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnEverythingChangedEvent]
  }
  
  @scala.inline
  implicit class ColumnEverythingChangedEventMutableBuilder[Self <: ColumnEverythingChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
