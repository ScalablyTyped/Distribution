package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthority extends js.Object {
  /**
    * Amazon Resource Name (ARN) for your private certificate authority (CA). The format is  12345678-1234-1234-1234-123456789012 .
    */
  var Arn: js.UndefOr[typings.awsSdk.acmpcaMod.Arn] = js.native
  /**
    * Your private CA configuration.
    */
  var CertificateAuthorityConfiguration: js.UndefOr[typings.awsSdk.acmpcaMod.CertificateAuthorityConfiguration] = js.native
  /**
    * Date and time at which your private CA was created.
    */
  var CreatedAt: js.UndefOr[TStamp] = js.native
  /**
    * Reason the request to create your private CA failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.acmpcaMod.FailureReason] = js.native
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
  var RevocationConfiguration: js.UndefOr[typings.awsSdk.acmpcaMod.RevocationConfiguration] = js.native
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
  def apply(): CertificateAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthority]
  }
  @scala.inline
  implicit class CertificateAuthorityOps[Self <: CertificateAuthority] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCertificateAuthorityConfiguration(value: CertificateAuthorityConfiguration): Self = this.set("CertificateAuthorityConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateAuthorityConfiguration: Self = this.set("CertificateAuthorityConfiguration", js.undefined)
    @scala.inline
    def setCreatedAt(value: TStamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    @scala.inline
    def setLastStateChangeAt(value: TStamp): Self = this.set("LastStateChangeAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastStateChangeAt: Self = this.set("LastStateChangeAt", js.undefined)
    @scala.inline
    def setNotAfter(value: TStamp): Self = this.set("NotAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotAfter: Self = this.set("NotAfter", js.undefined)
    @scala.inline
    def setNotBefore(value: TStamp): Self = this.set("NotBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotBefore: Self = this.set("NotBefore", js.undefined)
    @scala.inline
    def setRestorableUntil(value: TStamp): Self = this.set("RestorableUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestorableUntil: Self = this.set("RestorableUntil", js.undefined)
    @scala.inline
    def setRevocationConfiguration(value: RevocationConfiguration): Self = this.set("RevocationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevocationConfiguration: Self = this.set("RevocationConfiguration", js.undefined)
    @scala.inline
    def setSerial(value: String): Self = this.set("Serial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerial: Self = this.set("Serial", js.undefined)
    @scala.inline
    def setStatus(value: CertificateAuthorityStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setType(value: CertificateAuthorityType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

