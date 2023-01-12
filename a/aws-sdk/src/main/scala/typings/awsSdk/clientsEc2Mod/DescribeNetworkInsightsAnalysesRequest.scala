package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNetworkInsightsAnalysesRequest extends StObject {
  
  /**
    * The time when the network insights analyses ended.
    */
  var AnalysisEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when the network insights analyses started.
    */
  var AnalysisStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The filters. The following are the possible values:   path-found - A Boolean value that indicates whether a feasible path is found.   status - The status of the analysis (running | succeeded | failed).  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[NetworkInsightsMaxResults] = js.undefined
  
  /**
    * The ID of the network insights analyses. You must specify either analysis IDs or a path ID.
    */
  var NetworkInsightsAnalysisIds: js.UndefOr[NetworkInsightsAnalysisIdList] = js.undefined
  
  /**
    * The ID of the path. You must specify either a path ID or analysis IDs.
    */
  var NetworkInsightsPathId: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsPathId] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeNetworkInsightsAnalysesRequest {
  
  inline def apply(): DescribeNetworkInsightsAnalysesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkInsightsAnalysesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeNetworkInsightsAnalysesRequest] (val x: Self) extends AnyVal {
    
    inline def setAnalysisEndTime(value: js.Date): Self = StObject.set(x, "AnalysisEndTime", value.asInstanceOf[js.Any])
    
    inline def setAnalysisEndTimeUndefined: Self = StObject.set(x, "AnalysisEndTime", js.undefined)
    
    inline def setAnalysisStartTime(value: js.Date): Self = StObject.set(x, "AnalysisStartTime", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStartTimeUndefined: Self = StObject.set(x, "AnalysisStartTime", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: NetworkInsightsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNetworkInsightsAnalysisIds(value: NetworkInsightsAnalysisIdList): Self = StObject.set(x, "NetworkInsightsAnalysisIds", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAnalysisIdsUndefined: Self = StObject.set(x, "NetworkInsightsAnalysisIds", js.undefined)
    
    inline def setNetworkInsightsAnalysisIdsVarargs(value: NetworkInsightsAnalysisId*): Self = StObject.set(x, "NetworkInsightsAnalysisIds", js.Array(value*))
    
    inline def setNetworkInsightsPathId(value: NetworkInsightsPathId): Self = StObject.set(x, "NetworkInsightsPathId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsPathIdUndefined: Self = StObject.set(x, "NetworkInsightsPathId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
