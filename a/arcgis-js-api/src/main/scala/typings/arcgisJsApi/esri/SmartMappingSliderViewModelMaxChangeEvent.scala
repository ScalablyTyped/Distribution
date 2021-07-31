package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartMappingSliderViewModelMaxChangeEvent extends StObject {
  
  var oldValue: Double
  
  var `type`: max
  
  var value: Double
}
object SmartMappingSliderViewModelMaxChangeEvent {
  
  @scala.inline
  def apply(oldValue: Double, value: Double): SmartMappingSliderViewModelMaxChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("max")
    __obj.asInstanceOf[SmartMappingSliderViewModelMaxChangeEvent]
  }
  
  @scala.inline
  implicit class SmartMappingSliderViewModelMaxChangeEventMutableBuilder[Self <: SmartMappingSliderViewModelMaxChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: max): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
