package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamLayerViewDataReceivedEvent extends StObject {
  
  var attributes: js.Any
  
  var geometry: js.Any
}
object StreamLayerViewDataReceivedEvent {
  
  @scala.inline
  def apply(attributes: js.Any, geometry: js.Any): StreamLayerViewDataReceivedEvent = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamLayerViewDataReceivedEvent]
  }
  
  @scala.inline
  implicit class StreamLayerViewDataReceivedEventMutableBuilder[Self <: StreamLayerViewDataReceivedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: js.Any): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
  }
}
