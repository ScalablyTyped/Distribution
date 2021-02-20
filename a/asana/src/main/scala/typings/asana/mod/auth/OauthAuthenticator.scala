package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OauthAuthenticator extends Authenticator {
  
  /**
    * @param {Object} request The request to modify, for the `request` library.
    * @return {Object} The `request` parameter, modified to include authentication
    *     information using the stored credentials.
    * @param request
    * @return
    */
  def authenticateRequest(request: OauthAuthenticatorRequest): OauthAuthenticatorRequest = js.native
}
object OauthAuthenticator {
  
  @JSImport("asana", "auth.OauthAuthenticator")
  @js.native
  val ^ : OauthAuthenticatorStatic = js.native
  
  @scala.inline
  implicit class OauthAuthenticatorMutableBuilder[Self <: OauthAuthenticator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticateRequest(value: OauthAuthenticatorRequest => OauthAuthenticatorRequest): Self = StObject.set(x, "authenticateRequest", js.Any.fromFunction1(value))
  }
}
