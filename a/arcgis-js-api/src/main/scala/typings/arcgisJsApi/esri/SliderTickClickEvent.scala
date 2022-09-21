package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`tick-click`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderTickClickEvent extends StObject {
  
  var configIndex: Double
  
  var groupIndex: Double
  
  var `type`: `tick-click`
  
  var value: Double
}
object SliderTickClickEvent {
  
  inline def apply(configIndex: Double, groupIndex: Double, value: Double): SliderTickClickEvent = {
    val __obj = js.Dynamic.literal(configIndex = configIndex.asInstanceOf[js.Any], groupIndex = groupIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tick-click")
    __obj.asInstanceOf[SliderTickClickEvent]
  }
  
  extension [Self <: SliderTickClickEvent](x: Self) {
    
    inline def setConfigIndex(value: Double): Self = StObject.set(x, "configIndex", value.asInstanceOf[js.Any])
    
    inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
    
    inline def setType(value: `tick-click`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
