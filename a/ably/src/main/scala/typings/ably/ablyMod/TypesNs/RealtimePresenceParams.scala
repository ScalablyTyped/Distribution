package typings.ably.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimePresenceParams extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var connectionId: js.UndefOr[String] = js.undefined
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}

object RealtimePresenceParams {
  @scala.inline
  def apply(
    clientId: String = null,
    connectionId: String = null,
    waitForSync: js.UndefOr[Boolean] = js.undefined
  ): RealtimePresenceParams = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId)
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync)
    __obj.asInstanceOf[RealtimePresenceParams]
  }
}

