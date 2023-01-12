package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcAttachmentResponse extends StObject {
  
  /**
    * Provides details about the VPC attachment.
    */
  var VpcAttachment: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.VpcAttachment] = js.undefined
}
object CreateVpcAttachmentResponse {
  
  inline def apply(): CreateVpcAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcAttachmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVpcAttachmentResponse] (val x: Self) extends AnyVal {
    
    inline def setVpcAttachment(value: VpcAttachment): Self = StObject.set(x, "VpcAttachment", value.asInstanceOf[js.Any])
    
    inline def setVpcAttachmentUndefined: Self = StObject.set(x, "VpcAttachment", js.undefined)
  }
}
