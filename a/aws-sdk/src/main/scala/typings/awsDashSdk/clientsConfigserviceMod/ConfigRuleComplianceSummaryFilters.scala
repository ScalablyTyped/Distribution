package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigRuleComplianceSummaryFilters extends js.Object {
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.AccountId] = js.native
  /**
    * The source region where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.AwsRegion] = js.native
}

object ConfigRuleComplianceSummaryFilters {
  @scala.inline
  def apply(AccountId: AccountId = null, AwsRegion: AwsRegion = null): ConfigRuleComplianceSummaryFilters = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (AwsRegion != null) __obj.updateDynamic("AwsRegion")(AwsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigRuleComplianceSummaryFilters]
  }
}

