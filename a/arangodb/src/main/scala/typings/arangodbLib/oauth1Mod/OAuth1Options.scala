package typings
package arangodbLib.oauth1Mod

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

