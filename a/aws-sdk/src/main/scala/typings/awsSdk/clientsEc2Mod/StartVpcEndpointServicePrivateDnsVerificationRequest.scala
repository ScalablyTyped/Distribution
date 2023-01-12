package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartVpcEndpointServicePrivateDnsVerificationRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: VpcEndpointServiceId
}
object StartVpcEndpointServicePrivateDnsVerificationRequest {
  
  inline def apply(ServiceId: VpcEndpointServiceId): StartVpcEndpointServicePrivateDnsVerificationRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartVpcEndpointServicePrivateDnsVerificationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartVpcEndpointServicePrivateDnsVerificationRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setServiceId(value: VpcEndpointServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
  }
}
