package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCurrentMetricDataResponse extends StObject {
  
  /**
    * The total count of the result, regardless of the current page size. 
    */
  var ApproximateTotalCount: js.UndefOr[typings.awsSdk.clientsConnectMod.ApproximateTotalCount] = js.undefined
  
  /**
    * The time at which the metrics were retrieved and cached for pagination.
    */
  var DataSnapshotTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about the real-time metrics.
    */
  var MetricResults: js.UndefOr[CurrentMetricResults] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must use the same request parameters as the request that generated the token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
}
object GetCurrentMetricDataResponse {
  
  inline def apply(): GetCurrentMetricDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCurrentMetricDataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCurrentMetricDataResponse] (val x: Self) extends AnyVal {
    
    inline def setApproximateTotalCount(value: ApproximateTotalCount): Self = StObject.set(x, "ApproximateTotalCount", value.asInstanceOf[js.Any])
    
    inline def setApproximateTotalCountUndefined: Self = StObject.set(x, "ApproximateTotalCount", js.undefined)
    
    inline def setDataSnapshotTime(value: js.Date): Self = StObject.set(x, "DataSnapshotTime", value.asInstanceOf[js.Any])
    
    inline def setDataSnapshotTimeUndefined: Self = StObject.set(x, "DataSnapshotTime", js.undefined)
    
    inline def setMetricResults(value: CurrentMetricResults): Self = StObject.set(x, "MetricResults", value.asInstanceOf[js.Any])
    
    inline def setMetricResultsUndefined: Self = StObject.set(x, "MetricResults", js.undefined)
    
    inline def setMetricResultsVarargs(value: CurrentMetricResult*): Self = StObject.set(x, "MetricResults", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
