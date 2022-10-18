package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayAttachmentPropagation extends StObject {
  
  /**
    * The state of the propagation route table.
    */
  var State: js.UndefOr[TransitGatewayPropagationState] = js.undefined
  
  /**
    * The ID of the propagation route table.
    */
  var TransitGatewayRouteTableId: js.UndefOr[String] = js.undefined
}
object TransitGatewayAttachmentPropagation {
  
  inline def apply(): TransitGatewayAttachmentPropagation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayAttachmentPropagation]
  }
  
  extension [Self <: TransitGatewayAttachmentPropagation](x: Self) {
    
    inline def setState(value: TransitGatewayPropagationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTransitGatewayRouteTableId(value: String): Self = StObject.set(x, "TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableIdUndefined: Self = StObject.set(x, "TransitGatewayRouteTableId", js.undefined)
  }
}
