package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0DelegationToken extends js.Object {
  /** The length of time in seconds the token is valid for. */
  var expiresIn: Double
  /** The JWT for delegated access.  */
  var idToken: String
  /** The type of token being returned. Possible values: "Bearer"  */
  var tokenType: String
}

object Auth0DelegationToken {
  @scala.inline
  def apply(expiresIn: Double, idToken: String, tokenType: String): Auth0DelegationToken = {
    val __obj = js.Dynamic.literal(expiresIn = expiresIn, idToken = idToken, tokenType = tokenType)
  
    __obj.asInstanceOf[Auth0DelegationToken]
  }
}

