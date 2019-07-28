package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMatchmakingRuleSetOutput extends js.Object {
  /**
    * Object that describes the newly created matchmaking rule set.
    */
  var RuleSet: MatchmakingRuleSet
}

object CreateMatchmakingRuleSetOutput {
  @scala.inline
  def apply(RuleSet: MatchmakingRuleSet): CreateMatchmakingRuleSetOutput = {
    val __obj = js.Dynamic.literal(RuleSet = RuleSet)
  
    __obj.asInstanceOf[CreateMatchmakingRuleSetOutput]
  }
}

