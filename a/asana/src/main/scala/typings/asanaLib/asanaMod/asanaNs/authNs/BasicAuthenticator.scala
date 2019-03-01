package typings
package asanaLib.asanaMod.asanaNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicAuthenticator extends Authenticator {
  /**
    * @param {Object} request The request to modify, for the `request` library.
    * @return {Object} The `request` parameter, modified to include authentication
    *     information using the stored credentials.
    * @param request
    * @return
    */
  def authenticateRequest(request: BasicAuthenticatorRequest): BasicAuthenticatorRequest
}

object BasicAuthenticator {
  @scala.inline
  def apply(
    authenticateRequest: js.Function1[BasicAuthenticatorRequest, BasicAuthenticatorRequest],
    establishCredentials: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    refreshCredentials: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Boolean]]
  ): BasicAuthenticator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authenticateRequest")(authenticateRequest)
    __obj.updateDynamic("establishCredentials")(establishCredentials)
    __obj.updateDynamic("refreshCredentials")(refreshCredentials)
    __obj.asInstanceOf[BasicAuthenticator]
  }
}

