package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayPeering extends StObject {
  
  /**
    * Describes a transit gateway peer connection.
    */
  var Peering: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Peering] = js.undefined
  
  /**
    * The ARN of the transit gateway.
    */
  var TransitGatewayArn: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.TransitGatewayArn] = js.undefined
  
  /**
    * The ID of the transit gateway peering attachment.
    */
  var TransitGatewayPeeringAttachmentId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.TransitGatewayPeeringAttachmentId] = js.undefined
}
object TransitGatewayPeering {
  
  inline def apply(): TransitGatewayPeering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayPeering]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitGatewayPeering] (val x: Self) extends AnyVal {
    
    inline def setPeering(value: Peering): Self = StObject.set(x, "Peering", value.asInstanceOf[js.Any])
    
    inline def setPeeringUndefined: Self = StObject.set(x, "Peering", js.undefined)
    
    inline def setTransitGatewayArn(value: TransitGatewayArn): Self = StObject.set(x, "TransitGatewayArn", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayArnUndefined: Self = StObject.set(x, "TransitGatewayArn", js.undefined)
    
    inline def setTransitGatewayPeeringAttachmentId(value: TransitGatewayPeeringAttachmentId): Self = StObject.set(x, "TransitGatewayPeeringAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPeeringAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayPeeringAttachmentId", js.undefined)
  }
}
