package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoIdentityProvider extends js.Object {
  /**
    * The client ID for the Amazon Cognito user pool.
    */
  var ClientId: js.UndefOr[CognitoIdentityProviderClientId] = js.undefined
  /**
    * The provider name for an Amazon Cognito user pool. For example, cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789.
    */
  var ProviderName: js.UndefOr[CognitoIdentityProviderName] = js.undefined
  /**
    * TRUE if server-side token validation is enabled for the identity provider’s token. Once you set ServerSideTokenCheck to TRUE for an identity pool, that identity pool will check with the integrated user pools to make sure that the user has not been globally signed out or deleted before the identity pool provides an OIDC token or AWS credentials for the user. If the user is signed out or deleted, the identity pool will return a 400 Not Authorized error.
    */
  var ServerSideTokenCheck: js.UndefOr[CognitoIdentityProviderTokenCheck] = js.undefined
}

object CognitoIdentityProvider {
  @scala.inline
  def apply(
    ClientId: CognitoIdentityProviderClientId = null,
    ProviderName: CognitoIdentityProviderName = null,
    ServerSideTokenCheck: js.UndefOr[Boolean] = js.undefined
  ): CognitoIdentityProvider = {
    val __obj = js.Dynamic.literal()
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId)
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName)
    if (!js.isUndefined(ServerSideTokenCheck)) __obj.updateDynamic("ServerSideTokenCheck")(ServerSideTokenCheck)
    __obj.asInstanceOf[CognitoIdentityProvider]
  }
}

