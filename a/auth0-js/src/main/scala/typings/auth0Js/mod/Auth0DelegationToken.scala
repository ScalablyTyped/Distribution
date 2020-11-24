package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0DelegationToken extends js.Object {
  
  /** The length of time in seconds the token is valid for. */
  var expiresIn: Double = js.native
  
  /** The JWT for delegated access.  */
  var idToken: String = js.native
  
  /** The type of token being returned. Possible values: "Bearer"  */
  var tokenType: String = js.native
}
object Auth0DelegationToken {
  
  @scala.inline
  def apply(expiresIn: Double, idToken: String, tokenType: String): Auth0DelegationToken = {
    val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0DelegationToken]
  }
  
  @scala.inline
  implicit class Auth0DelegationTokenOps[Self <: Auth0DelegationToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExpiresIn(value: Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenType(value: String): Self = this.set("tokenType", value.asInstanceOf[js.Any])
  }
}
