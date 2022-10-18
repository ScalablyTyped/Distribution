package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterTuningJobObjective extends StObject {
  
  /**
    * The name of the metric to use for the objective metric.
    */
  var MetricName: typings.awsSdk.clientsSagemakerMod.MetricName
  
  /**
    * Whether to minimize or maximize the objective metric.
    */
  var Type: HyperParameterTuningJobObjectiveType
}
object HyperParameterTuningJobObjective {
  
  inline def apply(MetricName: MetricName, Type: HyperParameterTuningJobObjectiveType): HyperParameterTuningJobObjective = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningJobObjective]
  }
  
  extension [Self <: HyperParameterTuningJobObjective](x: Self) {
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setType(value: HyperParameterTuningJobObjectiveType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
