package typings
package amazonDashCognitoDashAuthDashJsLib.amazonDashCognitoDashAuthDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amazon-cognito-auth-js", "CognitoTokenScopes")
@js.native
class CognitoTokenScopes protected () extends js.Object {
  /**
    * Constructs a new CognitoTokenScopes object
    * @param TokenScopesArray The token scopes
    */
  def this(TokenScopesArray: js.Array[java.lang.String]) = this()
  /**
    * @returns the token scopes.
    */
  def getScopes(): js.Array[java.lang.String] = js.native
  /**
    * Sets new value for token scopes.
    * @param tokenScopes The token scopes
    */
  def setTokenScopes(tokenScopes: js.Array[java.lang.String]): scala.Unit = js.native
}

