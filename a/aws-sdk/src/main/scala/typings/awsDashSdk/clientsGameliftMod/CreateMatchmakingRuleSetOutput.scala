package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMatchmakingRuleSetOutput extends js.Object {
  /**
    * The newly created matchmaking rule set.
    */
  var RuleSet: MatchmakingRuleSet = js.native
}

object CreateMatchmakingRuleSetOutput {
  @scala.inline
  def apply(RuleSet: MatchmakingRuleSet): CreateMatchmakingRuleSetOutput = {
    val __obj = js.Dynamic.literal(RuleSet = RuleSet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateMatchmakingRuleSetOutput]
  }
}

