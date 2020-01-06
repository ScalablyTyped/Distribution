package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateMatchmakingRuleSetOutput extends js.Object {
  /**
    * A response indicating whether the rule set is valid.
    */
  var Valid: js.UndefOr[BooleanModel] = js.native
}

object ValidateMatchmakingRuleSetOutput {
  @scala.inline
  def apply(Valid: js.UndefOr[Boolean] = js.undefined): ValidateMatchmakingRuleSetOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Valid)) __obj.updateDynamic("Valid")(Valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateMatchmakingRuleSetOutput]
  }
}

