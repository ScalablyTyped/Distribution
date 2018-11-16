package typings
package amazonDashCognitoDashAuthDashJsLib.amazonDashCognitoDashAuthDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amazon-cognito-auth-js", "CognitoAccessToken")
@js.native
class CognitoAccessToken protected () extends js.Object {
  /**
       * Constructs a new CognitoAccessToken object
       * @param AccessToken The JWT access token.
       */
  def this(AccessToken: java.lang.String) = this()
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
       * @returns the username from payload.
       */
  def getUsername(): java.lang.String = js.native
  /**
       * Sets new value for access token.
       * @param accessToken The JWT access token.
       */
  def setJwtToken(accessToken: java.lang.String): scala.Unit = js.native
}

