package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMatchmakingInput extends js.Object {
  /**
    * Name of the matchmaking configuration to use for this request. Matchmaking configurations must exist in the same Region as this request. You can use either the configuration name or ARN value.
    */
  var ConfigurationName: MatchmakingConfigurationName = js.native
  /**
    * Information on each player to be matched. This information must include a player ID, and may contain player attributes and latency data to be used in the matchmaking process. After a successful match, Player objects contain the name of the team the player is assigned to.
    */
  var Players: PlayerList = js.native
  /**
    * A unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate one in the form of a UUID. Use this identifier to track the matchmaking ticket status and retrieve match results.
    */
  var TicketId: js.UndefOr[MatchmakingIdStringModel] = js.native
}

object StartMatchmakingInput {
  @scala.inline
  def apply(
    ConfigurationName: MatchmakingConfigurationName,
    Players: PlayerList,
    TicketId: MatchmakingIdStringModel = null
  ): StartMatchmakingInput = {
    val __obj = js.Dynamic.literal(ConfigurationName = ConfigurationName.asInstanceOf[js.Any], Players = Players.asInstanceOf[js.Any])
    if (TicketId != null) __obj.updateDynamic("TicketId")(TicketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMatchmakingInput]
  }
}

