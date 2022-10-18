package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserPoolRequest extends StObject {
  
  /**
    * The available verified method a user can use to recover their password when they call ForgotPassword. You can use this setting to define a preferred method when a user has more than one method available. With this setting, SMS doesn't qualify for a valid password recovery mechanism if the user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting, Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred through email.
    */
  var AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType] = js.undefined
  
  /**
    * The configuration for AdminCreateUser requests.
    */
  var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined
  
  /**
    * The attributes that are automatically verified when Amazon Cognito requests to update user pools.
    */
  var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined
  
  /**
    * The device-remembering configuration for a user pool. A null value indicates that you have deactivated device remembering in your user pool.  When you provide a value for any DeviceConfiguration field, you activate the Amazon Cognito device-remembering feature. 
    */
  var DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.undefined
  
  /**
    * The email configuration of your user pool. The email configuration type sets your preferred sending method, Amazon Web Services Region, and sender for email invitation and verification messages from your user pool.
    */
  var EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.undefined
  
  /**
    * This parameter is no longer used. See VerificationMessageTemplateType.
    */
  var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined
  
  /**
    * This parameter is no longer used. See VerificationMessageTemplateType.
    */
  var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined
  
  /**
    * The Lambda configuration information from the request to update the user pool.
    */
  var LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined
  
  /**
    * Possible values include:    OFF - MFA tokens aren't required and can't be specified during user registration.    ON - MFA tokens are required for all user registrations. You can only specify ON when you're initially creating a user pool. You can use the SetUserPoolMfaConfig API operation to turn MFA "ON" for existing user pools.     OPTIONAL - Users have the option when registering to create an MFA token.  
    */
  var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined
  
  /**
    * A container with the policies you want to update in a user pool.
    */
  var Policies: js.UndefOr[UserPoolPolicyType] = js.undefined
  
  /**
    * The contents of the SMS authentication message.
    */
  var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
  
  /**
    * The SMS configuration with the settings that your Amazon Cognito user pool must use to send an SMS message from your Amazon Web Services account through Amazon Simple Notification Service. To send SMS messages with Amazon SNS in the Amazon Web Services Region that you want, the Amazon Cognito user pool uses an Identity and Access Management (IAM) role in your Amazon Web Services account.
    */
  var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined
  
  /**
    * This parameter is no longer used. See VerificationMessageTemplateType.
    */
  var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
  
  /**
    * The settings for updates to user attributes. These settings include the property AttributesRequireVerificationBeforeUpdate, a user-pool setting that tells Amazon Cognito how to handle changes to the value of your users' email address and phone number attributes. For more information, see  Verifying updates to email addresses and phone numbers.
    */
  var UserAttributeUpdateSettings: js.UndefOr[UserAttributeUpdateSettingsType] = js.undefined
  
  /**
    * Enables advanced security risk detection. Set the key AdvancedSecurityMode to the value "AUDIT".
    */
  var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined
  
  /**
    * The user pool ID for the user pool you want to update.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The tag keys and values to assign to the user pool. A tag is a label that you can use to categorize and manage user pools in different ways, such as by purpose, owner, environment, or other criteria.
    */
  var UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined
  
  /**
    * The template for verification messages.
    */
  var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined
}
object UpdateUserPoolRequest {
  
