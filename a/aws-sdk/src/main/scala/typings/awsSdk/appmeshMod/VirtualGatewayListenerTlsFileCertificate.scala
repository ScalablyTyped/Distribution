package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayListenerTlsFileCertificate extends StObject {
  
  /**
    * The certificate chain for the certificate.
    */
  var certificateChain: FilePath = js.native
  
  /**
    * The private key for a certificate stored on the file system of the mesh endpoint that the proxy is running on.
    */
  var privateKey: FilePath = js.native
}
object VirtualGatewayListenerTlsFileCertificate {
  
  @scala.inline
  def apply(certificateChain: FilePath, privateKey: FilePath): VirtualGatewayListenerTlsFileCertificate = {
    val __obj = js.Dynamic.literal(certificateChain = certificateChain.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayListenerTlsFileCertificate]
  }
  
  @scala.inline
  implicit class VirtualGatewayListenerTlsFileCertificateMutableBuilder[Self <: VirtualGatewayListenerTlsFileCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateChain(value: FilePath): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKey(value: FilePath): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
  }
}
