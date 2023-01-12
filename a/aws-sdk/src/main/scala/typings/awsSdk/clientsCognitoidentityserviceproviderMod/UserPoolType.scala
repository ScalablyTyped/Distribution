package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolType extends StObject {
  
  /**
    * The available verified method a user can use to recover their password when they call ForgotPassword. You can use this setting to define a preferred method when a user has more than one method available. With this setting, SMS doesn't qualify for a valid password recovery mechanism if the user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting, Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred through email.
    */
  var AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType] = js.undefined
  
  /**
    * The configuration for AdminCreateUser requests.
    */
  var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined
  
  /**
    * The attributes that are aliased in a user pool.
    */
  var AliasAttributes: js.UndefOr[AliasAttributesListType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the user pool.
    */
  var Arn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * The attributes that are auto-verified in a user pool.
    */
  var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined
  
  /**
    * The date the user pool was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A custom domain name that you provide to Amazon Cognito. This parameter applies only if you use a custom domain to host the sign-up and sign-in pages for your application. An example of a custom domain name might be auth.example.com. For more information about adding a custom domain to your user pool, see Using Your Own Domain for the Hosted UI.
    */
  var CustomDomain: js.UndefOr[DomainType] = js.undefined
  
  /**
    * When active, DeletionProtection prevents accidental deletion of your user pool. Before you can delete a user pool that you have protected against deletion, you must deactivate this feature. When you try to delete a protected user pool in a DeleteUserPool API request, Amazon Cognito returns an InvalidParameterException error. To delete a protected user pool, send a new DeleteUserPool request after you deactivate deletion protection in an UpdateUserPool API request.
    */
  var DeletionProtection: js.UndefOr[DeletionProtectionType] = js.undefined
  
  /**
    * The device-remembering configuration for a user pool. A null value indicates that you have deactivated device remembering in your user pool.  When you provide a value for any DeviceConfiguration field, you activate the Amazon Cognito device-remembering feature. 
    */
  var DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.undefined
  
  /**
    * The domain prefix, if the user pool has a domain associated with it.
    */
  var Domain: js.UndefOr[DomainType] = js.undefined
  
  /**
    * The email configuration of your user pool. The email configuration type sets your preferred sending method, Amazon Web Services Region, and sender for messages tfrom your user pool.
    */
  var EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.undefined
  
  /**
    * Deprecated. Review error codes from API requests with EventSource:cognito-idp.amazonaws.com in CloudTrail for information about problems with user pool email configuration.
    */
  var EmailConfigurationFailure: js.UndefOr[StringType] = js.undefined
  
  /**
    * This parameter is no longer used. See VerificationMessageTemplateType.
    */
  var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined
  
  /**
    * This parameter is no longer used. See VerificationMessageTemplateType.
    */
  var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined
  
  /**
    * A number estimating the size of the user pool.
    */
  var EstimatedNumberOfUsers: js.UndefOr[IntegerType] = js.undefined
  
  /**
    * The ID of the user pool.
    */
  var Id: js.UndefOr[UserPoolIdType] = js.undefined
  
  /**
    * The Lambda triggers associated with the user pool.
    */
  var LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined
  
  /**
    * The date the user pool was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Can be one of the following values:    OFF - MFA tokens aren't required and can't be specified during user registration.    ON - MFA tokens are required for all user registrations. You can only specify required when you're initially creating a user pool.    OPTIONAL - Users have the option when registering to create an MFA token.  
    */
  var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined
  
  /**
    * The name of the user pool.
    */
  var Name: js.UndefOr[UserPoolNameType] = js.undefined
  
  /**
    * The policies associated with the user pool.
    */
  var Policies: js.UndefOr[UserPoolPolicyType] = js.undefined
  
  /**
    * A container with the schema attributes of a user pool.
    */
  var SchemaAttributes: js.UndefOr[SchemaAttributesListType] = js.undefined
  
  /**
    * The contents of the SMS authentication message.
    */
  var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
  
  /**
    * The SMS configuration with the settings that your Amazon Cognito user pool must use to send an SMS message from your Amazon Web Services account through Amazon Simple Notification Service. To send SMS messages with Amazon SNS in the Amazon Web Services Region that you want, the Amazon Cognito user pool uses an Identity and Access Management (IAM) role in your Amazon Web Services account.
    */
  var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined
  
  /**
    * The reason why the SMS configuration can't send the messages to your users. This message might include comma-separated values to describe why your SMS configuration can't send messages to user pool end users.  InvalidSmsRoleAccessPolicyException  The Identity and Access Management role that Amazon Cognito uses to send SMS messages isn't properly configured. For more information, see SmsConfigurationType.  SNSSandbox  The Amazon Web Services account is in the SNS SMS Sandbox and messages will only reach verified end users. This parameter won’t get populated with SNSSandbox if the IAM user creating the user pool doesn’t have SNS permissions. To learn how to move your Amazon Web Services account out of the sandbox, see Moving out of the SMS sandbox.  
    */
  var SmsConfigurationFailure: js.UndefOr[StringType] = js.undefined
  
  /**
    * This parameter is no longer used. See VerificationMessageTemplateType.
    */
  var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
  
  /**
    * The status of a user pool.
    */
  var Status: js.UndefOr[StatusType] = js.undefined
  
  /**
    * The settings for updates to user attributes. These settings include the property AttributesRequireVerificationBeforeUpdate, a user-pool setting that tells Amazon Cognito how to handle changes to the value of your users' email address and phone number attributes. For more information, see  Verifying updates to email addresses and phone numbers.
    */
  var UserAttributeUpdateSettings: js.UndefOr[UserAttributeUpdateSettingsType] = js.undefined
  
  /**
    * The user pool add-ons.
    */
  var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined
  
  /**
    * The tags that are assigned to the user pool. A tag is a label that you can apply to user pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria.
    */
  var UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined
  
  /**
    * Specifies whether a user can use an email address or phone number as a username when they sign up.
    */
  var UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.undefined
  
  /**
    * Case sensitivity of the username input for the selected sign-in option. For example, when case sensitivity is set to False, users can sign in using either "username" or "Username". This configuration is immutable once it has been set. For more information, see UsernameConfigurationType.
    */
  var UsernameConfiguration: js.UndefOr[UsernameConfigurationType] = js.undefined
  
  /**
    * The template for verification messages.
    */
  var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined
}
object UserPoolType {
  
