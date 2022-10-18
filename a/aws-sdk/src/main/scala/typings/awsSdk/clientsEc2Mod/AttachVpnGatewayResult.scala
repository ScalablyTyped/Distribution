package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachVpnGatewayResult extends StObject {
  
  /**
    * Information about the attachment.
    */
  var VpcAttachment: js.UndefOr[typings.awsSdk.clientsEc2Mod.VpcAttachment] = js.undefined
}
object AttachVpnGatewayResult {
  
  inline def apply(): AttachVpnGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachVpnGatewayResult]
  }
  
  extension [Self <: AttachVpnGatewayResult](x: Self) {
    
    inline def setVpcAttachment(value: VpcAttachment): Self = StObject.set(x, "VpcAttachment", value.asInstanceOf[js.Any])
    
    inline def setVpcAttachmentUndefined: Self = StObject.set(x, "VpcAttachment", js.undefined)
  }
}
