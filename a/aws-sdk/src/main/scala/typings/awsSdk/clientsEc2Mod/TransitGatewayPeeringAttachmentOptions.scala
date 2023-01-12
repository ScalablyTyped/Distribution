package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayPeeringAttachmentOptions extends StObject {
  
  /**
    * Describes whether dynamic routing is enabled or disabled for the transit gateway peering attachment.
    */
  var DynamicRouting: js.UndefOr[DynamicRoutingValue] = js.undefined
}
object TransitGatewayPeeringAttachmentOptions {
  
  inline def apply(): TransitGatewayPeeringAttachmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayPeeringAttachmentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitGatewayPeeringAttachmentOptions] (val x: Self) extends AnyVal {
    
    inline def setDynamicRouting(value: DynamicRoutingValue): Self = StObject.set(x, "DynamicRouting", value.asInstanceOf[js.Any])
    
    inline def setDynamicRoutingUndefined: Self = StObject.set(x, "DynamicRouting", js.undefined)
  }
}
