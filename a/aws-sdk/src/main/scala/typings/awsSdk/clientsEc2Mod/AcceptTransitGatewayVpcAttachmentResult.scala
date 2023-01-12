package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptTransitGatewayVpcAttachmentResult extends StObject {
  
  /**
    * The VPC attachment.
    */
  var TransitGatewayVpcAttachment: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayVpcAttachment] = js.undefined
}
object AcceptTransitGatewayVpcAttachmentResult {
  
  inline def apply(): AcceptTransitGatewayVpcAttachmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptTransitGatewayVpcAttachmentResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcceptTransitGatewayVpcAttachmentResult] (val x: Self) extends AnyVal {
    
    inline def setTransitGatewayVpcAttachment(value: TransitGatewayVpcAttachment): Self = StObject.set(x, "TransitGatewayVpcAttachment", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayVpcAttachmentUndefined: Self = StObject.set(x, "TransitGatewayVpcAttachment", js.undefined)
  }
}
