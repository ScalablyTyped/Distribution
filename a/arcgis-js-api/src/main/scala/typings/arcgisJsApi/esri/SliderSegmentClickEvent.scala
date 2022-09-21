package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`segment-click`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderSegmentClickEvent extends StObject {
  
  var index: Double
  
  var thumbIndices: js.Array[Double]
  
  var `type`: `segment-click`
  
  var value: Double
}
object SliderSegmentClickEvent {
  
  inline def apply(index: Double, thumbIndices: js.Array[Double], value: Double): SliderSegmentClickEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], thumbIndices = thumbIndices.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("segment-click")
    __obj.asInstanceOf[SliderSegmentClickEvent]
  }
  
  extension [Self <: SliderSegmentClickEvent](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setThumbIndices(value: js.Array[Double]): Self = StObject.set(x, "thumbIndices", value.asInstanceOf[js.Any])
    
    inline def setThumbIndicesVarargs(value: Double*): Self = StObject.set(x, "thumbIndices", js.Array(value*))
    
    inline def setType(value: `segment-click`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
