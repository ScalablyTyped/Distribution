package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayVpcAttachmentResult extends StObject {
  
  /**
    * Information about the VPC attachment.
    */
  var TransitGatewayVpcAttachment: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayVpcAttachment] = js.undefined
}
object CreateTransitGatewayVpcAttachmentResult {
  
  inline def apply(): CreateTransitGatewayVpcAttachmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayVpcAttachmentResult]
  }
  
  extension [Self <: CreateTransitGatewayVpcAttachmentResult](x: Self) {
    
    inline def setTransitGatewayVpcAttachment(value: TransitGatewayVpcAttachment): Self = StObject.set(x, "TransitGatewayVpcAttachment", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayVpcAttachmentUndefined: Self = StObject.set(x, "TransitGatewayVpcAttachment", js.undefined)
  }
}
