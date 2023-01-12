package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayRouteTableAttachment extends StObject {
  
  var Attachment: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Attachment] = js.undefined
  
  /**
    * The ID of the peering attachment.
    */
  var PeeringId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.PeeringId] = js.undefined
  
  /**
    * The ARN of the transit gateway attachment route table.
    */
  var TransitGatewayRouteTableArn: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.TransitGatewayRouteTableArn] = js.undefined
}
object TransitGatewayRouteTableAttachment {
  
  inline def apply(): TransitGatewayRouteTableAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRouteTableAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitGatewayRouteTableAttachment] (val x: Self) extends AnyVal {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
    
    inline def setPeeringId(value: PeeringId): Self = StObject.set(x, "PeeringId", value.asInstanceOf[js.Any])
    
    inline def setPeeringIdUndefined: Self = StObject.set(x, "PeeringId", js.undefined)
    
    inline def setTransitGatewayRouteTableArn(value: TransitGatewayRouteTableArn): Self = StObject.set(x, "TransitGatewayRouteTableArn", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableArnUndefined: Self = StObject.set(x, "TransitGatewayRouteTableArn", js.undefined)
  }
}
