package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMatchmakingRuleSetInput extends js.Object {
  /**
    * Unique identifier for a matchmaking rule set to be deleted. (Note: The rule set name is different from the optional "name" field in the rule set body.) 
    */
  var Name: MatchmakingIdStringModel
}

object DeleteMatchmakingRuleSetInput {
  @scala.inline
  def apply(Name: MatchmakingIdStringModel): DeleteMatchmakingRuleSetInput = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteMatchmakingRuleSetInput]
  }
}

