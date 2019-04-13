package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeComplianceByConfigRuleRequest extends js.Object {
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT and NON_COMPLIANT.
    */
  var ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined
  /**
    * Specify one or more AWS Config rule names to filter the results by rule.
    */
  var ConfigRuleNames: js.UndefOr[ConfigRuleNames] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeComplianceByConfigRuleRequest {
  @scala.inline
  def apply(
    ComplianceTypes: ComplianceTypes = null,
    ConfigRuleNames: ConfigRuleNames = null,
    NextToken: String = null
  ): DescribeComplianceByConfigRuleRequest = {
    val __obj = js.Dynamic.literal()
    if (ComplianceTypes != null) __obj.updateDynamic("ComplianceTypes")(ComplianceTypes)
    if (ConfigRuleNames != null) __obj.updateDynamic("ConfigRuleNames")(ConfigRuleNames)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeComplianceByConfigRuleRequest]
  }
}

