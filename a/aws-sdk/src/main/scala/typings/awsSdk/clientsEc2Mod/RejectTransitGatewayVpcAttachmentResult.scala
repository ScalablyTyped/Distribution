package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectTransitGatewayVpcAttachmentResult extends StObject {
  
  /**
    * Information about the attachment.
    */
  var TransitGatewayVpcAttachment: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayVpcAttachment] = js.undefined
}
object RejectTransitGatewayVpcAttachmentResult {
  
  inline def apply(): RejectTransitGatewayVpcAttachmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectTransitGatewayVpcAttachmentResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RejectTransitGatewayVpcAttachmentResult] (val x: Self) extends AnyVal {
    
    inline def setTransitGatewayVpcAttachment(value: TransitGatewayVpcAttachment): Self = StObject.set(x, "TransitGatewayVpcAttachment", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayVpcAttachmentUndefined: Self = StObject.set(x, "TransitGatewayVpcAttachment", js.undefined)
  }
}
