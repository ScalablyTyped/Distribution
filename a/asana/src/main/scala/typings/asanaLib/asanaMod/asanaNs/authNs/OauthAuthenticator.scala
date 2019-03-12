package typings
package asanaLib.asanaMod.asanaNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthenticator extends Authenticator {
  /**
    * @param {Object} request The request to modify, for the `request` library.
    * @return {Object} The `request` parameter, modified to include authentication
    *     information using the stored credentials.
    * @param request
    * @return
    */
  def authenticateRequest(request: OauthAuthenticatorRequest): OauthAuthenticatorRequest
}

object OauthAuthenticator {
  @scala.inline
  def apply(
    authenticateRequest: OauthAuthenticatorRequest => OauthAuthenticatorRequest,
    establishCredentials: () => bluebirdLib.bluebirdMod.namespaced[scala.Unit],
    refreshCredentials: () => bluebirdLib.bluebirdMod.namespaced[scala.Boolean]
  ): OauthAuthenticator = {
    val __obj = js.Dynamic.literal(authenticateRequest = js.Any.fromFunction1(authenticateRequest), establishCredentials = js.Any.fromFunction0(establishCredentials), refreshCredentials = js.Any.fromFunction0(refreshCredentials))
  
    __obj.asInstanceOf[OauthAuthenticator]
  }
}

