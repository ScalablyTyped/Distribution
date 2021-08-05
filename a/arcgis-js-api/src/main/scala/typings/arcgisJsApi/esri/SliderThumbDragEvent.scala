package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`thumb-drag`
import typings.arcgisJsApi.arcgisJsApiStrings.drag
import typings.arcgisJsApi.arcgisJsApiStrings.start
import typings.arcgisJsApi.arcgisJsApiStrings.stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderThumbDragEvent extends StObject {
  
  var index: Double
  
  var state: drag | start | stop
  
  var `type`: `thumb-drag`
  
  var value: Double
}
object SliderThumbDragEvent {
  
  inline def apply(index: Double, state: drag | start | stop, value: Double): SliderThumbDragEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("thumb-drag")
    __obj.asInstanceOf[SliderThumbDragEvent]
  }
  
  extension [Self <: SliderThumbDragEvent](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setState(value: drag | start | stop): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setType(value: `thumb-drag`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
