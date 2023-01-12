package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictiveScalingCustomizedScalingMetric extends StObject {
  
  /**
    * One or more metric data queries to provide the data points for a scaling metric. Use multiple metric data queries only if you are performing a math expression on returned data. 
    */
  var MetricDataQueries: typings.awsSdk.clientsAutoscalingMod.MetricDataQueries
}
object PredictiveScalingCustomizedScalingMetric {
  
  inline def apply(MetricDataQueries: MetricDataQueries): PredictiveScalingCustomizedScalingMetric = {
    val __obj = js.Dynamic.literal(MetricDataQueries = MetricDataQueries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictiveScalingCustomizedScalingMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredictiveScalingCustomizedScalingMetric] (val x: Self) extends AnyVal {
    
    inline def setMetricDataQueries(value: MetricDataQueries): Self = StObject.set(x, "MetricDataQueries", value.asInstanceOf[js.Any])
    
    inline def setMetricDataQueriesVarargs(value: MetricDataQuery*): Self = StObject.set(x, "MetricDataQueries", js.Array(value*))
  }
}
