package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayPeeringAttachmentRequestOptions extends StObject {
  
  /**
    * Indicates whether dynamic routing is enabled or disabled.
    */
  var DynamicRouting: js.UndefOr[DynamicRoutingValue] = js.undefined
}
object CreateTransitGatewayPeeringAttachmentRequestOptions {
  
  inline def apply(): CreateTransitGatewayPeeringAttachmentRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayPeeringAttachmentRequestOptions]
  }
  
  extension [Self <: CreateTransitGatewayPeeringAttachmentRequestOptions](x: Self) {
    
    inline def setDynamicRouting(value: DynamicRoutingValue): Self = StObject.set(x, "DynamicRouting", value.asInstanceOf[js.Any])
    
    inline def setDynamicRoutingUndefined: Self = StObject.set(x, "DynamicRouting", js.undefined)
  }
}
