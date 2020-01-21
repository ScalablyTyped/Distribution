package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestPresenceParams extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var connectionId: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
}

object RestPresenceParams {
  @scala.inline
  def apply(clientId: String = null, connectionId: String = null, limit: Int | Double = null): RestPresenceParams = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestPresenceParams]
  }
}

