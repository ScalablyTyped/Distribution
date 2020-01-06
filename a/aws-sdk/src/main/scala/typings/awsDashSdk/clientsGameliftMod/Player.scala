package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Player extends js.Object {
  /**
    * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when connected to AWS Regions. If this property is present, FlexMatch considers placing the match only in Regions for which latency is reported.  If a matchmaker has a rule that evaluates player latency, players must report latency in order to be matched. If no latency is reported in this scenario, FlexMatch assumes that no Regions are available to the player and the ticket is not matchable. 
    */
  var LatencyInMs: js.UndefOr[LatencyMap] = js.native
  /**
    * A collection of key:value pairs containing player information for use in matchmaking. Player attribute keys must match the playerAttributes used in a matchmaking rule set. Example: "PlayerAttributes": {"skill": {"N": "23"}, "gameMode": {"S": "deathmatch"}}.
    */
  var PlayerAttributes: js.UndefOr[PlayerAttributeMap] = js.native
  /**
    * A unique identifier for a player
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Name of the team that the player is assigned to in a match. Team names are defined in a matchmaking rule set.
    */
  var Team: js.UndefOr[NonZeroAndMaxString] = js.native
}

object Player {
  @scala.inline
  def apply(
    LatencyInMs: LatencyMap = null,
    PlayerAttributes: PlayerAttributeMap = null,
    PlayerId: NonZeroAndMaxString = null,
    Team: NonZeroAndMaxString = null
  ): Player = {
    val __obj = js.Dynamic.literal()
    if (LatencyInMs != null) __obj.updateDynamic("LatencyInMs")(LatencyInMs.asInstanceOf[js.Any])
    if (PlayerAttributes != null) __obj.updateDynamic("PlayerAttributes")(PlayerAttributes.asInstanceOf[js.Any])
    if (PlayerId != null) __obj.updateDynamic("PlayerId")(PlayerId.asInstanceOf[js.Any])
    if (Team != null) __obj.updateDynamic("Team")(Team.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
}

