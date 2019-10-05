package typings.asana.asanaMod.auth

import org.scalablytyped.runtime.TopLevel
import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  var asanaBaseUrl: String = js.native
  var scope: String = js.native
  /**
    * @param {String} code An authorization code obtained via `asanaAuthorizeUrl`.
    * @param {Object} options  Overrides to the app's defaults
    * @option {String} asanaBaseUrl
    * @option {String} redirectUri
    * @return {Promise<Object>} The token, which will include the `access_token`
    *     used for API access, as well as a `refresh_token` which can be stored
    *     to get a new access token without going through the flow again.
    * @param code
    * @param options
    * @return
    */
  def accessTokenFromCode(code: String): ^[Credentials] = js.native
  def accessTokenFromCode(code: String, options: AsanaAuthorizeUrlOptions): ^[Credentials] = js.native
  /**
    * @param {String} refreshToken A refresh token obtained via Oauth.
    * @param {Object} options Overrides to the app's defaults
    * @option {String} asanaBaseUrl
    * @option {String} redirectUri
    * @return {Promise<Object>} The token, which will include the `access_token`
    *     used for API access.
    * @param refreshToken
    * @param options
    * @return
    */
  def accessTokenFromRefreshToken(refreshToken: String, options: AsanaAuthorizeUrlOptions): ^[Credentials] = js.native
  /**
    * @param {Object} options  Overrides to the app's defaults
    * @option {String} asanaBaseUrl
    * @option {String} redirectUri
    * @returns {String} The URL used to authorize a user for the app.
    * @param options
    * @return
    */
  def asanaAuthorizeUrl(): String = js.native
  def asanaAuthorizeUrl(options: AsanaAuthorizeUrlOptions): String = js.native
  /**
    * @param {Object} options  Overrides to the app's defaults
    * @option {String} asanaBaseUrl
    * @option {String} redirectUri
    * @returns {String} The URL used to acquire an access token.
    * @param options
    * @return
    */
  def asanaTokenUrl(): String = js.native
  def asanaTokenUrl(options: AsanaAuthorizeUrlOptions): String = js.native
}

@JSImport("asana", "auth.App")
@js.native
object App extends TopLevel[AppStatic]

