package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddAttachmentsToSetResponse extends StObject {
  
  /**
    * The ID of the attachment set. If an attachmentSetId was not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId was specified, the attachments are added to the specified set, if it exists.
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined
  
  /**
    * The time and date when the attachment set expires.
    */
  var expiryTime: js.UndefOr[ExpiryTime] = js.undefined
}
object AddAttachmentsToSetResponse {
  
  inline def apply(): AddAttachmentsToSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddAttachmentsToSetResponse]
  }
  
  extension [Self <: AddAttachmentsToSetResponse](x: Self) {
    
    inline def setAttachmentSetId(value: AttachmentSetId): Self = StObject.set(x, "attachmentSetId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentSetIdUndefined: Self = StObject.set(x, "attachmentSetId", js.undefined)
    
    inline def setExpiryTime(value: ExpiryTime): Self = StObject.set(x, "expiryTime", value.asInstanceOf[js.Any])
    
    inline def setExpiryTimeUndefined: Self = StObject.set(x, "expiryTime", js.undefined)
  }
}
