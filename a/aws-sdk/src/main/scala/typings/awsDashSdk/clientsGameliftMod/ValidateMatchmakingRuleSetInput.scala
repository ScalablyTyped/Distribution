package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateMatchmakingRuleSetInput extends js.Object {
  /**
    * Collection of matchmaking rules to validate, formatted as a JSON string.
    */
  var RuleSetBody: typings.awsDashSdk.clientsGameliftMod.RuleSetBody
}

object ValidateMatchmakingRuleSetInput {
  @scala.inline
  def apply(RuleSetBody: RuleSetBody): ValidateMatchmakingRuleSetInput = {
    val __obj = js.Dynamic.literal(RuleSetBody = RuleSetBody)
  
    __obj.asInstanceOf[ValidateMatchmakingRuleSetInput]
  }
}

