package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`min-change`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartMappingSliderBaseMinChangeEvent extends StObject {
  
  var oldValue: Double
  
  var `type`: `min-change`
  
  var value: Double
}
object SmartMappingSliderBaseMinChangeEvent {
  
  inline def apply(oldValue: Double, value: Double): SmartMappingSliderBaseMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("min-change")
    __obj.asInstanceOf[SmartMappingSliderBaseMinChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartMappingSliderBaseMinChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: `min-change`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
