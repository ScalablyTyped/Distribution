package typings.arangodb.oauth2Mod

import typings.arangodb.anon.Granttype
import typings.arangodb.anon.Responsetype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth2Client extends js.Object {
  
  def exchangeGrantToken(code: String, redirect_uri: String): js.Any = js.native
  def exchangeGrantToken(code: String, redirect_uri: String, options: Granttype): js.Any = js.native
  
  def fetchActiveUser(access_token: String): js.Any = js.native
  
  def getAuthUrl(redirect_uri: String): String = js.native
  def getAuthUrl(redirect_uri: String, options: Responsetype): String = js.native
}
