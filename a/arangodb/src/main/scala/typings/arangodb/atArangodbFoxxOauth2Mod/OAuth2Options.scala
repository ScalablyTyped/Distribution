package typings.arangodb.atArangodbFoxxOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2Options extends js.Object {
  var activeUserEndpoint: js.UndefOr[String] = js.undefined
  var authEndpoint: String
  var clientId: String
  var clientSecret: String
  var refreshEndpoint: js.UndefOr[String] = js.undefined
  var tokenEndpoint: String
}

object OAuth2Options {
  @scala.inline
  def apply(
    authEndpoint: String,
    clientId: String,
    clientSecret: String,
    tokenEndpoint: String,
    activeUserEndpoint: String = null,
    refreshEndpoint: String = null
  ): OAuth2Options = {
    val __obj = js.Dynamic.literal(authEndpoint = authEndpoint, clientId = clientId, clientSecret = clientSecret, tokenEndpoint = tokenEndpoint)
    if (activeUserEndpoint != null) __obj.updateDynamic("activeUserEndpoint")(activeUserEndpoint)
    if (refreshEndpoint != null) __obj.updateDynamic("refreshEndpoint")(refreshEndpoint)
    __obj.asInstanceOf[OAuth2Options]
  }
}

