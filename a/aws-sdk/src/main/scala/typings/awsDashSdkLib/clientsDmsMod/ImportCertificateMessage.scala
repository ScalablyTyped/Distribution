package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportCertificateMessage extends js.Object {
  /**
    * The customer-assigned name of the certificate. Valid characters are A-z and 0-9.
    */
  var CertificateIdentifier: String
  /**
    * The contents of the .pem X.509 certificate file for the certificate.
    */
  var CertificatePem: js.UndefOr[String] = js.undefined
  /**
    * The location of the imported Oracle Wallet certificate for use with SSL.
    */
  var CertificateWallet: js.UndefOr[CertificateWallet] = js.undefined
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

