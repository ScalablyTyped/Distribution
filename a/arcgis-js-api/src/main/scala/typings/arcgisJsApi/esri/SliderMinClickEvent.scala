package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`min-click`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderMinClickEvent extends StObject {
  
  var `type`: `min-click`
  
  var value: Double
}
object SliderMinClickEvent {
  
  inline def apply(value: Double): SliderMinClickEvent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("min-click")
    __obj.asInstanceOf[SliderMinClickEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderMinClickEvent] (val x: Self) extends AnyVal {
    
    inline def setType(value: `min-click`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
