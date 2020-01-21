package typings.amazonCognitoAuthJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amazon-cognito-auth-js", "CognitoAuthSession")
@js.native
class CognitoAuthSession protected () extends js.Object {
  /**
    * Constructs a new CognitoUserSession object
    * @param sessionData The session's tokens, scopes, and state.
    */
  def this(sessionData: CognitoSessionData) = this()
  /**
    * @returns the session's access token
    */
  def getAccessToken(): CognitoAccessToken = js.native
  /**
    *  @returns the session's Id token
    */
  def getIdToken(): CognitoIdToken = js.native
  /**
    * @returns the session's refresh token
    */
  def getRefreshToken(): CognitoRefreshToken = js.native
  /**
    * @returns the session's state
    */
  def getState(): String = js.native
  /**
    * @returns the session's token scopes
    */
  def getTokenScopes(): CognitoTokenScopes = js.native
  /**
    * Checks to see if the session is still valid based on session expiry information found
    * in Access and Id Tokens and the current time
    * @returns if the session is still valid
    */
  def isValid(): Boolean = js.native
  /**
    * Set a new Access token
    * @param AccessToken The session's access token.
    */
  def setAccessToken(AccessToken: CognitoAccessToken): Unit = js.native
  /**
    * Set a new Id token
    * @param IdToken The session's Id token.
    */
  def setIdToken(IdToken: CognitoIdToken): Unit = js.native
  /**
    * Set a new Refresh token
    * @param RefreshToken The session's refresh token.
    */
  def setRefreshToken(RefreshToken: CognitoRefreshToken): Unit = js.native
  /**
    * Set new state
    * @param state The session's state.
    */
  def setState(State: String): Unit = js.native
  /**
    * Set new token scopes
    * @param tokenScopes The session's token scopes.
    */
  def setTokenScopes(tokenScopes: CognitoTokenScopes): Unit = js.native
}

