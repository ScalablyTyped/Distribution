package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayPeeringAttachmentResult extends StObject {
  
  /**
    * The transit gateway peering attachment.
    */
  var TransitGatewayPeeringAttachment: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayPeeringAttachment] = js.undefined
}
object CreateTransitGatewayPeeringAttachmentResult {
  
  inline def apply(): CreateTransitGatewayPeeringAttachmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayPeeringAttachmentResult]
  }
  
  extension [Self <: CreateTransitGatewayPeeringAttachmentResult](x: Self) {
    
    inline def setTransitGatewayPeeringAttachment(value: TransitGatewayPeeringAttachment): Self = StObject.set(x, "TransitGatewayPeeringAttachment", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPeeringAttachmentUndefined: Self = StObject.set(x, "TransitGatewayPeeringAttachment", js.undefined)
  }
}
