package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenewalSummary extends js.Object {
  /**
    * Contains information about the validation of each domain name in the certificate, as it pertains to ACM's managed renewal. This is different from the initial validation that occurs as a result of the RequestCertificate request. This field exists only when the certificate type is AMAZON_ISSUED.
    */
  var DomainValidationOptions: DomainValidationList = js.native
  /**
    * The status of ACM's managed renewal of the certificate.
    */
  var RenewalStatus: typings.awsSdk.acmMod.RenewalStatus = js.native
  /**
    * The reason that a renewal request was unsuccessful.
    */
  var RenewalStatusReason: js.UndefOr[FailureReason] = js.native
  /**
    * The time at which the renewal summary was last updated.
    */
  var UpdatedAt: TStamp = js.native
}

object RenewalSummary {
  @scala.inline
  def apply(DomainValidationOptions: DomainValidationList, RenewalStatus: RenewalStatus, UpdatedAt: TStamp): RenewalSummary = {
    val __obj = js.Dynamic.literal(DomainValidationOptions = DomainValidationOptions.asInstanceOf[js.Any], RenewalStatus = RenewalStatus.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenewalSummary]
  }
  @scala.inline
  implicit class RenewalSummaryOps[Self <: RenewalSummary] (val x: Self) extends AnyVal {
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
    def setDomainValidationOptionsVarargs(value: DomainValidation*): Self = this.set("DomainValidationOptions", js.Array(value :_*))
    @scala.inline
    def setDomainValidationOptions(value: DomainValidationList): Self = this.set("DomainValidationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenewalStatus(value: RenewalStatus): Self = this.set("RenewalStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedAt(value: TStamp): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenewalStatusReason(value: FailureReason): Self = this.set("RenewalStatusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenewalStatusReason: Self = this.set("RenewalStatusReason", js.undefined)
  }
  
}

