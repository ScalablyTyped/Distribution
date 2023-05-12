package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMetricAttributionMetricsResponse extends StObject {
  
  /**
    * The metrics for the specified metric attribution.
    */
  var metrics: js.UndefOr[MetricAttributes] = js.undefined
  
  /**
    * Specify the pagination token from a previous ListMetricAttributionMetricsResponse request to retrieve the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListMetricAttributionMetricsResponse {
  
  inline def apply(): ListMetricAttributionMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricAttributionMetricsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMetricAttributionMetricsResponse] (val x: Self) extends AnyVal {
    
    inline def setMetrics(value: MetricAttributes): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: MetricAttribute*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
