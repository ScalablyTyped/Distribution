package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayTlsValidationContextFileTrust extends StObject {
  
  /**
    * The certificate trust chain for a certificate stored on the file system of the virtual node that the proxy is running on.
    */
  var certificateChain: FilePath = js.native
}
object VirtualGatewayTlsValidationContextFileTrust {
  
  @scala.inline
  def apply(certificateChain: FilePath): VirtualGatewayTlsValidationContextFileTrust = {
    val __obj = js.Dynamic.literal(certificateChain = certificateChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayTlsValidationContextFileTrust]
  }
  
  @scala.inline
  implicit class VirtualGatewayTlsValidationContextFileTrustMutableBuilder[Self <: VirtualGatewayTlsValidationContextFileTrust] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateChain(value: FilePath): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
  }
}
