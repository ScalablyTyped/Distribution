package typings.awsDashSdk.clientsAugmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopActivationReason extends js.Object {
  /**
    * True if the specified conditions were matched to trigger the human loop.
    */
  var ConditionsMatched: js.UndefOr[Boolean] = js.native
}

object HumanLoopActivationReason {
  @scala.inline
  def apply(ConditionsMatched: js.UndefOr[scala.Boolean] = js.undefined): HumanLoopActivationReason = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ConditionsMatched)) __obj.updateDynamic("ConditionsMatched")(ConditionsMatched.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopActivationReason]
  }
}

