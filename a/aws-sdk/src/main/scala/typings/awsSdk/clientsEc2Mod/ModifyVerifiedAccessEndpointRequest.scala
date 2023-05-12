package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVerifiedAccessEndpointRequest extends StObject {
  
  /**
    * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * A description for the Verified Access endpoint.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The load balancer details if creating the Verified Access endpoint as load-balancertype.
    */
  var LoadBalancerOptions: js.UndefOr[ModifyVerifiedAccessEndpointLoadBalancerOptions] = js.undefined
  
  /**
    * The network interface options.
    */
  var NetworkInterfaceOptions: js.UndefOr[ModifyVerifiedAccessEndpointEniOptions] = js.undefined
  
  /**
    * The ID of the Verified Access endpoint.
    */
  var VerifiedAccessEndpointId: typings.awsSdk.clientsEc2Mod.VerifiedAccessEndpointId
  
  /**
    * The ID of the Verified Access group.
    */
  var VerifiedAccessGroupId: js.UndefOr[typings.awsSdk.clientsEc2Mod.VerifiedAccessGroupId] = js.undefined
}
object ModifyVerifiedAccessEndpointRequest {
  
  inline def apply(VerifiedAccessEndpointId: VerifiedAccessEndpointId): ModifyVerifiedAccessEndpointRequest = {
    val __obj = js.Dynamic.literal(VerifiedAccessEndpointId = VerifiedAccessEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVerifiedAccessEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyVerifiedAccessEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setLoadBalancerOptions(value: ModifyVerifiedAccessEndpointLoadBalancerOptions): Self = StObject.set(x, "LoadBalancerOptions", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerOptionsUndefined: Self = StObject.set(x, "LoadBalancerOptions", js.undefined)
    
    inline def setNetworkInterfaceOptions(value: ModifyVerifiedAccessEndpointEniOptions): Self = StObject.set(x, "NetworkInterfaceOptions", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceOptionsUndefined: Self = StObject.set(x, "NetworkInterfaceOptions", js.undefined)
    
    inline def setVerifiedAccessEndpointId(value: VerifiedAccessEndpointId): Self = StObject.set(x, "VerifiedAccessEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessGroupId(value: VerifiedAccessGroupId): Self = StObject.set(x, "VerifiedAccessGroupId", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessGroupIdUndefined: Self = StObject.set(x, "VerifiedAccessGroupId", js.undefined)
  }
}
