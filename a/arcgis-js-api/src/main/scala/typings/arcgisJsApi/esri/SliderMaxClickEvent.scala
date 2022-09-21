package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`max-click`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderMaxClickEvent extends StObject {
  
  var `type`: `max-click`
  
  var value: Double
}
object SliderMaxClickEvent {
  
  inline def apply(value: Double): SliderMaxClickEvent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("max-click")
    __obj.asInstanceOf[SliderMaxClickEvent]
  }
  
  extension [Self <: SliderMaxClickEvent](x: Self) {
    
    inline def setType(value: `max-click`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
