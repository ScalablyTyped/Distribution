package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationResultType extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.undefined
  /**
    * The expiration period of the authentication result in seconds.
    */
  var ExpiresIn: js.UndefOr[IntegerType] = js.undefined
  /**
    * The ID token.
    */
  var IdToken: js.UndefOr[TokenModelType] = js.undefined
  /**
    * The new device metadata from an authentication result.
    */
  var NewDeviceMetadata: js.UndefOr[NewDeviceMetadataType] = js.undefined
  /**
    * The refresh token.
    */
  var RefreshToken: js.UndefOr[TokenModelType] = js.undefined
  /**
    * The token type.
    */
  var TokenType: js.UndefOr[StringType] = js.undefined
}

object AuthenticationResultType {
  @scala.inline
  def apply(
    AccessToken: TokenModelType = null,
    ExpiresIn: js.UndefOr[IntegerType] = js.undefined,
    IdToken: TokenModelType = null,
    NewDeviceMetadata: NewDeviceMetadataType = null,
    RefreshToken: TokenModelType = null,
    TokenType: StringType = null
  ): AuthenticationResultType = {
    val __obj = js.Dynamic.literal()
    if (AccessToken != null) __obj.updateDynamic("AccessToken")(AccessToken)
    if (!js.isUndefined(ExpiresIn)) __obj.updateDynamic("ExpiresIn")(ExpiresIn)
    if (IdToken != null) __obj.updateDynamic("IdToken")(IdToken)
    if (NewDeviceMetadata != null) __obj.updateDynamic("NewDeviceMetadata")(NewDeviceMetadata)
    if (RefreshToken != null) __obj.updateDynamic("RefreshToken")(RefreshToken)
    if (TokenType != null) __obj.updateDynamic("TokenType")(TokenType)
    __obj.asInstanceOf[AuthenticationResultType]
  }
}

