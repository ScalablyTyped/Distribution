package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomMetricsResponse extends StObject {
  
  /**
    *  The name of the custom metric. 
    */
  var metricNames: js.UndefOr[MetricNames] = js.undefined
  
  /**
    *  A token that can be used to retrieve the next set of results, or null if there are no additional results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListCustomMetricsResponse {
  
  inline def apply(): ListCustomMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomMetricsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCustomMetricsResponse] (val x: Self) extends AnyVal {
    
    inline def setMetricNames(value: MetricNames): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    inline def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    inline def setMetricNamesVarargs(value: MetricName*): Self = StObject.set(x, "metricNames", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
