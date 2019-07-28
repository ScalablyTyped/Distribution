package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartMatchBackfillInput extends js.Object {
  /**
    * Name of the matchmaker to use for this request. The name of the matchmaker that was used with the original game session is listed in the GameSession object, MatchmakerData property. This property contains a matchmaking configuration ARN value, which includes the matchmaker name. (In the ARN value "arn:aws:gamelift:us-west-2:111122223333:matchmakingconfiguration/MM-4v4", the matchmaking configuration name is "MM-4v4".) Use only the name for this parameter.
    */
  var ConfigurationName: MatchmakingIdStringModel
  /**
    * Amazon Resource Name (ARN) that is assigned to a game session and uniquely identifies it. 
    */
  var GameSessionArn: ArnStringModel
  /**
    * Match information on all players that are currently assigned to the game session. This information is used by the matchmaker to find new players and add them to the existing game.   PlayerID, PlayerAttributes, Team -\\- This information is maintained in the GameSession object, MatchmakerData property, for all players who are currently assigned to the game session. The matchmaker data is in JSON syntax, formatted as a string. For more details, see  Match Data.    LatencyInMs -\\- If the matchmaker uses player latency, include a latency value, in milliseconds, for the region that the game session is currently in. Do not include latency values for any other region.  
    */
  var Players: PlayerList
  /**
    * Unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate one in the form of a UUID. Use this identifier to track the match backfill ticket status and retrieve match results.
    */
  var TicketId: js.UndefOr[MatchmakingIdStringModel] = js.undefined
}

object StartMatchBackfillInput {
  @scala.inline
  def apply(
    ConfigurationName: MatchmakingIdStringModel,
    GameSessionArn: ArnStringModel,
    Players: PlayerList,
    TicketId: MatchmakingIdStringModel = null
  ): StartMatchBackfillInput = {
    val __obj = js.Dynamic.literal(ConfigurationName = ConfigurationName, GameSessionArn = GameSessionArn, Players = Players)
    if (TicketId != null) __obj.updateDynamic("TicketId")(TicketId)
    __obj.asInstanceOf[StartMatchBackfillInput]
  }
}

