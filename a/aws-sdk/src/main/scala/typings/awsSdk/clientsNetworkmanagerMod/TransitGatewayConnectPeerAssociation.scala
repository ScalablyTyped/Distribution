package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayConnectPeerAssociation extends StObject {
  
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.DeviceId] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId] = js.undefined
  
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.LinkId] = js.undefined
  
  /**
    * The state of the association.
    */
  var State: js.UndefOr[TransitGatewayConnectPeerAssociationState] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the transit gateway Connect peer.
    */
  var TransitGatewayConnectPeerArn: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.TransitGatewayConnectPeerArn] = js.undefined
}
object TransitGatewayConnectPeerAssociation {
  
  inline def apply(): TransitGatewayConnectPeerAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayConnectPeerAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitGatewayConnectPeerAssociation] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    inline def setLinkId(value: LinkId): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "LinkId", js.undefined)
    
    inline def setState(value: TransitGatewayConnectPeerAssociationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTransitGatewayConnectPeerArn(value: TransitGatewayConnectPeerArn): Self = StObject.set(x, "TransitGatewayConnectPeerArn", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayConnectPeerArnUndefined: Self = StObject.set(x, "TransitGatewayConnectPeerArn", js.undefined)
  }
}
