package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayRouteTableAnnouncement extends StObject {
  
  /**
    * The direction for the route table announcement.
    */
  var AnnouncementDirection: js.UndefOr[TransitGatewayRouteTableAnnouncementDirection] = js.undefined
  
  /**
    * The ID of the core network for the transit gateway route table announcement.
    */
  var CoreNetworkId: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when the transit gateway route table announcement was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the core network ID for the peer.
    */
  var PeerCoreNetworkId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the peer transit gateway.
    */
  var PeerTransitGatewayId: js.UndefOr[TransitGatewayId] = js.undefined
  
  /**
    * The ID of the peering attachment.
    */
  var PeeringAttachmentId: js.UndefOr[TransitGatewayAttachmentId] = js.undefined
  
  /**
    * The state of the transit gateway announcement.
    */
  var State: js.UndefOr[TransitGatewayRouteTableAnnouncementState] = js.undefined
  
  /**
    * The key-value pairs associated with the route table announcement.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayId] = js.undefined
  
  /**
    * The ID of the transit gateway route table announcement.
    */
  var TransitGatewayRouteTableAnnouncementId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayRouteTableAnnouncementId] = js.undefined
  
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayRouteTableId] = js.undefined
}
object TransitGatewayRouteTableAnnouncement {
  
  inline def apply(): TransitGatewayRouteTableAnnouncement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRouteTableAnnouncement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitGatewayRouteTableAnnouncement] (val x: Self) extends AnyVal {
    
    inline def setAnnouncementDirection(value: TransitGatewayRouteTableAnnouncementDirection): Self = StObject.set(x, "AnnouncementDirection", value.asInstanceOf[js.Any])
    
    inline def setAnnouncementDirectionUndefined: Self = StObject.set(x, "AnnouncementDirection", js.undefined)
    
    inline def setCoreNetworkId(value: String): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkIdUndefined: Self = StObject.set(x, "CoreNetworkId", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setPeerCoreNetworkId(value: String): Self = StObject.set(x, "PeerCoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setPeerCoreNetworkIdUndefined: Self = StObject.set(x, "PeerCoreNetworkId", js.undefined)
    
    inline def setPeerTransitGatewayId(value: TransitGatewayId): Self = StObject.set(x, "PeerTransitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setPeerTransitGatewayIdUndefined: Self = StObject.set(x, "PeerTransitGatewayId", js.undefined)
    
    inline def setPeeringAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "PeeringAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setPeeringAttachmentIdUndefined: Self = StObject.set(x, "PeeringAttachmentId", js.undefined)
    
    inline def setState(value: TransitGatewayRouteTableAnnouncementState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTransitGatewayId(value: TransitGatewayId): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    inline def setTransitGatewayRouteTableAnnouncementId(value: TransitGatewayRouteTableAnnouncementId): Self = StObject.set(x, "TransitGatewayRouteTableAnnouncementId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableAnnouncementIdUndefined: Self = StObject.set(x, "TransitGatewayRouteTableAnnouncementId", js.undefined)
    
    inline def setTransitGatewayRouteTableId(value: TransitGatewayRouteTableId): Self = StObject.set(x, "TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableIdUndefined: Self = StObject.set(x, "TransitGatewayRouteTableId", js.undefined)
  }
}
