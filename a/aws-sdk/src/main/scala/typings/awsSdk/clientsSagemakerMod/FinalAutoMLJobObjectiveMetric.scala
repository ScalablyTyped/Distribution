package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalAutoMLJobObjectiveMetric extends StObject {
  
  /**
    * The name of the metric with the best result. For a description of the possible objective metrics, see AutoMLJobObjective$MetricName.
    */
  var MetricName: AutoMLMetricEnum
  
  /**
    * The name of the standard metric. For a description of the standard metrics, see Autopilot candidate metrics.
    */
  var StandardMetricName: js.UndefOr[AutoMLMetricEnum] = js.undefined
  
  /**
    * The type of metric with the best result.
    */
  var Type: js.UndefOr[AutoMLJobObjectiveType] = js.undefined
  
  /**
    * The value of the metric with the best result.
    */
  var Value: MetricValue
}
object FinalAutoMLJobObjectiveMetric {
  
  inline def apply(MetricName: AutoMLMetricEnum, Value: MetricValue): FinalAutoMLJobObjectiveMetric = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalAutoMLJobObjectiveMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FinalAutoMLJobObjectiveMetric] (val x: Self) extends AnyVal {
    
    inline def setMetricName(value: AutoMLMetricEnum): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setStandardMetricName(value: AutoMLMetricEnum): Self = StObject.set(x, "StandardMetricName", value.asInstanceOf[js.Any])
    
    inline def setStandardMetricNameUndefined: Self = StObject.set(x, "StandardMetricName", js.undefined)
    
    inline def setType(value: AutoMLJobObjectiveType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: MetricValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
