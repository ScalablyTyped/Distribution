package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVpcAttachmentRequest extends StObject {
  
  /**
    * The ID of the attachment.
    */
  var AttachmentId: typings.awsSdk.clientsNetworkmanagerMod.AttachmentId
}
object GetVpcAttachmentRequest {
  
  inline def apply(AttachmentId: AttachmentId): GetVpcAttachmentRequest = {
    val __obj = js.Dynamic.literal(AttachmentId = AttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcAttachmentRequest]
  }
  
  extension [Self <: GetVpcAttachmentRequest](x: Self) {
    
    inline def setAttachmentId(value: AttachmentId): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
  }
}
