package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMetricDataV2Response extends StObject {
  
  /**
    * Information about the metrics requested in the API request If no grouping is specified, a summary of metric data is returned. 
    */
  var MetricResults: js.UndefOr[MetricResultsV2] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[NextToken2500] = js.undefined
}
object GetMetricDataV2Response {
  
  inline def apply(): GetMetricDataV2Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricDataV2Response]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMetricDataV2Response] (val x: Self) extends AnyVal {
    
    inline def setMetricResults(value: MetricResultsV2): Self = StObject.set(x, "MetricResults", value.asInstanceOf[js.Any])
    
    inline def setMetricResultsUndefined: Self = StObject.set(x, "MetricResults", js.undefined)
    
    inline def setMetricResultsVarargs(value: MetricResultV2*): Self = StObject.set(x, "MetricResults", js.Array(value*))
    
    inline def setNextToken(value: NextToken2500): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
