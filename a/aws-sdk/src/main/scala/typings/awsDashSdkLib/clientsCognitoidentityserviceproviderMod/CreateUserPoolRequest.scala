package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserPoolRequest extends js.Object {
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
    * The device configuration.
    */
  var DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.undefined
  /**
    * The email configuration.
    */
  var EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.undefined
  /**
    * A string representing the email verification message.
    */
  var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined
  /**
    * A string representing the email verification subject.
    */
  var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined
  /**
    * The Lambda trigger configuration information for the new user pool.  In a push model, event sources (such as Amazon S3 and custom applications) need permission to invoke a function. So you will need to make an extra call to add permission for these event sources to invoke your Lambda function.  For more information on using the Lambda API to add permission, see  AddPermission .  For adding permission using the AWS CLI, see  add-permission . 
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
    * The SMS configuration.
    */
  var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined
  /**
    * A string representing the SMS verification message.
    */
  var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
  /**
    * Used to enable advanced security risk detection. Set the key AdvancedSecurityMode to the value "AUDIT".
    */
  var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined
  /**
    * The tag keys and values to assign to the user pool. A tag is a label that you can use to categorize and manage user pools in different ways, such as by purpose, owner, environment, or other criteria.
    */
  var UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined
  /**
    * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
    */
  var UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.undefined
  /**
    * The template for the verification message that the user sees when the app requests permission to access the user's information.
    */
  var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined
}

object CreateUserPoolRequest {
  @scala.inline
  def apply(
    PoolName: UserPoolNameType,
    AdminCreateUserConfig: AdminCreateUserConfigType = null,
    AliasAttributes: AliasAttributesListType = null,
    AutoVerifiedAttributes: VerifiedAttributesListType = null,
    DeviceConfiguration: DeviceConfigurationType = null,
    EmailConfiguration: EmailConfigurationType = null,
    EmailVerificationMessage: EmailVerificationMessageType = null,
    EmailVerificationSubject: EmailVerificationSubjectType = null,
    LambdaConfig: LambdaConfigType = null,
    MfaConfiguration: UserPoolMfaType = null,
    Policies: UserPoolPolicyType = null,
    Schema: SchemaAttributesListType = null,
    SmsAuthenticationMessage: SmsVerificationMessageType = null,
    SmsConfiguration: SmsConfigurationType = null,
    SmsVerificationMessage: SmsVerificationMessageType = null,
    UserPoolAddOns: UserPoolAddOnsType = null,
    UserPoolTags: UserPoolTagsType = null,
    UsernameAttributes: UsernameAttributesListType = null,
    VerificationMessageTemplate: VerificationMessageTemplateType = null
  ): CreateUserPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName)
    if (AdminCreateUserConfig != null) __obj.updateDynamic("AdminCreateUserConfig")(AdminCreateUserConfig)
    if (AliasAttributes != null) __obj.updateDynamic("AliasAttributes")(AliasAttributes)
    if (AutoVerifiedAttributes != null) __obj.updateDynamic("AutoVerifiedAttributes")(AutoVerifiedAttributes)
    if (DeviceConfiguration != null) __obj.updateDynamic("DeviceConfiguration")(DeviceConfiguration)
    if (EmailConfiguration != null) __obj.updateDynamic("EmailConfiguration")(EmailConfiguration)
    if (EmailVerificationMessage != null) __obj.updateDynamic("EmailVerificationMessage")(EmailVerificationMessage)
    if (EmailVerificationSubject != null) __obj.updateDynamic("EmailVerificationSubject")(EmailVerificationSubject)
    if (LambdaConfig != null) __obj.updateDynamic("LambdaConfig")(LambdaConfig)
    if (MfaConfiguration != null) __obj.updateDynamic("MfaConfiguration")(MfaConfiguration.asInstanceOf[js.Any])
    if (Policies != null) __obj.updateDynamic("Policies")(Policies)
    if (Schema != null) __obj.updateDynamic("Schema")(Schema)
    if (SmsAuthenticationMessage != null) __obj.updateDynamic("SmsAuthenticationMessage")(SmsAuthenticationMessage)
    if (SmsConfiguration != null) __obj.updateDynamic("SmsConfiguration")(SmsConfiguration)
    if (SmsVerificationMessage != null) __obj.updateDynamic("SmsVerificationMessage")(SmsVerificationMessage)
    if (UserPoolAddOns != null) __obj.updateDynamic("UserPoolAddOns")(UserPoolAddOns)
    if (UserPoolTags != null) __obj.updateDynamic("UserPoolTags")(UserPoolTags)
    if (UsernameAttributes != null) __obj.updateDynamic("UsernameAttributes")(UsernameAttributes)
    if (VerificationMessageTemplate != null) __obj.updateDynamic("VerificationMessageTemplate")(VerificationMessageTemplate)
    __obj.asInstanceOf[CreateUserPoolRequest]
  }
}

