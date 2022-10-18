package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVpcAttachmentResponse extends StObject {
  
  /**
    * Describes the updated VPC attachment.
    */
  var VpcAttachment: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.VpcAttachment] = js.undefined
}
object UpdateVpcAttachmentResponse {
  
  inline def apply(): UpdateVpcAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVpcAttachmentResponse]
  }
  
  extension [Self <: UpdateVpcAttachmentResponse](x: Self) {
    
    inline def setVpcAttachment(value: VpcAttachment): Self = StObject.set(x, "VpcAttachment", value.asInstanceOf[js.Any])
    
    inline def setVpcAttachmentUndefined: Self = StObject.set(x, "VpcAttachment", js.undefined)
  }
}
