package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogoutOptions extends js.Object {
  var clientID: js.UndefOr[java.lang.String] = js.undefined
  var federated: js.UndefOr[scala.Boolean] = js.undefined
  var returnTo: js.UndefOr[java.lang.String] = js.undefined
}

object LogoutOptions {
  @scala.inline
  def apply(
    clientID: java.lang.String = null,
    federated: js.UndefOr[scala.Boolean] = js.undefined,
    returnTo: java.lang.String = null
  ): LogoutOptions = {
    val __obj = js.Dynamic.literal()
    if (clientID != null) __obj.updateDynamic("clientID")(clientID)
    if (!js.isUndefined(federated)) __obj.updateDynamic("federated")(federated)
    if (returnTo != null) __obj.updateDynamic("returnTo")(returnTo)
    __obj.asInstanceOf[LogoutOptions]
  }
}

