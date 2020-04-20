package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TlsValidationContextAcmTrust extends js.Object {
  /**
    * One or more ACM Amazon Resource Name (ARN)s.
    */
  var certificateAuthorityArns: CertificateAuthorityArns = js.native
}

object TlsValidationContextAcmTrust {
  @scala.inline
  def apply(certificateAuthorityArns: CertificateAuthorityArns): TlsValidationContextAcmTrust = {
    val __obj = js.Dynamic.literal(certificateAuthorityArns = certificateAuthorityArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TlsValidationContextAcmTrust]
  }
}

