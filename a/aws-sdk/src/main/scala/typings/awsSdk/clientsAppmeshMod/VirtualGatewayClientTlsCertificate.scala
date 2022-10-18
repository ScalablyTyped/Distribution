package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayClientTlsCertificate extends StObject {
  
  /**
    * An object that represents a local file certificate. The certificate must meet specific requirements and you must have proxy authorization enabled. For more information, see  Transport Layer Security (TLS) .
    */
  var file: js.UndefOr[VirtualGatewayListenerTlsFileCertificate] = js.undefined
  
  /**
    * A reference to an object that represents a virtual gateway's client's Secret Discovery Service certificate.
    */
  var sds: js.UndefOr[VirtualGatewayListenerTlsSdsCertificate] = js.undefined
}
object VirtualGatewayClientTlsCertificate {
  
  inline def apply(): VirtualGatewayClientTlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayClientTlsCertificate]
  }
  
  extension [Self <: VirtualGatewayClientTlsCertificate](x: Self) {
    
    inline def setFile(value: VirtualGatewayListenerTlsFileCertificate): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setSds(value: VirtualGatewayListenerTlsSdsCertificate): Self = StObject.set(x, "sds", value.asInstanceOf[js.Any])
    
    inline def setSdsUndefined: Self = StObject.set(x, "sds", js.undefined)
  }
}
