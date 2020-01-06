package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailConfigurationType extends js.Object {
  /**
    * The set of configuration rules that can be applied to emails sent using Amazon SES. A configuration set is applied to an email by including a reference to the configuration set in the headers of the email. Once applied, all of the rules in that configuration set are applied to the email. Configuration sets can be used to apply the following types of rules to emails:    Event publishing – Amazon SES can track the number of send, delivery, open, click, bounce, and complaint events for each email sent. Use event publishing to send information about these events to other AWS services such as SNS and CloudWatch.   IP pool management – When leasing dedicated IP addresses with Amazon SES, you can create groups of IP addresses, called dedicated IP pools. You can then associate the dedicated IP pools with configuration sets.  
    */
  var ConfigurationSet: js.UndefOr[SESConfigurationSet] = js.native
  /**
    * Specifies whether Amazon Cognito emails your users by using its built-in email functionality or your Amazon SES email configuration. Specify one of the following values:  COGNITO_DEFAULT  When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default option, Amazon Cognito allows only a limited number of emails each day for your user pool. For typical production environments, the default email limit is below the required delivery volume. To achieve a higher delivery volume, specify DEVELOPER to use your Amazon SES email configuration. To look up the email delivery limit for the default option, see Limits in Amazon Cognito in the Amazon Cognito Developer Guide. The default FROM address is no-reply@verificationemail.com. To customize the FROM address, provide the ARN of an Amazon SES verified email address for the SourceArn parameter.  DEVELOPER  When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon SES on your behalf to send email from your verified email address. When you use this option, the email delivery limits are the same limits that apply to your Amazon SES verified email address in your AWS account. If you use this option, you must provide the ARN of an Amazon SES verified email address for the SourceArn parameter. Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your behalf. When you update your user pool with this option, Amazon Cognito creates a service-linked role, which is a type of IAM role, in your AWS account. This role contains the permissions that allow Amazon Cognito to access Amazon SES and send email messages with your address. For more information about the service-linked role that Amazon Cognito creates, see Using Service-Linked Roles for Amazon Cognito in the Amazon Cognito Developer Guide.  
    */
  var EmailSendingAccount: js.UndefOr[EmailSendingAccountType] = js.native
  /**
    * Identifies either the sender’s email address or the sender’s name with their email address. For example, testuser@example.com or Test User &lt;testuser@example.com&gt;. This address will appear before the body of the email.
    */
  var From: js.UndefOr[StringType] = js.native
  /**
    * The destination to which the receiver of the email should reply to.
    */
  var ReplyToEmailAddress: js.UndefOr[EmailAddressType] = js.native
  /**
    * The Amazon Resource Name (ARN) of a verified email address in Amazon SES. This email address is used in one of the following ways, depending on the value that you specify for the EmailSendingAccount parameter:   If you specify COGNITO_DEFAULT, Amazon Cognito uses this address as the custom FROM address when it emails your users by using its built-in email account.   If you specify DEVELOPER, Amazon Cognito emails your users with this address by calling Amazon SES on your behalf.  
    */
  var SourceArn: js.UndefOr[ArnType] = js.native
}

object EmailConfigurationType {
  @scala.inline
  def apply(
    ConfigurationSet: SESConfigurationSet = null,
    EmailSendingAccount: EmailSendingAccountType = null,
    From: StringType = null,
    ReplyToEmailAddress: EmailAddressType = null,
    SourceArn: ArnType = null
  ): EmailConfigurationType = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationSet != null) __obj.updateDynamic("ConfigurationSet")(ConfigurationSet.asInstanceOf[js.Any])
    if (EmailSendingAccount != null) __obj.updateDynamic("EmailSendingAccount")(EmailSendingAccount.asInstanceOf[js.Any])
    if (From != null) __obj.updateDynamic("From")(From.asInstanceOf[js.Any])
    if (ReplyToEmailAddress != null) __obj.updateDynamic("ReplyToEmailAddress")(ReplyToEmailAddress.asInstanceOf[js.Any])
    if (SourceArn != null) __obj.updateDynamic("SourceArn")(SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailConfigurationType]
  }
}

