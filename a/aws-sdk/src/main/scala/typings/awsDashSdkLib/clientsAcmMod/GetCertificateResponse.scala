package typings
package awsDashSdkLib.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateResponse extends js.Object {
  /**
    * String that contains the ACM certificate represented by the ARN specified at input.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.undefined
  /**
    * The certificate chain that contains the root certificate issued by the certificate authority (CA).
    */
  var CertificateChain: js.UndefOr[CertificateChain] = js.undefined
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

