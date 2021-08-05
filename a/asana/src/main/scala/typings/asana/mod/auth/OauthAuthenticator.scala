package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OauthAuthenticator
  extends StObject
     with Authenticator {
  
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
  
  @JSImport("asana", "auth.OauthAuthenticator")
  @js.native
  val ^ : OauthAuthenticatorStatic = js.native
  
  extension [Self <: OauthAuthenticator](x: Self) {
    
    inline def setAuthenticateRequest(value: OauthAuthenticatorRequest => OauthAuthenticatorRequest): Self = StObject.set(x, "authenticateRequest", js.Any.fromFunction1(value))
  }
}
