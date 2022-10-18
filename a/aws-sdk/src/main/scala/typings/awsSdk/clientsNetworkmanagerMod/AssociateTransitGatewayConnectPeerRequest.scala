package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTransitGatewayConnectPeerRequest extends StObject {
  
  /**
    * The ID of the device.
    */
  var DeviceId: typings.awsSdk.clientsNetworkmanagerMod.DeviceId
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.LinkId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Connect peer.
    */
  var TransitGatewayConnectPeerArn: typings.awsSdk.clientsNetworkmanagerMod.TransitGatewayConnectPeerArn
}
object AssociateTransitGatewayConnectPeerRequest {
  
  inline def apply(
    DeviceId: DeviceId,
    GlobalNetworkId: GlobalNetworkId,
    TransitGatewayConnectPeerArn: TransitGatewayConnectPeerArn
  ): AssociateTransitGatewayConnectPeerRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], TransitGatewayConnectPeerArn = TransitGatewayConnectPeerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTransitGatewayConnectPeerRequest]
  }
  
  extension [Self <: AssociateTransitGatewayConnectPeerRequest](x: Self) {
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setLinkId(value: LinkId): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "LinkId", js.undefined)
    
    inline def setTransitGatewayConnectPeerArn(value: TransitGatewayConnectPeerArn): Self = StObject.set(x, "TransitGatewayConnectPeerArn", value.asInstanceOf[js.Any])
  }
}
