package typings.auth0Js.mod

import typings.auth0Js.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.auth0Js.mod.SsoSessionFoundResult
  - typings.auth0Js.mod.SsoSessionNotFoundResult
*/
trait SsoDataResult extends StObject
object SsoDataResult {
  
  @scala.inline
  def SsoSessionFoundResult(
    lastUsedClientID: String,
    lastUsedConnection: Name,
    lastUsedUserID: String,
    lastUsedUsername: String,
    sessionClients: js.Array[String]
  ): typings.auth0Js.mod.SsoSessionFoundResult = {
    val __obj = js.Dynamic.literal(lastUsedClientID = lastUsedClientID.asInstanceOf[js.Any], lastUsedConnection = lastUsedConnection.asInstanceOf[js.Any], lastUsedUserID = lastUsedUserID.asInstanceOf[js.Any], lastUsedUsername = lastUsedUsername.asInstanceOf[js.Any], sessionClients = sessionClients.asInstanceOf[js.Any], sso = true)
    __obj.asInstanceOf[typings.auth0Js.mod.SsoSessionFoundResult]
  }
  
  @scala.inline
  def SsoSessionNotFoundResult(): typings.auth0Js.mod.SsoSessionNotFoundResult = {
    val __obj = js.Dynamic.literal(sso = false)
    __obj.asInstanceOf[typings.auth0Js.mod.SsoSessionNotFoundResult]
  }
}
