package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAggregateComplianceDetailsByConfigRuleResponse extends js.Object {
  /**
    * Returns an AggregateEvaluationResults object.
    */
  var AggregateEvaluationResults: js.UndefOr[AggregateEvaluationResultList] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.NextToken] = js.undefined
}

object GetAggregateComplianceDetailsByConfigRuleResponse {
  @scala.inline
  def apply(AggregateEvaluationResults: AggregateEvaluationResultList = null, NextToken: NextToken = null): GetAggregateComplianceDetailsByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (AggregateEvaluationResults != null) __obj.updateDynamic("AggregateEvaluationResults")(AggregateEvaluationResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetAggregateComplianceDetailsByConfigRuleResponse]
  }
}

