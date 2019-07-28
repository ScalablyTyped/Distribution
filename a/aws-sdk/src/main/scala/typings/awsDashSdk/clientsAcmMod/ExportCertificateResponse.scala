package typings.awsDashSdk.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportCertificateResponse extends js.Object {
  /**
    * The base64 PEM-encoded certificate.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.undefined
  /**
    * The base64 PEM-encoded certificate chain. This does not include the certificate that you are exporting.
    */
  var CertificateChain: js.UndefOr[typings.awsDashSdk.clientsAcmMod.CertificateChain] = js.undefined
  /**
    * The encrypted private key associated with the public key in the certificate. The key is output in PKCS #8 format and is base64 PEM-encoded. 
    */
  var PrivateKey: js.UndefOr[typings.awsDashSdk.clientsAcmMod.PrivateKey] = js.undefined
}

object ExportCertificateResponse {
  @scala.inline
  def apply(
    Certificate: CertificateBody = null,
    CertificateChain: CertificateChain = null,
    PrivateKey: PrivateKey = null
  ): ExportCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate)
    if (CertificateChain != null) __obj.updateDynamic("CertificateChain")(CertificateChain)
    if (PrivateKey != null) __obj.updateDynamic("PrivateKey")(PrivateKey)
    __obj.asInstanceOf[ExportCertificateResponse]
  }
}

