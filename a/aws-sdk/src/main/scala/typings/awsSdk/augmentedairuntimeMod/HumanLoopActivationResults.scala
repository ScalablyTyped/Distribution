package typings.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopActivationResults extends js.Object {
  /**
    * A copy of the human loop activation conditions of the flow definition, augmented with the results of evaluating those conditions on the input provided to the StartHumanLoop operation.
    */
  var HumanLoopActivationConditionsEvaluationResults: js.UndefOr[String] = js.native
  /**
    * An object containing information about why a human loop was triggered.
    */
  var HumanLoopActivationReason: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.HumanLoopActivationReason] = js.native
}

object HumanLoopActivationResults {
  @scala.inline
  def apply(
    HumanLoopActivationConditionsEvaluationResults: String = null,
    HumanLoopActivationReason: HumanLoopActivationReason = null
  ): HumanLoopActivationResults = {
    val __obj = js.Dynamic.literal()
    if (HumanLoopActivationConditionsEvaluationResults != null) __obj.updateDynamic("HumanLoopActivationConditionsEvaluationResults")(HumanLoopActivationConditionsEvaluationResults.asInstanceOf[js.Any])
    if (HumanLoopActivationReason != null) __obj.updateDynamic("HumanLoopActivationReason")(HumanLoopActivationReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopActivationResults]
  }
}

