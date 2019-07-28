package typings.arangodb.atArangodbFoxxOauth2Mod

import typings.arangodb.Anon_Granttype
import typings.arangodb.Anon_Responsetype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2Client extends js.Object {
  def exchangeGrantToken(code: String, redirect_uri: String): js.Any = js.native
  def exchangeGrantToken(code: String, redirect_uri: String, options: Anon_Granttype): js.Any = js.native
  def fetchActiveUser(access_token: String): js.Any = js.native
  def getAuthUrl(redirect_uri: String): String = js.native
  def getAuthUrl(redirect_uri: String, options: Anon_Responsetype): String = js.native
}

