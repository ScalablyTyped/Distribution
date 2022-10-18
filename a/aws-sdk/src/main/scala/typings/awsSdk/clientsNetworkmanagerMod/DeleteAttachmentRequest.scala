package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAttachmentRequest extends StObject {
  
  /**
    * The ID of the attachment to delete.
    */
  var AttachmentId: typings.awsSdk.clientsNetworkmanagerMod.AttachmentId
}
object DeleteAttachmentRequest {
  
  inline def apply(AttachmentId: AttachmentId): DeleteAttachmentRequest = {
    val __obj = js.Dynamic.literal(AttachmentId = AttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAttachmentRequest]
  }
  
  extension [Self <: DeleteAttachmentRequest](x: Self) {
    
    inline def setAttachmentId(value: AttachmentId): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
  }
}
