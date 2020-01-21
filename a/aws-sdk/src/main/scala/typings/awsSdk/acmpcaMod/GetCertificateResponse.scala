package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateResponse extends js.Object {
  /**
    * The base64 PEM-encoded certificate specified by the CertificateArn parameter.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.native
  /**
    * The base64 PEM-encoded certificate chain that chains up to the on-premises root CA certificate that you used to sign your private CA certificate. 
    */
  var CertificateChain: js.UndefOr[typings.awsSdk.acmpcaMod.CertificateChain] = js.native
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

