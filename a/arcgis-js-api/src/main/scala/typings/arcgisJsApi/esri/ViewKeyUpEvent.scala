package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`key-up`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewKeyUpEvent extends StObject {
  
  var key: String
  
  var native: js.Any
  
  var stopPropagation: js.Function
  
  var timestamp: Double
  
  var `type`: `key-up`
}
object ViewKeyUpEvent {
  
  @scala.inline
  def apply(key: String, native: js.Any, stopPropagation: js.Function, timestamp: Double): ViewKeyUpEvent = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("key-up")
    __obj.asInstanceOf[ViewKeyUpEvent]
  }
  
  @scala.inline
  implicit class ViewKeyUpEventMutableBuilder[Self <: ViewKeyUpEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: js.Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: js.Function): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `key-up`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
