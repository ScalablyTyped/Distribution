package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.originalColumnGroupMod.OriginalColumnGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnGroupOpenedEvent extends AgGridEvent {
  
  var columnGroup: OriginalColumnGroup = js.native
}
object ColumnGroupOpenedEvent {
  
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, columnGroup: OriginalColumnGroup, `type`: String): ColumnGroupOpenedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], columnGroup = columnGroup.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupOpenedEvent]
  }
  
  @scala.inline
  implicit class ColumnGroupOpenedEventMutableBuilder[Self <: ColumnGroupOpenedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnGroup(value: OriginalColumnGroup): Self = StObject.set(x, "columnGroup", value.asInstanceOf[js.Any])
  }
}
