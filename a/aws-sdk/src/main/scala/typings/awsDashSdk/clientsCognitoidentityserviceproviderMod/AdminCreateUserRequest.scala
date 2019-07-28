package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminCreateUserRequest extends js.Object {
  /**
    * Specify "EMAIL" if email will be used to send the welcome message. Specify "SMS" if the phone number will be used. The default value is "SMS". More than one value can be specified.
    */
  var DesiredDeliveryMediums: js.UndefOr[DeliveryMediumListType] = js.undefined
  /**
    * This parameter is only used if the phone_number_verified or email_verified attribute is set to True. Otherwise, it is ignored. If this parameter is set to True and the phone number or email address specified in the UserAttributes parameter already exists as an alias with a different user, the API call will migrate the alias from the previous user to the newly created user. The previous user will no longer be able to log in using that alias. If this parameter is set to False, the API throws an AliasExistsException error if the alias already exists. The default value is False.
    */
  var ForceAliasCreation: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityserviceproviderMod.ForceAliasCreation] = js.undefined
  /**
    * Set to "RESEND" to resend the invitation message to a user that already exists and reset the expiration limit on the user's account. Set to "SUPPRESS" to suppress sending the message. Only one value can be specified.
    */
  var MessageAction: js.UndefOr[MessageActionType] = js.undefined
  /**
    * The user's temporary password. This password must conform to the password policy that you specified when you created the user pool. The temporary password is valid only once. To complete the Admin Create User flow, the user must enter the temporary password in the sign-in page along with a new password to be used in all future sign-ins. This parameter is not required. If you do not specify a value, Amazon Cognito generates one for you. The temporary password can only be used until the user account expiration limit that you specified when you created the user pool. To reset the account after that time limit, you must call AdminCreateUser again, specifying "RESEND" for the MessageAction parameter.
    */
  var TemporaryPassword: js.UndefOr[PasswordType] = js.undefined
  /**
    * An array of name-value pairs that contain user attributes and attribute values to be set for the user to be created. You can create a user without specifying any attributes other than Username. However, any attributes that you specify as required (in or in the Attributes tab of the console) must be supplied either by you (in your call to AdminCreateUser) or by the user (when he or she signs up in response to your welcome message). For custom attributes, you must prepend the custom: prefix to the attribute name. To send a message inviting the user to sign up, you must specify the user's email address or phone number. This can be done in your call to AdminCreateUser or in the Users tab of the Amazon Cognito console for managing your user pools. In your call to AdminCreateUser, you can set the email_verified attribute to True, and you can set the phone_number_verified attribute to True. (You can also do this by calling .)    email: The email address of the user to whom the message that contains the code and username will be sent. Required if the email_verified attribute is set to True, or if "EMAIL" is specified in the DesiredDeliveryMediums parameter.    phone_number: The phone number of the user to whom the message that contains the code and username will be sent. Required if the phone_number_verified attribute is set to True, or if "SMS" is specified in the DesiredDeliveryMediums parameter.  
    */
  var UserAttributes: js.UndefOr[AttributeListType] = js.undefined
  /**
    * The user pool ID for the user pool where the user will be created.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The username for the user. Must be unique within the user pool. Must be a UTF-8 string between 1 and 128 characters. After the user is created, the username cannot be changed.
    */
  var Username: UsernameType
  /**
    * The user's validation data. This is an array of name-value pairs that contain user attributes and attribute values that you can use for custom validation, such as restricting the types of user accounts that can be registered. For example, you might choose to allow or disallow user sign-up based on the user's domain. To configure custom validation, you must create a Pre Sign-up Lambda trigger for the user pool as described in the Amazon Cognito Developer Guide. The Lambda trigger receives the validation data and uses it in the validation process. The user's validation data is not persisted.
    */
  var ValidationData: js.UndefOr[AttributeListType] = js.undefined
}

object AdminCreateUserRequest {
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    Username: UsernameType,
    DesiredDeliveryMediums: DeliveryMediumListType = null,
    ForceAliasCreation: js.UndefOr[ForceAliasCreation] = js.undefined,
    MessageAction: MessageActionType = null,
    TemporaryPassword: PasswordType = null,
    UserAttributes: AttributeListType = null,
    ValidationData: AttributeListType = null
  ): AdminCreateUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId, Username = Username)
    if (DesiredDeliveryMediums != null) __obj.updateDynamic("DesiredDeliveryMediums")(DesiredDeliveryMediums)
    if (!js.isUndefined(ForceAliasCreation)) __obj.updateDynamic("ForceAliasCreation")(ForceAliasCreation)
    if (MessageAction != null) __obj.updateDynamic("MessageAction")(MessageAction.asInstanceOf[js.Any])
    if (TemporaryPassword != null) __obj.updateDynamic("TemporaryPassword")(TemporaryPassword)
    if (UserAttributes != null) __obj.updateDynamic("UserAttributes")(UserAttributes)
    if (ValidationData != null) __obj.updateDynamic("ValidationData")(ValidationData)
    __obj.asInstanceOf[AdminCreateUserRequest]
  }
}

