package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportCertificateResponse extends js.Object {
  /**
    * The base64 PEM-encoded certificate.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.native
  /**
    * The base64 PEM-encoded certificate chain. This does not include the certificate that you are exporting.
    */
  var CertificateChain: js.UndefOr[typings.awsSdk.acmMod.CertificateChain] = js.native
  /**
    * The encrypted private key associated with the public key in the certificate. The key is output in PKCS #8 format and is base64 PEM-encoded. 
    */
  var PrivateKey: js.UndefOr[typings.awsSdk.acmMod.PrivateKey] = js.native
}

object ExportCertificateResponse {
  @scala.inline
  def apply(
    Certificate: CertificateBody = null,
    CertificateChain: CertificateChain = null,
    PrivateKey: PrivateKey = null
  ): ExportCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate.asInstanceOf[js.Any])
    if (CertificateChain != null) __obj.updateDynamic("CertificateChain")(CertificateChain.asInstanceOf[js.Any])
    if (PrivateKey != null) __obj.updateDynamic("PrivateKey")(PrivateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportCertificateResponse]
  }
}

