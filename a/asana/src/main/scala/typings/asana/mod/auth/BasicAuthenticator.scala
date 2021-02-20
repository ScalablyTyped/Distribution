package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicAuthenticator extends Authenticator {
  
  /**
    * @param {Object} request The request to modify, for the `request` library.
    * @return {Object} The `request` parameter, modified to include authentication
    *     information using the stored credentials.
    * @param request
    * @return
    */
  def authenticateRequest(request: BasicAuthenticatorRequest): BasicAuthenticatorRequest = js.native
}
object BasicAuthenticator {
  
  @JSImport("asana", "auth.BasicAuthenticator")
  @js.native
  val ^ : BasicAuthenticatorStatic = js.native
  
  @scala.inline
  implicit class BasicAuthenticatorMutableBuilder[Self <: BasicAuthenticator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticateRequest(value: BasicAuthenticatorRequest => BasicAuthenticatorRequest): Self = StObject.set(x, "authenticateRequest", js.Any.fromFunction1(value))
  }
}
