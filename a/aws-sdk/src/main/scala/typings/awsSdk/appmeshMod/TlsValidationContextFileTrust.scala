package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TlsValidationContextFileTrust extends js.Object {
  /**
    * The certificate trust chain for a certificate stored on the file system of the virtual
    node that the proxy is running on.
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
  implicit class TlsValidationContextFileTrustOps[Self <: TlsValidationContextFileTrust] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificateChain(value: FilePath): Self = this.set("certificateChain", value.asInstanceOf[js.Any])
  }
  
}

