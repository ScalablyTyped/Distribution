package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AuthResult extends js.Object {
  var accessToken: java.lang.String
  var appState: js.UndefOr[js.Any] = js.undefined
  var expiresIn: scala.Double
  var idToken: java.lang.String
  var idTokenPayload: Anon_Exp
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var state: java.lang.String
  var tokenType: java.lang.String
}

