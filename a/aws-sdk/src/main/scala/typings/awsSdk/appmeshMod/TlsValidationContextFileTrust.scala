package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TlsValidationContextFileTrust extends StObject {
  
  /**
    * The certificate trust chain for a certificate stored on the file system of the virtual node that the proxy is running on.
    */
  var certificateChain: FilePath = js.native
}
object TlsValidationContextFileTrust {
  
  @scala.inline
  def apply(certificateChain: FilePath): TlsValidationContextFileTrust = {
    val __obj = js.Dynamic.literal(certificateChain = certificateChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[TlsValidationContextFileTrust]
  }
  
  @scala.inline
  implicit class TlsValidationContextFileTrustMutableBuilder[Self <: TlsValidationContextFileTrust] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateChain(value: FilePath): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
  }
}
