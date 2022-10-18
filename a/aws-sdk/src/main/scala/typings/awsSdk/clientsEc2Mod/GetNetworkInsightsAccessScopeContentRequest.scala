package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkInsightsAccessScopeContentRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the Network Access Scope.
    */
  var NetworkInsightsAccessScopeId: typings.awsSdk.clientsEc2Mod.NetworkInsightsAccessScopeId
}
object GetNetworkInsightsAccessScopeContentRequest {
  
  inline def apply(NetworkInsightsAccessScopeId: NetworkInsightsAccessScopeId): GetNetworkInsightsAccessScopeContentRequest = {
    val __obj = js.Dynamic.literal(NetworkInsightsAccessScopeId = NetworkInsightsAccessScopeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkInsightsAccessScopeContentRequest]
  }
  
  extension [Self <: GetNetworkInsightsAccessScopeContentRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setNetworkInsightsAccessScopeId(value: NetworkInsightsAccessScopeId): Self = StObject.set(x, "NetworkInsightsAccessScopeId", value.asInstanceOf[js.Any])
  }
}
