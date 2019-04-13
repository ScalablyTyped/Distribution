package typings
package awsDashSdkLib.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateAuthorityCertificateResponse extends js.Object {
  /**
    * Base64-encoded certificate authority (CA) certificate.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.undefined
  /**
    * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. 
    */
  var CertificateChain: js.UndefOr[CertificateChain] = js.undefined
}

object GetCertificateAuthorityCertificateResponse {
  @scala.inline
  def apply(Certificate: CertificateBody = null, CertificateChain: CertificateChain = null): GetCertificateAuthorityCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate)
    if (CertificateChain != null) __obj.updateDynamic("CertificateChain")(CertificateChain)
    __obj.asInstanceOf[GetCertificateAuthorityCertificateResponse]
  }
}

