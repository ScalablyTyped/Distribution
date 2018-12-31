package typings
package amazonDashCognitoDashAuthDashJsLib.amazonDashCognitoDashAuthDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amazon-cognito-auth-js", "CognitoRefreshToken")
@js.native
class CognitoRefreshToken protected () extends js.Object {
  /**
    * Constructs a new CognitoRefreshToken object
    * @param RefreshToken The JWT refresh token.
    */
  def this(RefreshToken: java.lang.String) = this()
  /**
    * @returns the record's token.
    */
  def getToken(): java.lang.String = js.native
  /**
    * Sets new value for refresh token.
    * @param refreshToken The JWT refresh token.
    */
  def setToken(refreshToken: java.lang.String): scala.Unit = js.native
}

