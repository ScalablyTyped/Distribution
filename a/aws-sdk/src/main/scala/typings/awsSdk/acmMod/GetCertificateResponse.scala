package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateResponse extends js.Object {
  /**
    * String that contains the ACM certificate represented by the ARN specified at input.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.native
  /**
    * The certificate chain that contains the root certificate issued by the certificate authority (CA).
    */
  var CertificateChain: js.UndefOr[typings.awsSdk.acmMod.CertificateChain] = js.native
}

object GetCertificateResponse {
  @scala.inline
  def apply(Certificate: CertificateBody = null, CertificateChain: CertificateChain = null): GetCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate.asInstanceOf[js.Any])
    if (CertificateChain != null) __obj.updateDynamic("CertificateChain")(CertificateChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateResponse]
  }
}

