package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAttachmentResponse extends StObject {
  
  /**
    * Information about the deleted attachment.
    */
  var Attachment: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Attachment] = js.undefined
}
object DeleteAttachmentResponse {
  
  inline def apply(): DeleteAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAttachmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAttachmentResponse] (val x: Self) extends AnyVal {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
  }
}
