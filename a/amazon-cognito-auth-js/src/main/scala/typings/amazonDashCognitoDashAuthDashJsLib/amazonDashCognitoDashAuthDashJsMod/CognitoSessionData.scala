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

