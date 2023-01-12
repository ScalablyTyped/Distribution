package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserPoolRequest extends StObject {
  
  /**
    * The available verified method a user can use to recover their password when they call ForgotPassword. You can use this setting to define a preferred method when a user has more than one method available. With this setting, SMS doesn't qualify for a valid password recovery mechanism if the user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting, Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred through email.
    */
  var AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType] = js.undefined
  
  /**
    * The configuration for AdminCreateUser requests.
    */
  var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined
  
  /**
    * Attributes supported as an alias for this user pool. Possible values: phone_number, email, or preferred_username.
    */
  var AliasAttributes: js.UndefOr[AliasAttributesListType] = js.undefined
  
  /**
    * The attributes to be auto-verified. Possible values: email, phone_number.
    */
  var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined
  
  /**
    * When active, DeletionProtection prevents accidental deletion of your user pool. Before you can delete a user pool that you have protected against deletion, you must deactivate this feature. When you try to delete a protected user pool in a DeleteUserPool API request, Amazon Cognito returns an InvalidParameterException error. To delete a protected user pool, send a new DeleteUserPool request after you deactivate deletion protection in an UpdateUserPool API request.
    */
  var DeletionProtection: js.UndefOr[DeletionProtectionType] = js.undefined
  
  /**
    * The device-remembering configuration for a user pool. A null value indicates that you have deactivated device remembering in your user pool.  When you provide a value for any DeviceConfiguration field, you activate the Amazon Cognito device-remembering feature. 
    */
  var DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.undefined
  
  /**
    * The email configuration of your user pool. The email configuration type sets your preferred sending method, Amazon Web Services Region, and sender for messages from your user pool.
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
    * The Lambda trigger configuration information for the new user pool.  In a push model, event sources (such as Amazon S3 and custom applications) need permission to invoke a function. So you must make an extra call to add permission for these event sources to invoke your Lambda function.  For more information on using the Lambda API to add permission, see AddPermission .  For adding permission using the CLI, see add-permission . 
    */
  var LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined
  
  /**
    * Specifies MFA configuration details.
    */
  var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined
  
  /**
    * The policies associated with the new user pool.
    */
  var Policies: js.UndefOr[UserPoolPolicyType] = js.undefined
  
  /**
    * A string used to name the user pool.
    */
  var PoolName: UserPoolNameType
  
  /**
    * An array of schema attributes for the new user pool. These attributes can be standard or custom attributes.
    */
  var Schema: js.UndefOr[SchemaAttributesListType] = js.undefined
  
  /**
    * A string representing the SMS authentication message.
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
    * The tag keys and values to assign to the user pool. A tag is a label that you can use to categorize and manage user pools in different ways, such as by purpose, owner, environment, or other criteria.
    */
  var UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined
  
  /**
    * Specifies whether a user can use an email address or phone number as a username when they sign up.
    */
  var UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.undefined
  
  /**
    * Case sensitivity on the username input for the selected sign-in option. For example, when case sensitivity is set to False, users can sign in using either "username" or "Username". This configuration is immutable once it has been set. For more information, see UsernameConfigurationType.
    */
  var UsernameConfiguration: js.UndefOr[UsernameConfigurationType] = js.undefined
  
  /**
    * The template for the verification message that the user sees when the app requests permission to access the user's information.
    */
  var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined
}
object CreateUserPoolRequest {
  
  inline def apply(PoolName: UserPoolNameType): CreateUserPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserPoolRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateUserPoolRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountRecoverySetting(value: AccountRecoverySettingType): Self = StObject.set(x, "AccountRecoverySetting", value.asInstanceOf[js.Any])
    
    inline def setAccountRecoverySettingUndefined: Self = StObject.set(x, "AccountRecoverySetting", js.undefined)
    
    inline def setAdminCreateUserConfig(value: AdminCreateUserConfigType): Self = StObject.set(x, "AdminCreateUserConfig", value.asInstanceOf[js.Any])
    
    inline def setAdminCreateUserConfigUndefined: Self = StObject.set(x, "AdminCreateUserConfig", js.undefined)
    
    inline def setAliasAttributes(value: AliasAttributesListType): Self = StObject.set(x, "AliasAttributes", value.asInstanceOf[js.Any])
    
    inline def setAliasAttributesUndefined: Self = StObject.set(x, "AliasAttributes", js.undefined)
    
    inline def setAliasAttributesVarargs(value: AliasAttributeType*): Self = StObject.set(x, "AliasAttributes", js.Array(value*))
    
    inline def setAutoVerifiedAttributes(value: VerifiedAttributesListType): Self = StObject.set(x, "AutoVerifiedAttributes", value.asInstanceOf[js.Any])
    
    inline def setAutoVerifiedAttributesUndefined: Self = StObject.set(x, "AutoVerifiedAttributes", js.undefined)
    
    inline def setAutoVerifiedAttributesVarargs(value: VerifiedAttributeType*): Self = StObject.set(x, "AutoVerifiedAttributes", js.Array(value*))
    
    inline def setDeletionProtection(value: DeletionProtectionType): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
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
    
    inline def setPoolName(value: UserPoolNameType): Self = StObject.set(x, "PoolName", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: SchemaAttributesListType): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
    
    inline def setSchemaVarargs(value: SchemaAttributeType*): Self = StObject.set(x, "Schema", js.Array(value*))
    
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
    
    inline def setUserPoolTags(value: UserPoolTagsType): Self = StObject.set(x, "UserPoolTags", value.asInstanceOf[js.Any])
    
    inline def setUserPoolTagsUndefined: Self = StObject.set(x, "UserPoolTags", js.undefined)
    
    inline def setUsernameAttributes(value: UsernameAttributesListType): Self = StObject.set(x, "UsernameAttributes", value.asInstanceOf[js.Any])
    
    inline def setUsernameAttributesUndefined: Self = StObject.set(x, "UsernameAttributes", js.undefined)
    
    inline def setUsernameAttributesVarargs(value: UsernameAttributeType*): Self = StObject.set(x, "UsernameAttributes", js.Array(value*))
    
    inline def setUsernameConfiguration(value: UsernameConfigurationType): Self = StObject.set(x, "UsernameConfiguration", value.asInstanceOf[js.Any])
    
    inline def setUsernameConfigurationUndefined: Self = StObject.set(x, "UsernameConfiguration", js.undefined)
    
    inline def setVerificationMessageTemplate(value: VerificationMessageTemplateType): Self = StObject.set(x, "VerificationMessageTemplate", value.asInstanceOf[js.Any])
    
    inline def setVerificationMessageTemplateUndefined: Self = StObject.set(x, "VerificationMessageTemplate", js.undefined)
  }
}
