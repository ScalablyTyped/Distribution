package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalHyperParameterTuningJobObjectiveMetric extends StObject {
  
  /**
    * The name of the objective metric. For SageMaker built-in algorithms, metrics are defined per algorithm. See the metrics for XGBoost as an example. You can also use a custom algorithm for training and define your own metrics. For more information, see Define metrics and environment variables.
    */
  var MetricName: typings.awsSdk.clientsSagemakerMod.MetricName
  
  /**
    * Select if you want to minimize or maximize the objective metric during hyperparameter tuning. 
    */
  var Type: js.UndefOr[HyperParameterTuningJobObjectiveType] = js.undefined
  
  /**
    * The value of the objective metric.
    */
  var Value: MetricValue
}
object FinalHyperParameterTuningJobObjectiveMetric {
  
  inline def apply(MetricName: MetricName, Value: MetricValue): FinalHyperParameterTuningJobObjectiveMetric = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalHyperParameterTuningJobObjectiveMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FinalHyperParameterTuningJobObjectiveMetric] (val x: Self) extends AnyVal {
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setType(value: HyperParameterTuningJobObjectiveType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: MetricValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
