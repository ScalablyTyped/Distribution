package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignUpRequest extends js.Object {
  /**
    * The Amazon Pinpoint analytics metadata for collecting metrics for SignUp calls.
    */
  var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
  /**
    * The ID of the client associated with the user pool.
    */
  var ClientId: ClientIdType
  /**
    * The password of the user you wish to register.
    */
  var Password: PasswordType
  /**
    * A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and username plus the client ID in the message.
    */
  var SecretHash: js.UndefOr[SecretHashType] = js.undefined
  /**
    * An array of name-value pairs representing user attributes. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributes: js.UndefOr[AttributeListType] = js.undefined
  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  var UserContextData: js.UndefOr[UserContextDataType] = js.undefined
  /**
    * The user name of the user you wish to register.
    */
  var Username: UsernameType
  /**
    * The validation data in the request to register a user.
    */
  var ValidationData: js.UndefOr[AttributeListType] = js.undefined
}

object SignUpRequest {
  @scala.inline
  def apply(
    ClientId: ClientIdType,
    Password: PasswordType,
    Username: UsernameType,
    AnalyticsMetadata: AnalyticsMetadataType = null,
    SecretHash: SecretHashType = null,
    UserAttributes: AttributeListType = null,
    UserContextData: UserContextDataType = null,
    ValidationData: AttributeListType = null
  ): SignUpRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId, Password = Password, Username = Username)
    if (AnalyticsMetadata != null) __obj.updateDynamic("AnalyticsMetadata")(AnalyticsMetadata)
    if (SecretHash != null) __obj.updateDynamic("SecretHash")(SecretHash)
    if (UserAttributes != null) __obj.updateDynamic("UserAttributes")(UserAttributes)
    if (UserContextData != null) __obj.updateDynamic("UserContextData")(UserContextData)
    if (ValidationData != null) __obj.updateDynamic("ValidationData")(ValidationData)
    __obj.asInstanceOf[SignUpRequest]
  }
}

