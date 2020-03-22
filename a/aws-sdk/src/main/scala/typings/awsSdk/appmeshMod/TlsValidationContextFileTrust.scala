package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TlsValidationContextFileTrust extends js.Object {
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
}

