package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEvaluationResultsRequest extends js.Object {
  /**
    * The name of the AWS Config rule for which you want to delete the evaluation results.
    */
  var ConfigRuleName: StringWithCharLimit64
}

object DeleteEvaluationResultsRequest {
  @scala.inline
  def apply(ConfigRuleName: StringWithCharLimit64): DeleteEvaluationResultsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName)
  
    __obj.asInstanceOf[DeleteEvaluationResultsRequest]
  }
}

