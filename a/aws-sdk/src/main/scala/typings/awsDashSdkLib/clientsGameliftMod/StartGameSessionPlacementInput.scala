package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartGameSessionPlacementInput extends js.Object {
  /**
    * Set of information on each player to create a player session for.
    */
  var DesiredPlayerSessions: js.UndefOr[DesiredPlayerSessionList] = js.undefined
  /**
    * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.undefined
  /**
    * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameSessionData: js.UndefOr[GameSessionData] = js.undefined
  /**
    * Descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var GameSessionName: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Name of the queue to use to place the new game session.
    */
  var GameSessionQueueName: awsDashSdkLib.clientsGameliftMod.GameSessionQueueName
  /**
    * Maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: WholeNumber
  /**
    * Unique identifier to assign to the new game session placement. This value is developer-defined. The value must be unique across all regions and cannot be reused unless you are resubmitting a canceled or timed-out placement request.
    */
  var PlacementId: IdStringModel
  /**
    * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when connected to AWS regions. This information is used to try to place the new game session where it can offer the best possible gameplay experience for the players. 
    */
  var PlayerLatencies: js.UndefOr[PlayerLatencyList] = js.undefined
}

object StartGameSessionPlacementInput {
  @scala.inline
  def apply(
    GameSessionQueueName: GameSessionQueueName,
    MaximumPlayerSessionCount: WholeNumber,
    PlacementId: IdStringModel,
    DesiredPlayerSessions: DesiredPlayerSessionList = null,
    GameProperties: GamePropertyList = null,
    GameSessionData: GameSessionData = null,
    GameSessionName: NonZeroAndMaxString = null,
    PlayerLatencies: PlayerLatencyList = null
  ): StartGameSessionPlacementInput = {
    val __obj = js.Dynamic.literal(GameSessionQueueName = GameSessionQueueName, MaximumPlayerSessionCount = MaximumPlayerSessionCount, PlacementId = PlacementId)
    if (DesiredPlayerSessions != null) __obj.updateDynamic("DesiredPlayerSessions")(DesiredPlayerSessions)
    if (GameProperties != null) __obj.updateDynamic("GameProperties")(GameProperties)
    if (GameSessionData != null) __obj.updateDynamic("GameSessionData")(GameSessionData)
    if (GameSessionName != null) __obj.updateDynamic("GameSessionName")(GameSessionName)
    if (PlayerLatencies != null) __obj.updateDynamic("PlayerLatencies")(PlayerLatencies)
    __obj.asInstanceOf[StartGameSessionPlacementInput]
  }
}

