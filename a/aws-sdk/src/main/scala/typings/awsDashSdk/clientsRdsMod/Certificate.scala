package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  /**
    * The unique key that identifies a certificate.
    */
  var CertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * The type of the certificate.
    */
  var CertificateType: js.UndefOr[String] = js.native
  /**
    * The thumbprint of the certificate.
    */
  var Thumbprint: js.UndefOr[String] = js.native
  /**
    * The starting date from which the certificate is valid.
    */
  var ValidFrom: js.UndefOr[TStamp] = js.native
  /**
    * The final date that the certificate continues to be valid.
    */
  var ValidTill: js.UndefOr[TStamp] = js.native
}

object Certificate {
  @scala.inline
  def apply(
    CertificateArn: String = null,
    CertificateIdentifier: String = null,
    CertificateType: String = null,
    Thumbprint: String = null,
    ValidFrom: TStamp = null,
    ValidTill: TStamp = null
  ): Certificate = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn.asInstanceOf[js.Any])
    if (CertificateIdentifier != null) __obj.updateDynamic("CertificateIdentifier")(CertificateIdentifier.asInstanceOf[js.Any])
    if (CertificateType != null) __obj.updateDynamic("CertificateType")(CertificateType.asInstanceOf[js.Any])
    if (Thumbprint != null) __obj.updateDynamic("Thumbprint")(Thumbprint.asInstanceOf[js.Any])
    if (ValidFrom != null) __obj.updateDynamic("ValidFrom")(ValidFrom.asInstanceOf[js.Any])
    if (ValidTill != null) __obj.updateDynamic("ValidTill")(ValidTill.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
}

