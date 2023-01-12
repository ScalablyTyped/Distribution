package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ATITrainingMetricsValue extends StObject {
  
  /**
    *  The model's performance metrics data points. 
    */
  var metricDataPoints: js.UndefOr[ATIMetricDataPointsList] = js.undefined
  
  /**
    *  The model's overall performance scores. 
    */
  var modelPerformance: js.UndefOr[ATIModelPerformance] = js.undefined
}
object ATITrainingMetricsValue {
  
  inline def apply(): ATITrainingMetricsValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ATITrainingMetricsValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ATITrainingMetricsValue] (val x: Self) extends AnyVal {
    
    inline def setMetricDataPoints(value: ATIMetricDataPointsList): Self = StObject.set(x, "metricDataPoints", value.asInstanceOf[js.Any])
    
    inline def setMetricDataPointsUndefined: Self = StObject.set(x, "metricDataPoints", js.undefined)
    
    inline def setMetricDataPointsVarargs(value: ATIMetricDataPoint*): Self = StObject.set(x, "metricDataPoints", js.Array(value*))
    
    inline def setModelPerformance(value: ATIModelPerformance): Self = StObject.set(x, "modelPerformance", value.asInstanceOf[js.Any])
    
    inline def setModelPerformanceUndefined: Self = StObject.set(x, "modelPerformance", js.undefined)
  }
}
