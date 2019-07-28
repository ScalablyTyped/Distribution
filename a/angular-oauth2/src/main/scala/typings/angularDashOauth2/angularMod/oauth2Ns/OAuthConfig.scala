package typings.angularDashOauth2.angularMod.oauth2Ns

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
    val __obj = js.Dynamic.literal(baseUrl = baseUrl, clientId = clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (grantPath != null) __obj.updateDynamic("grantPath")(grantPath)
    if (revokePath != null) __obj.updateDynamic("revokePath")(revokePath)
    __obj.asInstanceOf[OAuthConfig]
  }
}