  inline def apply(): UserPoolType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserPoolType] (val x: Self) extends AnyVal {
    
    inline def setAccountRecoverySetting(value: AccountRecoverySettingType): Self = StObject.set(x, "AccountRecoverySetting", value.asInstanceOf[js.Any])
    
    inline def setAccountRecoverySettingUndefined: Self = StObject.set(x, "AccountRecoverySetting", js.undefined)
    
    inline def setAdminCreateUserConfig(value: AdminCreateUserConfigType): Self = StObject.set(x, "AdminCreateUserConfig", value.asInstanceOf[js.Any])
    
    inline def setAdminCreateUserConfigUndefined: Self = StObject.set(x, "AdminCreateUserConfig", js.undefined)
    
    inline def setAliasAttributes(value: AliasAttributesListType): Self = StObject.set(x, "AliasAttributes", value.asInstanceOf[js.Any])
    
    inline def setAliasAttributesUndefined: Self = StObject.set(x, "AliasAttributes", js.undefined)
    
    inline def setAliasAttributesVarargs(value: AliasAttributeType*): Self = StObject.set(x, "AliasAttributes", js.Array(value*))
    
    inline def setArn(value: ArnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAutoVerifiedAttributes(value: VerifiedAttributesListType): Self = StObject.set(x, "AutoVerifiedAttributes", value.asInstanceOf[js.Any])
    
    inline def setAutoVerifiedAttributesUndefined: Self = StObject.set(x, "AutoVerifiedAttributes", js.undefined)
    
    inline def setAutoVerifiedAttributesVarargs(value: VerifiedAttributeType*): Self = StObject.set(x, "AutoVerifiedAttributes", js.Array(value*))
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setCustomDomain(value: DomainType): Self = StObject.set(x, "CustomDomain", value.asInstanceOf[js.Any])
    
    inline def setCustomDomainUndefined: Self = StObject.set(x, "CustomDomain", js.undefined)
    
    inline def setDeletionProtection(value: DeletionProtectionType): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setDeviceConfiguration(value: DeviceConfigurationType): Self = StObject.set(x, "DeviceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDeviceConfigurationUndefined: Self = StObject.set(x, "DeviceConfiguration", js.undefined)
    
    inline def setDomain(value: DomainType): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setEmailConfiguration(value: EmailConfigurationType): Self = StObject.set(x, "EmailConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEmailConfigurationFailure(value: StringType): Self = StObject.set(x, "EmailConfigurationFailure", value.asInstanceOf[js.Any])
    
    inline def setEmailConfigurationFailureUndefined: Self = StObject.set(x, "EmailConfigurationFailure", js.undefined)
    
    inline def setEmailConfigurationUndefined: Self = StObject.set(x, "EmailConfiguration", js.undefined)
    
    inline def setEmailVerificationMessage(value: EmailVerificationMessageType): Self = StObject.set(x, "EmailVerificationMessage", value.asInstanceOf[js.Any])
    
    inline def setEmailVerificationMessageUndefined: Self = StObject.set(x, "EmailVerificationMessage", js.undefined)
    
    inline def setEmailVerificationSubject(value: EmailVerificationSubjectType): Self = StObject.set(x, "EmailVerificationSubject", value.asInstanceOf[js.Any])
    
    inline def setEmailVerificationSubjectUndefined: Self = StObject.set(x, "EmailVerificationSubject", js.undefined)
    
    inline def setEstimatedNumberOfUsers(value: IntegerType): Self = StObject.set(x, "EstimatedNumberOfUsers", value.asInstanceOf[js.Any])
    
    inline def setEstimatedNumberOfUsersUndefined: Self = StObject.set(x, "EstimatedNumberOfUsers", js.undefined)
    
    inline def setId(value: UserPoolIdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLambdaConfig(value: LambdaConfigType): Self = StObject.set(x, "LambdaConfig", value.asInstanceOf[js.Any])
    
    inline def setLambdaConfigUndefined: Self = StObject.set(x, "LambdaConfig", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setMfaConfiguration(value: UserPoolMfaType): Self = StObject.set(x, "MfaConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMfaConfigurationUndefined: Self = StObject.set(x, "MfaConfiguration", js.undefined)
    
    inline def setName(value: UserPoolNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPolicies(value: UserPoolPolicyType): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    inline def setSchemaAttributes(value: SchemaAttributesListType): Self = StObject.set(x, "SchemaAttributes", value.asInstanceOf[js.Any])
    
    inline def setSchemaAttributesUndefined: Self = StObject.set(x, "SchemaAttributes", js.undefined)
    
    inline def setSchemaAttributesVarargs(value: SchemaAttributeType*): Self = StObject.set(x, "SchemaAttributes", js.Array(value*))
    
    inline def setSmsAuthenticationMessage(value: SmsVerificationMessageType): Self = StObject.set(x, "SmsAuthenticationMessage", value.asInstanceOf[js.Any])
    
    inline def setSmsAuthenticationMessageUndefined: Self = StObject.set(x, "SmsAuthenticationMessage", js.undefined)
    
    inline def setSmsConfiguration(value: SmsConfigurationType): Self = StObject.set(x, "SmsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSmsConfigurationFailure(value: StringType): Self = StObject.set(x, "SmsConfigurationFailure", value.asInstanceOf[js.Any])
    
    inline def setSmsConfigurationFailureUndefined: Self = StObject.set(x, "SmsConfigurationFailure", js.undefined)
    
    inline def setSmsConfigurationUndefined: Self = StObject.set(x, "SmsConfiguration", js.undefined)
    
    inline def setSmsVerificationMessage(value: SmsVerificationMessageType): Self = StObject.set(x, "SmsVerificationMessage", value.asInstanceOf[js.Any])
    
    inline def setSmsVerificationMessageUndefined: Self = StObject.set(x, "SmsVerificationMessage", js.undefined)
    
    inline def setStatus(value: StatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
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
