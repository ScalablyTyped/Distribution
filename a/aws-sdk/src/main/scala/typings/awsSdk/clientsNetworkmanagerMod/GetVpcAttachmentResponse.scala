package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVpcAttachmentResponse extends StObject {
  
  /**
    * Returns details about a VPC attachment.
    */
  var VpcAttachment: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.VpcAttachment] = js.undefined
}
object GetVpcAttachmentResponse {
  
  inline def apply(): GetVpcAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcAttachmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVpcAttachmentResponse] (val x: Self) extends AnyVal {
    
    inline def setVpcAttachment(value: VpcAttachment): Self = StObject.set(x, "VpcAttachment", value.asInstanceOf[js.Any])
    
    inline def setVpcAttachmentUndefined: Self = StObject.set(x, "VpcAttachment", js.undefined)
  }
}
