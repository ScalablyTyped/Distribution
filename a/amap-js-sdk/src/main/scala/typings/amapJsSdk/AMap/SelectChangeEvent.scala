package typings.amapJsSdk.AMap

import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectChangeEvent extends StObject {
  
  var data: Poi = js.native
  
  var id: String = js.native
  
  var listElement: HTMLLIElement = js.native
  
  var marker: Marker = js.native
  
  var `type`: String = js.native
}
object SelectChangeEvent {
  
  @scala.inline
  def apply(data: Poi, id: String, listElement: HTMLLIElement, marker: Marker, `type`: String): SelectChangeEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], listElement = listElement.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectChangeEvent]
  }
  
  @scala.inline
  implicit class SelectChangeEventMutableBuilder[Self <: SelectChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Poi): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListElement(value: HTMLLIElement): Self = StObject.set(x, "listElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
