package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayPolicyTableAssociation extends StObject {
  
  /**
    * The resource ID of the transit gateway attachment.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The resource type for the transit gateway policy table association.
    */
  var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType] = js.undefined
  
  /**
    * The state of the transit gateway policy table association.
    */
  var State: js.UndefOr[TransitGatewayAssociationState] = js.undefined
  
  /**
    * The ID of the transit gateway attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayAttachmentId] = js.undefined
  
  /**
    * The ID of the transit gateway policy table.
    */
  var TransitGatewayPolicyTableId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayPolicyTableId] = js.undefined
}
object TransitGatewayPolicyTableAssociation {
  
  inline def apply(): TransitGatewayPolicyTableAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayPolicyTableAssociation]
  }
  
  extension [Self <: TransitGatewayPolicyTableAssociation](x: Self) {
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: TransitGatewayAttachmentResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setState(value: TransitGatewayAssociationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
    
    inline def setTransitGatewayPolicyTableId(value: TransitGatewayPolicyTableId): Self = StObject.set(x, "TransitGatewayPolicyTableId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPolicyTableIdUndefined: Self = StObject.set(x, "TransitGatewayPolicyTableId", js.undefined)
  }
}
