package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeSliderViewModelMinChangeEvent extends StObject {
  
  var oldValue: Double
  
  var `type`: min
  
  var value: Double
}
object SizeSliderViewModelMinChangeEvent {
  
  inline def apply(oldValue: Double, value: Double): SizeSliderViewModelMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("min")
    __obj.asInstanceOf[SizeSliderViewModelMinChangeEvent]
  }
  
  extension [Self <: SizeSliderViewModelMinChangeEvent](x: Self) {
    
    inline def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: min): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
