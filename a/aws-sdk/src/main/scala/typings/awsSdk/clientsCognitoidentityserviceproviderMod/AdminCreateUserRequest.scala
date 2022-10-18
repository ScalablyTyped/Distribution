package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminCreateUserRequest extends StObject {
  
  /**
    * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers. You create custom workflows by assigning Lambda functions to user pool triggers. When you use the AdminCreateUser API action, Amazon Cognito invokes the function that is assigned to the pre sign-up trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the function receives as input. This payload contains a clientMetadata attribute, which provides the data that you assigned to the ClientMetadata parameter in your AdminCreateUser request. In your function code in Lambda, you can process the clientMetadata value to enhance your workflow for your specific needs. For more information, see  Customizing user pool Workflows with Lambda Triggers in the Amazon Cognito Developer Guide.  When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:   Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration doesn't include triggers, the ClientMetadata parameter serves no purpose.   Validate the ClientMetadata value.   Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.   
    */
  var ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined
  
  /**
    * Specify "EMAIL" if email will be used to send the welcome message. Specify "SMS" if the phone number will be used. The default value is "SMS". You can specify more than one value.
    */
  var DesiredDeliveryMediums: js.UndefOr[DeliveryMediumListType] = js.undefined
  
  /**
    * This parameter is used only if the phone_number_verified or email_verified attribute is set to True. Otherwise, it is ignored. If this parameter is set to True and the phone number or email address specified in the UserAttributes parameter already exists as an alias with a different user, the API call will migrate the alias from the previous user to the newly created user. The previous user will no longer be able to log in using that alias. If this parameter is set to False, the API throws an AliasExistsException error if the alias already exists. The default value is False.
    */
  var ForceAliasCreation: js.UndefOr[typings.awsSdk.clientsCognitoidentityserviceproviderMod.ForceAliasCreation] = js.undefined
  
  /**
    * Set to RESEND to resend the invitation message to a user that already exists and reset the expiration limit on the user's account. Set to SUPPRESS to suppress sending the message. You can specify only one value.
    */
  var MessageAction: js.UndefOr[MessageActionType] = js.undefined
  
  /**
    * The user's temporary password. This password must conform to the password policy that you specified when you created the user pool. The temporary password is valid only once. To complete the Admin Create User flow, the user must enter the temporary password in the sign-in page, along with a new password to be used in all future sign-ins. This parameter isn't required. If you don't specify a value, Amazon Cognito generates one for you. The temporary password can only be used until the user account expiration limit that you specified when you created the user pool. To reset the account after that time limit, you must call AdminCreateUser again, specifying "RESEND" for the MessageAction parameter.
    */
  var TemporaryPassword: js.UndefOr[PasswordType] = js.undefined
  
  /**
    * An array of name-value pairs that contain user attributes and attribute values to be set for the user to be created. You can create a user without specifying any attributes other than Username. However, any attributes that you specify as required (when creating a user pool or in the Attributes tab of the console) either you should supply (in your call to AdminCreateUser) or the user should supply (when they sign up in response to your welcome message). For custom attributes, you must prepend the custom: prefix to the attribute name. To send a message inviting the user to sign up, you must specify the user's email address or phone number. You can do this in your call to AdminCreateUser or in the Users tab of the Amazon Cognito console for managing your user pools. In your call to AdminCreateUser, you can set the email_verified attribute to True, and you can set the phone_number_verified attribute to True. You can also do this by calling AdminUpdateUserAttributes.    email: The email address of the user to whom the message that contains the code and username will be sent. Required if the email_verified attribute is set to True, or if "EMAIL" is specified in the DesiredDeliveryMediums parameter.    phone_number: The phone number of the user to whom the message that contains the code and username will be sent. Required if the phone_number_verified attribute is set to True, or if "SMS" is specified in the DesiredDeliveryMediums parameter.  
    */
  var UserAttributes: js.UndefOr[AttributeListType] = js.undefined
  
  /**
    * The user pool ID for the user pool where the user will be created.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The username for the user. Must be unique within the user pool. Must be a UTF-8 string between 1 and 128 characters. After the user is created, the username can't be changed.
    */
  var Username: UsernameType
  
  /**
    * The user's validation data. This is an array of name-value pairs that contain user attributes and attribute values that you can use for custom validation, such as restricting the types of user accounts that can be registered. For example, you might choose to allow or disallow user sign-up based on the user's domain. To configure custom validation, you must create a Pre Sign-up Lambda trigger for the user pool as described in the Amazon Cognito Developer Guide. The Lambda trigger receives the validation data and uses it in the validation process. The user's validation data isn't persisted.
    */
  var ValidationData: js.UndefOr[AttributeListType] = js.undefined
}
object AdminCreateUserRequest {
  
  inline def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminCreateUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminCreateUserRequest]
  }
  
  extension [Self <: AdminCreateUserRequest](x: Self) {
    
    inline def setClientMetadata(value: ClientMetadataType): Self = StObject.set(x, "ClientMetadata", value.asInstanceOf[js.Any])
    
    inline def setClientMetadataUndefined: Self = StObject.set(x, "ClientMetadata", js.undefined)
    
    inline def setDesiredDeliveryMediums(value: DeliveryMediumListType): Self = StObject.set(x, "DesiredDeliveryMediums", value.asInstanceOf[js.Any])
    
    inline def setDesiredDeliveryMediumsUndefined: Self = StObject.set(x, "DesiredDeliveryMediums", js.undefined)
    
    inline def setDesiredDeliveryMediumsVarargs(value: DeliveryMediumType*): Self = StObject.set(x, "DesiredDeliveryMediums", js.Array(value*))
    
    inline def setForceAliasCreation(value: ForceAliasCreation): Self = StObject.set(x, "ForceAliasCreation", value.asInstanceOf[js.Any])
    
    inline def setForceAliasCreationUndefined: Self = StObject.set(x, "ForceAliasCreation", js.undefined)
    
    inline def setMessageAction(value: MessageActionType): Self = StObject.set(x, "MessageAction", value.asInstanceOf[js.Any])
    
    inline def setMessageActionUndefined: Self = StObject.set(x, "MessageAction", js.undefined)
    
    inline def setTemporaryPassword(value: PasswordType): Self = StObject.set(x, "TemporaryPassword", value.asInstanceOf[js.Any])
    
    inline def setTemporaryPasswordUndefined: Self = StObject.set(x, "TemporaryPassword", js.undefined)
    
    inline def setUserAttributes(value: AttributeListType): Self = StObject.set(x, "UserAttributes", value.asInstanceOf[js.Any])
    
    inline def setUserAttributesUndefined: Self = StObject.set(x, "UserAttributes", js.undefined)
    
    inline def setUserAttributesVarargs(value: AttributeType*): Self = StObject.set(x, "UserAttributes", js.Array(value*))
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setValidationData(value: AttributeListType): Self = StObject.set(x, "ValidationData", value.asInstanceOf[js.Any])
    
    inline def setValidationDataUndefined: Self = StObject.set(x, "ValidationData", js.undefined)
    
    inline def setValidationDataVarargs(value: AttributeType*): Self = StObject.set(x, "ValidationData", js.Array(value*))
  }
}
