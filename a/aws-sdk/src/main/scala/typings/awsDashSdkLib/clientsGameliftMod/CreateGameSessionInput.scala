package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGameSessionInput extends js.Object {
  /**
    * Unique identifier for an alias associated with the fleet to create a game session in. Each request must reference either a fleet ID or alias ID, but not both.
    */
  var AliasId: js.UndefOr[AliasId] = js.undefined
  /**
    * Unique identifier for a player or entity creating the game session. This ID is used to enforce a resource protection policy (if one exists) that limits the number of concurrent active game sessions one player can have.
    */
  var CreatorId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Unique identifier for a fleet to create a game session in. Each request must reference either a fleet ID or alias ID, but not both.
    */
  var FleetId: js.UndefOr[FleetId] = js.undefined
  /**
    * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.undefined
  /**
    * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameSessionData: js.UndefOr[GameSessionData] = js.undefined
  /**
    *  This parameter is no longer preferred. Please use IdempotencyToken instead. Custom string that uniquely identifies a request for a new game session. Maximum token length is 48 characters. If provided, this string is included in the new game session's ID. (A game session ARN has the following format: arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;.) 
    */
  var GameSessionId: js.UndefOr[IdStringModel] = js.undefined
  /**
    * Custom string that uniquely identifies a request for a new game session. Maximum token length is 48 characters. If provided, this string is included in the new game session's ID. (A game session ARN has the following format: arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;.) Idempotency tokens remain in use for 30 days after a game session has ended; game session objects are retained for this time period and then deleted.
    */
  var IdempotencyToken: js.UndefOr[IdStringModel] = js.undefined
  /**
    * Maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: WholeNumber
  /**
    * Descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object CreateGameSessionInput {
  @scala.inline
  def apply(
    MaximumPlayerSessionCount: WholeNumber,
    AliasId: AliasId = null,
    CreatorId: NonZeroAndMaxString = null,
    FleetId: FleetId = null,
    GameProperties: GamePropertyList = null,
    GameSessionData: GameSessionData = null,
    GameSessionId: IdStringModel = null,
    IdempotencyToken: IdStringModel = null,
    Name: NonZeroAndMaxString = null
  ): CreateGameSessionInput = {
    val __obj = js.Dynamic.literal(MaximumPlayerSessionCount = MaximumPlayerSessionCount)
    if (AliasId != null) __obj.updateDynamic("AliasId")(AliasId)
    if (CreatorId != null) __obj.updateDynamic("CreatorId")(CreatorId)
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    if (GameProperties != null) __obj.updateDynamic("GameProperties")(GameProperties)
    if (GameSessionData != null) __obj.updateDynamic("GameSessionData")(GameSessionData)
    if (GameSessionId != null) __obj.updateDynamic("GameSessionId")(GameSessionId)
    if (IdempotencyToken != null) __obj.updateDynamic("IdempotencyToken")(IdempotencyToken)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[CreateGameSessionInput]
  }
}

