package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectAttachmentRequest extends StObject {
  
  /**
    * The ID of the attachment.
    */
  var AttachmentId: typings.awsSdk.clientsNetworkmanagerMod.AttachmentId
}
object GetConnectAttachmentRequest {
  
  inline def apply(AttachmentId: AttachmentId): GetConnectAttachmentRequest = {
    val __obj = js.Dynamic.literal(AttachmentId = AttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectAttachmentRequest]
  }
  
  extension [Self <: GetConnectAttachmentRequest](x: Self) {
    
    inline def setAttachmentId(value: AttachmentId): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
  }
}
