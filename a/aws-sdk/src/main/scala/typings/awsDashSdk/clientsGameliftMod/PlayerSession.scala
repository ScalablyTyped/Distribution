package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerSession extends js.Object {
  /**
    * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * DNS identifier assigned to the instance that is running the game session. Values have the following format:   TLS-enabled fleets: &lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com.   Non-TLS-enabled fleets: ec2-&lt;unique identifier&gt;.compute.amazonaws.com. (See Amazon EC2 Instance IP Addressing.)   When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP address.
    */
  var DnsName: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.DnsName] = js.native
  /**
    *  The Amazon Resource Name (ARN) associated with the GameLift fleet that the player's game session is running on. 
    */
  var FleetArn: js.UndefOr[ArnStringModel] = js.native
  /**
    * A unique identifier for a fleet that the player's game session is running on.
    */
  var FleetId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.FleetId] = js.native
  /**
    * A unique identifier for the game session that the player session is connected to.
    */
  var GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * IP address of the instance that is running the game session. When connecting to a Amazon GameLift game server, a client needs to reference an IP address (or DNS name) and port number.
    */
  var IpAddress: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.IpAddress] = js.native
  /**
    * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game. 
    */
  var PlayerData: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.PlayerData] = js.native
  /**
    * A unique identifier for a player that is associated with this player session.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A unique identifier for a player session.
    */
  var PlayerSessionId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.PlayerSessionId] = js.native
  /**
    * Port number for the game session. To connect to a Amazon GameLift server process, an app needs both the IP address and port number.
    */
  var Port: js.UndefOr[PortNumber] = js.native
  /**
    * Current status of the player session. Possible player session statuses include the following:    RESERVED -- The player session request has been received, but the player has not yet connected to the server process and/or been validated.     ACTIVE -- The player has been validated by the server process and is currently connected.    COMPLETED -- The player connection has been dropped.    TIMEDOUT -- A player session request was received, but the player did not connect and/or was not validated within the timeout limit (60 seconds).  
    */
  var Status: js.UndefOr[PlayerSessionStatus] = js.native
  /**
    * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var TerminationTime: js.UndefOr[Timestamp] = js.native
}

object PlayerSession {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    DnsName: DnsName = null,
    FleetArn: ArnStringModel = null,
    FleetId: FleetId = null,
    GameSessionId: NonZeroAndMaxString = null,
    IpAddress: IpAddress = null,
    PlayerData: PlayerData = null,
    PlayerId: NonZeroAndMaxString = null,
    PlayerSessionId: PlayerSessionId = null,
    Port: Int | scala.Double = null,
    Status: PlayerSessionStatus = null,
    TerminationTime: Timestamp = null
  ): PlayerSession = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DnsName != null) __obj.updateDynamic("DnsName")(DnsName.asInstanceOf[js.Any])
    if (FleetArn != null) __obj.updateDynamic("FleetArn")(FleetArn.asInstanceOf[js.Any])
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    if (GameSessionId != null) __obj.updateDynamic("GameSessionId")(GameSessionId.asInstanceOf[js.Any])
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress.asInstanceOf[js.Any])
    if (PlayerData != null) __obj.updateDynamic("PlayerData")(PlayerData.asInstanceOf[js.Any])
    if (PlayerId != null) __obj.updateDynamic("PlayerId")(PlayerId.asInstanceOf[js.Any])
    if (PlayerSessionId != null) __obj.updateDynamic("PlayerSessionId")(PlayerSessionId.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TerminationTime != null) __obj.updateDynamic("TerminationTime")(TerminationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerSession]
  }
}

