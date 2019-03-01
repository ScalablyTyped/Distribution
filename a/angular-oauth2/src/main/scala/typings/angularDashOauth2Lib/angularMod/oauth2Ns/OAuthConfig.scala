package typings
package angularDashOauth2Lib.angularMod.oauth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthConfig extends js.Object {
  var baseUrl: java.lang.String
  var clientId: java.lang.String
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  var grantPath: js.UndefOr[java.lang.String] = js.undefined
  var revokePath: js.UndefOr[java.lang.String] = js.undefined
}

object OAuthConfig {
  @scala.inline
  def apply(
    baseUrl: java.lang.String,
    clientId: java.lang.String,
    clientSecret: java.lang.String = null,
    grantPath: java.lang.String = null,
    revokePath: java.lang.String = null
  ): OAuthConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseUrl")(baseUrl)
    __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (grantPath != null) __obj.updateDynamic("grantPath")(grantPath)
    if (revokePath != null) __obj.updateDynamic("revokePath")(revokePath)
    __obj.asInstanceOf[OAuthConfig]
  }
}

