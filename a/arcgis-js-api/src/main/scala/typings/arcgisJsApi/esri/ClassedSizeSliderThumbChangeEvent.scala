package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`thumb-change`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassedSizeSliderThumbChangeEvent extends StObject {
  
  var index: Double
  
  var oldValue: Double
  
  var `type`: `thumb-change`
  
  var value: Double
}
object ClassedSizeSliderThumbChangeEvent {
  
  inline def apply(index: Double, oldValue: Double, value: Double): ClassedSizeSliderThumbChangeEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("thumb-change")
    __obj.asInstanceOf[ClassedSizeSliderThumbChangeEvent]
  }
  
  extension [Self <: ClassedSizeSliderThumbChangeEvent](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: `thumb-change`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
