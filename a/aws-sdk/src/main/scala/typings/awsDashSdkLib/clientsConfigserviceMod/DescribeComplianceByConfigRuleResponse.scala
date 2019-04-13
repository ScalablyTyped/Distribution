package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeComplianceByConfigRuleResponse extends js.Object {
  /**
    * Indicates whether each of the specified AWS Config rules is compliant.
    */
  var ComplianceByConfigRules: js.UndefOr[ComplianceByConfigRules] = js.undefined
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeComplianceByConfigRuleResponse {
  @scala.inline
  def apply(ComplianceByConfigRules: ComplianceByConfigRules = null, NextToken: String = null): DescribeComplianceByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ComplianceByConfigRules != null) __obj.updateDynamic("ComplianceByConfigRules")(ComplianceByConfigRules)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeComplianceByConfigRuleResponse]
  }
}

