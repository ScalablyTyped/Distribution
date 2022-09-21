package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictiveScalingCustomizedLoadMetric extends StObject {
  
  /**
    * One or more metric data queries to provide the data points for a load metric. Use multiple metric data queries only if you are performing a math expression on returned data. 
    */
  var MetricDataQueries: typings.awsSdk.autoscalingMod.MetricDataQueries
}
object PredictiveScalingCustomizedLoadMetric {
  
  inline def apply(MetricDataQueries: MetricDataQueries): PredictiveScalingCustomizedLoadMetric = {
    val __obj = js.Dynamic.literal(MetricDataQueries = MetricDataQueries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictiveScalingCustomizedLoadMetric]
  }
  
  extension [Self <: PredictiveScalingCustomizedLoadMetric](x: Self) {
    
    inline def setMetricDataQueries(value: MetricDataQueries): Self = StObject.set(x, "MetricDataQueries", value.asInstanceOf[js.Any])
    
    inline def setMetricDataQueriesVarargs(value: MetricDataQuery*): Self = StObject.set(x, "MetricDataQueries", js.Array(value*))
  }
}
