package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitAttachmentStateChangesRequest extends StObject {
  
  /**
    * Any attachments associated with the state change request.
    */
  var attachments: AttachmentStateChanges
  
  /**
    * The short name or full ARN of the cluster that hosts the container instance the attachment belongs to.
    */
  var cluster: js.UndefOr[String] = js.undefined
}
object SubmitAttachmentStateChangesRequest {
  
  inline def apply(attachments: AttachmentStateChanges): SubmitAttachmentStateChangesRequest = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitAttachmentStateChangesRequest]
  }
  
  extension [Self <: SubmitAttachmentStateChangesRequest](x: Self) {
    
    inline def setAttachments(value: AttachmentStateChanges): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsVarargs(value: AttachmentStateChange*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
  }
}
