package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerTlsFileCertificate extends StObject {
  
  /**
    * The certificate chain for the certificate.
    */
  var certificateChain: FilePath
  
  /**
    * The private key for a certificate stored on the file system of the virtual node that the proxy is running on.
    */
  var privateKey: FilePath
}
object ListenerTlsFileCertificate {
  
  inline def apply(certificateChain: FilePath, privateKey: FilePath): ListenerTlsFileCertificate = {
    val __obj = js.Dynamic.literal(certificateChain = certificateChain.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerTlsFileCertificate]
  }
  
  extension [Self <: ListenerTlsFileCertificate](x: Self) {
    
    inline def setCertificateChain(value: FilePath): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
    
    inline def setPrivateKey(value: FilePath): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
  }
}
