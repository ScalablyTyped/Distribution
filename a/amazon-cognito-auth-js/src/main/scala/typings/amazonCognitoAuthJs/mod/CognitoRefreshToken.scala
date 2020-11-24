package typings.amazonCognitoAuthJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("amazon-cognito-auth-js", "CognitoRefreshToken")
@js.native
class CognitoRefreshToken protected () extends js.Object {
  /**
    * Constructs a new CognitoRefreshToken object
    * @param RefreshToken The JWT refresh token.
    */
  def this(RefreshToken: String) = this()
  
  /**
    * @returns the record's token.
    */
  def getToken(): String = js.native
  
  /**
    * Sets new value for refresh token.
    * @param refreshToken The JWT refresh token.
    */
  def setToken(refreshToken: String): Unit = js.native
}
