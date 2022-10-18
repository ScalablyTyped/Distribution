package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkInsightsAnalysisRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the network insights analysis.
    */
  var NetworkInsightsAnalysisId: typings.awsSdk.clientsEc2Mod.NetworkInsightsAnalysisId
}
object DeleteNetworkInsightsAnalysisRequest {
  
  inline def apply(NetworkInsightsAnalysisId: NetworkInsightsAnalysisId): DeleteNetworkInsightsAnalysisRequest = {
    val __obj = js.Dynamic.literal(NetworkInsightsAnalysisId = NetworkInsightsAnalysisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkInsightsAnalysisRequest]
  }
  
  extension [Self <: DeleteNetworkInsightsAnalysisRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setNetworkInsightsAnalysisId(value: NetworkInsightsAnalysisId): Self = StObject.set(x, "NetworkInsightsAnalysisId", value.asInstanceOf[js.Any])
  }
}