  inline def apply(UserPoolId: UserPoolIdType): UpdateUserPoolRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserPoolRequest]
  }
  
  extension [Self <: UpdateUserPoolRequest](x: Self) {
    
    inline def setAccountRecoverySetting(value: AccountRecoverySettingType): Self = StObject.set(x, "AccountRecoverySetting", value.asInstanceOf[js.Any])
    
    inline def setAccountRecoverySettingUndefined: Self = StObject.set(x, "AccountRecoverySetting", js.undefined)
    
    inline def setAdminCreateUserConfig(value: AdminCreateUserConfigType): Self = StObject.set(x, "AdminCreateUserConfig", value.asInstanceOf[js.Any])
    
    inline def setAdminCreateUserConfigUndefined: Self = StObject.set(x, "AdminCreateUserConfig", js.undefined)
    
    inline def setAutoVerifiedAttributes(value: VerifiedAttributesListType): Self = StObject.set(x, "AutoVerifiedAttributes", value.asInstanceOf[js.Any])
    
    inline def setAutoVerifiedAttributesUndefined: Self = StObject.set(x, "AutoVerifiedAttributes", js.undefined)
    
    inline def setAutoVerifiedAttributesVarargs(value: VerifiedAttributeType*): Self = StObject.set(x, "AutoVerifiedAttributes", js.Array(value*))
    
    inline def setDeviceConfiguration(value: DeviceConfigurationType): Self = StObject.set(x, "DeviceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDeviceConfigurationUndefined: Self = StObject.set(x, "DeviceConfiguration", js.undefined)
    
    inline def setEmailConfiguration(value: EmailConfigurationType): Self = StObject.set(x, "EmailConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEmailConfigurationUndefined: Self = StObject.set(x, "EmailConfiguration", js.undefined)
    
    inline def setEmailVerificationMessage(value: EmailVerificationMessageType): Self = StObject.set(x, "EmailVerificationMessage", value.asInstanceOf[js.Any])
    
    inline def setEmailVerificationMessageUndefined: Self = StObject.set(x, "EmailVerificationMessage", js.undefined)
    
    inline def setEmailVerificationSubject(value: EmailVerificationSubjectType): Self = StObject.set(x, "EmailVerificationSubject", value.asInstanceOf[js.Any])
    
    inline def setEmailVerificationSubjectUndefined: Self = StObject.set(x, "EmailVerificationSubject", js.undefined)
    
    inline def setLambdaConfig(value: LambdaConfigType): Self = StObject.set(x, "LambdaConfig", value.asInstanceOf[js.Any])
    
    inline def setLambdaConfigUndefined: Self = StObject.set(x, "LambdaConfig", js.undefined)
    
    inline def setMfaConfiguration(value: UserPoolMfaType): Self = StObject.set(x, "MfaConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMfaConfigurationUndefined: Self = StObject.set(x, "MfaConfiguration", js.undefined)
    
    inline def setPolicies(value: UserPoolPolicyType): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    inline def setSmsAuthenticationMessage(value: SmsVerificationMessageType): Self = StObject.set(x, "SmsAuthenticationMessage", value.asInstanceOf[js.Any])
    
    inline def setSmsAuthenticationMessageUndefined: Self = StObject.set(x, "SmsAuthenticationMessage", js.undefined)
    
    inline def setSmsConfiguration(value: SmsConfigurationType): Self = StObject.set(x, "SmsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSmsConfigurationUndefined: Self = StObject.set(x, "SmsConfiguration", js.undefined)
    
    inline def setSmsVerificationMessage(value: SmsVerificationMessageType): Self = StObject.set(x, "SmsVerificationMessage", value.asInstanceOf[js.Any])
    
    inline def setSmsVerificationMessageUndefined: Self = StObject.set(x, "SmsVerificationMessage", js.undefined)
    
    inline def setUserAttributeUpdateSettings(value: UserAttributeUpdateSettingsType): Self = StObject.set(x, "UserAttributeUpdateSettings", value.asInstanceOf[js.Any])
    
    inline def setUserAttributeUpdateSettingsUndefined: Self = StObject.set(x, "UserAttributeUpdateSettings", js.undefined)
    
    inline def setUserPoolAddOns(value: UserPoolAddOnsType): Self = StObject.set(x, "UserPoolAddOns", value.asInstanceOf[js.Any])
    
    inline def setUserPoolAddOnsUndefined: Self = StObject.set(x, "UserPoolAddOns", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUserPoolTags(value: UserPoolTagsType): Self = StObject.set(x, "UserPoolTags", value.asInstanceOf[js.Any])
    
    inline def setUserPoolTagsUndefined: Self = StObject.set(x, "UserPoolTags", js.undefined)
    
    inline def setVerificationMessageTemplate(value: VerificationMessageTemplateType): Self = StObject.set(x, "VerificationMessageTemplate", value.asInstanceOf[js.Any])
    
    inline def setVerificationMessageTemplateUndefined: Self = StObject.set(x, "VerificationMessageTemplate", js.undefined)
  }
}
