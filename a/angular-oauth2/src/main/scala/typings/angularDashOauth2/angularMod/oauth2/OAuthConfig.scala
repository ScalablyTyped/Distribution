package typings.angularDashOauth2.angularMod.oauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthConfig extends js.Object {
  var baseUrl: String
  var clientId: String
  var clientSecret: js.UndefOr[String] = js.undefined
  var grantPath: js.UndefOr[String] = js.undefined
  var revokePath: js.UndefOr[String] = js.undefined
}

object OAuthConfig {
  @scala.inline
  def apply(
    baseUrl: String,
    clientId: String,
    clientSecret: String = null,
    grantPath: String = null,
    revokePath: String = null
  ): OAuthConfig = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (grantPath != null) __obj.updateDynamic("grantPath")(grantPath.asInstanceOf[js.Any])
    if (revokePath != null) __obj.updateDynamic("revokePath")(revokePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthConfig]
  }
}

