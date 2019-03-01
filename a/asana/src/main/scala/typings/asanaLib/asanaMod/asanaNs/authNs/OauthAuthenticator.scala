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
    authenticateRequest: js.Function1[OauthAuthenticatorRequest, OauthAuthenticatorRequest],
    establishCredentials: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    refreshCredentials: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Boolean]]
  ): OauthAuthenticator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authenticateRequest")(authenticateRequest)
    __obj.updateDynamic("establishCredentials")(establishCredentials)
    __obj.updateDynamic("refreshCredentials")(refreshCredentials)
    __obj.asInstanceOf[OauthAuthenticator]
  }
}

