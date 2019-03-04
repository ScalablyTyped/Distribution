package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0DelegationToken extends js.Object {
  /** The length of time in seconds the token is valid for. */
  var expiresIn: scala.Double
  /** The JWT for delegated access.  */
  var idToken: java.lang.String
  /** The type of token being returned. Possible values: "Bearer"  */
  var tokenType: java.lang.String
}

object Auth0DelegationToken {
  @scala.inline
  def apply(expiresIn: scala.Double, idToken: java.lang.String, tokenType: java.lang.String): Auth0DelegationToken = {
    val __obj = js.Dynamic.literal(expiresIn = expiresIn, idToken = idToken, tokenType = tokenType)
  
    __obj.asInstanceOf[Auth0DelegationToken]
  }
}

