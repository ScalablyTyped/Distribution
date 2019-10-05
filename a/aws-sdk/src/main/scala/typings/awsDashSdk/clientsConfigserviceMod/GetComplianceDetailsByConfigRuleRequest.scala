package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetComplianceDetailsByConfigRuleRequest extends js.Object {
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE.
    */
  var ComplianceTypes: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ComplianceTypes] = js.undefined
  /**
    * The name of the AWS Config rule for which you want compliance information.
    */
  var ConfigRuleName: StringWithCharLimit64
  /**
    * The maximum number of evaluation results returned on each page. The default is 10. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.Limit] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.NextToken] = js.undefined
}

object GetComplianceDetailsByConfigRuleRequest {
  @scala.inline
  def apply(
    ConfigRuleName: StringWithCharLimit64,
    ComplianceTypes: ComplianceTypes = null,
    Limit: Int | Double = null,
    NextToken: NextToken = null
  ): GetComplianceDetailsByConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName)
    if (ComplianceTypes != null) __obj.updateDynamic("ComplianceTypes")(ComplianceTypes)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetComplianceDetailsByConfigRuleRequest]
  }
}

