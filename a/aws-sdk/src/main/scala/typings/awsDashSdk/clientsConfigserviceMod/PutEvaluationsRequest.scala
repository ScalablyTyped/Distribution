package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEvaluationsRequest extends js.Object {
  /**
    * The assessments that the AWS Lambda function performs. Each evaluation identifies an AWS resource and indicates whether it complies with the AWS Config rule that invokes the AWS Lambda function.
    */
  var Evaluations: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.Evaluations] = js.undefined
  /**
    * An encrypted token that associates an evaluation with an AWS Config rule. Identifies the rule and the event that triggered the evaluation.
    */
  var ResultToken: String
  /**
    * Use this parameter to specify a test run for PutEvaluations. You can verify whether your AWS Lambda function will deliver evaluation results to AWS Config. No updates occur to your existing evaluations, and evaluation results are not sent to AWS Config.  When TestMode is true, PutEvaluations doesn't require a valid value for the ResultToken parameter, but the value cannot be null. 
    */
  var TestMode: js.UndefOr[Boolean] = js.undefined
}

object PutEvaluationsRequest {
  @scala.inline
  def apply(ResultToken: String, Evaluations: Evaluations = null, TestMode: js.UndefOr[Boolean] = js.undefined): PutEvaluationsRequest = {
    val __obj = js.Dynamic.literal(ResultToken = ResultToken)
    if (Evaluations != null) __obj.updateDynamic("Evaluations")(Evaluations)
    if (!js.isUndefined(TestMode)) __obj.updateDynamic("TestMode")(TestMode)
    __obj.asInstanceOf[PutEvaluationsRequest]
  }
}

