package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientTlsCertificate extends StObject {
  
  /**
    * An object that represents a local file certificate. The certificate must meet specific requirements and you must have proxy authorization enabled. For more information, see Transport Layer Security (TLS).
    */
  var file: js.UndefOr[ListenerTlsFileCertificate] = js.undefined
  
  /**
    * A reference to an object that represents a client's TLS Secret Discovery Service certificate.
    */
  var sds: js.UndefOr[ListenerTlsSdsCertificate] = js.undefined
}
object ClientTlsCertificate {
  
  inline def apply(): ClientTlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientTlsCertificate]
  }
  
  extension [Self <: ClientTlsCertificate](x: Self) {
    
    inline def setFile(value: ListenerTlsFileCertificate): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setSds(value: ListenerTlsSdsCertificate): Self = StObject.set(x, "sds", value.asInstanceOf[js.Any])
    
    inline def setSdsUndefined: Self = StObject.set(x, "sds", js.undefined)
  }
}
