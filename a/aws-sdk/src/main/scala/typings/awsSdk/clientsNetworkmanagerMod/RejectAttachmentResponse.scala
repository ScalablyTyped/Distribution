package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectAttachmentResponse extends StObject {
  
  /**
    * Describes the rejected attachment request.
    */
  var Attachment: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Attachment] = js.undefined
}
object RejectAttachmentResponse {
  
  inline def apply(): RejectAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectAttachmentResponse]
  }
  
  extension [Self <: RejectAttachmentResponse](x: Self) {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
  }
}
