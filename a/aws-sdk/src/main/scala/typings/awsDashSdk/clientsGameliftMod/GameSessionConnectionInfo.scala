package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameSessionConnectionInfo extends js.Object {
  var DnsName: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.DnsName] = js.undefined
  /**
    * Amazon Resource Name (ARN) that is assigned to a game session and uniquely identifies it.
    */
  var GameSessionArn: js.UndefOr[ArnStringModel] = js.undefined
  /**
    * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number.
    */
  var IpAddress: js.UndefOr[StringModel] = js.undefined
  /**
    * Collection of player session IDs, one for each player ID that was included in the original matchmaking request. 
    */
  var MatchedPlayerSessions: js.UndefOr[MatchedPlayerSessionList] = js.undefined
  /**
    * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number.
    */
  var Port: js.UndefOr[PositiveInteger] = js.undefined
}

object GameSessionConnectionInfo {
  @scala.inline
  def apply(
    DnsName: DnsName = null,
    GameSessionArn: ArnStringModel = null,
    IpAddress: StringModel = null,
    MatchedPlayerSessions: MatchedPlayerSessionList = null,
    Port: Int | scala.Double = null
  ): GameSessionConnectionInfo = {
    val __obj = js.Dynamic.literal()
    if (DnsName != null) __obj.updateDynamic("DnsName")(DnsName)
    if (GameSessionArn != null) __obj.updateDynamic("GameSessionArn")(GameSessionArn)
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress)
    if (MatchedPlayerSessions != null) __obj.updateDynamic("MatchedPlayerSessions")(MatchedPlayerSessions)
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSessionConnectionInfo]
  }
}

