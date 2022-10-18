package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OFITrainingMetricsValue extends StObject {
  
  /**
    *  The model's performance metrics data points. 
    */
  var metricDataPoints: js.UndefOr[OFIMetricDataPointsList] = js.undefined
  
  /**
    *  The model's overall performance score. 
    */
  var modelPerformance: js.UndefOr[OFIModelPerformance] = js.undefined
}
object OFITrainingMetricsValue {
  
  inline def apply(): OFITrainingMetricsValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OFITrainingMetricsValue]
  }
  
  extension [Self <: OFITrainingMetricsValue](x: Self) {
    
    inline def setMetricDataPoints(value: OFIMetricDataPointsList): Self = StObject.set(x, "metricDataPoints", value.asInstanceOf[js.Any])
    
    inline def setMetricDataPointsUndefined: Self = StObject.set(x, "metricDataPoints", js.undefined)
    
    inline def setMetricDataPointsVarargs(value: OFIMetricDataPoint*): Self = StObject.set(x, "metricDataPoints", js.Array(value*))
    
    inline def setModelPerformance(value: OFIModelPerformance): Self = StObject.set(x, "modelPerformance", value.asInstanceOf[js.Any])
    
    inline def setModelPerformanceUndefined: Self = StObject.set(x, "modelPerformance", js.undefined)
  }
}
