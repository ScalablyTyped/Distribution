package typings
package asanaLib.asanaMod.asanaNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  var asanaBaseUrl: java.lang.String = js.native
  var scope: java.lang.String = js.native
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
  def accessTokenFromCode(code: java.lang.String): bluebirdLib.bluebirdMod.namespaced[Credentials] = js.native
  def accessTokenFromCode(code: java.lang.String, options: AsanaAuthorizeUrlOptions): bluebirdLib.bluebirdMod.namespaced[Credentials] = js.native
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
  def accessTokenFromRefreshToken(refreshToken: java.lang.String, options: AsanaAuthorizeUrlOptions): bluebirdLib.bluebirdMod.namespaced[Credentials] = js.native
  /**
    * @param {Object} options  Overrides to the app's defaults
    * @option {String} asanaBaseUrl
    * @option {String} redirectUri
    * @returns {String} The URL used to authorize a user for the app.
    * @param options
    * @return
    */
  def asanaAuthorizeUrl(): java.lang.String = js.native
  def asanaAuthorizeUrl(options: AsanaAuthorizeUrlOptions): java.lang.String = js.native
  /**
    * @param {Object} options  Overrides to the app's defaults
    * @option {String} asanaBaseUrl
    * @option {String} redirectUri
    * @returns {String} The URL used to acquire an access token.
    * @param options
    * @return
    */
  def asanaTokenUrl(): java.lang.String = js.native
  def asanaTokenUrl(options: AsanaAuthorizeUrlOptions): java.lang.String = js.native
}

