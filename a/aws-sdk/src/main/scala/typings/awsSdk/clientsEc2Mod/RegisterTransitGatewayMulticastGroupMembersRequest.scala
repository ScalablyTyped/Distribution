package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterTransitGatewayMulticastGroupMembersRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IP address assigned to the transit gateway multicast group.
    */
  var GroupIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The group members' network interface IDs to register with the transit gateway multicast group.
    */
  var NetworkInterfaceIds: TransitGatewayNetworkInterfaceIdList
  
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: typings.awsSdk.clientsEc2Mod.TransitGatewayMulticastDomainId
}
object RegisterTransitGatewayMulticastGroupMembersRequest {
  
  inline def apply(
    NetworkInterfaceIds: TransitGatewayNetworkInterfaceIdList,
    TransitGatewayMulticastDomainId: TransitGatewayMulticastDomainId
  ): RegisterTransitGatewayMulticastGroupMembersRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceIds = NetworkInterfaceIds.asInstanceOf[js.Any], TransitGatewayMulticastDomainId = TransitGatewayMulticastDomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTransitGatewayMulticastGroupMembersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterTransitGatewayMulticastGroupMembersRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setGroupIpAddress(value: String): Self = StObject.set(x, "GroupIpAddress", value.asInstanceOf[js.Any])
    
    inline def setGroupIpAddressUndefined: Self = StObject.set(x, "GroupIpAddress", js.undefined)
    
    inline def setNetworkInterfaceIds(value: TransitGatewayNetworkInterfaceIdList): Self = StObject.set(x, "NetworkInterfaceIds", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdsVarargs(value: NetworkInterfaceId*): Self = StObject.set(x, "NetworkInterfaceIds", js.Array(value*))
    
    inline def setTransitGatewayMulticastDomainId(value: TransitGatewayMulticastDomainId): Self = StObject.set(x, "TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
  }
}
