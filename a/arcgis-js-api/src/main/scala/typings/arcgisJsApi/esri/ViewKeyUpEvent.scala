package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`key-up`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewKeyUpEvent extends StObject {
  
  var key: String
  
  var native: Any
  
  var stopPropagation: js.Function
  
  var timestamp: Double
  
  var `type`: `key-up`
}
object ViewKeyUpEvent {
  
  inline def apply(key: String, native: Any, stopPropagation: js.Function, timestamp: Double): ViewKeyUpEvent = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("key-up")
    __obj.asInstanceOf[ViewKeyUpEvent]
  }
  
  extension [Self <: ViewKeyUpEvent](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNative(value: Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setStopPropagation(value: js.Function): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: `key-up`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
