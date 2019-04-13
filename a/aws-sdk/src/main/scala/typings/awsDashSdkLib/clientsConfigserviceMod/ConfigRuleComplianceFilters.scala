package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigRuleComplianceFilters extends js.Object {
  /**
    * The 12-digit account ID of the source account. 
    */
  var AccountId: js.UndefOr[AccountId] = js.undefined
  /**
    * The source region where the data is aggregated. 
    */
  var AwsRegion: js.UndefOr[AwsRegion] = js.undefined
  /**
    * The rule compliance status. For the ConfigRuleComplianceFilters data type, AWS Config supports only COMPLIANT and NON_COMPLIANT. AWS Config does not support the NOT_APPLICABLE and the INSUFFICIENT_DATA values.
    */
  var ComplianceType: js.UndefOr[ComplianceType] = js.undefined
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: js.UndefOr[ConfigRuleName] = js.undefined
}

object ConfigRuleComplianceFilters {
  @scala.inline
  def apply(
    AccountId: AccountId = null,
    AwsRegion: AwsRegion = null,
    ComplianceType: ComplianceType = null,
    ConfigRuleName: ConfigRuleName = null
  ): ConfigRuleComplianceFilters = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (AwsRegion != null) __obj.updateDynamic("AwsRegion")(AwsRegion)
    if (ComplianceType != null) __obj.updateDynamic("ComplianceType")(ComplianceType.asInstanceOf[js.Any])
    if (ConfigRuleName != null) __obj.updateDynamic("ConfigRuleName")(ConfigRuleName)
    __obj.asInstanceOf[ConfigRuleComplianceFilters]
  }
}

