package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMetricAttributionsResponse extends StObject {
  
  /**
    * The list of metric attributions.
    */
  var metricAttributions: js.UndefOr[MetricAttributions] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListMetricAttributionsResponse {
  
  inline def apply(): ListMetricAttributionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricAttributionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMetricAttributionsResponse] (val x: Self) extends AnyVal {
    
    inline def setMetricAttributions(value: MetricAttributions): Self = StObject.set(x, "metricAttributions", value.asInstanceOf[js.Any])
    
    inline def setMetricAttributionsUndefined: Self = StObject.set(x, "metricAttributions", js.undefined)
    
    inline def setMetricAttributionsVarargs(value: MetricAttributionSummary*): Self = StObject.set(x, "metricAttributions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
