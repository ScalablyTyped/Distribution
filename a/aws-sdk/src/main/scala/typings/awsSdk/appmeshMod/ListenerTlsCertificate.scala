package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerTlsCertificate extends StObject {
  
  /**
    * A reference to an object that represents an AWS Certicate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[ListenerTlsAcmCertificate] = js.undefined
  
  /**
    * A reference to an object that represents a local file certificate.
    */
  var file: js.UndefOr[ListenerTlsFileCertificate] = js.undefined
}
object ListenerTlsCertificate {
  
  inline def apply(): ListenerTlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerTlsCertificate]
  }
  
  extension [Self <: ListenerTlsCertificate](x: Self) {
    
    inline def setAcm(value: ListenerTlsAcmCertificate): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    inline def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    inline def setFile(value: ListenerTlsFileCertificate): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
