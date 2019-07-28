package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacedPlayerSession extends js.Object {
  /**
    * Unique identifier for a player that is associated with this player session.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Unique identifier for a player session.
    */
  var PlayerSessionId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.PlayerSessionId] = js.undefined
}

object PlacedPlayerSession {
  @scala.inline
  def apply(PlayerId: NonZeroAndMaxString = null, PlayerSessionId: PlayerSessionId = null): PlacedPlayerSession = {
    val __obj = js.Dynamic.literal()
    if (PlayerId != null) __obj.updateDynamic("PlayerId")(PlayerId)
    if (PlayerSessionId != null) __obj.updateDynamic("PlayerSessionId")(PlayerSessionId)
    __obj.asInstanceOf[PlacedPlayerSession]
  }
}

