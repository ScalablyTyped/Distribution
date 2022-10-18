package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayPrefixListAttachment extends StObject {
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The resource type. Note that the tgw-peering resource type has been deprecated.
    */
  var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType] = js.undefined
  
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayAttachmentId] = js.undefined
}
object TransitGatewayPrefixListAttachment {
  
  inline def apply(): TransitGatewayPrefixListAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayPrefixListAttachment]
  }
  
  extension [Self <: TransitGatewayPrefixListAttachment](x: Self) {
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: TransitGatewayAttachmentResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
  }
}
