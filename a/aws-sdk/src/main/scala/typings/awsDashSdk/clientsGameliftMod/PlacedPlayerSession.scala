package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacedPlayerSession extends js.Object {
  /**
    * A unique identifier for a player that is associated with this player session.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A unique identifier for a player session.
    */
  var PlayerSessionId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.PlayerSessionId] = js.native
}

object PlacedPlayerSession {
  @scala.inline
  def apply(PlayerId: NonZeroAndMaxString = null, PlayerSessionId: PlayerSessionId = null): PlacedPlayerSession = {
    val __obj = js.Dynamic.literal()
    if (PlayerId != null) __obj.updateDynamic("PlayerId")(PlayerId.asInstanceOf[js.Any])
    if (PlayerSessionId != null) __obj.updateDynamic("PlayerSessionId")(PlayerSessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacedPlayerSession]
  }
}

