package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerTlsCertificate extends StObject {
  
  /**
    * A reference to an object that represents an Certificate Manager certificate.
    */
  var acm: js.UndefOr[ListenerTlsAcmCertificate] = js.undefined
  
  /**
    * A reference to an object that represents a local file certificate.
    */
  var file: js.UndefOr[ListenerTlsFileCertificate] = js.undefined
  
  /**
    * A reference to an object that represents a listener's Secret Discovery Service certificate.
    */
  var sds: js.UndefOr[ListenerTlsSdsCertificate] = js.undefined
}
object ListenerTlsCertificate {
  
  inline def apply(): ListenerTlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerTlsCertificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListenerTlsCertificate] (val x: Self) extends AnyVal {
    
    inline def setAcm(value: ListenerTlsAcmCertificate): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    inline def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    inline def setFile(value: ListenerTlsFileCertificate): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setSds(value: ListenerTlsSdsCertificate): Self = StObject.set(x, "sds", value.asInstanceOf[js.Any])
    
    inline def setSdsUndefined: Self = StObject.set(x, "sds", js.undefined)
  }
}
