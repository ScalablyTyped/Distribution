package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLJobObjective extends StObject {
  
  /**
    * The name of the objective metric used to measure the predictive quality of a machine learning system. During training, the model's parameters are updated iteratively to optimize its performance based on the feedback provided by the objective metric when evaluating the model on the validation dataset. For the list of all available metrics supported by Autopilot, see Autopilot metrics. If you do not specify a metric explicitly, the default behavior is to automatically use:    MSE: for regression.    F1: for binary classification    Accuracy: for multiclass classification.  
    */
  var MetricName: AutoMLMetricEnum
}
object AutoMLJobObjective {
  
  inline def apply(MetricName: AutoMLMetricEnum): AutoMLJobObjective = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLJobObjective]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoMLJobObjective] (val x: Self) extends AnyVal {
    
    inline def setMetricName(value: AutoMLMetricEnum): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
  }
}
