package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetComplianceDetailsByResourceResponse extends js.Object {
  /**
    * Indicates whether the specified AWS resource complies each AWS Config rule.
    */
  var EvaluationResults: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.EvaluationResults] = js.undefined
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object GetComplianceDetailsByResourceResponse {
  @scala.inline
  def apply(EvaluationResults: EvaluationResults = null, NextToken: String = null): GetComplianceDetailsByResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (EvaluationResults != null) __obj.updateDynamic("EvaluationResults")(EvaluationResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetComplianceDetailsByResourceResponse]
  }
}

