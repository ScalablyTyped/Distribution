package typings
package arangodbLib.atArangodbFoxxOauth1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth1Options extends js.Object {
  var accessTokenEndpoint: java.lang.String
  var activeUserEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var authEndpoint: java.lang.String
  var clientId: java.lang.String
  var clientSecret: java.lang.String
  var requestTokenEndpoint: java.lang.String
  var signatureMethod: js.UndefOr[
    arangodbLib.arangodbLibStrings.`HMAC-SHA1` | arangodbLib.arangodbLibStrings.PLAINTEXT
  ] = js.undefined
}

object OAuth1Options {
  @scala.inline
  def apply(
    accessTokenEndpoint: java.lang.String,
    authEndpoint: java.lang.String,
    clientId: java.lang.String,
    clientSecret: java.lang.String,
    requestTokenEndpoint: java.lang.String,
    activeUserEndpoint: java.lang.String = null,
    signatureMethod: arangodbLib.arangodbLibStrings.`HMAC-SHA1` | arangodbLib.arangodbLibStrings.PLAINTEXT = null
  ): OAuth1Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessTokenEndpoint")(accessTokenEndpoint)
    __obj.updateDynamic("authEndpoint")(authEndpoint)
    __obj.updateDynamic("clientId")(clientId)
    __obj.updateDynamic("clientSecret")(clientSecret)
    __obj.updateDynamic("requestTokenEndpoint")(requestTokenEndpoint)
    if (activeUserEndpoint != null) __obj.updateDynamic("activeUserEndpoint")(activeUserEndpoint)
    if (signatureMethod != null) __obj.updateDynamic("signatureMethod")(signatureMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth1Options]
  }
}

