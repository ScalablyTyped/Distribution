package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateMatchmakingRuleSetOutput extends js.Object {
  /**
    * Response indicating whether or not the rule set is valid.
    */
  var Valid: js.UndefOr[BooleanModel] = js.undefined
}

object ValidateMatchmakingRuleSetOutput {
  @scala.inline
  def apply(Valid: js.UndefOr[BooleanModel] = js.undefined): ValidateMatchmakingRuleSetOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Valid)) __obj.updateDynamic("Valid")(Valid)
    __obj.asInstanceOf[ValidateMatchmakingRuleSetOutput]
  }
}

