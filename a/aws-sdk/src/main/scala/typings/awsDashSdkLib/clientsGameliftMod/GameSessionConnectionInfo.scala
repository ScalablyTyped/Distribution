package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameSessionConnectionInfo extends js.Object {
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
    GameSessionArn: ArnStringModel = null,
    IpAddress: StringModel = null,
    MatchedPlayerSessions: MatchedPlayerSessionList = null,
    Port: js.UndefOr[PositiveInteger] = js.undefined
  ): GameSessionConnectionInfo = {
    val __obj = js.Dynamic.literal()
    if (GameSessionArn != null) __obj.updateDynamic("GameSessionArn")(GameSessionArn)
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress)
    if (MatchedPlayerSessions != null) __obj.updateDynamic("MatchedPlayerSessions")(MatchedPlayerSessions)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    __obj.asInstanceOf[GameSessionConnectionInfo]
  }
}

