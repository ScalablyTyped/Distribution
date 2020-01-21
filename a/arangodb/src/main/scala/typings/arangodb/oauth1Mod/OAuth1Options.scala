package typings.arangodb.oauth1Mod

import typings.arangodb.arangodbStrings.PLAINTEXT
import typings.arangodb.arangodbStrings.`HMAC-SHA1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth1Options extends js.Object {
  var accessTokenEndpoint: String
  var activeUserEndpoint: js.UndefOr[String] = js.undefined
  var authEndpoint: String
  var clientId: String
  var clientSecret: String
  var requestTokenEndpoint: String
  var signatureMethod: js.UndefOr[`HMAC-SHA1` | PLAINTEXT] = js.undefined
}

object OAuth1Options {
  @scala.inline
  def apply(
    accessTokenEndpoint: String,
    authEndpoint: String,
    clientId: String,
    clientSecret: String,
    requestTokenEndpoint: String,
    activeUserEndpoint: String = null,
    signatureMethod: `HMAC-SHA1` | PLAINTEXT = null
  ): OAuth1Options = {
    val __obj = js.Dynamic.literal(accessTokenEndpoint = accessTokenEndpoint.asInstanceOf[js.Any], authEndpoint = authEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], requestTokenEndpoint = requestTokenEndpoint.asInstanceOf[js.Any])
    if (activeUserEndpoint != null) __obj.updateDynamic("activeUserEndpoint")(activeUserEndpoint.asInstanceOf[js.Any])
    if (signatureMethod != null) __obj.updateDynamic("signatureMethod")(signatureMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth1Options]
  }
}

