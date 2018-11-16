package typings
package arangodbLib.oauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2Client extends js.Object {
  def exchangeGrantToken(code: java.lang.String, redirect_uri: java.lang.String): js.Any = js.native
  def exchangeGrantToken(code: java.lang.String, redirect_uri: java.lang.String, options: arangodbLib.Anon_Granttype): js.Any = js.native
  def fetchActiveUser(access_token: java.lang.String): js.Any = js.native
  def getAuthUrl(redirect_uri: java.lang.String): java.lang.String = js.native
  def getAuthUrl(redirect_uri: java.lang.String, options: arangodbLib.Anon_Responsetype): java.lang.String = js.native
}

