package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectAttachment extends StObject {
  
  /**
    * The attachment details.
    */
  var Attachment: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Attachment] = js.undefined
  
  /**
    * Options for connecting an attachment.
    */
  var Options: js.UndefOr[ConnectAttachmentOptions] = js.undefined
  
  /**
    * The ID of the transport attachment.
    */
  var TransportAttachmentId: js.UndefOr[AttachmentId] = js.undefined
}
object ConnectAttachment {
  
  inline def apply(): ConnectAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectAttachment] (val x: Self) extends AnyVal {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
    
    inline def setOptions(value: ConnectAttachmentOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setTransportAttachmentId(value: AttachmentId): Self = StObject.set(x, "TransportAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransportAttachmentIdUndefined: Self = StObject.set(x, "TransportAttachmentId", js.undefined)
  }
}
