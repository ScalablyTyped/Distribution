package typings
package awsDashSdkLib.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenewalSummary extends js.Object {
  /**
    * Contains information about the validation of each domain name in the certificate, as it pertains to ACM's managed renewal. This is different from the initial validation that occurs as a result of the RequestCertificate request. This field exists only when the certificate type is AMAZON_ISSUED.
    */
  var DomainValidationOptions: DomainValidationList
  /**
    * The status of ACM's managed renewal of the certificate.
    */
  var RenewalStatus: awsDashSdkLib.clientsAcmMod.RenewalStatus
  /**
    * The reason that a renewal request was unsuccessful.
    */
  var RenewalStatusReason: js.UndefOr[FailureReason] = js.undefined
  /**
    * The time at which the renewal summary was last updated.
    */
  var UpdatedAt: TStamp
}

object RenewalSummary {
  @scala.inline
  def apply(
    DomainValidationOptions: DomainValidationList,
    RenewalStatus: RenewalStatus,
    UpdatedAt: TStamp,
    RenewalStatusReason: FailureReason = null
  ): RenewalSummary = {
    val __obj = js.Dynamic.literal(DomainValidationOptions = DomainValidationOptions, RenewalStatus = RenewalStatus.asInstanceOf[js.Any], UpdatedAt = UpdatedAt)
    if (RenewalStatusReason != null) __obj.updateDynamic("RenewalStatusReason")(RenewalStatusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenewalSummary]
  }
}

