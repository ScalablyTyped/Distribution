package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmForgotPasswordRequest extends js.Object {
  /**
    * The Amazon Pinpoint analytics metadata for collecting metrics for ConfirmForgotPassword calls.
    */
  var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
  /**
    * The app client ID of the app associated with the user pool.
    */
  var ClientId: ClientIdType
  /**
    * The confirmation code sent by a user's request to retrieve a forgotten password. For more information, see 
    */
  var ConfirmationCode: ConfirmationCodeType
  /**
    * The password sent by a user's request to retrieve a forgotten password.
    */
  var Password: PasswordType
  /**
    * A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and username plus the client ID in the message.
    */
  var SecretHash: js.UndefOr[SecretHashType] = js.undefined
  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  var UserContextData: js.UndefOr[UserContextDataType] = js.undefined
  /**
    * The user name of the user for whom you want to enter a code to retrieve a forgotten password.
    */
  var Username: UsernameType
}

object ConfirmForgotPasswordRequest {
  @scala.inline
  def apply(
    ClientId: ClientIdType,
    ConfirmationCode: ConfirmationCodeType,
    Password: PasswordType,
    Username: UsernameType,
    AnalyticsMetadata: AnalyticsMetadataType = null,
    SecretHash: SecretHashType = null,
    UserContextData: UserContextDataType = null
  ): ConfirmForgotPasswordRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId, ConfirmationCode = ConfirmationCode, Password = Password, Username = Username)
    if (AnalyticsMetadata != null) __obj.updateDynamic("AnalyticsMetadata")(AnalyticsMetadata)
    if (SecretHash != null) __obj.updateDynamic("SecretHash")(SecretHash)
    if (UserContextData != null) __obj.updateDynamic("UserContextData")(UserContextData)
    __obj.asInstanceOf[ConfirmForgotPasswordRequest]
  }
}

