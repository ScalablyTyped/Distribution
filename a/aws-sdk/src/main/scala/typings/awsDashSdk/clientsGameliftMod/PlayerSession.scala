package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerSession extends js.Object {
  /**
    * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Unique identifier for a fleet that the player's game session is running on.
    */
  var FleetId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.FleetId] = js.undefined
  /**
    * Unique identifier for the game session that the player session is connected to.
    */
  var GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number.
    */
  var IpAddress: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.IpAddress] = js.undefined
  /**
    * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game. 
    */
  var PlayerData: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.PlayerData] = js.undefined
  /**
    * Unique identifier for a player that is associated with this player session.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Unique identifier for a player session.
    */
  var PlayerSessionId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.PlayerSessionId] = js.undefined
  /**
    * Port number for the game session. To connect to a Amazon GameLift server process, an app needs both the IP address and port number.
    */
  var Port: js.UndefOr[PortNumber] = js.undefined
  /**
    * Current status of the player session. Possible player session statuses include the following:    RESERVED -- The player session request has been received, but the player has not yet connected to the server process and/or been validated.     ACTIVE -- The player has been validated by the server process and is currently connected.    COMPLETED -- The player connection has been dropped.    TIMEDOUT -- A player session request was received, but the player did not connect and/or was not validated within the timeout limit (60 seconds).  
    */
  var Status: js.UndefOr[PlayerSessionStatus] = js.undefined
  /**
    * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var TerminationTime: js.UndefOr[Timestamp] = js.undefined
}

object PlayerSession {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    FleetId: FleetId = null,
    GameSessionId: NonZeroAndMaxString = null,
    IpAddress: IpAddress = null,
    PlayerData: PlayerData = null,
    PlayerId: NonZeroAndMaxString = null,
    PlayerSessionId: PlayerSessionId = null,
    Port: js.UndefOr[PortNumber] = js.undefined,
    Status: PlayerSessionStatus = null,
    TerminationTime: Timestamp = null
  ): PlayerSession = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    if (GameSessionId != null) __obj.updateDynamic("GameSessionId")(GameSessionId)
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress)
    if (PlayerData != null) __obj.updateDynamic("PlayerData")(PlayerData)
    if (PlayerId != null) __obj.updateDynamic("PlayerId")(PlayerId)
    if (PlayerSessionId != null) __obj.updateDynamic("PlayerSessionId")(PlayerSessionId)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TerminationTime != null) __obj.updateDynamic("TerminationTime")(TerminationTime)
    __obj.asInstanceOf[PlayerSession]
  }
}

