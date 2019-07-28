package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserPoolRequest extends js.Object {
  /**
    * The configuration for AdminCreateUser requests.
    */
  var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined
  /**
    * The attributes that are automatically verified when the Amazon Cognito service makes a request to update user pools.
    */
  var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined
  /**
    * Device configuration.
    */
  var DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.undefined
  /**
    * Email configuration.
    */
  var EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.undefined
  /**
    * The contents of the email verification message.
    */
  var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined
  /**
    * The subject of the email verification message.
    */
  var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined
  /**
    * The AWS Lambda configuration information from the request to update the user pool.
    */
  var LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined
  /**
    * Can be one of the following values:    OFF - MFA tokens are not required and cannot be specified during user registration.    ON - MFA tokens are required for all user registrations. You can only specify required when you are initially creating a user pool.    OPTIONAL - Users have the option when registering to create an MFA token.  
    */
  var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined
  /**
    * A container with the policies you wish to update in a user pool.
    */
  var Policies: js.UndefOr[UserPoolPolicyType] = js.undefined
  /**
    * The contents of the SMS authentication message.
    */
  var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
  /**
    * SMS configuration.
    */
  var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined
  /**
    * A container with information about the SMS verification message.
    */
  var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
  /**
    * Used to enable advanced security risk detection. Set the key AdvancedSecurityMode to the value "AUDIT".
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
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    AdminCreateUserConfig: AdminCreateUserConfigType = null,
    AutoVerifiedAttributes: VerifiedAttributesListType = null,
    DeviceConfiguration: DeviceConfigurationType = null,
    EmailConfiguration: EmailConfigurationType = null,
    EmailVerificationMessage: EmailVerificationMessageType = null,
    EmailVerificationSubject: EmailVerificationSubjectType = null,
    LambdaConfig: LambdaConfigType = null,
    MfaConfiguration: UserPoolMfaType = null,
    Policies: UserPoolPolicyType = null,
    SmsAuthenticationMessage: SmsVerificationMessageType = null,
    SmsConfiguration: SmsConfigurationType = null,
    SmsVerificationMessage: SmsVerificationMessageType = null,
    UserPoolAddOns: UserPoolAddOnsType = null,
    UserPoolTags: UserPoolTagsType = null,
    VerificationMessageTemplate: VerificationMessageTemplateType = null
  ): UpdateUserPoolRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId)
    if (AdminCreateUserConfig != null) __obj.updateDynamic("AdminCreateUserConfig")(AdminCreateUserConfig)
    if (AutoVerifiedAttributes != null) __obj.updateDynamic("AutoVerifiedAttributes")(AutoVerifiedAttributes)
    if (DeviceConfiguration != null) __obj.updateDynamic("DeviceConfiguration")(DeviceConfiguration)
    if (EmailConfiguration != null) __obj.updateDynamic("EmailConfiguration")(EmailConfiguration)
    if (EmailVerificationMessage != null) __obj.updateDynamic("EmailVerificationMessage")(EmailVerificationMessage)
    if (EmailVerificationSubject != null) __obj.updateDynamic("EmailVerificationSubject")(EmailVerificationSubject)
    if (LambdaConfig != null) __obj.updateDynamic("LambdaConfig")(LambdaConfig)
    if (MfaConfiguration != null) __obj.updateDynamic("MfaConfiguration")(MfaConfiguration.asInstanceOf[js.Any])
    if (Policies != null) __obj.updateDynamic("Policies")(Policies)
    if (SmsAuthenticationMessage != null) __obj.updateDynamic("SmsAuthenticationMessage")(SmsAuthenticationMessage)
    if (SmsConfiguration != null) __obj.updateDynamic("SmsConfiguration")(SmsConfiguration)
    if (SmsVerificationMessage != null) __obj.updateDynamic("SmsVerificationMessage")(SmsVerificationMessage)
    if (UserPoolAddOns != null) __obj.updateDynamic("UserPoolAddOns")(UserPoolAddOns)
    if (UserPoolTags != null) __obj.updateDynamic("UserPoolTags")(UserPoolTags)
    if (VerificationMessageTemplate != null) __obj.updateDynamic("VerificationMessageTemplate")(VerificationMessageTemplate)
    __obj.asInstanceOf[UpdateUserPoolRequest]
  }
}

