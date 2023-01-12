package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`max-change`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartMappingSliderBaseMaxChangeEvent extends StObject {
  
  var oldValue: Double
  
  var `type`: `max-change`
  
  var value: Double
}
object SmartMappingSliderBaseMaxChangeEvent {
  
  inline def apply(oldValue: Double, value: Double): SmartMappingSliderBaseMaxChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("max-change")
    __obj.asInstanceOf[SmartMappingSliderBaseMaxChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartMappingSliderBaseMaxChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: `max-change`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
