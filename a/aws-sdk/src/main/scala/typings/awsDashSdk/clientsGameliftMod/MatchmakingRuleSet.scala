package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchmakingRuleSet extends js.Object {
  /**
    * The time stamp indicating when this data object was created. The format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * Amazon Resource Name (ARN) that is assigned to a GameLift matchmaking rule set resource and uniquely identifies it. ARNs are unique across all Regions. In a GameLift rule set ARN, the resource ID matches the RuleSetName value.
    */
  var RuleSetArn: js.UndefOr[MatchmakingRuleSetArn] = js.native
  /**
    * A collection of matchmaking rules, formatted as a JSON string. Comments are not allowed in JSON, but most elements support a description field.
    */
  var RuleSetBody: typings.awsDashSdk.clientsGameliftMod.RuleSetBody = js.native
  /**
    * A unique identifier for a matchmaking rule set
    */
  var RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.native
}

object MatchmakingRuleSet {
  @scala.inline
  def apply(
    RuleSetBody: RuleSetBody,
    CreationTime: Timestamp = null,
    RuleSetArn: MatchmakingRuleSetArn = null,
    RuleSetName: MatchmakingIdStringModel = null
  ): MatchmakingRuleSet = {
    val __obj = js.Dynamic.literal(RuleSetBody = RuleSetBody.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (RuleSetArn != null) __obj.updateDynamic("RuleSetArn")(RuleSetArn.asInstanceOf[js.Any])
    if (RuleSetName != null) __obj.updateDynamic("RuleSetName")(RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchmakingRuleSet]
  }
}

