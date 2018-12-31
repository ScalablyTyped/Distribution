package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagementClientOptions extends js.Object {
  var audience: js.UndefOr[java.lang.String] = js.undefined
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  var domain: java.lang.String
  var retry: js.UndefOr[RetryOptions] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var tokenProvider: js.UndefOr[TokenProvider] = js.undefined
}

