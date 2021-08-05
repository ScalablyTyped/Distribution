package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassedColorSliderViewModelMinChangeEvent extends StObject {
  
  var oldValue: Double
  
  var `type`: min
  
  var value: Double
}
object ClassedColorSliderViewModelMinChangeEvent {
  
  inline def apply(oldValue: Double, value: Double): ClassedColorSliderViewModelMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("min")
    __obj.asInstanceOf[ClassedColorSliderViewModelMinChangeEvent]
  }
  
  extension [Self <: ClassedColorSliderViewModelMinChangeEvent](x: Self) {
    
    inline def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: min): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
