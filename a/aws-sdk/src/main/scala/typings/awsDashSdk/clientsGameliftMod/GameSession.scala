package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameSession extends js.Object {
  /**
    * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Unique identifier for a player. This ID is used to enforce a resource protection policy (if one exists), that limits the number of game sessions a player can create.
    */
  var CreatorId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Number of players currently in the game session.
    */
  var CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Unique identifier for a fleet that the game session is running on.
    */
  var FleetId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.FleetId] = js.undefined
  /**
    * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session). You can search for active game sessions based on this custom data with SearchGameSessions.
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.undefined
  /**
    * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameSessionData: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.GameSessionData] = js.undefined
  /**
    * Unique identifier for the game session. A game session ARN has the following format: arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;.
    */
  var GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number.
    */
  var IpAddress: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.IpAddress] = js.undefined
  /**
    * Information about the matchmaking process that was used to create the game session. It is in JSON syntax, formatted as a string. In addition the matchmaking configuration used, it contains data on all players assigned to the match, including player attributes and team assignments. For more details on matchmaker data, see Match Data. Matchmaker data is useful when requesting match backfills, and is updated whenever new players are added during a successful backfill (see StartMatchBackfill). 
    */
  var MatchmakerData: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.MatchmakerData] = js.undefined
  /**
    * Maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Indicates whether or not the game session is accepting new players.
    */
  var PlayerSessionCreationPolicy: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.PlayerSessionCreationPolicy] = js.undefined
  /**
    * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number.
    */
  var Port: js.UndefOr[PortNumber] = js.undefined
  /**
    * Current status of the game session. A game session must have an ACTIVE status to have player sessions.
    */
  var Status: js.UndefOr[GameSessionStatus] = js.undefined
  /**
    * Provides additional information about game session status. INTERRUPTED indicates that the game session was hosted on a spot instance that was reclaimed, causing the active game session to be terminated.
    */
  var StatusReason: js.UndefOr[GameSessionStatusReason] = js.undefined
  /**
    * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var TerminationTime: js.UndefOr[Timestamp] = js.undefined
}

object GameSession {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    CreatorId: NonZeroAndMaxString = null,
    CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
    FleetId: FleetId = null,
    GameProperties: GamePropertyList = null,
    GameSessionData: GameSessionData = null,
    GameSessionId: NonZeroAndMaxString = null,
    IpAddress: IpAddress = null,
    MatchmakerData: MatchmakerData = null,
    MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
    Name: NonZeroAndMaxString = null,
    PlayerSessionCreationPolicy: PlayerSessionCreationPolicy = null,
    Port: js.UndefOr[PortNumber] = js.undefined,
    Status: GameSessionStatus = null,
    StatusReason: GameSessionStatusReason = null,
    TerminationTime: Timestamp = null
  ): GameSession = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (CreatorId != null) __obj.updateDynamic("CreatorId")(CreatorId)
    if (!js.isUndefined(CurrentPlayerSessionCount)) __obj.updateDynamic("CurrentPlayerSessionCount")(CurrentPlayerSessionCount)
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    if (GameProperties != null) __obj.updateDynamic("GameProperties")(GameProperties)
    if (GameSessionData != null) __obj.updateDynamic("GameSessionData")(GameSessionData)
    if (GameSessionId != null) __obj.updateDynamic("GameSessionId")(GameSessionId)
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress)
    if (MatchmakerData != null) __obj.updateDynamic("MatchmakerData")(MatchmakerData)
    if (!js.isUndefined(MaximumPlayerSessionCount)) __obj.updateDynamic("MaximumPlayerSessionCount")(MaximumPlayerSessionCount)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (PlayerSessionCreationPolicy != null) __obj.updateDynamic("PlayerSessionCreationPolicy")(PlayerSessionCreationPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason.asInstanceOf[js.Any])
    if (TerminationTime != null) __obj.updateDynamic("TerminationTime")(TerminationTime)
    __obj.asInstanceOf[GameSession]
  }
}

