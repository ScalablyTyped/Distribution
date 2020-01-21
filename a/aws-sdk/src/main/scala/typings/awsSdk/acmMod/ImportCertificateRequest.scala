package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportCertificateRequest extends js.Object {
  /**
    * The certificate to import.
    */
  var Certificate: CertificateBodyBlob = js.native
  /**
    * The Amazon Resource Name (ARN) of an imported certificate to replace. To import a new certificate, omit this field. 
    */
  var CertificateArn: js.UndefOr[Arn] = js.native
  /**
    * The PEM encoded certificate chain.
    */
  var CertificateChain: js.UndefOr[CertificateChainBlob] = js.native
  /**
    * The private key that matches the public key in the certificate.
    */
  var PrivateKey: PrivateKeyBlob = js.native
  /**
    * One or more resource tags to associate with the imported certificate.  Note: You cannot apply tags when reimporting a certificate.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ImportCertificateRequest {
  @scala.inline
  def apply(
    Certificate: CertificateBodyBlob,
    PrivateKey: PrivateKeyBlob,
    CertificateArn: Arn = null,
    CertificateChain: CertificateChainBlob = null,
    Tags: TagList = null
  ): ImportCertificateRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], PrivateKey = PrivateKey.asInstanceOf[js.Any])
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn.asInstanceOf[js.Any])
    if (CertificateChain != null) __obj.updateDynamic("CertificateChain")(CertificateChain.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCertificateRequest]
  }
}

