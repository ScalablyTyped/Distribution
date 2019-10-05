package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameSessionPlacement extends js.Object {
  var DnsName: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.DnsName] = js.undefined
  /**
    * Time stamp indicating when this request was completed, canceled, or timed out.
    */
  var EndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.undefined
  /**
    * Identifier for the game session created by this placement request. This value is set once the new game session is placed (placement status is FULFILLED). This identifier is unique across all regions. You can use this value as a GameSessionId value as needed.
    */
  var GameSessionArn: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameSessionData: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.GameSessionData] = js.undefined
  /**
    * Unique identifier for the game session. This value is set once the new game session is placed (placement status is FULFILLED).
    */
  var GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var GameSessionName: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
    */
  var GameSessionQueueName: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.GameSessionQueueName] = js.undefined
  /**
    * Name of the region where the game session created by this placement request is running. This value is set once the new game session is placed (placement status is FULFILLED).
    */
  var GameSessionRegion: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number. This value is set once the new game session is placed (placement status is FULFILLED). 
    */
  var IpAddress: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.IpAddress] = js.undefined
  /**
    * Information on the matchmaking process for this game. Data is in JSON syntax, formatted as a string. It identifies the matchmaking configuration used to create the match, and contains data on all players assigned to the match, including player attributes and team assignments. For more details on matchmaker data, see Match Data.
    */
  var MatchmakerData: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.MatchmakerData] = js.undefined
  /**
    * Maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Collection of information on player sessions created in response to the game session placement request. These player sessions are created only once a new game session is successfully placed (placement status is FULFILLED). This information includes the player ID (as provided in the placement request) and the corresponding player session ID. Retrieve full player sessions by calling DescribePlayerSessions with the player session ID.
    */
  var PlacedPlayerSessions: js.UndefOr[PlacedPlayerSessionList] = js.undefined
  /**
    * Unique identifier for a game session placement.
    */
  var PlacementId: js.UndefOr[IdStringModel] = js.undefined
  /**
    * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when connected to AWS regions.
    */
  var PlayerLatencies: js.UndefOr[PlayerLatencyList] = js.undefined
  /**
    * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number. This value is set once the new game session is placed (placement status is FULFILLED).
    */
  var Port: js.UndefOr[PortNumber] = js.undefined
  /**
    * Time stamp indicating when this request was placed in the queue. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var StartTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Current status of the game session placement request.    PENDING -- The placement request is currently in the queue waiting to be processed.    FULFILLED -- A new game session and player sessions (if requested) have been successfully created. Values for GameSessionArn and GameSessionRegion are available.     CANCELLED -- The placement request was canceled with a call to StopGameSessionPlacement.    TIMED_OUT -- A new game session was not successfully created before the time limit expired. You can resubmit the placement request as needed.  
    */
  var Status: js.UndefOr[GameSessionPlacementState] = js.undefined
}

object GameSessionPlacement {
  @scala.inline
  def apply(
    DnsName: DnsName = null,
    EndTime: Timestamp = null,
    GameProperties: GamePropertyList = null,
    GameSessionArn: NonZeroAndMaxString = null,
    GameSessionData: GameSessionData = null,
    GameSessionId: NonZeroAndMaxString = null,
    GameSessionName: NonZeroAndMaxString = null,
    GameSessionQueueName: GameSessionQueueName = null,
    GameSessionRegion: NonZeroAndMaxString = null,
    IpAddress: IpAddress = null,
    MatchmakerData: MatchmakerData = null,
    MaximumPlayerSessionCount: Int | scala.Double = null,
    PlacedPlayerSessions: PlacedPlayerSessionList = null,
    PlacementId: IdStringModel = null,
    PlayerLatencies: PlayerLatencyList = null,
    Port: Int | scala.Double = null,
    StartTime: Timestamp = null,
    Status: GameSessionPlacementState = null
  ): GameSessionPlacement = {
    val __obj = js.Dynamic.literal()
    if (DnsName != null) __obj.updateDynamic("DnsName")(DnsName)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (GameProperties != null) __obj.updateDynamic("GameProperties")(GameProperties)
    if (GameSessionArn != null) __obj.updateDynamic("GameSessionArn")(GameSessionArn)
    if (GameSessionData != null) __obj.updateDynamic("GameSessionData")(GameSessionData)
    if (GameSessionId != null) __obj.updateDynamic("GameSessionId")(GameSessionId)
    if (GameSessionName != null) __obj.updateDynamic("GameSessionName")(GameSessionName)
    if (GameSessionQueueName != null) __obj.updateDynamic("GameSessionQueueName")(GameSessionQueueName)
    if (GameSessionRegion != null) __obj.updateDynamic("GameSessionRegion")(GameSessionRegion)
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress)
    if (MatchmakerData != null) __obj.updateDynamic("MatchmakerData")(MatchmakerData)
    if (MaximumPlayerSessionCount != null) __obj.updateDynamic("MaximumPlayerSessionCount")(MaximumPlayerSessionCount.asInstanceOf[js.Any])
    if (PlacedPlayerSessions != null) __obj.updateDynamic("PlacedPlayerSessions")(PlacedPlayerSessions)
    if (PlacementId != null) __obj.updateDynamic("PlacementId")(PlacementId)
    if (PlayerLatencies != null) __obj.updateDynamic("PlayerLatencies")(PlayerLatencies)
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSessionPlacement]
  }
}

