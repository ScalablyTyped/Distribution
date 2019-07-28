package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateAuthRequest extends js.Object {
  /**
    * The Amazon Pinpoint analytics metadata for collecting metrics for InitiateAuth calls.
    */
  var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
  /**
    * The authentication flow for this call to execute. The API action will depend on this value. For example:     REFRESH_TOKEN_AUTH will take in a valid refresh token and return new tokens.    USER_SRP_AUTH will take in USERNAME and SRP_A and return the SRP variables to be used for next challenge execution.    USER_PASSWORD_AUTH will take in USERNAME and PASSWORD and return the next challenge or tokens.   Valid values include:    USER_SRP_AUTH: Authentication flow for the Secure Remote Password (SRP) protocol.    REFRESH_TOKEN_AUTH/REFRESH_TOKEN: Authentication flow for refreshing the access token and ID token by supplying a valid refresh token.    CUSTOM_AUTH: Custom authentication flow.    USER_PASSWORD_AUTH: Non-SRP authentication flow; USERNAME and PASSWORD are passed directly. If a user migration Lambda trigger is set, this flow will invoke the user migration Lambda if the USERNAME is not found in the user pool.     ADMIN_NO_SRP_AUTH is not a valid value.
    */
  var AuthFlow: AuthFlowType
  /**
    * The authentication parameters. These are inputs corresponding to the AuthFlow that you are invoking. The required values depend on the value of AuthFlow:   For USER_SRP_AUTH: USERNAME (required), SRP_A (required), SECRET_HASH (required if the app client is configured with a client secret), DEVICE_KEY    For REFRESH_TOKEN_AUTH/REFRESH_TOKEN: REFRESH_TOKEN (required), SECRET_HASH (required if the app client is configured with a client secret), DEVICE_KEY    For CUSTOM_AUTH: USERNAME (required), SECRET_HASH (if app client is configured with client secret), DEVICE_KEY   
    */
  var AuthParameters: js.UndefOr[AuthParametersType] = js.undefined
  /**
    * The app client ID.
    */
  var ClientId: ClientIdType
  /**
    * This is a random key-value pair map which can contain any key and will be passed to your PreAuthentication Lambda trigger as-is. It can be used to implement additional validations around authentication.
    */
  var ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined
  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  var UserContextData: js.UndefOr[UserContextDataType] = js.undefined
}

object InitiateAuthRequest {
  @scala.inline
  def apply(
    AuthFlow: AuthFlowType,
    ClientId: ClientIdType,
    AnalyticsMetadata: AnalyticsMetadataType = null,
    AuthParameters: AuthParametersType = null,
    ClientMetadata: ClientMetadataType = null,
    UserContextData: UserContextDataType = null
  ): InitiateAuthRequest = {
    val __obj = js.Dynamic.literal(AuthFlow = AuthFlow.asInstanceOf[js.Any], ClientId = ClientId)
    if (AnalyticsMetadata != null) __obj.updateDynamic("AnalyticsMetadata")(AnalyticsMetadata)
    if (AuthParameters != null) __obj.updateDynamic("AuthParameters")(AuthParameters)
    if (ClientMetadata != null) __obj.updateDynamic("ClientMetadata")(ClientMetadata)
    if (UserContextData != null) __obj.updateDynamic("UserContextData")(UserContextData)
    __obj.asInstanceOf[InitiateAuthRequest]
  }
}

