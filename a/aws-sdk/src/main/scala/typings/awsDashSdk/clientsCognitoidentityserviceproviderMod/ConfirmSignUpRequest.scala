package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmSignUpRequest extends js.Object {
  /**
    * The Amazon Pinpoint analytics metadata for collecting metrics for ConfirmSignUp calls.
    */
  var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
  /**
    * The ID of the app client associated with the user pool.
    */
  var ClientId: ClientIdType
  /**
    * The confirmation code sent by a user's request to confirm registration.
    */
  var ConfirmationCode: ConfirmationCodeType
  /**
    * Boolean to be specified to force user confirmation irrespective of existing alias. By default set to False. If this parameter is set to True and the phone number/email used for sign up confirmation already exists as an alias with a different user, the API call will migrate the alias from the previous user to the newly created user being confirmed. If set to False, the API will throw an AliasExistsException error.
    */
  var ForceAliasCreation: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityserviceproviderMod.ForceAliasCreation] = js.undefined
  /**
    * A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and username plus the client ID in the message.
    */
  var SecretHash: js.UndefOr[SecretHashType] = js.undefined
  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  var UserContextData: js.UndefOr[UserContextDataType] = js.undefined
  /**
    * The user name of the user whose registration you wish to confirm.
    */
  var Username: UsernameType
}

object ConfirmSignUpRequest {
  @scala.inline
  def apply(
    ClientId: ClientIdType,
    ConfirmationCode: ConfirmationCodeType,
    Username: UsernameType,
    AnalyticsMetadata: AnalyticsMetadataType = null,
    ForceAliasCreation: js.UndefOr[ForceAliasCreation] = js.undefined,
    SecretHash: SecretHashType = null,
    UserContextData: UserContextDataType = null
  ): ConfirmSignUpRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId, ConfirmationCode = ConfirmationCode, Username = Username)
    if (AnalyticsMetadata != null) __obj.updateDynamic("AnalyticsMetadata")(AnalyticsMetadata)
    if (!js.isUndefined(ForceAliasCreation)) __obj.updateDynamic("ForceAliasCreation")(ForceAliasCreation)
    if (SecretHash != null) __obj.updateDynamic("SecretHash")(SecretHash)
    if (UserContextData != null) __obj.updateDynamic("UserContextData")(UserContextData)
    __obj.asInstanceOf[ConfirmSignUpRequest]
  }
}

