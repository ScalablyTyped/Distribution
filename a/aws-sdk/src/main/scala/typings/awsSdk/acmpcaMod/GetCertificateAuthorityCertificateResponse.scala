package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityCertificateResponse extends js.Object {
  /**
    * Base64-encoded certificate authority (CA) certificate.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.native
  /**
    * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. If this is a root CA, the value will be null.
    */
  var CertificateChain: js.UndefOr[typings.awsSdk.acmpcaMod.CertificateChain] = js.native
}

object GetCertificateAuthorityCertificateResponse {
  @scala.inline
  def apply(Certificate: CertificateBody = null, CertificateChain: CertificateChain = null): GetCertificateAuthorityCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate.asInstanceOf[js.Any])
    if (CertificateChain != null) __obj.updateDynamic("CertificateChain")(CertificateChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateAuthorityCertificateResponse]
  }
}

