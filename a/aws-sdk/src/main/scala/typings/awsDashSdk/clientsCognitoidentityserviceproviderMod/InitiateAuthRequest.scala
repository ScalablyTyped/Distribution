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
    * A map of custom key-value pairs that you can provide as input for certain custom workflows that this action triggers. You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the InitiateAuth API action, Amazon Cognito invokes the AWS Lambda functions that are specified for various triggers. The ClientMetadata value is passed as input to the functions for only the following triggers:   Pre signup   Pre authentication   User migration   When Amazon Cognito invokes the functions for these triggers, it passes a JSON payload, which the function receives as input. This payload contains a validationData attribute, which provides the data that you assigned to the ClientMetadata parameter in your InitiateAuth request. In your function code in AWS Lambda, you can process the validationData value to enhance your workflow for your specific needs. When you use the InitiateAuth API action, Amazon Cognito also invokes the functions for the following triggers, but it does not provide the ClientMetadata value as input:   Post authentication   Custom message   Pre token generation   Create auth challenge   Define auth challenge   Verify auth challenge   For more information, see Customizing User Pool Workflows with Lambda Triggers in the Amazon Cognito Developer Guide.  Take the following limitations into consideration when you use the ClientMetadata parameter:   Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration does not include triggers, the ClientMetadata parameter serves no purpose.   Amazon Cognito does not validate the ClientMetadata value.   Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.   
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

