package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetComplianceDetailsByConfigRuleResponse extends js.Object {
  /**
    * Indicates whether the AWS resource complies with the specified AWS Config rule.
    */
  var EvaluationResults: js.UndefOr[EvaluationResults] = js.undefined
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object GetComplianceDetailsByConfigRuleResponse {
  @scala.inline
  def apply(EvaluationResults: EvaluationResults = null, NextToken: NextToken = null): GetComplianceDetailsByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (EvaluationResults != null) __obj.updateDynamic("EvaluationResults")(EvaluationResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetComplianceDetailsByConfigRuleResponse]
  }
}

