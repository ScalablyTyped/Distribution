package typings.asana.mod.auth

import org.scalablytyped.runtime.TopLevel
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
  def accessToken(code: String): Unit
  /**
    * @return {Promise} The access token, which will include a refresh token
    *     that can be stored in the future to create a client without going
    *     through the Oauth flow.
    * @param url
    * @return
    */
  def promptForCode(url: String): js.Any
}

@JSImport("asana", "auth.NativeFlow")
@js.native
object NativeFlow extends TopLevel[NativeFlowStatic]

