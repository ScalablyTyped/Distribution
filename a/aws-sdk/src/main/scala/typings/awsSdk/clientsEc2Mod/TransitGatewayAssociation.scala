package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayAssociation extends StObject {
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The resource type. Note that the tgw-peering resource type has been deprecated.
    */
  var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType] = js.undefined
  
  /**
    * The state of the association.
    */
  var State: js.UndefOr[TransitGatewayAssociationState] = js.undefined
  
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayAttachmentId] = js.undefined
  
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayRouteTableId] = js.undefined
}
object TransitGatewayAssociation {
  
  inline def apply(): TransitGatewayAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayAssociation]
  }
  
  extension [Self <: TransitGatewayAssociation](x: Self) {
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: TransitGatewayAttachmentResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setState(value: TransitGatewayAssociationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
    
    inline def setTransitGatewayRouteTableId(value: TransitGatewayRouteTableId): Self = StObject.set(x, "TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableIdUndefined: Self = StObject.set(x, "TransitGatewayRouteTableId", js.undefined)
  }
}
