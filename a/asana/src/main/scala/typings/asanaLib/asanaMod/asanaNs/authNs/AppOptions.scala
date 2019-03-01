package typings
package asanaLib.asanaMod.asanaNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppOptions extends AsanaAuthorizeUrlOptions {
  var clientId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object AppOptions {
  @scala.inline
  def apply(
    asanaBaseUrl: java.lang.String = null,
    clientId: java.lang.String | scala.Double = null,
    clientSecret: java.lang.String = null,
    redirectUri: java.lang.String = null,
    scope: java.lang.String = null
  ): AppOptions = {
    val __obj = js.Dynamic.literal()
    if (asanaBaseUrl != null) __obj.updateDynamic("asanaBaseUrl")(asanaBaseUrl)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[AppOptions]
  }
}

