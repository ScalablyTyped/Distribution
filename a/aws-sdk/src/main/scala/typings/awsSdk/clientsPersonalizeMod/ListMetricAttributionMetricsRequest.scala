package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMetricAttributionMetricsRequest extends StObject {
  
  /**
    * The maximum number of metrics to return in one page of results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the metric attribution to retrieve attributes for.
    */
  var metricAttributionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListMetricAttributionMetricsRequest {
  
  inline def apply(): ListMetricAttributionMetricsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricAttributionMetricsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMetricAttributionMetricsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMetricAttributionArn(value: Arn): Self = StObject.set(x, "metricAttributionArn", value.asInstanceOf[js.Any])
    
    inline def setMetricAttributionArnUndefined: Self = StObject.set(x, "metricAttributionArn", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
