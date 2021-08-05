package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassedColorSliderViewModelMaxChangeEvent extends StObject {
  
  var oldValue: Double
  
  var `type`: max
  
  var value: Double
}
object ClassedColorSliderViewModelMaxChangeEvent {
  
  inline def apply(oldValue: Double, value: Double): ClassedColorSliderViewModelMaxChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("max")
    __obj.asInstanceOf[ClassedColorSliderViewModelMaxChangeEvent]
  }
  
  extension [Self <: ClassedColorSliderViewModelMaxChangeEvent](x: Self) {
    
    inline def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: max): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
