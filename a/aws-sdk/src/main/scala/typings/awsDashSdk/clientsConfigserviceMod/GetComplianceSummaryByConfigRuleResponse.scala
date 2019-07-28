package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetComplianceSummaryByConfigRuleResponse extends js.Object {
  /**
    * The number of AWS Config rules that are compliant and the number that are noncompliant, up to a maximum of 25 for each.
    */
  var ComplianceSummary: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ComplianceSummary] = js.undefined
}

object GetComplianceSummaryByConfigRuleResponse {
  @scala.inline
  def apply(ComplianceSummary: ComplianceSummary = null): GetComplianceSummaryByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ComplianceSummary != null) __obj.updateDynamic("ComplianceSummary")(ComplianceSummary)
    __obj.asInstanceOf[GetComplianceSummaryByConfigRuleResponse]
  }
}

