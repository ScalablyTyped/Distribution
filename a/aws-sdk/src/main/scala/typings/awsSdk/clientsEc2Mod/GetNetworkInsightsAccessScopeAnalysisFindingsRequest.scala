package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkInsightsAccessScopeAnalysisFindingsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[NetworkInsightsMaxResults] = js.undefined
  
  /**
    * The ID of the Network Access Scope analysis.
    */
  var NetworkInsightsAccessScopeAnalysisId: typings.awsSdk.clientsEc2Mod.NetworkInsightsAccessScopeAnalysisId
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object GetNetworkInsightsAccessScopeAnalysisFindingsRequest {
  
  inline def apply(NetworkInsightsAccessScopeAnalysisId: NetworkInsightsAccessScopeAnalysisId): GetNetworkInsightsAccessScopeAnalysisFindingsRequest = {
    val __obj = js.Dynamic.literal(NetworkInsightsAccessScopeAnalysisId = NetworkInsightsAccessScopeAnalysisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkInsightsAccessScopeAnalysisFindingsRequest]
  }
  
  extension [Self <: GetNetworkInsightsAccessScopeAnalysisFindingsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setMaxResults(value: NetworkInsightsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNetworkInsightsAccessScopeAnalysisId(value: NetworkInsightsAccessScopeAnalysisId): Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysisId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
