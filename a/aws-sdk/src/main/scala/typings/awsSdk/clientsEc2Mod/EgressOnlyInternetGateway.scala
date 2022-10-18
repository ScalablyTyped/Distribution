package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EgressOnlyInternetGateway extends StObject {
  
  /**
    * Information about the attachment of the egress-only internet gateway.
    */
  var Attachments: js.UndefOr[InternetGatewayAttachmentList] = js.undefined
  
  /**
    * The ID of the egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: js.UndefOr[typings.awsSdk.clientsEc2Mod.EgressOnlyInternetGatewayId] = js.undefined
  
  /**
    * The tags assigned to the egress-only internet gateway.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object EgressOnlyInternetGateway {
  
  inline def apply(): EgressOnlyInternetGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EgressOnlyInternetGateway]
  }
  
  extension [Self <: EgressOnlyInternetGateway](x: Self) {
    
    inline def setAttachments(value: InternetGatewayAttachmentList): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "Attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: InternetGatewayAttachment*): Self = StObject.set(x, "Attachments", js.Array(value*))
    
    inline def setEgressOnlyInternetGatewayId(value: EgressOnlyInternetGatewayId): Self = StObject.set(x, "EgressOnlyInternetGatewayId", value.asInstanceOf[js.Any])
    
    inline def setEgressOnlyInternetGatewayIdUndefined: Self = StObject.set(x, "EgressOnlyInternetGatewayId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
