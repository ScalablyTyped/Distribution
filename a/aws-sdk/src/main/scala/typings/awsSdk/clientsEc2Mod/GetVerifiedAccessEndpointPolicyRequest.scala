package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVerifiedAccessEndpointPolicyRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the Verified Access endpoint.
    */
  var VerifiedAccessEndpointId: typings.awsSdk.clientsEc2Mod.VerifiedAccessEndpointId
}
object GetVerifiedAccessEndpointPolicyRequest {
  
  inline def apply(VerifiedAccessEndpointId: VerifiedAccessEndpointId): GetVerifiedAccessEndpointPolicyRequest = {
    val __obj = js.Dynamic.literal(VerifiedAccessEndpointId = VerifiedAccessEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVerifiedAccessEndpointPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVerifiedAccessEndpointPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setVerifiedAccessEndpointId(value: VerifiedAccessEndpointId): Self = StObject.set(x, "VerifiedAccessEndpointId", value.asInstanceOf[js.Any])
  }
}
