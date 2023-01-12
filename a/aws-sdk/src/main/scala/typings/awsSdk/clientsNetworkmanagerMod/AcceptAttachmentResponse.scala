package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptAttachmentResponse extends StObject {
  
  /**
    * The response to the attachment request. 
    */
  var Attachment: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Attachment] = js.undefined
}
object AcceptAttachmentResponse {
  
  inline def apply(): AcceptAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptAttachmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcceptAttachmentResponse] (val x: Self) extends AnyVal {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
  }
}
