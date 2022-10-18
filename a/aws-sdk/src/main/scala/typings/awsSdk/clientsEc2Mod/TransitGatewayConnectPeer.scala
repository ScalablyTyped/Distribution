package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayConnectPeer extends StObject {
  
  /**
    * The Connect peer details.
    */
  var ConnectPeerConfiguration: js.UndefOr[TransitGatewayConnectPeerConfiguration] = js.undefined
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the Connect peer.
    */
  var State: js.UndefOr[TransitGatewayConnectPeerState] = js.undefined
  
  /**
    * The tags for the Connect peer.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the Connect attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayAttachmentId] = js.undefined
  
  /**
    * The ID of the Connect peer.
    */
  var TransitGatewayConnectPeerId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayConnectPeerId] = js.undefined
}
object TransitGatewayConnectPeer {
  
  inline def apply(): TransitGatewayConnectPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayConnectPeer]
  }
  
  extension [Self <: TransitGatewayConnectPeer](x: Self) {
    
    inline def setConnectPeerConfiguration(value: TransitGatewayConnectPeerConfiguration): Self = StObject.set(x, "ConnectPeerConfiguration", value.asInstanceOf[js.Any])
    
    inline def setConnectPeerConfigurationUndefined: Self = StObject.set(x, "ConnectPeerConfiguration", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setState(value: TransitGatewayConnectPeerState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
    
    inline def setTransitGatewayConnectPeerId(value: TransitGatewayConnectPeerId): Self = StObject.set(x, "TransitGatewayConnectPeerId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayConnectPeerIdUndefined: Self = StObject.set(x, "TransitGatewayConnectPeerId", js.undefined)
  }
}
