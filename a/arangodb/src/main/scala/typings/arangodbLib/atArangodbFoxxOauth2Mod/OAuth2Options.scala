package typings
package arangodbLib.atArangodbFoxxOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2Options extends js.Object {
  var activeUserEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var authEndpoint: java.lang.String
  var clientId: java.lang.String
  var clientSecret: java.lang.String
  var refreshEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var tokenEndpoint: java.lang.String
}

object OAuth2Options {
  @scala.inline
  def apply(
    authEndpoint: java.lang.String,
    clientId: java.lang.String,
    clientSecret: java.lang.String,
    tokenEndpoint: java.lang.String,
    activeUserEndpoint: java.lang.String = null,
    refreshEndpoint: java.lang.String = null
  ): OAuth2Options = {
    val __obj = js.Dynamic.literal(authEndpoint = authEndpoint, clientId = clientId, clientSecret = clientSecret, tokenEndpoint = tokenEndpoint)
    if (activeUserEndpoint != null) __obj.updateDynamic("activeUserEndpoint")(activeUserEndpoint)
    if (refreshEndpoint != null) __obj.updateDynamic("refreshEndpoint")(refreshEndpoint)
    __obj.asInstanceOf[OAuth2Options]
  }
}

