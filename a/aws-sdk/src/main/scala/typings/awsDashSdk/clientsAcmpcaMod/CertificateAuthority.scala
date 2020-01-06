package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthority extends js.Object {
  /**
    * Amazon Resource Name (ARN) for your private certificate authority (CA). The format is  12345678-1234-1234-1234-123456789012 .
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsAcmpcaMod.Arn] = js.native
  /**
    * Your private CA configuration.
    */
  var CertificateAuthorityConfiguration: js.UndefOr[typings.awsDashSdk.clientsAcmpcaMod.CertificateAuthorityConfiguration] = js.native
  /**
    * Date and time at which your private CA was created.
    */
  var CreatedAt: js.UndefOr[TStamp] = js.native
  /**
    * Reason the request to create your private CA failed.
    */
  var FailureReason: js.UndefOr[typings.awsDashSdk.clientsAcmpcaMod.FailureReason] = js.native
  /**
    * Date and time at which your private CA was last updated.
    */
  var LastStateChangeAt: js.UndefOr[TStamp] = js.native
  /**
    * Date and time after which your private CA certificate is not valid.
    */
  var NotAfter: js.UndefOr[TStamp] = js.native
  /**
    * Date and time before which your private CA certificate is not valid.
    */
  var NotBefore: js.UndefOr[TStamp] = js.native
  /**
    * The period during which a deleted CA can be restored. For more information, see the PermanentDeletionTimeInDays parameter of the DeleteCertificateAuthorityRequest action. 
    */
  var RestorableUntil: js.UndefOr[TStamp] = js.native
  /**
    * Information about the certificate revocation list (CRL) created and maintained by your private CA. 
    */
  var RevocationConfiguration: js.UndefOr[typings.awsDashSdk.clientsAcmpcaMod.RevocationConfiguration] = js.native
  /**
    * Serial number of your private CA.
    */
  var Serial: js.UndefOr[String] = js.native
  /**
    * Status of your private CA.
    */
  var Status: js.UndefOr[CertificateAuthorityStatus] = js.native
  /**
    * Type of your private CA.
    */
  var Type: js.UndefOr[CertificateAuthorityType] = js.native
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
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CertificateAuthorityConfiguration != null) __obj.updateDynamic("CertificateAuthorityConfiguration")(CertificateAuthorityConfiguration.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LastStateChangeAt != null) __obj.updateDynamic("LastStateChangeAt")(LastStateChangeAt.asInstanceOf[js.Any])
    if (NotAfter != null) __obj.updateDynamic("NotAfter")(NotAfter.asInstanceOf[js.Any])
    if (NotBefore != null) __obj.updateDynamic("NotBefore")(NotBefore.asInstanceOf[js.Any])
    if (RestorableUntil != null) __obj.updateDynamic("RestorableUntil")(RestorableUntil.asInstanceOf[js.Any])
    if (RevocationConfiguration != null) __obj.updateDynamic("RevocationConfiguration")(RevocationConfiguration.asInstanceOf[js.Any])
    if (Serial != null) __obj.updateDynamic("Serial")(Serial.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthority]
  }
}

