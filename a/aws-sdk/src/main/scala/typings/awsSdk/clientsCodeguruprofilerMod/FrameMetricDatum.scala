package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameMetricDatum extends StObject {
  
  var frameMetric: FrameMetric
  
  /**
    *  A list of values that are associated with a frame metric. 
    */
  var values: FrameMetricValues
}
object FrameMetricDatum {
  
  inline def apply(frameMetric: FrameMetric, values: FrameMetricValues): FrameMetricDatum = {
    val __obj = js.Dynamic.literal(frameMetric = frameMetric.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameMetricDatum]
  }
  
  extension [Self <: FrameMetricDatum](x: Self) {
    
    inline def setFrameMetric(value: FrameMetric): Self = StObject.set(x, "frameMetric", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FrameMetricValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FrameMetricValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
