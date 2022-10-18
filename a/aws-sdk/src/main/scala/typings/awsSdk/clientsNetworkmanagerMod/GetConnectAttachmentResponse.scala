package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectAttachmentResponse extends StObject {
  
  /**
    * Details about the Connect attachment.
    */
  var ConnectAttachment: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ConnectAttachment] = js.undefined
}
object GetConnectAttachmentResponse {
  
  inline def apply(): GetConnectAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectAttachmentResponse]
  }
  
  extension [Self <: GetConnectAttachmentResponse](x: Self) {
    
    inline def setConnectAttachment(value: ConnectAttachment): Self = StObject.set(x, "ConnectAttachment", value.asInstanceOf[js.Any])
    
    inline def setConnectAttachmentUndefined: Self = StObject.set(x, "ConnectAttachment", js.undefined)
  }
}
