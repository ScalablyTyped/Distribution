package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateTransitGatewayConnectPeerRequest extends StObject {
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The Amazon Resource Name (ARN) of the transit gateway Connect peer.
    */
  var TransitGatewayConnectPeerArn: typings.awsSdk.clientsNetworkmanagerMod.TransitGatewayConnectPeerArn
}
object DisassociateTransitGatewayConnectPeerRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId, TransitGatewayConnectPeerArn: TransitGatewayConnectPeerArn): DisassociateTransitGatewayConnectPeerRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], TransitGatewayConnectPeerArn = TransitGatewayConnectPeerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTransitGatewayConnectPeerRequest]
  }
  
  extension [Self <: DisassociateTransitGatewayConnectPeerRequest](x: Self) {
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayConnectPeerArn(value: TransitGatewayConnectPeerArn): Self = StObject.set(x, "TransitGatewayConnectPeerArn", value.asInstanceOf[js.Any])
  }
}
