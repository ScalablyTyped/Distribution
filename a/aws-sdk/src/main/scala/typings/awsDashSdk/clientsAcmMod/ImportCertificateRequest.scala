package typings.awsDashSdk.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportCertificateRequest extends js.Object {
  /**
    * The certificate to import.
    */
  var Certificate: CertificateBodyBlob
  /**
    * The Amazon Resource Name (ARN) of an imported certificate to replace. To import a new certificate, omit this field. 
    */
  var CertificateArn: js.UndefOr[Arn] = js.undefined
  /**
    * The PEM encoded certificate chain.
    */
  var CertificateChain: js.UndefOr[CertificateChainBlob] = js.undefined
  /**
    * The private key that matches the public key in the certificate.
    */
  var PrivateKey: PrivateKeyBlob
}

object ImportCertificateRequest {
  @scala.inline
  def apply(
    Certificate: CertificateBodyBlob,
    PrivateKey: PrivateKeyBlob,
    CertificateArn: Arn = null,
    CertificateChain: CertificateChainBlob = null
  ): ImportCertificateRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], PrivateKey = PrivateKey.asInstanceOf[js.Any])
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn)
    if (CertificateChain != null) __obj.updateDynamic("CertificateChain")(CertificateChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCertificateRequest]
  }
}

