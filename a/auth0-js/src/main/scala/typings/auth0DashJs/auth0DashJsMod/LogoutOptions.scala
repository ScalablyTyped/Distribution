package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogoutOptions extends js.Object {
  var clientID: js.UndefOr[String] = js.undefined
  var federated: js.UndefOr[Boolean] = js.undefined
  var returnTo: js.UndefOr[String] = js.undefined
}

object LogoutOptions {
  @scala.inline
  def apply(clientID: String = null, federated: js.UndefOr[Boolean] = js.undefined, returnTo: String = null): LogoutOptions = {
    val __obj = js.Dynamic.literal()
    if (clientID != null) __obj.updateDynamic("clientID")(clientID.asInstanceOf[js.Any])
    if (!js.isUndefined(federated)) __obj.updateDynamic("federated")(federated.asInstanceOf[js.Any])
    if (returnTo != null) __obj.updateDynamic("returnTo")(returnTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogoutOptions]
  }
}

