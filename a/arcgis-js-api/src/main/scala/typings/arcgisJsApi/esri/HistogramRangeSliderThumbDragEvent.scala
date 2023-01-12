package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`thumb-drag`
import typings.arcgisJsApi.arcgisJsApiStrings.drag
import typings.arcgisJsApi.arcgisJsApiStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramRangeSliderThumbDragEvent extends StObject {
  
  var index: Double
  
  var state: start | drag
  
  var `type`: `thumb-drag`
  
  var value: Double
}
object HistogramRangeSliderThumbDragEvent {
  
  inline def apply(index: Double, state: start | drag, value: Double): HistogramRangeSliderThumbDragEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("thumb-drag")
    __obj.asInstanceOf[HistogramRangeSliderThumbDragEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistogramRangeSliderThumbDragEvent] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setState(value: start | drag): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setType(value: `thumb-drag`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
