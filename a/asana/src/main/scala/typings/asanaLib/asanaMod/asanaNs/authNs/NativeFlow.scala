package typings
package asanaLib.asanaMod.asanaNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeFlow extends Flow {
  /**
    * @param {String} code An authorization code obtained via `asanaAuthorizeUrl`.
    * @return {Promise<Object>} The token, which will include the `access_token`
    *     used for API access, as well as a `refresh_token` which can be stored
    *     to get a new access token without going through the flow again.
    * @param code
    */
  def accessToken(code: java.lang.String): scala.Unit
  /**
    * @return {Promise} The access token, which will include a refresh token
    *     that can be stored in the future to create a client without going
    *     through the Oauth flow.
    * @param url
    * @return
    */
  def promptForCode(url: java.lang.String): js.Any
}

object NativeFlow {
  @scala.inline
  def apply(
    accessToken: js.Function1[java.lang.String, scala.Unit],
    authorizeUrl: js.Function0[java.lang.String],
    promptForCode: js.Function1[java.lang.String, js.Any],
    run: js.Function0[scala.Unit]
  ): NativeFlow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessToken")(accessToken)
    __obj.updateDynamic("authorizeUrl")(authorizeUrl)
    __obj.updateDynamic("promptForCode")(promptForCode)
    __obj.updateDynamic("run")(run)
    __obj.asInstanceOf[NativeFlow]
  }
}

