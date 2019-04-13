package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartMatchmakingInput extends js.Object {
  /**
    * Name of the matchmaking configuration to use for this request. Matchmaking configurations must exist in the same region as this request.
    */
  var ConfigurationName: MatchmakingIdStringModel
  /**
    * Information on each player to be matched. This information must include a player ID, and may contain player attributes and latency data to be used in the matchmaking process. After a successful match, Player objects contain the name of the team the player is assigned to.
    */
  var Players: PlayerList
  /**
    * Unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate one in the form of a UUID. Use this identifier to track the matchmaking ticket status and retrieve match results.
    */
  var TicketId: js.UndefOr[MatchmakingIdStringModel] = js.undefined
}

object StartMatchmakingInput {
  @scala.inline
  def apply(
    ConfigurationName: MatchmakingIdStringModel,
    Players: PlayerList,
    TicketId: MatchmakingIdStringModel = null
  ): StartMatchmakingInput = {
    val __obj = js.Dynamic.literal(ConfigurationName = ConfigurationName, Players = Players)
    if (TicketId != null) __obj.updateDynamic("TicketId")(TicketId)
    __obj.asInstanceOf[StartMatchmakingInput]
  }
}

