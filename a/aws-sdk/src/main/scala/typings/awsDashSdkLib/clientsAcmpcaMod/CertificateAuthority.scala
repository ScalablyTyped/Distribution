package typings
package awsDashSdkLib.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateAuthority extends js.Object {
  /**
    * Amazon Resource Name (ARN) for your private certificate authority (CA). The format is  12345678-1234-1234-1234-123456789012 .
    */
  var Arn: js.UndefOr[Arn] = js.undefined
  /**
    * Your private CA configuration.
    */
  var CertificateAuthorityConfiguration: js.UndefOr[CertificateAuthorityConfiguration] = js.undefined
  /**
    * Date and time at which your private CA was created.
    */
  var CreatedAt: js.UndefOr[TStamp] = js.undefined
  /**
    * Reason the request to create your private CA failed.
    */
  var FailureReason: js.UndefOr[FailureReason] = js.undefined
  /**
    * Date and time at which your private CA was last updated.
    */
  var LastStateChangeAt: js.UndefOr[TStamp] = js.undefined
  /**
    * Date and time after which your private CA certificate is not valid.
    */
  var NotAfter: js.UndefOr[TStamp] = js.undefined
  /**
    * Date and time before which your private CA certificate is not valid.
    */
  var NotBefore: js.UndefOr[TStamp] = js.undefined
  /**
    * The period during which a deleted CA can be restored. For more information, see the PermanentDeletionTimeInDays parameter of the DeleteCertificateAuthorityRequest action. 
    */
  var RestorableUntil: js.UndefOr[TStamp] = js.undefined
  /**
    * Information about the certificate revocation list (CRL) created and maintained by your private CA. 
    */
  var RevocationConfiguration: js.UndefOr[RevocationConfiguration] = js.undefined
  /**
    * Serial number of your private CA.
    */
  var Serial: js.UndefOr[String] = js.undefined
  /**
    * Status of your private CA.
    */
  var Status: js.UndefOr[CertificateAuthorityStatus] = js.undefined
  /**
    * Type of your private CA.
    */
  var Type: js.UndefOr[CertificateAuthorityType] = js.undefined
}

object CertificateAuthority {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CertificateAuthorityConfiguration: CertificateAuthorityConfiguration = null,
    CreatedAt: TStamp = null,
    FailureReason: FailureReason = null,
    LastStateChangeAt: TStamp = null,
    NotAfter: TStamp = null,
    NotBefore: TStamp = null,
    RestorableUntil: TStamp = null,
    RevocationConfiguration: RevocationConfiguration = null,
    Serial: String = null,
    Status: CertificateAuthorityStatus = null,
    Type: CertificateAuthorityType = null
  ): CertificateAuthority = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CertificateAuthorityConfiguration != null) __obj.updateDynamic("CertificateAuthorityConfiguration")(CertificateAuthorityConfiguration)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LastStateChangeAt != null) __obj.updateDynamic("LastStateChangeAt")(LastStateChangeAt)
    if (NotAfter != null) __obj.updateDynamic("NotAfter")(NotAfter)
    if (NotBefore != null) __obj.updateDynamic("NotBefore")(NotBefore)
    if (RestorableUntil != null) __obj.updateDynamic("RestorableUntil")(RestorableUntil)
    if (RevocationConfiguration != null) __obj.updateDynamic("RevocationConfiguration")(RevocationConfiguration)
    if (Serial != null) __obj.updateDynamic("Serial")(Serial)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthority]
  }
}

