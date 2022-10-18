package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateClientVpnTargetNetworkRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: typings.awsSdk.clientsEc2Mod.ClientVpnEndpointId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the subnet to associate with the Client VPN endpoint.
    */
  var SubnetId: typings.awsSdk.clientsEc2Mod.SubnetId
}
object AssociateClientVpnTargetNetworkRequest {
  
  inline def apply(ClientVpnEndpointId: ClientVpnEndpointId, SubnetId: SubnetId): AssociateClientVpnTargetNetworkRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateClientVpnTargetNetworkRequest]
  }
  
  extension [Self <: AssociateClientVpnTargetNetworkRequest](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
  }
}
