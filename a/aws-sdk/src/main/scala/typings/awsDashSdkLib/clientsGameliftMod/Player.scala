package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Player extends js.Object {
  /**
    * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when connected to AWS regions. If this property is present, FlexMatch considers placing the match only in regions for which latency is reported.  If a matchmaker has a rule that evaluates player latency, players must report latency in order to be matched. If no latency is reported in this scenario, FlexMatch assumes that no regions are available to the player and the ticket is not matchable. 
    */
  var LatencyInMs: js.UndefOr[LatencyMap] = js.undefined
  /**
    * Collection of key:value pairs containing player information for use in matchmaking. Player attribute keys must match the playerAttributes used in a matchmaking rule set. Example: "PlayerAttributes": {"skill": {"N": "23"}, "gameMode": {"S": "deathmatch"}}.
    */
  var PlayerAttributes: js.UndefOr[PlayerAttributeMap] = js.undefined
  /**
    * Unique identifier for a player
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Name of the team that the player is assigned to in a match. Team names are defined in a matchmaking rule set.
    */
  var Team: js.UndefOr[NonZeroAndMaxString] = js.undefined
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
    if (LatencyInMs != null) __obj.updateDynamic("LatencyInMs")(LatencyInMs)
    if (PlayerAttributes != null) __obj.updateDynamic("PlayerAttributes")(PlayerAttributes)
    if (PlayerId != null) __obj.updateDynamic("PlayerId")(PlayerId)
    if (Team != null) __obj.updateDynamic("Team")(Team)
    __obj.asInstanceOf[Player]
  }
}

