package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchedPlayerSession extends js.Object {
  /**
    * Unique identifier for a player 
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Unique identifier for a player session
    */
  var PlayerSessionId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.PlayerSessionId] = js.undefined
}

object MatchedPlayerSession {
  @scala.inline
  def apply(PlayerId: NonZeroAndMaxString = null, PlayerSessionId: PlayerSessionId = null): MatchedPlayerSession = {
    val __obj = js.Dynamic.literal()
    if (PlayerId != null) __obj.updateDynamic("PlayerId")(PlayerId)
    if (PlayerSessionId != null) __obj.updateDynamic("PlayerSessionId")(PlayerSessionId)
    __obj.asInstanceOf[MatchedPlayerSession]
  }
}

