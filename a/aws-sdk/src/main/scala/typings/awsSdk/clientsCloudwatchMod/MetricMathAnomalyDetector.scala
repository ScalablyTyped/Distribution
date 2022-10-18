package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricMathAnomalyDetector extends StObject {
  
  /**
    * An array of metric data query structures that enables you to create an anomaly detector based on the result of a metric math expression. Each item in MetricDataQueries gets a metric or performs a math expression. One item in MetricDataQueries is the expression that provides the time series that the anomaly detector uses as input. Designate the expression by setting ReturnData to True for this object in the array. For all other expressions and metrics, set ReturnData to False. The designated expression must return a single time series.
    */
  var MetricDataQueries: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.MetricDataQueries] = js.undefined
}
object MetricMathAnomalyDetector {
  
  inline def apply(): MetricMathAnomalyDetector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricMathAnomalyDetector]
  }
  
  extension [Self <: MetricMathAnomalyDetector](x: Self) {
    
    inline def setMetricDataQueries(value: MetricDataQueries): Self = StObject.set(x, "MetricDataQueries", value.asInstanceOf[js.Any])
    
    inline def setMetricDataQueriesUndefined: Self = StObject.set(x, "MetricDataQueries", js.undefined)
    
    inline def setMetricDataQueriesVarargs(value: MetricDataQuery*): Self = StObject.set(x, "MetricDataQueries", js.Array(value*))
  }
}
