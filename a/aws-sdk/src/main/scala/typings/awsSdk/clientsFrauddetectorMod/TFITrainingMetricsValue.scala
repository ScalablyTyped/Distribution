package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TFITrainingMetricsValue extends StObject {
  
  /**
    *  The model's performance metrics data points. 
    */
  var metricDataPoints: js.UndefOr[TFIMetricDataPointsList] = js.undefined
  
  /**
    *  The model performance score. 
    */
  var modelPerformance: js.UndefOr[TFIModelPerformance] = js.undefined
}
object TFITrainingMetricsValue {
  
  inline def apply(): TFITrainingMetricsValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TFITrainingMetricsValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TFITrainingMetricsValue] (val x: Self) extends AnyVal {
    
    inline def setMetricDataPoints(value: TFIMetricDataPointsList): Self = StObject.set(x, "metricDataPoints", value.asInstanceOf[js.Any])
    
    inline def setMetricDataPointsUndefined: Self = StObject.set(x, "metricDataPoints", js.undefined)
    
    inline def setMetricDataPointsVarargs(value: TFIMetricDataPoint*): Self = StObject.set(x, "metricDataPoints", js.Array(value*))
    
    inline def setModelPerformance(value: TFIModelPerformance): Self = StObject.set(x, "modelPerformance", value.asInstanceOf[js.Any])
    
    inline def setModelPerformanceUndefined: Self = StObject.set(x, "modelPerformance", js.undefined)
  }
}
