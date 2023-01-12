package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingMetrics extends StObject {
  
  /**
    * The area under the curve. This summarizes true positive rate (TPR) and false positive rate (FPR) across all possible model score thresholds. A model with no predictive power has an AUC of 0.5, whereas a perfect model has a score of 1.0.
    */
  var auc: js.UndefOr[float] = js.undefined
  
  /**
    * The data points details.
    */
  var metricDataPoints: js.UndefOr[metricDataPointsList] = js.undefined
}
object TrainingMetrics {
  
  inline def apply(): TrainingMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrainingMetrics] (val x: Self) extends AnyVal {
    
    inline def setAuc(value: float): Self = StObject.set(x, "auc", value.asInstanceOf[js.Any])
    
    inline def setAucUndefined: Self = StObject.set(x, "auc", js.undefined)
    
    inline def setMetricDataPoints(value: metricDataPointsList): Self = StObject.set(x, "metricDataPoints", value.asInstanceOf[js.Any])
    
    inline def setMetricDataPointsUndefined: Self = StObject.set(x, "metricDataPoints", js.undefined)
    
    inline def setMetricDataPointsVarargs(value: MetricDataPoint*): Self = StObject.set(x, "metricDataPoints", js.Array(value*))
  }
}
