package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkInsightsAccessScopeAnalysisRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the Network Access Scope analysis.
    */
  var NetworkInsightsAccessScopeAnalysisId: typings.awsSdk.clientsEc2Mod.NetworkInsightsAccessScopeAnalysisId
}
object DeleteNetworkInsightsAccessScopeAnalysisRequest {
  
  inline def apply(NetworkInsightsAccessScopeAnalysisId: NetworkInsightsAccessScopeAnalysisId): DeleteNetworkInsightsAccessScopeAnalysisRequest = {
    val __obj = js.Dynamic.literal(NetworkInsightsAccessScopeAnalysisId = NetworkInsightsAccessScopeAnalysisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkInsightsAccessScopeAnalysisRequest]
  }
  
  extension [Self <: DeleteNetworkInsightsAccessScopeAnalysisRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setNetworkInsightsAccessScopeAnalysisId(value: NetworkInsightsAccessScopeAnalysisId): Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysisId", value.asInstanceOf[js.Any])
  }
}
