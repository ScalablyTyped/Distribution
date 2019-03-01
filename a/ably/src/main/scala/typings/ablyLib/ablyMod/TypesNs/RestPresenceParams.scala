package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestPresenceParams extends js.Object {
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var connectionId: js.UndefOr[java.lang.String] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
}

object RestPresenceParams {
  @scala.inline
  def apply(
    clientId: java.lang.String = null,
    connectionId: java.lang.String = null,
    limit: scala.Int | scala.Double = null
  ): RestPresenceParams = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestPresenceParams]
  }
}

