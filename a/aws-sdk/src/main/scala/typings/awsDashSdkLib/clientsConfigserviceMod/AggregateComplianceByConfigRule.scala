package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateComplianceByConfigRule extends js.Object {
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: js.UndefOr[AccountId] = js.undefined
  /**
    * The source region from where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[AwsRegion] = js.undefined
  /**
    * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors that affect the compliance.
    */
  var Compliance: js.UndefOr[Compliance] = js.undefined
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: js.UndefOr[ConfigRuleName] = js.undefined
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
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (AwsRegion != null) __obj.updateDynamic("AwsRegion")(AwsRegion)
    if (Compliance != null) __obj.updateDynamic("Compliance")(Compliance)
    if (ConfigRuleName != null) __obj.updateDynamic("ConfigRuleName")(ConfigRuleName)
    __obj.asInstanceOf[AggregateComplianceByConfigRule]
  }
}

