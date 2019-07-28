package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePlayerSessionsOutput extends js.Object {
  /**
    * Collection of player session objects created for the added players.
    */
  var PlayerSessions: js.UndefOr[PlayerSessionList] = js.undefined
}

object CreatePlayerSessionsOutput {
  @scala.inline
  def apply(PlayerSessions: PlayerSessionList = null): CreatePlayerSessionsOutput = {
    val __obj = js.Dynamic.literal()
    if (PlayerSessions != null) __obj.updateDynamic("PlayerSessions")(PlayerSessions)
    __obj.asInstanceOf[CreatePlayerSessionsOutput]
  }
}

