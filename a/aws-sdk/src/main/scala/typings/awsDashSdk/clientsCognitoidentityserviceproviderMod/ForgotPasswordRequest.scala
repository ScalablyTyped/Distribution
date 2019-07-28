package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForgotPasswordRequest extends js.Object {
  /**
    * The Amazon Pinpoint analytics metadata for collecting metrics for ForgotPassword calls.
    */
  var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
  /**
    * The ID of the client associated with the user pool.
    */
  var ClientId: ClientIdType
  /**
    * A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and username plus the client ID in the message.
    */
  var SecretHash: js.UndefOr[SecretHashType] = js.undefined
  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  var UserContextData: js.UndefOr[UserContextDataType] = js.undefined
  /**
    * The user name of the user for whom you want to enter a code to reset a forgotten password.
    */
  var Username: UsernameType
}

object ForgotPasswordRequest {
  @scala.inline
  def apply(
    ClientId: ClientIdType,
    Username: UsernameType,
    AnalyticsMetadata: AnalyticsMetadataType = null,
    SecretHash: SecretHashType = null,
    UserContextData: UserContextDataType = null
  ): ForgotPasswordRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId, Username = Username)
    if (AnalyticsMetadata != null) __obj.updateDynamic("AnalyticsMetadata")(AnalyticsMetadata)
    if (SecretHash != null) __obj.updateDynamic("SecretHash")(SecretHash)
    if (UserContextData != null) __obj.updateDynamic("UserContextData")(UserContextData)
    __obj.asInstanceOf[ForgotPasswordRequest]
  }
}

