package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchmakingRuleSet extends js.Object {
  /**
    * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Collection of matchmaking rules, formatted as a JSON string. (Note that comments14 are not allowed in JSON, but most elements support a description field.)
    */
  var RuleSetBody: awsDashSdkLib.clientsGameliftMod.RuleSetBody
  /**
    * Unique identifier for a matchmaking rule set
    */
  var RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined
}

object MatchmakingRuleSet {
  @scala.inline
  def apply(
    RuleSetBody: RuleSetBody,
    CreationTime: Timestamp = null,
    RuleSetName: MatchmakingIdStringModel = null
  ): MatchmakingRuleSet = {
    val __obj = js.Dynamic.literal(RuleSetBody = RuleSetBody)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (RuleSetName != null) __obj.updateDynamic("RuleSetName")(RuleSetName)
    __obj.asInstanceOf[MatchmakingRuleSet]
  }
}

