package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`key-down`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewKeyDownEvent extends StObject {
  
  var key: String
  
  var native: Any
  
  var repeat: Boolean
  
  var stopPropagation: js.Function
  
  var timestamp: Double
  
  var `type`: `key-down`
}
object ViewKeyDownEvent {
  
  inline def apply(key: String, native: Any, repeat: Boolean, stopPropagation: js.Function, timestamp: Double): ViewKeyDownEvent = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("key-down")
    __obj.asInstanceOf[ViewKeyDownEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewKeyDownEvent] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNative(value: Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setStopPropagation(value: js.Function): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: `key-down`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
