package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`segment-drag`
import typings.arcgisJsApi.arcgisJsApiStrings.drag
import typings.arcgisJsApi.arcgisJsApiStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramRangeSliderSegmentDragEvent extends StObject {
  
  var index: Double
  
  var state: start | drag
  
  var thumbIndices: js.Array[Double]
  
  var `type`: `segment-drag`
}
object HistogramRangeSliderSegmentDragEvent {
  
  @scala.inline
  def apply(index: Double, state: start | drag, thumbIndices: js.Array[Double]): HistogramRangeSliderSegmentDragEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], thumbIndices = thumbIndices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("segment-drag")
    __obj.asInstanceOf[HistogramRangeSliderSegmentDragEvent]
  }
  
  @scala.inline
  implicit class HistogramRangeSliderSegmentDragEventMutableBuilder[Self <: HistogramRangeSliderSegmentDragEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: start | drag): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbIndices(value: js.Array[Double]): Self = StObject.set(x, "thumbIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbIndicesVarargs(value: Double*): Self = StObject.set(x, "thumbIndices", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `segment-drag`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
