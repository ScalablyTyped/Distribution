package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateComplianceByConfigRule extends js.Object {
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.AccountId] = js.native
  /**
    * The source region from where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.AwsRegion] = js.native
  /**
    * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors that affect the compliance.
    */
  var Compliance: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.Compliance] = js.native
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ConfigRuleName] = js.native
}

object AggregateComplianceByConfigRule {
  @scala.inline
  def apply(
    AccountId: AccountId = null,
    AwsRegion: AwsRegion = null,
    Compliance: Compliance = null,
    ConfigRuleName: ConfigRuleName = null
  ): AggregateComplianceByConfigRule = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (AwsRegion != null) __obj.updateDynamic("AwsRegion")(AwsRegion.asInstanceOf[js.Any])
    if (Compliance != null) __obj.updateDynamic("Compliance")(Compliance.asInstanceOf[js.Any])
    if (ConfigRuleName != null) __obj.updateDynamic("ConfigRuleName")(ConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateComplianceByConfigRule]
  }
}

