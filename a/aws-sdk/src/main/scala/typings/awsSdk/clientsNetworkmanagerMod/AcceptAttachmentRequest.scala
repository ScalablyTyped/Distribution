package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptAttachmentRequest extends StObject {
  
  /**
    * The ID of the attachment. 
    */
  var AttachmentId: typings.awsSdk.clientsNetworkmanagerMod.AttachmentId
}
object AcceptAttachmentRequest {
  
  inline def apply(AttachmentId: AttachmentId): AcceptAttachmentRequest = {
    val __obj = js.Dynamic.literal(AttachmentId = AttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptAttachmentRequest]
  }
  
  extension [Self <: AcceptAttachmentRequest](x: Self) {
    
    inline def setAttachmentId(value: AttachmentId): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
  }
}
