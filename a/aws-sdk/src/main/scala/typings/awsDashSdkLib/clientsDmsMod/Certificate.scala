package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certificate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.undefined
  /**
    * The date that the certificate was created.
    */
  var CertificateCreationDate: js.UndefOr[TStamp] = js.undefined
  /**
    * A customer-assigned name for the certificate. Identifiers must begin with a letter; must contain only ASCII letters, digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
    */
  var CertificateIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The owner of the certificate.
    */
  var CertificateOwner: js.UndefOr[String] = js.undefined
  /**
    * The contents of a .pem file, which contains an X.509 certificate.
    */
  var CertificatePem: js.UndefOr[String] = js.undefined
  /**
    * The location of an imported Oracle Wallet certificate for use with SSL.
    */
  var CertificateWallet: js.UndefOr[CertificateWallet] = js.undefined
  /**
    * The key length of the cryptographic algorithm being used.
    */
  var KeyLength: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The signing algorithm for the certificate.
    */
  var SigningAlgorithm: js.UndefOr[String] = js.undefined
  /**
    * The beginning date that the certificate is valid.
    */
  var ValidFromDate: js.UndefOr[TStamp] = js.undefined
  /**
    * The final date that the certificate is valid.
    */
  var ValidToDate: js.UndefOr[TStamp] = js.undefined
}

object Certificate {
  @scala.inline
  def apply(
    CertificateArn: String = null,
    CertificateCreationDate: TStamp = null,
    CertificateIdentifier: String = null,
    CertificateOwner: String = null,
    CertificatePem: String = null,
    CertificateWallet: CertificateWallet = null,
    KeyLength: js.UndefOr[IntegerOptional] = js.undefined,
    SigningAlgorithm: String = null,
    ValidFromDate: TStamp = null,
    ValidToDate: TStamp = null
  ): Certificate = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn)
    if (CertificateCreationDate != null) __obj.updateDynamic("CertificateCreationDate")(CertificateCreationDate)
    if (CertificateIdentifier != null) __obj.updateDynamic("CertificateIdentifier")(CertificateIdentifier)
    if (CertificateOwner != null) __obj.updateDynamic("CertificateOwner")(CertificateOwner)
    if (CertificatePem != null) __obj.updateDynamic("CertificatePem")(CertificatePem)
    if (CertificateWallet != null) __obj.updateDynamic("CertificateWallet")(CertificateWallet.asInstanceOf[js.Any])
    if (!js.isUndefined(KeyLength)) __obj.updateDynamic("KeyLength")(KeyLength)
    if (SigningAlgorithm != null) __obj.updateDynamic("SigningAlgorithm")(SigningAlgorithm)
    if (ValidFromDate != null) __obj.updateDynamic("ValidFromDate")(ValidFromDate)
    if (ValidToDate != null) __obj.updateDynamic("ValidToDate")(ValidToDate)
    __obj.asInstanceOf[Certificate]
  }
}

