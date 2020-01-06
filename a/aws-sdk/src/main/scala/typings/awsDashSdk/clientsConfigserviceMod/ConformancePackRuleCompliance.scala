package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConformancePackRuleCompliance extends js.Object {
  /**
    * Compliance of the AWS Config rule The allowed values are COMPLIANT and NON_COMPLIANT.
    */
  var ComplianceType: js.UndefOr[ConformancePackComplianceType] = js.native
  /**
    * Name of the config rule.
    */
  var ConfigRuleName: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ConfigRuleName] = js.native
}

object ConformancePackRuleCompliance {
  @scala.inline
  def apply(ComplianceType: ConformancePackComplianceType = null, ConfigRuleName: ConfigRuleName = null): ConformancePackRuleCompliance = {
    val __obj = js.Dynamic.literal()
    if (ComplianceType != null) __obj.updateDynamic("ComplianceType")(ComplianceType.asInstanceOf[js.Any])
    if (ConfigRuleName != null) __obj.updateDynamic("ConfigRuleName")(ConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackRuleCompliance]
  }
}

