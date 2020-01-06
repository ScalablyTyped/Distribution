package typings.awsDashSdk.clientsSsooidcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTokenResponse extends js.Object {
  /**
    * An opaque token to access AWS SSO resources assigned to a user.
    */
  var accessToken: js.UndefOr[AccessToken] = js.native
  /**
    * Indicates the time in seconds when an access token will expire.
    */
  var expiresIn: js.UndefOr[ExpirationInSeconds] = js.native
  /**
    * The identifier of the user that associated with the access token, if present.
    */
  var idToken: js.UndefOr[IdToken] = js.native
  /**
    * A token that, if present, can be used to refresh a previously issued access token that might have expired.
    */
  var refreshToken: js.UndefOr[RefreshToken] = js.native
  /**
    * Used to notify the client that the returned token is an access token. The supported type is BearerToken.
    */
  var tokenType: js.UndefOr[TokenType] = js.native
}

object CreateTokenResponse {
  @scala.inline
  def apply(
    accessToken: AccessToken = null,
    expiresIn: Int | Double = null,
    idToken: IdToken = null,
    refreshToken: RefreshToken = null,
    tokenType: TokenType = null
  ): CreateTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (tokenType != null) __obj.updateDynamic("tokenType")(tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTokenResponse]
  }
}

