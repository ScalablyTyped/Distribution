package typings
package amazonDashCognitoDashAuthDashJsLib.amazonDashCognitoDashAuthDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amazon-cognito-auth-js", "CognitoIdToken")
@js.native
class CognitoIdToken protected () extends js.Object {
  /**
    * Constructs a new CognitoIdToken object
    * @param IdToken The JWT Id token
    */
  def this(IdToken: java.lang.String) = this()
  /**
    * @returns the token's payload.
    */
  def decodePayload(): js.Object = js.native
  /**
    * @returns the token's expiration (exp member).
    */
  def getExpiration(): scala.Double = js.native
  /**
    * @returns the record's token.
    */
  def getJwtToken(): java.lang.String = js.native
  /**
    * Sets new value for id token.
    * @param idToken The JWT Id token
    */
  def setJwtToken(idToken: java.lang.String): scala.Unit = js.native
}

