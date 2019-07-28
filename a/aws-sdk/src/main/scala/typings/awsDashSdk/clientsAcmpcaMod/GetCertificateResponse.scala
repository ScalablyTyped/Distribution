package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateResponse extends js.Object {
  /**
    * The base64 PEM-encoded certificate specified by the CertificateArn parameter.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.undefined
  /**
    * The base64 PEM-encoded certificate chain that chains up to the on-premises root CA certificate that you used to sign your private CA certificate. 
    */
  var CertificateChain: js.UndefOr[typings.awsDashSdk.clientsAcmpcaMod.CertificateChain] = js.undefined
}

object GetCertificateResponse {
  @scala.inline
  def apply(Certificate: CertificateBody = null, CertificateChain: CertificateChain = null): GetCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate)
    if (CertificateChain != null) __obj.updateDynamic("CertificateChain")(CertificateChain)
    __obj.asInstanceOf[GetCertificateResponse]
  }
}

