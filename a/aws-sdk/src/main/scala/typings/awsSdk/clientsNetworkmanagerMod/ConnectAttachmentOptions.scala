package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectAttachmentOptions extends StObject {
  
  /**
    * The protocol used for the attachment connection.
    */
  var Protocol: js.UndefOr[TunnelProtocol] = js.undefined
}
object ConnectAttachmentOptions {
  
  inline def apply(): ConnectAttachmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectAttachmentOptions]
  }
  
  extension [Self <: ConnectAttachmentOptions](x: Self) {
    
    inline def setProtocol(value: TunnelProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
  }
}
