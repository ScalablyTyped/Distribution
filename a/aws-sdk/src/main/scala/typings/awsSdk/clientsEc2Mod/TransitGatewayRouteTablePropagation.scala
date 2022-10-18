package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayRouteTablePropagation extends StObject {
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of resource. Note that the tgw-peering resource type has been deprecated.
    */
  var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType] = js.undefined
  
  /**
    * The state of the resource.
    */
  var State: js.UndefOr[TransitGatewayPropagationState] = js.undefined
  
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the transit gateway route table announcement.
    */
  var TransitGatewayRouteTableAnnouncementId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayRouteTableAnnouncementId] = js.undefined
}
object TransitGatewayRouteTablePropagation {
  
  inline def apply(): TransitGatewayRouteTablePropagation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRouteTablePropagation]
  }
  
  extension [Self <: TransitGatewayRouteTablePropagation](x: Self) {
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: TransitGatewayAttachmentResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setState(value: TransitGatewayPropagationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTransitGatewayAttachmentId(value: String): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
    
    inline def setTransitGatewayRouteTableAnnouncementId(value: TransitGatewayRouteTableAnnouncementId): Self = StObject.set(x, "TransitGatewayRouteTableAnnouncementId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableAnnouncementIdUndefined: Self = StObject.set(x, "TransitGatewayRouteTableAnnouncementId", js.undefined)
  }
}
