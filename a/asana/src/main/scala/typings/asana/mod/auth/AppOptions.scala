package typings.asana.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppOptions extends AsanaAuthorizeUrlOptions {
  var clientId: js.UndefOr[String | Double] = js.undefined
  var clientSecret: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
}

object AppOptions {
  @scala.inline
  def apply(
    asanaBaseUrl: String = null,
    clientId: String | Double = null,
    clientSecret: String = null,
    redirectUri: String = null,
    scope: String = null
  ): AppOptions = {
    val __obj = js.Dynamic.literal()
    if (asanaBaseUrl != null) __obj.updateDynamic("asanaBaseUrl")(asanaBaseUrl.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppOptions]
  }
}

