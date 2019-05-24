package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDomainResponse extends js.Object {
  /**
    * The ARN of an issued ACM certificate that is valid for the domain being associated.
    */
  var AcmCertificateArn: js.UndefOr[AcmCertificateArn] = js.undefined
  /**
    * The time that the domain was added.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[DisplayName] = js.undefined
  /**
    * The name of the domain.
    */
  var DomainName: js.UndefOr[DomainName] = js.undefined
  /**
    * The current state for the domain.
    */
  var DomainStatus: js.UndefOr[DomainStatus] = js.undefined
}

object DescribeDomainResponse {
  @scala.inline
  def apply(
    AcmCertificateArn: AcmCertificateArn = null,
    CreatedTime: DateTime = null,
    DisplayName: DisplayName = null,
    DomainName: DomainName = null,
    DomainStatus: DomainStatus = null
  ): DescribeDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (AcmCertificateArn != null) __obj.updateDynamic("AcmCertificateArn")(AcmCertificateArn)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    if (DomainStatus != null) __obj.updateDynamic("DomainStatus")(DomainStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainResponse]
  }
}

