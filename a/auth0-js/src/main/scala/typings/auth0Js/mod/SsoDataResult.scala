package typings.auth0Js.mod

import typings.auth0Js.anon.Name
import typings.auth0Js.auth0JsBooleans.`false`
import typings.auth0Js.auth0JsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.auth0Js.mod.SsoSessionFoundResult
  - typings.auth0Js.mod.SsoSessionNotFoundResult
*/
trait SsoDataResult extends js.Object

object SsoDataResult {
  @scala.inline
  def SsoSessionFoundResult(
    lastUsedClientID: String,
    lastUsedConnection: Name,
    lastUsedUserID: String,
    lastUsedUsername: String,
    sessionClients: js.Array[String],
    sso: `true`
  ): SsoDataResult = {
    val __obj = js.Dynamic.literal(lastUsedClientID = lastUsedClientID.asInstanceOf[js.Any], lastUsedConnection = lastUsedConnection.asInstanceOf[js.Any], lastUsedUserID = lastUsedUserID.asInstanceOf[js.Any], lastUsedUsername = lastUsedUsername.asInstanceOf[js.Any], sessionClients = sessionClients.asInstanceOf[js.Any], sso = sso.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsoDataResult]
  }
  @scala.inline
  def SsoSessionNotFoundResult(sso: `false`): SsoDataResult = {
    val __obj = js.Dynamic.literal(sso = sso.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsoDataResult]
  }
}

