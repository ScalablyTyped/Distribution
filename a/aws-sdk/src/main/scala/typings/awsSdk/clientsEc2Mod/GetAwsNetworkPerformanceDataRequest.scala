package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAwsNetworkPerformanceDataRequest extends StObject {
  
  /**
    * A list of network performance data queries.
    */
  var DataQueries: js.UndefOr[typings.awsSdk.clientsEc2Mod.DataQueries] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ending time for the performance data request. The end time must be formatted as yyyy-mm-ddThh:mm:ss. For example, 2022-06-12T12:00:00.000Z.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The starting time for the performance data request. The starting time must be formatted as yyyy-mm-ddThh:mm:ss. For example, 2022-06-10T12:00:00.000Z.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object GetAwsNetworkPerformanceDataRequest {
  
  inline def apply(): GetAwsNetworkPerformanceDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAwsNetworkPerformanceDataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAwsNetworkPerformanceDataRequest] (val x: Self) extends AnyVal {
    
    inline def setDataQueries(value: DataQueries): Self = StObject.set(x, "DataQueries", value.asInstanceOf[js.Any])
    
    inline def setDataQueriesUndefined: Self = StObject.set(x, "DataQueries", js.undefined)
    
    inline def setDataQueriesVarargs(value: DataQuery*): Self = StObject.set(x, "DataQueries", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
