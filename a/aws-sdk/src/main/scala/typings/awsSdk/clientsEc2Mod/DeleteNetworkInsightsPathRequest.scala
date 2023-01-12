package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkInsightsPathRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the path.
    */
  var NetworkInsightsPathId: typings.awsSdk.clientsEc2Mod.NetworkInsightsPathId
}
object DeleteNetworkInsightsPathRequest {
  
  inline def apply(NetworkInsightsPathId: NetworkInsightsPathId): DeleteNetworkInsightsPathRequest = {
    val __obj = js.Dynamic.literal(NetworkInsightsPathId = NetworkInsightsPathId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkInsightsPathRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteNetworkInsightsPathRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setNetworkInsightsPathId(value: NetworkInsightsPathId): Self = StObject.set(x, "NetworkInsightsPathId", value.asInstanceOf[js.Any])
  }
}
