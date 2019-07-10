package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMatchmakingRuleSetInput extends js.Object {
  /**
    * Unique identifier for a matchmaking rule set. A matchmaking configuration identifies the rule set it uses by this name value. (Note: The rule set name is different from the optional "name" field in the rule set body.) 
    */
  var Name: MatchmakingIdStringModel
  /**
    * Collection of matchmaking rules, formatted as a JSON string. Comments are not allowed in JSON, but most elements support a description field.
    */
  var RuleSetBody: awsDashSdkLib.clientsGameliftMod.RuleSetBody
}

object CreateMatchmakingRuleSetInput {
  @scala.inline
  def apply(Name: MatchmakingIdStringModel, RuleSetBody: RuleSetBody): CreateMatchmakingRuleSetInput = {
    val __obj = js.Dynamic.literal(Name = Name, RuleSetBody = RuleSetBody)
  
    __obj.asInstanceOf[CreateMatchmakingRuleSetInput]
  }
}

