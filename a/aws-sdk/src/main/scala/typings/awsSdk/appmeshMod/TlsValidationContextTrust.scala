package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TlsValidationContextTrust extends js.Object {
  /**
    * A reference to an object that represents a TLS validation context trust for an AWS Certicate Manager (ACM)
    certificate.
    */
  var acm: js.UndefOr[TlsValidationContextAcmTrust] = js.native
  /**
    * An object that represents a TLS validation context trust for a local file.
    */
  var file: js.UndefOr[TlsValidationContextFileTrust] = js.native
}

object TlsValidationContextTrust {
  @scala.inline
  def apply(acm: TlsValidationContextAcmTrust = null, file: TlsValidationContextFileTrust = null): TlsValidationContextTrust = {
    val __obj = js.Dynamic.literal()
    if (acm != null) __obj.updateDynamic("acm")(acm.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[TlsValidationContextTrust]
  }
}

