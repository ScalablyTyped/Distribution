package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`segment-drag`
import typings.arcgisJsApi.arcgisJsApiStrings.drag
import typings.arcgisJsApi.arcgisJsApiStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderSegmentDragEvent extends StObject {
  
  var index: Double
  
  var state: start | drag
  
  var thumbIndices: js.Array[Double]
  
  var `type`: `segment-drag`
}
object SliderSegmentDragEvent {
  
  inline def apply(index: Double, state: start | drag, thumbIndices: js.Array[Double]): SliderSegmentDragEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], thumbIndices = thumbIndices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("segment-drag")
    __obj.asInstanceOf[SliderSegmentDragEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderSegmentDragEvent] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setState(value: start | drag): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setThumbIndices(value: js.Array[Double]): Self = StObject.set(x, "thumbIndices", value.asInstanceOf[js.Any])
    
    inline def setThumbIndicesVarargs(value: Double*): Self = StObject.set(x, "thumbIndices", js.Array(value*))
    
    inline def setType(value: `segment-drag`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
