package typings
package amazonDashCognitoDashAuthDashJsLib.amazonDashCognitoDashAuthDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoSessionData extends js.Object {
  /**
    * The session's access token.
    */
  var AccessToken: js.UndefOr[CognitoAccessToken] = js.undefined
  /**
    * The session's Id token.
    */
  var IdToken: js.UndefOr[CognitoIdToken] = js.undefined
  /**
    * The session's refresh token.
    */
  var RefreshToken: js.UndefOr[CognitoRefreshToken] = js.undefined
  /**
    * The session's state.
    */
  var State: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The session's token scopes.
    */
  var TokenScopes: js.UndefOr[CognitoTokenScopes] = js.undefined
}

object CognitoSessionData {
  @scala.inline
  def apply(
    AccessToken: CognitoAccessToken = null,
    IdToken: CognitoIdToken = null,
    RefreshToken: CognitoRefreshToken = null,
    State: java.lang.String = null,
    TokenScopes: CognitoTokenScopes = null
  ): CognitoSessionData = {
    val __obj = js.Dynamic.literal()
    if (AccessToken != null) __obj.updateDynamic("AccessToken")(AccessToken)
    if (IdToken != null) __obj.updateDynamic("IdToken")(IdToken)
    if (RefreshToken != null) __obj.updateDynamic("RefreshToken")(RefreshToken)
    if (State != null) __obj.updateDynamic("State")(State)
    if (TokenScopes != null) __obj.updateDynamic("TokenScopes")(TokenScopes)
    __obj.asInstanceOf[CognitoSessionData]
  }
}

