package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolType extends js.Object {
  /**
    * The configuration for AdminCreateUser requests.
    */
  var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined
  /**
    * Specifies the attributes that are aliased in a user pool.
    */
  var AliasAttributes: js.UndefOr[AliasAttributesListType] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the user pool.
    */
  var Arn: js.UndefOr[ArnType] = js.undefined
  /**
    * Specifies the attributes that are auto-verified in a user pool.
    */
  var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined
  /**
    * The date the user pool was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.undefined
  /**
    * A custom domain name that you provide to Amazon Cognito. This parameter applies only if you use a custom domain to host the sign-up and sign-in pages for your application. For example: auth.example.com. For more information about adding a custom domain to your user pool, see Using Your Own Domain for the Hosted UI.
    */
  var CustomDomain: js.UndefOr[DomainType] = js.undefined
  /**
    * The device configuration.
    */
  var DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.undefined
  /**
    * Holds the domain prefix if the user pool has a domain associated with it.
    */
  var Domain: js.UndefOr[DomainType] = js.undefined
  /**
    * The email configuration.
    */
  var EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.undefined
  /**
    * The reason why the email configuration cannot send the messages to your users.
    */
  var EmailConfigurationFailure: js.UndefOr[StringType] = js.undefined
  /**
    * The contents of the email verification message.
    */
  var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined
  /**
    * The subject of the email verification message.
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
    * The AWS Lambda triggers associated with the user pool.
    */
  var LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined
  /**
    * The date the user pool was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.undefined
  /**
    * Can be one of the following values:    OFF - MFA tokens are not required and cannot be specified during user registration.    ON - MFA tokens are required for all user registrations. You can only specify required when you are initially creating a user pool.    OPTIONAL - Users have the option when registering to create an MFA token.  
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
    * The SMS configuration.
    */
  var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined
  /**
    * The reason why the SMS configuration cannot send the messages to your users.
    */
  var SmsConfigurationFailure: js.UndefOr[StringType] = js.undefined
  /**
    * The contents of the SMS verification message.
    */
  var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
  /**
    * The status of a user pool.
    */
  var Status: js.UndefOr[StatusType] = js.undefined
  /**
    * The user pool add-ons.
    */
  var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined
  /**
    * The tags that are assigned to the user pool. A tag is a label that you can apply to user pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria.
    */
  var UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined
  /**
    * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
    */
  var UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.undefined
  /**
    * The template for verification messages.
    */
  var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined
}

object UserPoolType {
  @scala.inline
  def apply(
    AdminCreateUserConfig: AdminCreateUserConfigType = null,
    AliasAttributes: AliasAttributesListType = null,
    Arn: ArnType = null,
    AutoVerifiedAttributes: VerifiedAttributesListType = null,
    CreationDate: DateType = null,
    CustomDomain: DomainType = null,
    DeviceConfiguration: DeviceConfigurationType = null,
    Domain: DomainType = null,
    EmailConfiguration: EmailConfigurationType = null,
    EmailConfigurationFailure: StringType = null,
    EmailVerificationMessage: EmailVerificationMessageType = null,
    EmailVerificationSubject: EmailVerificationSubjectType = null,
    EstimatedNumberOfUsers: js.UndefOr[IntegerType] = js.undefined,
    Id: UserPoolIdType = null,
    LambdaConfig: LambdaConfigType = null,
    LastModifiedDate: DateType = null,
    MfaConfiguration: UserPoolMfaType = null,
    Name: UserPoolNameType = null,
    Policies: UserPoolPolicyType = null,
    SchemaAttributes: SchemaAttributesListType = null,
    SmsAuthenticationMessage: SmsVerificationMessageType = null,
    SmsConfiguration: SmsConfigurationType = null,
    SmsConfigurationFailure: StringType = null,
    SmsVerificationMessage: SmsVerificationMessageType = null,
    Status: StatusType = null,
    UserPoolAddOns: UserPoolAddOnsType = null,
    UserPoolTags: UserPoolTagsType = null,
    UsernameAttributes: UsernameAttributesListType = null,
    VerificationMessageTemplate: VerificationMessageTemplateType = null
  ): UserPoolType = {
    val __obj = js.Dynamic.literal()
    if (AdminCreateUserConfig != null) __obj.updateDynamic("AdminCreateUserConfig")(AdminCreateUserConfig)
    if (AliasAttributes != null) __obj.updateDynamic("AliasAttributes")(AliasAttributes)
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (AutoVerifiedAttributes != null) __obj.updateDynamic("AutoVerifiedAttributes")(AutoVerifiedAttributes)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (CustomDomain != null) __obj.updateDynamic("CustomDomain")(CustomDomain)
    if (DeviceConfiguration != null) __obj.updateDynamic("DeviceConfiguration")(DeviceConfiguration)
    if (Domain != null) __obj.updateDynamic("Domain")(Domain)
    if (EmailConfiguration != null) __obj.updateDynamic("EmailConfiguration")(EmailConfiguration)
    if (EmailConfigurationFailure != null) __obj.updateDynamic("EmailConfigurationFailure")(EmailConfigurationFailure)
    if (EmailVerificationMessage != null) __obj.updateDynamic("EmailVerificationMessage")(EmailVerificationMessage)
    if (EmailVerificationSubject != null) __obj.updateDynamic("EmailVerificationSubject")(EmailVerificationSubject)
    if (!js.isUndefined(EstimatedNumberOfUsers)) __obj.updateDynamic("EstimatedNumberOfUsers")(EstimatedNumberOfUsers)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (LambdaConfig != null) __obj.updateDynamic("LambdaConfig")(LambdaConfig)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (MfaConfiguration != null) __obj.updateDynamic("MfaConfiguration")(MfaConfiguration.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Policies != null) __obj.updateDynamic("Policies")(Policies)
    if (SchemaAttributes != null) __obj.updateDynamic("SchemaAttributes")(SchemaAttributes)
    if (SmsAuthenticationMessage != null) __obj.updateDynamic("SmsAuthenticationMessage")(SmsAuthenticationMessage)
    if (SmsConfiguration != null) __obj.updateDynamic("SmsConfiguration")(SmsConfiguration)
    if (SmsConfigurationFailure != null) __obj.updateDynamic("SmsConfigurationFailure")(SmsConfigurationFailure)
    if (SmsVerificationMessage != null) __obj.updateDynamic("SmsVerificationMessage")(SmsVerificationMessage)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UserPoolAddOns != null) __obj.updateDynamic("UserPoolAddOns")(UserPoolAddOns)
    if (UserPoolTags != null) __obj.updateDynamic("UserPoolTags")(UserPoolTags)
    if (UsernameAttributes != null) __obj.updateDynamic("UsernameAttributes")(UsernameAttributes)
    if (VerificationMessageTemplate != null) __obj.updateDynamic("VerificationMessageTemplate")(VerificationMessageTemplate)
    __obj.asInstanceOf[UserPoolType]
  }
}

