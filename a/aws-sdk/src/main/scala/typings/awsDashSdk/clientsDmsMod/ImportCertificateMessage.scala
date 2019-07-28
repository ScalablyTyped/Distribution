package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportCertificateMessage extends js.Object {
  /**
    * A customer-assigned name for the certificate. Identifiers must begin with a letter; must contain only ASCII letters, digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
    */
  var CertificateIdentifier: String
  /**
    * The contents of a .pem file, which contains an X.509 certificate.
    */
  var CertificatePem: js.UndefOr[String] = js.undefined
  /**
    * The location of an imported Oracle Wallet certificate for use with SSL.
    */
  var CertificateWallet: js.UndefOr[typings.awsDashSdk.clientsDmsMod.CertificateWallet] = js.undefined
  /**
    * The tags associated with the certificate.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ImportCertificateMessage {
  @scala.inline
  def apply(
    CertificateIdentifier: String,
    CertificatePem: String = null,
    CertificateWallet: CertificateWallet = null,
    Tags: TagList = null
  ): ImportCertificateMessage = {
    val __obj = js.Dynamic.literal(CertificateIdentifier = CertificateIdentifier)
    if (CertificatePem != null) __obj.updateDynamic("CertificatePem")(CertificatePem)
    if (CertificateWallet != null) __obj.updateDynamic("CertificateWallet")(CertificateWallet.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ImportCertificateMessage]
  }
}

