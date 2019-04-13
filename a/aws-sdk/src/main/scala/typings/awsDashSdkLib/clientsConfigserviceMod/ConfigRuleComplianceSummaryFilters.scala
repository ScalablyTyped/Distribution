package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigRuleComplianceSummaryFilters extends js.Object {
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: js.UndefOr[AccountId] = js.undefined
  /**
    * The source region where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[AwsRegion] = js.undefined
}

object ConfigRuleComplianceSummaryFilters {
  @scala.inline
  def apply(AccountId: AccountId = null, AwsRegion: AwsRegion = null): ConfigRuleComplianceSummaryFilters = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (AwsRegion != null) __obj.updateDynamic("AwsRegion")(AwsRegion)
    __obj.asInstanceOf[ConfigRuleComplianceSummaryFilters]
  }
}

