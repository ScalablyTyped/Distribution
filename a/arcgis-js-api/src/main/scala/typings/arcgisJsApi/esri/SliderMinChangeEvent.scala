package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`min-change`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderMinChangeEvent extends StObject {
  
  var oldValue: Double
  
  var `type`: `min-change`
  
  var value: Double
}
object SliderMinChangeEvent {
  
  inline def apply(oldValue: Double, value: Double): SliderMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("min-change")
    __obj.asInstanceOf[SliderMinChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderMinChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: `min-change`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
