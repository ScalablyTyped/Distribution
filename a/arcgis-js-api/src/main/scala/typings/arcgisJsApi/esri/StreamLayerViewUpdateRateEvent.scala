package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamLayerViewUpdateRateEvent extends StObject {
  
  var client: Double
  
  var websocket: Double
}
object StreamLayerViewUpdateRateEvent {
  
  inline def apply(client: Double, websocket: Double): StreamLayerViewUpdateRateEvent = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], websocket = websocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamLayerViewUpdateRateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamLayerViewUpdateRateEvent] (val x: Self) extends AnyVal {
    
    inline def setClient(value: Double): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setWebsocket(value: Double): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
  }
}
