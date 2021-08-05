package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicAuthenticator
  extends StObject
     with Authenticator {
  
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
  
  @JSImport("asana", "auth.BasicAuthenticator")
  @js.native
  val ^ : BasicAuthenticatorStatic = js.native
  
  extension [Self <: BasicAuthenticator](x: Self) {
    
    inline def setAuthenticateRequest(value: BasicAuthenticatorRequest => BasicAuthenticatorRequest): Self = StObject.set(x, "authenticateRequest", js.Any.fromFunction1(value))
  }
}
