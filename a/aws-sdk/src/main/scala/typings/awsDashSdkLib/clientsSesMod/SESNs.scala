package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/ses", "SES")
@js.native
object SESNs extends js.Object {
  trait AddHeaderAction extends js.Object {
    /**
      * The name of the header to add. Must be between 1 and 50 characters, inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and dashes only.
      */
    var HeaderName: awsDashSdkLib.clientsSesMod.SESNs.HeaderName
    /**
      * Must be less than 2048 characters, and must not contain newline characters ("\r" or "\n").
      */
    var HeaderValue: awsDashSdkLib.clientsSesMod.SESNs.HeaderValue
  }
  
  trait Body extends js.Object {
    /**
      * The content of the message, in HTML format. Use this for email clients that can process HTML. You can include clickable links, formatted text, and much more in an HTML message.
      */
    var Html: js.UndefOr[Content] = js.undefined
    /**
      * The content of the message, in text format. Use this for text-based email clients, or clients on high-latency networks (such as mobile devices).
      */
    var Text: js.UndefOr[Content] = js.undefined
  }
  
  trait BounceAction extends js.Object {
    /**
      * Human-readable text to include in the bounce message.
      */
    var Message: BounceMessage
    /**
      * The email address of the sender of the bounced email. This is the address from which the bounce message will be sent.
      */
    var Sender: Address
    /**
      * The SMTP reply code, as defined by RFC 5321.
      */
    var SmtpReplyCode: BounceSmtpReplyCode
    /**
      * The SMTP enhanced status code, as defined by RFC 3463.
      */
    var StatusCode: js.UndefOr[BounceStatusCode] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the bounce action is taken. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
      */
    var TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
  }
  
  trait BouncedRecipientInfo extends js.Object {
    /**
      * The reason for the bounce. You must provide either this parameter or RecipientDsnFields.
      */
    var BounceType: js.UndefOr[BounceType] = js.undefined
    /**
      * The email address of the recipient of the bounced email.
      */
    var Recipient: Address
    /**
      * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to receive email for the recipient of the bounced email. For more information about sending authorization, see the Amazon SES Developer Guide.
      */
    var RecipientArn: js.UndefOr[AmazonResourceName] = js.undefined
    /**
      * Recipient-related DSN fields, most of which would normally be filled in automatically when provided with a BounceType. You must provide either this parameter or BounceType.
      */
    var RecipientDsnFields: js.UndefOr[RecipientDsnFields] = js.undefined
  }
  
  trait BulkEmailDestination extends js.Object {
    var Destination: awsDashSdkLib.clientsSesMod.SESNs.Destination
    /**
      * A list of tags, in the form of name/value pairs, to apply to an email that you send using SendBulkTemplatedEmail. Tags correspond to characteristics of the email that you define, so that you can publish email sending events.
      */
    var ReplacementTags: js.UndefOr[MessageTagList] = js.undefined
    /**
      * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
      */
    var ReplacementTemplateData: js.UndefOr[TemplateData] = js.undefined
  }
  
  trait BulkEmailDestinationStatus extends js.Object {
    /**
      * A description of an error that prevented a message being sent using the SendBulkTemplatedEmail operation.
      */
    var Error: js.UndefOr[Error] = js.undefined
    /**
      * The unique message identifier returned from the SendBulkTemplatedEmail operation.
      */
    var MessageId: js.UndefOr[MessageId] = js.undefined
    /**
      * The status of a message sent using the SendBulkTemplatedEmail operation. Possible values for this parameter include:    Success: Amazon SES accepted the message, and will attempt to deliver it to the recipients.    MessageRejected: The message was rejected because it contained a virus.    MailFromDomainNotVerified: The sender's email address or domain was not verified.    ConfigurationSetDoesNotExist: The configuration set you specified does not exist.    TemplateDoesNotExist: The template you specified does not exist.    AccountSuspended: Your account has been shut down because of issues related to your email sending practices.    AccountThrottled: The number of emails you can send has been reduced because your account has exceeded its allocated sending limit.    AccountDailyQuotaExceeded: You have reached or exceeded the maximum number of emails you can send from your account in a 24-hour period.    InvalidSendingPoolName: The configuration set you specified refers to an IP pool that does not exist.    AccountSendingPaused: Email sending for the Amazon SES account was disabled using the UpdateAccountSendingEnabled operation.    ConfigurationSetSendingPaused: Email sending for this configuration set was disabled using the UpdateConfigurationSetSendingEnabled operation.    InvalidParameterValue: One or more of the parameters you specified when calling this operation was invalid. See the error message for additional information.    TransientFailure: Amazon SES was unable to process your request because of a temporary issue.    Failed: Amazon SES was unable to process your request. See the error message for additional information.  
      */
    var Status: js.UndefOr[BulkEmailStatus] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CloneReceiptRuleSetRequest extends js.Object {
    /**
      * The name of the rule set to clone.
      */
    var OriginalRuleSetName: ReceiptRuleSetName
    /**
      * The name of the rule set to create. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
      */
    var RuleSetName: ReceiptRuleSetName
  }
  
  trait CloneReceiptRuleSetResponse extends js.Object
  
  trait CloudWatchDestination extends js.Object {
    /**
      * A list of dimensions upon which to categorize your emails when you publish email sending events to Amazon CloudWatch.
      */
    var DimensionConfigurations: CloudWatchDimensionConfigurations
  }
  
  trait CloudWatchDimensionConfiguration extends js.Object {
    /**
      * The default value of the dimension that is published to Amazon CloudWatch if you do not provide the value of the dimension when you send an email. The default value must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 256 characters.  
      */
    var DefaultDimensionValue: awsDashSdkLib.clientsSesMod.SESNs.DefaultDimensionValue
    /**
      * The name of an Amazon CloudWatch dimension associated with an email sending metric. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 256 characters.  
      */
    var DimensionName: awsDashSdkLib.clientsSesMod.SESNs.DimensionName
    /**
      * The place where Amazon SES finds the value of a dimension to publish to Amazon CloudWatch. If you want Amazon SES to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a parameter to the SendEmail/SendRawEmail API, choose messageTag. If you want Amazon SES to use your own email headers, choose emailHeader.
      */
    var DimensionValueSource: awsDashSdkLib.clientsSesMod.SESNs.DimensionValueSource
  }
  
  trait ConfigurationSet extends js.Object {
    /**
      * The name of the configuration set. The name must meet the following requirements:   Contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain 64 characters or fewer.  
      */
    var Name: ConfigurationSetName
  }
  
  trait Content extends js.Object {
    /**
      * The character set of the content.
      */
    var Charset: js.UndefOr[Charset] = js.undefined
    /**
      * The textual data of the content.
      */
    var Data: MessageData
  }
  
  trait CreateConfigurationSetEventDestinationRequest extends js.Object {
    /**
      * The name of the configuration set that the event destination should be associated with.
      */
    var ConfigurationSetName: awsDashSdkLib.clientsSesMod.SESNs.ConfigurationSetName
    /**
      * An object that describes the AWS service that email sending event information will be published to.
      */
    var EventDestination: awsDashSdkLib.clientsSesMod.SESNs.EventDestination
  }
  
  trait CreateConfigurationSetEventDestinationResponse extends js.Object
  
  trait CreateConfigurationSetRequest extends js.Object {
    /**
      * A data structure that contains the name of the configuration set.
      */
    var ConfigurationSet: awsDashSdkLib.clientsSesMod.SESNs.ConfigurationSet
  }
  
  trait CreateConfigurationSetResponse extends js.Object
  
  trait CreateConfigurationSetTrackingOptionsRequest extends js.Object {
    /**
      * The name of the configuration set that the tracking options should be associated with.
      */
    var ConfigurationSetName: awsDashSdkLib.clientsSesMod.SESNs.ConfigurationSetName
    var TrackingOptions: awsDashSdkLib.clientsSesMod.SESNs.TrackingOptions
  }
  
  trait CreateConfigurationSetTrackingOptionsResponse extends js.Object
  
  trait CreateCustomVerificationEmailTemplateRequest extends js.Object {
    /**
      * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
      */
    var FailureRedirectionURL: awsDashSdkLib.clientsSesMod.SESNs.FailureRedirectionURL
    /**
      * The email address that the custom verification email is sent from.
      */
    var FromEmailAddress: FromAddress
    /**
      * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
      */
    var SuccessRedirectionURL: awsDashSdkLib.clientsSesMod.SESNs.SuccessRedirectionURL
    /**
      * The content of the custom verification email. The total size of the email must be less than 10 MB. The message body may contain HTML, with some limitations. For more information, see Custom Verification Email Frequently Asked Questions in the Amazon SES Developer Guide.
      */
    var TemplateContent: awsDashSdkLib.clientsSesMod.SESNs.TemplateContent
    /**
      * The name of the custom verification email template.
      */
    var TemplateName: awsDashSdkLib.clientsSesMod.SESNs.TemplateName
    /**
      * The subject line of the custom verification email.
      */
    var TemplateSubject: Subject
  }
  
  trait CreateReceiptFilterRequest extends js.Object {
    /**
      * A data structure that describes the IP address filter to create, which consists of a name, an IP address range, and whether to allow or block mail from it.
      */
    var Filter: ReceiptFilter
  }
  
  trait CreateReceiptFilterResponse extends js.Object
  
  trait CreateReceiptRuleRequest extends js.Object {
    /**
      * The name of an existing rule after which the new rule will be placed. If this parameter is null, the new rule will be inserted at the beginning of the rule list.
      */
    var After: js.UndefOr[ReceiptRuleName] = js.undefined
    /**
      * A data structure that contains the specified rule's name, actions, recipients, domains, enabled status, scan status, and TLS policy.
      */
    var Rule: ReceiptRule
    /**
      * The name of the rule set that the receipt rule will be added to.
      */
    var RuleSetName: ReceiptRuleSetName
  }
  
  trait CreateReceiptRuleResponse extends js.Object
  
  trait CreateReceiptRuleSetRequest extends js.Object {
    /**
      * The name of the rule set to create. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
      */
    var RuleSetName: ReceiptRuleSetName
  }
  
  trait CreateReceiptRuleSetResponse extends js.Object
  
  trait CreateTemplateRequest extends js.Object {
    /**
      * The content of the email, composed of a subject line, an HTML part, and a text-only part.
      */
    var Template: awsDashSdkLib.clientsSesMod.SESNs.Template
  }
  
  trait CreateTemplateResponse extends js.Object
  
  trait CustomVerificationEmailTemplate extends js.Object {
    /**
      * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
      */
    var FailureRedirectionURL: js.UndefOr[FailureRedirectionURL] = js.undefined
    /**
      * The email address that the custom verification email is sent from.
      */
    var FromEmailAddress: js.UndefOr[FromAddress] = js.undefined
    /**
      * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
      */
    var SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL] = js.undefined
    /**
      * The name of the custom verification email template.
      */
    var TemplateName: js.UndefOr[TemplateName] = js.undefined
    /**
      * The subject line of the custom verification email.
      */
    var TemplateSubject: js.UndefOr[Subject] = js.undefined
  }
  
  trait DeleteConfigurationSetEventDestinationRequest extends js.Object {
    /**
      * The name of the configuration set from which to delete the event destination.
      */
    var ConfigurationSetName: awsDashSdkLib.clientsSesMod.SESNs.ConfigurationSetName
    /**
      * The name of the event destination to delete.
      */
    var EventDestinationName: awsDashSdkLib.clientsSesMod.SESNs.EventDestinationName
  }
  
  trait DeleteConfigurationSetEventDestinationResponse extends js.Object
  
  trait DeleteConfigurationSetRequest extends js.Object {
    /**
      * The name of the configuration set to delete.
      */
    var ConfigurationSetName: awsDashSdkLib.clientsSesMod.SESNs.ConfigurationSetName
  }
  
  trait DeleteConfigurationSetResponse extends js.Object
  
  trait DeleteConfigurationSetTrackingOptionsRequest extends js.Object {
    /**
      * The name of the configuration set from which you want to delete the tracking options.
      */
    var ConfigurationSetName: awsDashSdkLib.clientsSesMod.SESNs.ConfigurationSetName
  }
  
  trait DeleteConfigurationSetTrackingOptionsResponse extends js.Object
  
  trait DeleteCustomVerificationEmailTemplateRequest extends js.Object {
    /**
      * The name of the custom verification email template that you want to delete.
      */
    var TemplateName: awsDashSdkLib.clientsSesMod.SESNs.TemplateName
  }
  
  trait DeleteIdentityPolicyRequest extends js.Object {
    /**
      * The identity that is associated with the policy that you want to delete. You can specify the identity by using its name or by using its Amazon Resource Name (ARN). Examples: user@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com. To successfully call this API, you must own the identity.
      */
    var Identity: awsDashSdkLib.clientsSesMod.SESNs.Identity
    /**
      * The name of the policy to be deleted.
      */
    var PolicyName: awsDashSdkLib.clientsSesMod.SESNs.PolicyName
  }
  
  trait DeleteIdentityPolicyResponse extends js.Object
  
  trait DeleteIdentityRequest extends js.Object {
    /**
      * The identity to be removed from the list of identities for the AWS Account.
      */
    var Identity: awsDashSdkLib.clientsSesMod.SESNs.Identity
  }
  
  trait DeleteIdentityResponse extends js.Object
  
  trait DeleteReceiptFilterRequest extends js.Object {
    /**
      * The name of the IP address filter to delete.
      */
    var FilterName: ReceiptFilterName
  }
  
  trait DeleteReceiptFilterResponse extends js.Object
  
  trait DeleteReceiptRuleRequest extends js.Object {
    /**
      * The name of the receipt rule to delete.
      */
    var RuleName: ReceiptRuleName
    /**
      * The name of the receipt rule set that contains the receipt rule to delete.
      */
    var RuleSetName: ReceiptRuleSetName
  }
  
  trait DeleteReceiptRuleResponse extends js.Object
  
  trait DeleteReceiptRuleSetRequest extends js.Object {
    /**
      * The name of the receipt rule set to delete.
      */
    var RuleSetName: ReceiptRuleSetName
  }
  
  trait DeleteReceiptRuleSetResponse extends js.Object
  
  trait DeleteTemplateRequest extends js.Object {
    /**
      * The name of the template to be deleted.
      */
    var TemplateName: awsDashSdkLib.clientsSesMod.SESNs.TemplateName
  }
  
  trait DeleteTemplateResponse extends js.Object
  
  trait DeleteVerifiedEmailAddressRequest extends js.Object {
    /**
      * An email address to be removed from the list of verified addresses.
      */
    var EmailAddress: Address
  }
  
  trait DescribeActiveReceiptRuleSetRequest extends js.Object
  
  trait DescribeActiveReceiptRuleSetResponse extends js.Object {
    /**
      * The metadata for the currently active receipt rule set. The metadata consists of the rule set name and a timestamp of when the rule set was created.
      */
    var Metadata: js.UndefOr[ReceiptRuleSetMetadata] = js.undefined
    /**
      * The receipt rules that belong to the active rule set.
      */
    var Rules: js.UndefOr[ReceiptRulesList] = js.undefined
  }
  
  trait DescribeConfigurationSetRequest extends js.Object {
    /**
      * A list of configuration set attributes to return.
      */
    var ConfigurationSetAttributeNames: js.UndefOr[ConfigurationSetAttributeList] = js.undefined
    /**
      * The name of the configuration set to describe.
      */
    var ConfigurationSetName: awsDashSdkLib.clientsSesMod.SESNs.ConfigurationSetName
  }
  
  trait DescribeConfigurationSetResponse extends js.Object {
    /**
      * The configuration set object associated with the specified configuration set.
      */
    var ConfigurationSet: js.UndefOr[ConfigurationSet] = js.undefined
    /**
      * A list of event destinations associated with the configuration set. 
      */
    var EventDestinations: js.UndefOr[EventDestinations] = js.undefined
    /**
      * An object that represents the reputation settings for the configuration set. 
      */
    var ReputationOptions: js.UndefOr[ReputationOptions] = js.undefined
    /**
      * The name of the custom open and click tracking domain associated with the configuration set.
      */
    var TrackingOptions: js.UndefOr[TrackingOptions] = js.undefined
  }
  
  trait DescribeReceiptRuleRequest extends js.Object {
    /**
      * The name of the receipt rule.
      */
    var RuleName: ReceiptRuleName
    /**
      * The name of the receipt rule set that the receipt rule belongs to.
      */
    var RuleSetName: ReceiptRuleSetName
  }
  
  trait DescribeReceiptRuleResponse extends js.Object {
    /**
      * A data structure that contains the specified receipt rule's name, actions, recipients, domains, enabled status, scan status, and Transport Layer Security (TLS) policy.
      */
    var Rule: js.UndefOr[ReceiptRule] = js.undefined
  }
  
  trait DescribeReceiptRuleSetRequest extends js.Object {
    /**
      * The name of the receipt rule set to describe.
      */
    var RuleSetName: ReceiptRuleSetName
  }
  
  trait DescribeReceiptRuleSetResponse extends js.Object {
    /**
      * The metadata for the receipt rule set, which consists of the rule set name and the timestamp of when the rule set was created.
      */
    var Metadata: js.UndefOr[ReceiptRuleSetMetadata] = js.undefined
    /**
      * A list of the receipt rules that belong to the specified receipt rule set.
      */
    var Rules: js.UndefOr[ReceiptRulesList] = js.undefined
  }
  
  trait Destination extends js.Object {
    /**
      * The BCC: field(s) of the message.
      */
    var BccAddresses: js.UndefOr[AddressList] = js.undefined
    /**
      * The CC: field(s) of the message.
      */
    var CcAddresses: js.UndefOr[AddressList] = js.undefined
    /**
      * The To: field(s) of the message.
      */
    var ToAddresses: js.UndefOr[AddressList] = js.undefined
  }
  
  trait DkimAttributes
    extends /* key */ org.scalablytyped.runtime.StringDictionary[IdentityDkimAttributes]
  
  trait EventDestination extends js.Object {
    /**
      * An object that contains the names, default values, and sources of the dimensions associated with an Amazon CloudWatch event destination.
      */
    var CloudWatchDestination: js.UndefOr[CloudWatchDestination] = js.undefined
    /**
      * Sets whether Amazon SES publishes events to this destination when you send an email with the associated configuration set. Set to true to enable publishing to this destination; set to false to prevent publishing to this destination. The default value is false.
      */
    var Enabled: js.UndefOr[Enabled] = js.undefined
    /**
      * An object that contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis Firehose event destination.
      */
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined
    /**
      * The type of email sending events to publish to the event destination.
      */
    var MatchingEventTypes: EventTypes
    /**
      * The name of the event destination. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 64 characters.  
      */
    var Name: EventDestinationName
    /**
      * An object that contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS) event destination.
      */
    var SNSDestination: js.UndefOr[SNSDestination] = js.undefined
  }
  
  trait ExtensionField extends js.Object {
    /**
      * The name of the header to add. Must be between 1 and 50 characters, inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and dashes only.
      */
    var Name: ExtensionFieldName
    /**
      * The value of the header to add. Must be less than 2048 characters, and must not contain newline characters ("\r" or "\n").
      */
    var Value: ExtensionFieldValue
  }
  
  trait GetAccountSendingEnabledResponse extends js.Object {
    /**
      * Describes whether email sending is enabled or disabled for your Amazon SES account in the current AWS Region.
      */
    var Enabled: js.UndefOr[Enabled] = js.undefined
  }
  
  trait GetCustomVerificationEmailTemplateRequest extends js.Object {
    /**
      * The name of the custom verification email template that you want to retrieve.
      */
    var TemplateName: awsDashSdkLib.clientsSesMod.SESNs.TemplateName
  }
  
  trait GetCustomVerificationEmailTemplateResponse extends js.Object {
    /**
      * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
      */
    var FailureRedirectionURL: js.UndefOr[FailureRedirectionURL] = js.undefined
    /**
      * The email address that the custom verification email is sent from.
      */
    var FromEmailAddress: js.UndefOr[FromAddress] = js.undefined
    /**
      * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
      */
    var SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL] = js.undefined
    /**
      * The content of the custom verification email.
      */
    var TemplateContent: js.UndefOr[TemplateContent] = js.undefined
    /**
      * The name of the custom verification email template.
      */
    var TemplateName: js.UndefOr[TemplateName] = js.undefined
    /**
      * The subject line of the custom verification email.
      */
    var TemplateSubject: js.UndefOr[Subject] = js.undefined
  }
  
  trait GetIdentityDkimAttributesRequest extends js.Object {
    /**
      * A list of one or more verified identities - email addresses, domains, or both.
      */
    var Identities: IdentityList
  }
  
  trait GetIdentityDkimAttributesResponse extends js.Object {
    /**
      * The DKIM attributes for an email address or a domain.
      */
    var DkimAttributes: awsDashSdkLib.clientsSesMod.SESNs.DkimAttributes
  }
  
  trait GetIdentityMailFromDomainAttributesRequest extends js.Object {
    /**
      * A list of one or more identities.
      */
    var Identities: IdentityList
  }
  
  trait GetIdentityMailFromDomainAttributesResponse extends js.Object {
    /**
      * A map of identities to custom MAIL FROM attributes.
      */
    var MailFromDomainAttributes: awsDashSdkLib.clientsSesMod.SESNs.MailFromDomainAttributes
  }
  
  trait GetIdentityNotificationAttributesRequest extends js.Object {
    /**
      * A list of one or more identities. You can specify an identity by using its name or by using its Amazon Resource Name (ARN). Examples: user@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com.
      */
    var Identities: IdentityList
  }
  
  trait GetIdentityNotificationAttributesResponse extends js.Object {
    /**
      * A map of Identity to IdentityNotificationAttributes.
      */
    var NotificationAttributes: awsDashSdkLib.clientsSesMod.SESNs.NotificationAttributes
  }
  
  trait GetIdentityPoliciesRequest extends js.Object {
    /**
      * The identity for which the policies will be retrieved. You can specify an identity by using its name or by using its Amazon Resource Name (ARN). Examples: user@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com. To successfully call this API, you must own the identity.
      */
    var Identity: awsDashSdkLib.clientsSesMod.SESNs.Identity
    /**
      * A list of the names of policies to be retrieved. You can retrieve a maximum of 20 policies at a time. If you do not know the names of the policies that are attached to the identity, you can use ListIdentityPolicies.
      */
    var PolicyNames: PolicyNameList
  }
  
  trait GetIdentityPoliciesResponse extends js.Object {
    /**
      * A map of policy names to policies.
      */
    var Policies: PolicyMap
  }
  
  trait GetIdentityVerificationAttributesRequest extends js.Object {
    /**
      * A list of identities.
      */
    var Identities: IdentityList
  }
  
  trait GetIdentityVerificationAttributesResponse extends js.Object {
    /**
      * A map of Identities to IdentityVerificationAttributes objects.
      */
    var VerificationAttributes: awsDashSdkLib.clientsSesMod.SESNs.VerificationAttributes
  }
  
  trait GetSendQuotaResponse extends js.Object {
    /**
      * The maximum number of emails the user is allowed to send in a 24-hour interval. A value of -1 signifies an unlimited quota.
      */
    var Max24HourSend: js.UndefOr[Max24HourSend] = js.undefined
    /**
      * The maximum number of emails that Amazon SES can accept from the user's account per second.  The rate at which Amazon SES accepts the user's messages might be less than the maximum send rate. 
      */
    var MaxSendRate: js.UndefOr[MaxSendRate] = js.undefined
    /**
      * The number of emails sent during the previous 24 hours.
      */
    var SentLast24Hours: js.UndefOr[SentLast24Hours] = js.undefined
  }
  
  trait GetSendStatisticsResponse extends js.Object {
    /**
      * A list of data points, each of which represents 15 minutes of activity.
      */
    var SendDataPoints: js.UndefOr[SendDataPointList] = js.undefined
  }
  
  trait GetTemplateRequest extends js.Object {
    /**
      * The name of the template you want to retrieve.
      */
    var TemplateName: awsDashSdkLib.clientsSesMod.SESNs.TemplateName
  }
  
  trait GetTemplateResponse extends js.Object {
    var Template: js.UndefOr[Template] = js.undefined
  }
  
  trait IdentityDkimAttributes extends js.Object {
    /**
      * True if DKIM signing is enabled for email sent from the identity; false otherwise. The default value is true.
      */
    var DkimEnabled: Enabled
    /**
      * A set of character strings that represent the domain's identity. Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by Amazon SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection process may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign email originating from that domain. (This only applies to domain identities, not email address identities.) For more information about creating DNS records using DKIM tokens, go to the Amazon SES Developer Guide.
      */
    var DkimTokens: js.UndefOr[VerificationTokenList] = js.undefined
    /**
      * Describes whether Amazon SES has successfully verified the DKIM DNS records (tokens) published in the domain name's DNS. (This only applies to domain identities, not email address identities.)
      */
    var DkimVerificationStatus: VerificationStatus
  }
  
  trait IdentityMailFromDomainAttributes extends js.Object {
    /**
      * The action that Amazon SES takes if it cannot successfully read the required MX record when you send an email. A value of UseDefaultValue indicates that if Amazon SES cannot read the required MX record, it uses amazonses.com (or a subdomain of that) as the MAIL FROM domain. A value of RejectMessage indicates that if Amazon SES cannot read the required MX record, Amazon SES returns a MailFromDomainNotVerified error and does not send the email. The custom MAIL FROM setup states that result in this behavior are Pending, Failed, and TemporaryFailure.
      */
    var BehaviorOnMXFailure: awsDashSdkLib.clientsSesMod.SESNs.BehaviorOnMXFailure
    /**
      * The custom MAIL FROM domain that the identity is configured to use.
      */
    var MailFromDomain: MailFromDomainName
    /**
      * The state that indicates whether Amazon SES has successfully read the MX record required for custom MAIL FROM domain setup. If the state is Success, Amazon SES uses the specified custom MAIL FROM domain when the verified identity sends an email. All other states indicate that Amazon SES takes the action described by BehaviorOnMXFailure.
      */
    var MailFromDomainStatus: CustomMailFromStatus
  }
  
  trait IdentityNotificationAttributes extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES will publish bounce notifications.
      */
    var BounceTopic: NotificationTopic
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES will publish complaint notifications.
      */
    var ComplaintTopic: NotificationTopic
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES will publish delivery notifications.
      */
    var DeliveryTopic: NotificationTopic
    /**
      * Describes whether Amazon SES will forward bounce and complaint notifications as email. true indicates that Amazon SES will forward bounce and complaint notifications as email, while false indicates that bounce and complaint notifications will be published only to the specified bounce and complaint Amazon SNS topics.
      */
    var ForwardingEnabled: Enabled
    /**
      * Describes whether Amazon SES includes the original email headers in Amazon SNS notifications of type Bounce. A value of true specifies that Amazon SES will include headers in bounce notifications, and a value of false specifies that Amazon SES will not include headers in bounce notifications.
      */
    var HeadersInBounceNotificationsEnabled: js.UndefOr[Enabled] = js.undefined
    /**
      * Describes whether Amazon SES includes the original email headers in Amazon SNS notifications of type Complaint. A value of true specifies that Amazon SES will include headers in complaint notifications, and a value of false specifies that Amazon SES will not include headers in complaint notifications.
      */
    var HeadersInComplaintNotificationsEnabled: js.UndefOr[Enabled] = js.undefined
    /**
      * Describes whether Amazon SES includes the original email headers in Amazon SNS notifications of type Delivery. A value of true specifies that Amazon SES will include headers in delivery notifications, and a value of false specifies that Amazon SES will not include headers in delivery notifications.
      */
    var HeadersInDeliveryNotificationsEnabled: js.UndefOr[Enabled] = js.undefined
  }
  
  trait IdentityVerificationAttributes extends js.Object {
    /**
      * The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
      */
    var VerificationStatus: awsDashSdkLib.clientsSesMod.SESNs.VerificationStatus
    /**
      * The verification token for a domain identity. Null for email address identities.
      */
    var VerificationToken: js.UndefOr[VerificationToken] = js.undefined
  }
  
  trait KinesisFirehoseDestination extends js.Object {
    /**
      * The ARN of the Amazon Kinesis Firehose stream that email sending events should be published to.
      */
    var DeliveryStreamARN: AmazonResourceName
    /**
      * The ARN of the IAM role under which Amazon SES publishes email sending events to the Amazon Kinesis Firehose stream.
      */
    var IAMRoleARN: AmazonResourceName
  }
  
  trait LambdaAction extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the AWS Lambda function. An example of an AWS Lambda function ARN is arn:aws:lambda:us-west-2:account-id:function:MyFunction. For more information about AWS Lambda, see the AWS Lambda Developer Guide.
      */
    var FunctionArn: AmazonResourceName
    /**
      * The invocation type of the AWS Lambda function. An invocation type of RequestResponse means that the execution of the function will immediately result in a response, and a value of Event means that the function will be invoked asynchronously. The default value is Event. For information about AWS Lambda invocation types, see the AWS Lambda Developer Guide.  There is a 30-second timeout on RequestResponse invocations. You should use Event invocation in most cases. Use RequestResponse only when you want to make a mail flow decision, such as whether to stop the receipt rule or the receipt rule set. 
      */
    var InvocationType: js.UndefOr[InvocationType] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the Lambda action is taken. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
      */
    var TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
  }
  
  trait ListConfigurationSetsRequest extends js.Object {
    /**
      * The number of configuration sets to return.
      */
    var MaxItems: js.UndefOr[MaxItems] = js.undefined
    /**
      * A token returned from a previous call to ListConfigurationSets to indicate the position of the configuration set in the configuration set list.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListConfigurationSetsResponse extends js.Object {
    /**
      * A list of configuration sets.
      */
    var ConfigurationSets: js.UndefOr[ConfigurationSets] = js.undefined
    /**
      * A token indicating that there are additional configuration sets available to be listed. Pass this token to successive calls of ListConfigurationSets. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListCustomVerificationEmailTemplatesRequest extends js.Object {
    /**
      * The maximum number of custom verification email templates to return. This value must be at least 1 and less than or equal to 50. If you do not specify a value, or if you specify a value less than 1 or greater than 50, the operation will return up to 50 results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * An array the contains the name and creation time stamp for each template in your Amazon SES account.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListCustomVerificationEmailTemplatesResponse extends js.Object {
    /**
      * A list of the custom verification email templates that exist in your account.
      */
    var CustomVerificationEmailTemplates: js.UndefOr[CustomVerificationEmailTemplates] = js.undefined
    /**
      * A token indicating that there are additional custom verification email templates available to be listed. Pass this token to a subsequent call to ListTemplates to retrieve the next 50 custom verification email templates.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListIdentitiesRequest extends js.Object {
    /**
      * The type of the identities to list. Possible values are "EmailAddress" and "Domain". If this parameter is omitted, then all identities will be listed.
      */
    var IdentityType: js.UndefOr[IdentityType] = js.undefined
    /**
      * The maximum number of identities per page. Possible values are 1-1000 inclusive.
      */
    var MaxItems: js.UndefOr[MaxItems] = js.undefined
    /**
      * The token to use for pagination.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListIdentitiesResponse extends js.Object {
    /**
      * A list of identities.
      */
    var Identities: IdentityList
    /**
      * The token used for pagination.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListIdentityPoliciesRequest extends js.Object {
    /**
      * The identity that is associated with the policy for which the policies will be listed. You can specify an identity by using its name or by using its Amazon Resource Name (ARN). Examples: user@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com. To successfully call this API, you must own the identity.
      */
    var Identity: awsDashSdkLib.clientsSesMod.SESNs.Identity
  }
  
  trait ListIdentityPoliciesResponse extends js.Object {
    /**
      * A list of names of policies that apply to the specified identity.
      */
    var PolicyNames: PolicyNameList
  }
  
  trait ListReceiptFiltersRequest extends js.Object
  
  trait ListReceiptFiltersResponse extends js.Object {
    /**
      * A list of IP address filter data structures, which each consist of a name, an IP address range, and whether to allow or block mail from it.
      */
    var Filters: js.UndefOr[ReceiptFilterList] = js.undefined
  }
  
  trait ListReceiptRuleSetsRequest extends js.Object {
    /**
      * A token returned from a previous call to ListReceiptRuleSets to indicate the position in the receipt rule set list.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListReceiptRuleSetsResponse extends js.Object {
    /**
      * A token indicating that there are additional receipt rule sets available to be listed. Pass this token to successive calls of ListReceiptRuleSets to retrieve up to 100 receipt rule sets at a time.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The metadata for the currently active receipt rule set. The metadata consists of the rule set name and the timestamp of when the rule set was created.
      */
    var RuleSets: js.UndefOr[ReceiptRuleSetsLists] = js.undefined
  }
  
  trait ListTemplatesRequest extends js.Object {
    /**
      * The maximum number of templates to return. This value must be at least 1 and less than or equal to 10. If you do not specify a value, or if you specify a value less than 1 or greater than 10, the operation will return up to 10 results.
      */
    var MaxItems: js.UndefOr[MaxItems] = js.undefined
    /**
      * A token returned from a previous call to ListTemplates to indicate the position in the list of email templates.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListTemplatesResponse extends js.Object {
    /**
      * A token indicating that there are additional email templates available to be listed. Pass this token to a subsequent call to ListTemplates to retrieve the next 50 email templates.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An array the contains the name and creation time stamp for each template in your Amazon SES account.
      */
    var TemplatesMetadata: js.UndefOr[TemplateMetadataList] = js.undefined
  }
  
  trait ListVerifiedEmailAddressesResponse extends js.Object {
    /**
      * A list of email addresses that have been verified.
      */
    var VerifiedEmailAddresses: js.UndefOr[AddressList] = js.undefined
  }
  
  trait MailFromDomainAttributes
    extends /* key */ org.scalablytyped.runtime.StringDictionary[IdentityMailFromDomainAttributes]
  
  trait Message extends js.Object {
    /**
      * The message body.
      */
    var Body: awsDashSdkLib.clientsSesMod.SESNs.Body
    /**
      * The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
      */
    var Subject: Content
  }
  
  trait MessageDsn extends js.Object {
    /**
      * When the message was received by the reporting mail transfer agent (MTA), in RFC 822 date-time format.
      */
    var ArrivalDate: js.UndefOr[ArrivalDate] = js.undefined
    /**
      * Additional X-headers to include in the DSN.
      */
    var ExtensionFields: js.UndefOr[ExtensionFieldList] = js.undefined
    /**
      * The reporting MTA that attempted to deliver the message, formatted as specified in RFC 3464 (mta-name-type; mta-name). The default value is dns; inbound-smtp.[region].amazonaws.com.
      */
    var ReportingMta: awsDashSdkLib.clientsSesMod.SESNs.ReportingMta
  }
  
  trait MessageTag extends js.Object {
    /**
      * The name of the tag. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 256 characters.  
      */
    var Name: MessageTagName
    /**
      * The value of the tag. The value must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 256 characters.  
      */
    var Value: MessageTagValue
  }
  
  trait NotificationAttributes
    extends /* key */ org.scalablytyped.runtime.StringDictionary[IdentityNotificationAttributes]
  
  trait PolicyMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Policy]
  
  trait PutIdentityPolicyRequest extends js.Object {
    /**
      * The identity that the policy will apply to. You can specify an identity by using its name or by using its Amazon Resource Name (ARN). Examples: user@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com. To successfully call this API, you must own the identity.
      */
    var Identity: awsDashSdkLib.clientsSesMod.SESNs.Identity
    /**
      * The text of the policy in JSON format. The policy cannot exceed 4 KB. For information about the syntax of sending authorization policies, see the Amazon SES Developer Guide. 
      */
    var Policy: awsDashSdkLib.clientsSesMod.SESNs.Policy
    /**
      * The name of the policy. The policy name cannot exceed 64 characters and can only include alphanumeric characters, dashes, and underscores.
      */
    var PolicyName: awsDashSdkLib.clientsSesMod.SESNs.PolicyName
  }
  
  trait PutIdentityPolicyResponse extends js.Object
  
  trait RawMessage extends js.Object {
    /**
      * The raw data of the message. This data needs to base64-encoded if you are accessing Amazon SES directly through the HTTPS interface. If you are accessing Amazon SES using an AWS SDK, the SDK takes care of the base 64-encoding for you. In all cases, the client must ensure that the message format complies with Internet email standards regarding email header fields, MIME types, and MIME encoding. The To:, CC:, and BCC: headers in the raw message can contain a group list. If you are using SendRawEmail with sending authorization, you can include X-headers in the raw message to specify the "Source," "From," and "Return-Path" addresses. For more information, see the documentation for SendRawEmail.   Do not include these X-headers in the DKIM signature, because they are removed by Amazon SES before sending the email.  For more information, go to the Amazon SES Developer Guide.
      */
    var Data: RawMessageData
  }
  
  trait ReceiptAction extends js.Object {
    /**
      * Adds a header to the received email.
      */
    var AddHeaderAction: js.UndefOr[AddHeaderAction] = js.undefined
    /**
      * Rejects the received email by returning a bounce response to the sender and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
      */
    var BounceAction: js.UndefOr[BounceAction] = js.undefined
    /**
      * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
      */
    var LambdaAction: js.UndefOr[LambdaAction] = js.undefined
    /**
      * Saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally, publishes a notification to Amazon SNS.
      */
    var S3Action: js.UndefOr[S3Action] = js.undefined
    /**
      * Publishes the email content within a notification to Amazon SNS.
      */
    var SNSAction: js.UndefOr[SNSAction] = js.undefined
    /**
      * Terminates the evaluation of the receipt rule set and optionally publishes a notification to Amazon SNS.
      */
    var StopAction: js.UndefOr[StopAction] = js.undefined
    /**
      * Calls Amazon WorkMail and, optionally, publishes a notification to Amazon Amazon SNS.
      */
    var WorkmailAction: js.UndefOr[WorkmailAction] = js.undefined
  }
  
  trait ReceiptFilter extends js.Object {
    /**
      * A structure that provides the IP addresses to block or allow, and whether to block or allow incoming mail from them.
      */
    var IpFilter: ReceiptIpFilter
    /**
      * The name of the IP address filter. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
      */
    var Name: ReceiptFilterName
  }
  
  trait ReceiptIpFilter extends js.Object {
    /**
      * A single IP address or a range of IP addresses that you want to block or allow, specified in Classless Inter-Domain Routing (CIDR) notation. An example of a single email address is 10.0.0.1. An example of a range of IP addresses is 10.0.0.1/24. For more information about CIDR notation, see RFC 2317.
      */
    var Cidr: awsDashSdkLib.clientsSesMod.SESNs.Cidr
    /**
      * Indicates whether to block or allow incoming mail from the specified IP addresses.
      */
    var Policy: ReceiptFilterPolicy
  }
  
  trait ReceiptRule extends js.Object {
    /**
      * An ordered list of actions to perform on messages that match at least one of the recipient email addresses or domains specified in the receipt rule.
      */
    var Actions: js.UndefOr[ReceiptActionsList] = js.undefined
    /**
      * If true, the receipt rule is active. The default value is false.
      */
    var Enabled: js.UndefOr[Enabled] = js.undefined
    /**
      * The name of the receipt rule. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
      */
    var Name: ReceiptRuleName
    /**
      * The recipient domains and email addresses that the receipt rule applies to. If this field is not specified, this rule will match all recipients under all verified domains.
      */
    var Recipients: js.UndefOr[RecipientsList] = js.undefined
    /**
      * If true, then messages that this receipt rule applies to are scanned for spam and viruses. The default value is false.
      */
    var ScanEnabled: js.UndefOr[Enabled] = js.undefined
    /**
      * Specifies whether Amazon SES should require that incoming email is delivered over a connection encrypted with Transport Layer Security (TLS). If this parameter is set to Require, Amazon SES will bounce emails that are not received over TLS. The default is Optional.
      */
    var TlsPolicy: js.UndefOr[TlsPolicy] = js.undefined
  }
  
  trait ReceiptRuleSetMetadata extends js.Object {
    /**
      * The date and time the receipt rule set was created.
      */
    var CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the receipt rule set. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
      */
    var Name: js.UndefOr[ReceiptRuleSetName] = js.undefined
  }
  
  trait RecipientDsnFields extends js.Object {
    /**
      * The action performed by the reporting mail transfer agent (MTA) as a result of its attempt to deliver the message to the recipient address. This is required by RFC 3464.
      */
    var Action: DsnAction
    /**
      * An extended explanation of what went wrong; this is usually an SMTP response. See RFC 3463 for the correct formatting of this parameter.
      */
    var DiagnosticCode: js.UndefOr[DiagnosticCode] = js.undefined
    /**
      * Additional X-headers to include in the DSN.
      */
    var ExtensionFields: js.UndefOr[ExtensionFieldList] = js.undefined
    /**
      * The email address that the message was ultimately delivered to. This corresponds to the Final-Recipient in the DSN. If not specified, FinalRecipient will be set to the Recipient specified in the BouncedRecipientInfo structure. Either FinalRecipient or the recipient in BouncedRecipientInfo must be a recipient of the original bounced message.  Do not prepend the FinalRecipient email address with rfc 822;, as described in RFC 3798. 
      */
    var FinalRecipient: js.UndefOr[Address] = js.undefined
    /**
      * The time the final delivery attempt was made, in RFC 822 date-time format.
      */
    var LastAttemptDate: js.UndefOr[LastAttemptDate] = js.undefined
    /**
      * The MTA to which the remote MTA attempted to deliver the message, formatted as specified in RFC 3464 (mta-name-type; mta-name). This parameter typically applies only to propagating synchronous bounces.
      */
    var RemoteMta: js.UndefOr[RemoteMta] = js.undefined
    /**
      * The status code that indicates what went wrong. This is required by RFC 3464.
      */
    var Status: DsnStatus
  }
  
  trait ReorderReceiptRuleSetRequest extends js.Object {
    /**
      * A list of the specified receipt rule set's receipt rules in the order that you want to put them.
      */
    var RuleNames: ReceiptRuleNamesList
    /**
      * The name of the receipt rule set to reorder.
      */
    var RuleSetName: ReceiptRuleSetName
  }
  
  trait ReorderReceiptRuleSetResponse extends js.Object
  
  trait ReputationOptions extends js.Object {
    /**
      * The date and time at which the reputation metrics for the configuration set were last reset. Resetting these metrics is known as a fresh start. When you disable email sending for a configuration set using UpdateConfigurationSetSendingEnabled and later re-enable it, the reputation metrics for the configuration set (but not for the entire Amazon SES account) are reset. If email sending for the configuration set has never been disabled and later re-enabled, the value of this attribute is null.
      */
    var LastFreshStart: js.UndefOr[LastFreshStart] = js.undefined
    /**
      * Describes whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and complaint rates, to Amazon CloudWatch. If the value is true, reputation metrics are published. If the value is false, reputation metrics are not published. The default value is false.
      */
    var ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined
    /**
      * Describes whether email sending is enabled or disabled for the configuration set. If the value is true, then Amazon SES will send emails that use the configuration set. If the value is false, Amazon SES will not send emails that use the configuration set. The default value is true. You can change this setting using UpdateConfigurationSetSendingEnabled.
      */
    var SendingEnabled: js.UndefOr[Enabled] = js.undefined
  }
  
  trait S3Action extends js.Object {
    /**
      * The name of the Amazon S3 bucket that incoming email will be saved to.
      */
    var BucketName: S3BucketName
    /**
      * The customer master key that Amazon SES should use to encrypt your emails before saving them to the Amazon S3 bucket. You can use the default master key or a custom master key you created in AWS KMS as follows:   To use the default master key, provide an ARN in the form of arn:aws:kms:REGION:ACCOUNT-ID-WITHOUT-HYPHENS:alias/aws/ses. For example, if your AWS account ID is 123456789012 and you want to use the default master key in the US West (Oregon) region, the ARN of the default master key would be arn:aws:kms:us-west-2:123456789012:alias/aws/ses. If you use the default master key, you don't need to perform any extra steps to give Amazon SES permission to use the key.   To use a custom master key you created in AWS KMS, provide the ARN of the master key and ensure that you add a statement to your key's policy to give Amazon SES permission to use it. For more information about giving permissions, see the Amazon SES Developer Guide.   For more information about key policies, see the AWS KMS Developer Guide. If you do not specify a master key, Amazon SES will not encrypt your emails.  Your mail is encrypted by Amazon SES using the Amazon S3 encryption client before the mail is submitted to Amazon S3 for storage. It is not encrypted using Amazon S3 server-side encryption. This means that you must use the Amazon S3 encryption client to decrypt the email after retrieving it from Amazon S3, as the service has no access to use your AWS KMS keys for decryption. This encryption client is currently available with the AWS SDK for Java and AWS SDK for Ruby only. For more information about client-side encryption using AWS KMS master keys, see the Amazon S3 Developer Guide. 
      */
    var KmsKeyArn: js.UndefOr[AmazonResourceName] = js.undefined
    /**
      * The key prefix of the Amazon S3 bucket. The key prefix is similar to a directory name that enables you to store similar data under the same directory in a bucket.
      */
    var ObjectKeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    /**
      * The ARN of the Amazon SNS topic to notify when the message is saved to the Amazon S3 bucket. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
      */
    var TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
  }
  
  trait SNSAction extends js.Object {
    /**
      * The encoding to use for the email within the Amazon SNS notification. UTF-8 is easier to use, but may not preserve all special characters when a message was encoded with a different encoding format. Base64 preserves all special characters. The default value is UTF-8.
      */
    var Encoding: js.UndefOr[SNSActionEncoding] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
      */
    var TopicArn: AmazonResourceName
  }
  
  trait SNSDestination extends js.Object {
    /**
      * The ARN of the Amazon SNS topic that email sending events will be published to. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
      */
    var TopicARN: AmazonResourceName
  }
  
  trait SendBounceRequest extends js.Object {
    /**
      * The address to use in the "From" header of the bounce message. This must be an identity that you have verified with Amazon SES.
      */
    var BounceSender: Address
    /**
      * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the address in the "From" header of the bounce. For more information about sending authorization, see the Amazon SES Developer Guide.
      */
    var BounceSenderArn: js.UndefOr[AmazonResourceName] = js.undefined
    /**
      * A list of recipients of the bounced message, including the information required to create the Delivery Status Notifications (DSNs) for the recipients. You must specify at least one BouncedRecipientInfo in the list.
      */
    var BouncedRecipientInfoList: awsDashSdkLib.clientsSesMod.SESNs.BouncedRecipientInfoList
    /**
      * Human-readable text for the bounce message to explain the failure. If not specified, the text will be auto-generated based on the bounced recipient information.
      */
    var Explanation: js.UndefOr[Explanation] = js.undefined
    /**
      * Message-related DSN fields. If not specified, Amazon SES will choose the values.
      */
    var MessageDsn: js.UndefOr[MessageDsn] = js.undefined
    /**
      * The message ID of the message to be bounced.
      */
    var OriginalMessageId: MessageId
  }
  
  trait SendBounceResponse extends js.Object {
    /**
      * The message ID of the bounce message.
      */
    var MessageId: js.UndefOr[MessageId] = js.undefined
  }
  
  trait SendBulkTemplatedEmailRequest extends js.Object {
    /**
      * The name of the configuration set to use when you send an email using SendBulkTemplatedEmail.
      */
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined
    /**
      * A list of tags, in the form of name/value pairs, to apply to an email that you send to a destination using SendBulkTemplatedEmail.
      */
    var DefaultTags: js.UndefOr[MessageTagList] = js.undefined
    /**
      * A list of replacement values to apply to the template when replacement data is not specified in a Destination object. These values act as a default or fallback option when no other data is available. The template data is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
      */
    var DefaultTemplateData: js.UndefOr[TemplateData] = js.undefined
    /**
      * One or more Destination objects. All of the recipients in a Destination will receive the same version of the email. You can specify up to 50 Destination objects within a Destinations array.
      */
    var Destinations: BulkEmailDestinationList
    /**
      * The reply-to email address(es) for the message. If the recipient replies to the message, each reply-to address will receive the reply.
      */
    var ReplyToAddresses: js.UndefOr[AddressList] = js.undefined
    /**
      * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled. If the message cannot be delivered to the recipient, then an error message will be returned from the recipient's ISP; this message will then be forwarded to the email address specified by the ReturnPath parameter. The ReturnPath parameter is never overwritten. This email address must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES. 
      */
    var ReturnPath: js.UndefOr[Address] = js.undefined
    /**
      * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the email address specified in the ReturnPath parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to use feedback@example.com, then you would specify the ReturnPathArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the ReturnPath to be feedback@example.com. For more information about sending authorization, see the Amazon SES Developer Guide.
      */
    var ReturnPathArn: js.UndefOr[AmazonResourceName] = js.undefined
    /**
      * The email address that is sending the email. This email address must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES. For information about verifying identities, see the Amazon SES Developer Guide. If you are sending on behalf of another user and have been permitted to do so by a sending authorization policy, then you must also specify the SourceArn parameter. For more information about sending authorization, see the Amazon SES Developer Guide.  Amazon SES does not support the SMTPUTF8 extension, as described in RFC6531. For this reason, the local part of a source email address (the part of the email address that precedes the @ sign) may only contain 7-bit ASCII characters. If the domain part of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as described in RFC3492. The sender name (also known as the friendly name) may contain non-ASCII characters. These characters must be encoded using MIME encoded-word syntax, as described in RFC 2047. MIME encoded-word syntax uses the following form: =?charset?encoding?encoded-text?=. 
      */
    var Source: Address
    /**
      * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to send for the email address specified in the Source parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to send from user@example.com, then you would specify the SourceArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the Source to be user@example.com. For more information about sending authorization, see the Amazon SES Developer Guide.
      */
    var SourceArn: js.UndefOr[AmazonResourceName] = js.undefined
    /**
      * The template to use when sending this email.
      */
    var Template: TemplateName
    /**
      * The ARN of the template to use when sending this email.
      */
    var TemplateArn: js.UndefOr[AmazonResourceName] = js.undefined
  }
  
  trait SendBulkTemplatedEmailResponse extends js.Object {
    /**
      * The unique message identifier returned from the SendBulkTemplatedEmail action.
      */
    var Status: BulkEmailDestinationStatusList
  }
  
  trait SendCustomVerificationEmailRequest extends js.Object {
    /**
      * Name of a configuration set to use when sending the verification email.
      */
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined
    /**
      * The email address to verify.
      */
    var EmailAddress: Address
    /**
      * The name of the custom verification email template to use when sending the verification email.
      */
    var TemplateName: awsDashSdkLib.clientsSesMod.SESNs.TemplateName
  }
  
  trait SendCustomVerificationEmailResponse extends js.Object {
    /**
      * The unique message identifier returned from the SendCustomVerificationEmail operation.
      */
    var MessageId: js.UndefOr[MessageId] = js.undefined
  }
  
  trait SendDataPoint extends js.Object {
    /**
      * Number of emails that have bounced.
      */
    var Bounces: js.UndefOr[Counter] = js.undefined
    /**
      * Number of unwanted emails that were rejected by recipients.
      */
    var Complaints: js.UndefOr[Counter] = js.undefined
    /**
      * Number of emails that have been sent.
      */
    var DeliveryAttempts: js.UndefOr[Counter] = js.undefined
    /**
      * Number of emails rejected by Amazon SES.
      */
    var Rejects: js.UndefOr[Counter] = js.undefined
    /**
      * Time of the data point.
      */
    var Timestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait SendEmailRequest extends js.Object {
    /**
      * The name of the configuration set to use when you send an email using SendEmail.
      */
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined
    /**
      * The destination for this email, composed of To:, CC:, and BCC: fields.
      */
    var Destination: awsDashSdkLib.clientsSesMod.SESNs.Destination
    /**
      * The message to be sent.
      */
    var Message: awsDashSdkLib.clientsSesMod.SESNs.Message
    /**
      * The reply-to email address(es) for the message. If the recipient replies to the message, each reply-to address will receive the reply.
      */
    var ReplyToAddresses: js.UndefOr[AddressList] = js.undefined
    /**
      * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled. If the message cannot be delivered to the recipient, then an error message will be returned from the recipient's ISP; this message will then be forwarded to the email address specified by the ReturnPath parameter. The ReturnPath parameter is never overwritten. This email address must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES. 
      */
    var ReturnPath: js.UndefOr[Address] = js.undefined
    /**
      * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the email address specified in the ReturnPath parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to use feedback@example.com, then you would specify the ReturnPathArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the ReturnPath to be feedback@example.com. For more information about sending authorization, see the Amazon SES Developer Guide.
      */
    var ReturnPathArn: js.UndefOr[AmazonResourceName] = js.undefined
    /**
      * The email address that is sending the email. This email address must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES. For information about verifying identities, see the Amazon SES Developer Guide. If you are sending on behalf of another user and have been permitted to do so by a sending authorization policy, then you must also specify the SourceArn parameter. For more information about sending authorization, see the Amazon SES Developer Guide.  Amazon SES does not support the SMTPUTF8 extension, as described in RFC6531. For this reason, the local part of a source email address (the part of the email address that precedes the @ sign) may only contain 7-bit ASCII characters. If the domain part of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as described in RFC3492. The sender name (also known as the friendly name) may contain non-ASCII characters. These characters must be encoded using MIME encoded-word syntax, as described in RFC 2047. MIME encoded-word syntax uses the following form: =?charset?encoding?encoded-text?=. 
      */
    var Source: Address
    /**
      * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to send for the email address specified in the Source parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to send from user@example.com, then you would specify the SourceArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the Source to be user@example.com. For more information about sending authorization, see the Amazon SES Developer Guide.
      */
    var SourceArn: js.UndefOr[AmazonResourceName] = js.undefined
    /**
      * A list of tags, in the form of name/value pairs, to apply to an email that you send using SendEmail. Tags correspond to characteristics of the email that you define, so that you can publish email sending events.
      */
    var Tags: js.UndefOr[MessageTagList] = js.undefined
  }
  
  trait SendEmailResponse extends js.Object {
    /**
      * The unique message identifier returned from the SendEmail action. 
      */
    var MessageId: awsDashSdkLib.clientsSesMod.SESNs.MessageId
  }
  
  trait SendRawEmailRequest extends js.Object {
    /**
      * The name of the configuration set to use when you send an email using SendRawEmail.
      */
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined
    /**
      * A list of destinations for the message, consisting of To:, CC:, and BCC: addresses.
      */
    var Destinations: js.UndefOr[AddressList] = js.undefined
    /**
      * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to specify a particular "From" address in the header of the raw email. Instead of using this parameter, you can use the X-header X-SES-FROM-ARN in the raw message of the email. If you use both the FromArn parameter and the corresponding X-header, Amazon SES uses the value of the FromArn parameter.  For information about when to use this parameter, see the description of SendRawEmail in this guide, or see the Amazon SES Developer Guide. 
      */
    var FromArn: js.UndefOr[AmazonResourceName] = js.undefined
    /**
      * The raw email message itself. The message has to meet the following criteria:   The message has to contain a header and a body, separated by a blank line.   All of the required header fields must be present in the message.   Each part of a multipart MIME message must be formatted properly.   Attachments must be of a content type that Amazon SES supports. For a list on unsupported content types, see Unsupported Attachment Types in the Amazon SES Developer Guide.   The entire message must be base64-encoded.   If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, we highly recommend that you encode that content. For more information, see Sending Raw Email in the Amazon SES Developer Guide.   Per RFC 5321, the maximum length of each line of text, including the &lt;CRLF&gt;, must not exceed 1,000 characters.  
      */
    var RawMessage: awsDashSdkLib.clientsSesMod.SESNs.RawMessage
    /**
      * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the email address specified in the ReturnPath parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to use feedback@example.com, then you would specify the ReturnPathArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the ReturnPath to be feedback@example.com. Instead of using this parameter, you can use the X-header X-SES-RETURN-PATH-ARN in the raw message of the email. If you use both the ReturnPathArn parameter and the corresponding X-header, Amazon SES uses the value of the ReturnPathArn parameter.  For information about when to use this parameter, see the description of SendRawEmail in this guide, or see the Amazon SES Developer Guide. 
      */
    var ReturnPathArn: js.UndefOr[AmazonResourceName] = js.undefined
    /**
      * The identity's email address. If you do not provide a value for this parameter, you must specify a "From" address in the raw text of the message. (You can also specify both.)  Amazon SES does not support the SMTPUTF8 extension, as described inRFC6531. For this reason, the local part of a source email address (the part of the email address that precedes the @ sign) may only contain 7-bit ASCII characters. If the domain part of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as described in RFC3492. The sender name (also known as the friendly name) may contain non-ASCII characters. These characters must be encoded using MIME encoded-word syntax, as described in RFC 2047. MIME encoded-word syntax uses the following form: =?charset?encoding?encoded-text?=.  If you specify the Source parameter and have feedback forwarding enabled, then bounces and complaints will be sent to this email address. This takes precedence over any Return-Path header that you might include in the raw text of the message.
      */
    var Source: js.UndefOr[Address] = js.undefined
    /**
      * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to send for the email address specified in the Source parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to send from user@example.com, then you would specify the SourceArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the Source to be user@example.com. Instead of using this parameter, you can use the X-header X-SES-SOURCE-ARN in the raw message of the email. If you use both the SourceArn parameter and the corresponding X-header, Amazon SES uses the value of the SourceArn parameter.  For information about when to use this parameter, see the description of SendRawEmail in this guide, or see the Amazon SES Developer Guide. 
      */
    var SourceArn: js.UndefOr[AmazonResourceName] = js.undefined
    /**
      * A list of tags, in the form of name/value pairs, to apply to an email that you send using SendRawEmail. Tags correspond to characteristics of the email that you define, so that you can publish email sending events.
      */
    var Tags: js.UndefOr[MessageTagList] = js.undefined
  }
  
  trait SendRawEmailResponse extends js.Object {
    /**
      * The unique message identifier returned from the SendRawEmail action. 
      */
    var MessageId: awsDashSdkLib.clientsSesMod.SESNs.MessageId
  }
  
  trait SendTemplatedEmailRequest extends js.Object {
    /**
      * The name of the configuration set to use when you send an email using SendTemplatedEmail.
      */
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined
    /**
      * The destination for this email, composed of To:, CC:, and BCC: fields. A Destination can include up to 50 recipients across these three fields.
      */
    var Destination: awsDashSdkLib.clientsSesMod.SESNs.Destination
    /**
      * The reply-to email address(es) for the message. If the recipient replies to the message, each reply-to address will receive the reply.
      */
    var ReplyToAddresses: js.UndefOr[AddressList] = js.undefined
    /**
      * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled. If the message cannot be delivered to the recipient, then an error message will be returned from the recipient's ISP; this message will then be forwarded to the email address specified by the ReturnPath parameter. The ReturnPath parameter is never overwritten. This email address must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES. 
      */
    var ReturnPath: js.UndefOr[Address] = js.undefined
    /**
      * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the email address specified in the ReturnPath parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to use feedback@example.com, then you would specify the ReturnPathArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the ReturnPath to be feedback@example.com. For more information about sending authorization, see the Amazon SES Developer Guide.
      */
    var ReturnPathArn: js.UndefOr[AmazonResourceName] = js.undefined
    /**
      * The email address that is sending the email. This email address must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES. For information about verifying identities, see the Amazon SES Developer Guide. If you are sending on behalf of another user and have been permitted to do so by a sending authorization policy, then you must also specify the SourceArn parameter. For more information about sending authorization, see the Amazon SES Developer Guide.  Amazon SES does not support the SMTPUTF8 extension, as described in RFC6531. For this reason, the local part of a source email address (the part of the email address that precedes the @ sign) may only contain 7-bit ASCII characters. If the domain part of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as described in RFC3492. The sender name (also known as the friendly name) may contain non-ASCII characters. These characters must be encoded using MIME encoded-word syntax, as described inRFC 2047. MIME encoded-word syntax uses the following form: =?charset?encoding?encoded-text?=. 
      */
    var Source: Address
    /**
      * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to send for the email address specified in the Source parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to send from user@example.com, then you would specify the SourceArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the Source to be user@example.com. For more information about sending authorization, see the Amazon SES Developer Guide.
      */
    var SourceArn: js.UndefOr[AmazonResourceName] = js.undefined
    /**
      * A list of tags, in the form of name/value pairs, to apply to an email that you send using SendTemplatedEmail. Tags correspond to characteristics of the email that you define, so that you can publish email sending events.
      */
    var Tags: js.UndefOr[MessageTagList] = js.undefined
    /**
      * The template to use when sending this email.
      */
    var Template: TemplateName
    /**
      * The ARN of the template to use when sending this email.
      */
    var TemplateArn: js.UndefOr[AmazonResourceName] = js.undefined
    /**
      * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
      */
    var TemplateData: awsDashSdkLib.clientsSesMod.SESNs.TemplateData
  }
  
  trait SendTemplatedEmailResponse extends js.Object {
    /**
      * The unique message identifier returned from the SendTemplatedEmail action. 
      */
    var MessageId: awsDashSdkLib.clientsSesMod.SESNs.MessageId
  }
  
  trait SetActiveReceiptRuleSetRequest extends js.Object {
    /**
      * The name of the receipt rule set to make active. Setting this value to null disables all email receiving.
      */
    var RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined
  }
  
  trait SetActiveReceiptRuleSetResponse extends js.Object
  
  trait SetIdentityDkimEnabledRequest extends js.Object {
    /**
      * Sets whether DKIM signing is enabled for an identity. Set to true to enable DKIM signing for this identity; false to disable it. 
      */
    var DkimEnabled: Enabled
    /**
      * The identity for which DKIM signing should be enabled or disabled.
      */
    var Identity: awsDashSdkLib.clientsSesMod.SESNs.Identity
  }
  
  trait SetIdentityDkimEnabledResponse extends js.Object
  
  trait SetIdentityFeedbackForwardingEnabledRequest extends js.Object {
    /**
      * Sets whether Amazon SES will forward bounce and complaint notifications as email. true specifies that Amazon SES will forward bounce and complaint notifications as email, in addition to any Amazon SNS topic publishing otherwise specified. false specifies that Amazon SES will publish bounce and complaint notifications only through Amazon SNS. This value can only be set to false when Amazon SNS topics are set for both Bounce and Complaint notification types.
      */
    var ForwardingEnabled: Enabled
    /**
      * The identity for which to set bounce and complaint notification forwarding. Examples: user@example.com, example.com.
      */
    var Identity: awsDashSdkLib.clientsSesMod.SESNs.Identity
  }
  
  trait SetIdentityFeedbackForwardingEnabledResponse extends js.Object
  
  trait SetIdentityHeadersInNotificationsEnabledRequest extends js.Object {
    /**
      * Sets whether Amazon SES includes the original email headers in Amazon SNS notifications of the specified notification type. A value of true specifies that Amazon SES will include headers in notifications, and a value of false specifies that Amazon SES will not include headers in notifications. This value can only be set when NotificationType is already set to use a particular Amazon SNS topic.
      */
    var Enabled: awsDashSdkLib.clientsSesMod.SESNs.Enabled
    /**
      * The identity for which to enable or disable headers in notifications. Examples: user@example.com, example.com.
      */
    var Identity: awsDashSdkLib.clientsSesMod.SESNs.Identity
    /**
      * The notification type for which to enable or disable headers in notifications. 
      */
    var NotificationType: awsDashSdkLib.clientsSesMod.SESNs.NotificationType
  }
  
  trait SetIdentityHeadersInNotificationsEnabledResponse extends js.Object
  
  trait SetIdentityMailFromDomainRequest extends js.Object {
    /**
      * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. If you choose UseDefaultValue, Amazon SES will use amazonses.com (or a subdomain of that) as the MAIL FROM domain. If you choose RejectMessage, Amazon SES will return a MailFromDomainNotVerified error and not send the email. The action specified in BehaviorOnMXFailure is taken when the custom MAIL FROM domain setup is in the Pending, Failed, and TemporaryFailure states.
      */
    var BehaviorOnMXFailure: js.UndefOr[BehaviorOnMXFailure] = js.undefined
    /**
      * The verified identity for which you want to enable or disable the specified custom MAIL FROM domain.
      */
    var Identity: awsDashSdkLib.clientsSesMod.SESNs.Identity
    /**
      * The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must 1) be a subdomain of the verified identity, 2) not be used in a "From" address if the MAIL FROM domain is the destination of email feedback forwarding (for more information, see the Amazon SES Developer Guide), and 3) not be used to receive emails. A value of null disables the custom MAIL FROM setting for the identity.
      */
    var MailFromDomain: js.UndefOr[MailFromDomainName] = js.undefined
  }
  
  trait SetIdentityMailFromDomainResponse extends js.Object
  
  trait SetIdentityNotificationTopicRequest extends js.Object {
    /**
      * The identity (email address or domain) that you want to set the Amazon SNS topic for.  You can only specify a verified identity for this parameter.  You can specify an identity by using its name or by using its Amazon Resource Name (ARN). The following examples are all valid identities: sender@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com.
      */
    var Identity: awsDashSdkLib.clientsSesMod.SESNs.Identity
    /**
      * The type of notifications that will be published to the specified Amazon SNS topic.
      */
    var NotificationType: awsDashSdkLib.clientsSesMod.SESNs.NotificationType
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic. If the parameter is omitted from the request or a null value is passed, SnsTopic is cleared and publishing is disabled.
      */
    var SnsTopic: js.UndefOr[NotificationTopic] = js.undefined
  }
  
  trait SetIdentityNotificationTopicResponse extends js.Object
  
  trait SetReceiptRulePositionRequest extends js.Object {
    /**
      * The name of the receipt rule after which to place the specified receipt rule.
      */
    var After: js.UndefOr[ReceiptRuleName] = js.undefined
    /**
      * The name of the receipt rule to reposition.
      */
    var RuleName: ReceiptRuleName
    /**
      * The name of the receipt rule set that contains the receipt rule to reposition.
      */
    var RuleSetName: ReceiptRuleSetName
  }
  
  trait SetReceiptRulePositionResponse extends js.Object
  
  trait StopAction extends js.Object {
    /**
      * The name of the RuleSet that is being stopped.
      */
    var Scope: StopScope
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the stop action is taken. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
      */
    var TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
  }
  
  trait Template extends js.Object {
    /**
      * The HTML body of the email.
      */
    var HtmlPart: js.UndefOr[HtmlPart] = js.undefined
    /**
      * The subject line of the email.
      */
    var SubjectPart: js.UndefOr[SubjectPart] = js.undefined
    /**
      * The name of the template. You will refer to this name when you send email using the SendTemplatedEmail or SendBulkTemplatedEmail operations.
      */
    var TemplateName: awsDashSdkLib.clientsSesMod.SESNs.TemplateName
    /**
      * The email body that will be visible to recipients whose email clients do not display HTML.
      */
    var TextPart: js.UndefOr[TextPart] = js.undefined
  }
  
  trait TemplateMetadata extends js.Object {
    /**
      * The time and date the template was created.
      */
    var CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the template.
      */
    var Name: js.UndefOr[TemplateName] = js.undefined
  }
  
  trait TestRenderTemplateRequest extends js.Object {
    /**
      * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
      */
    var TemplateData: awsDashSdkLib.clientsSesMod.SESNs.TemplateData
    /**
      * The name of the template that you want to render.
      */
    var TemplateName: awsDashSdkLib.clientsSesMod.SESNs.TemplateName
  }
  
  trait TestRenderTemplateResponse extends js.Object {
    /**
      * The complete MIME message rendered by applying the data in the TemplateData parameter to the template specified in the TemplateName parameter.
      */
    var RenderedTemplate: js.UndefOr[RenderedTemplate] = js.undefined
  }
  
  trait TrackingOptions extends js.Object {
    /**
      * The custom subdomain that will be used to redirect email recipients to the Amazon SES event tracking domain.
      */
    var CustomRedirectDomain: js.UndefOr[CustomRedirectDomain] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Creates a receipt rule set by cloning an existing one. All receipt rules and configurations are copied to the new receipt rule set and are completely independent of the source rule set. For information about setting up rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def cloneReceiptRuleSet(): awsDashSdkLib.libRequestMod.Request[CloneReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cloneReceiptRuleSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CloneReceiptRuleSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CloneReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a receipt rule set by cloning an existing one. All receipt rules and configurations are copied to the new receipt rule set and are completely independent of the source rule set. For information about setting up rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def cloneReceiptRuleSet(params: CloneReceiptRuleSetRequest): awsDashSdkLib.libRequestMod.Request[CloneReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cloneReceiptRuleSet(
      params: CloneReceiptRuleSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CloneReceiptRuleSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CloneReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def createConfigurationSet(): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createConfigurationSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConfigurationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def createConfigurationSet(params: CreateConfigurationSetRequest): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createConfigurationSet(
      params: CreateConfigurationSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConfigurationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a configuration set event destination.  When you create or update an event destination, you must provide one, and only one, destination. The destination can be CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).  An event destination is the AWS service to which Amazon SES publishes the email sending events associated with a configuration set. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def createConfigurationSetEventDestination(): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createConfigurationSetEventDestination(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConfigurationSetEventDestinationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a configuration set event destination.  When you create or update an event destination, you must provide one, and only one, destination. The destination can be CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).  An event destination is the AWS service to which Amazon SES publishes the email sending events associated with a configuration set. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def createConfigurationSetEventDestination(params: CreateConfigurationSetEventDestinationRequest): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createConfigurationSetEventDestination(
      params: CreateConfigurationSetEventDestinationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConfigurationSetEventDestinationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an association between a configuration set and a custom domain for open and click event tracking.  By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.
      */
    def createConfigurationSetTrackingOptions(): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetTrackingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createConfigurationSetTrackingOptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConfigurationSetTrackingOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetTrackingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an association between a configuration set and a custom domain for open and click event tracking.  By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.
      */
    def createConfigurationSetTrackingOptions(params: CreateConfigurationSetTrackingOptionsRequest): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetTrackingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createConfigurationSetTrackingOptions(
      params: CreateConfigurationSetTrackingOptionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConfigurationSetTrackingOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetTrackingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def createCustomVerificationEmailTemplate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCustomVerificationEmailTemplate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def createCustomVerificationEmailTemplate(params: CreateCustomVerificationEmailTemplateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCustomVerificationEmailTemplate(
      params: CreateCustomVerificationEmailTemplateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new IP address filter. For information about setting up IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def createReceiptFilter(): awsDashSdkLib.libRequestMod.Request[CreateReceiptFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createReceiptFilter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReceiptFilterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReceiptFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new IP address filter. For information about setting up IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def createReceiptFilter(params: CreateReceiptFilterRequest): awsDashSdkLib.libRequestMod.Request[CreateReceiptFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createReceiptFilter(
      params: CreateReceiptFilterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReceiptFilterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReceiptFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a receipt rule. For information about setting up receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def createReceiptRule(): awsDashSdkLib.libRequestMod.Request[CreateReceiptRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createReceiptRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReceiptRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReceiptRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a receipt rule. For information about setting up receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def createReceiptRule(params: CreateReceiptRuleRequest): awsDashSdkLib.libRequestMod.Request[CreateReceiptRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createReceiptRule(
      params: CreateReceiptRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReceiptRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReceiptRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an empty receipt rule set. For information about setting up receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def createReceiptRuleSet(): awsDashSdkLib.libRequestMod.Request[CreateReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createReceiptRuleSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReceiptRuleSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an empty receipt rule set. For information about setting up receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def createReceiptRuleSet(params: CreateReceiptRuleSetRequest): awsDashSdkLib.libRequestMod.Request[CreateReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createReceiptRuleSet(
      params: CreateReceiptRuleSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReceiptRuleSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an email template. Email templates enable you to send personalized email to one or more destinations in a single API operation. For more information, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def createTemplate(): awsDashSdkLib.libRequestMod.Request[CreateTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an email template. Email templates enable you to send personalized email to one or more destinations in a single API operation. For more information, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def createTemplate(params: CreateTemplateRequest): awsDashSdkLib.libRequestMod.Request[CreateTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTemplate(
      params: CreateTemplateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def deleteConfigurationSet(): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteConfigurationSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteConfigurationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def deleteConfigurationSet(params: DeleteConfigurationSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteConfigurationSet(
      params: DeleteConfigurationSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteConfigurationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a configuration set event destination. Configuration set event destinations are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def deleteConfigurationSetEventDestination(): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteConfigurationSetEventDestination(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteConfigurationSetEventDestinationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a configuration set event destination. Configuration set event destinations are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def deleteConfigurationSetEventDestination(params: DeleteConfigurationSetEventDestinationRequest): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteConfigurationSetEventDestination(
      params: DeleteConfigurationSetEventDestinationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteConfigurationSetEventDestinationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an association between a configuration set and a custom domain for open and click event tracking. By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.  Deleting this kind of association will result in emails sent using the specified configuration set to capture open and click events using the standard, Amazon SES-operated domains. 
      */
    def deleteConfigurationSetTrackingOptions(): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetTrackingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteConfigurationSetTrackingOptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteConfigurationSetTrackingOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetTrackingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an association between a configuration set and a custom domain for open and click event tracking. By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.  Deleting this kind of association will result in emails sent using the specified configuration set to capture open and click events using the standard, Amazon SES-operated domains. 
      */
    def deleteConfigurationSetTrackingOptions(params: DeleteConfigurationSetTrackingOptionsRequest): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetTrackingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteConfigurationSetTrackingOptions(
      params: DeleteConfigurationSetTrackingOptionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteConfigurationSetTrackingOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetTrackingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing custom verification email template.  For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def deleteCustomVerificationEmailTemplate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCustomVerificationEmailTemplate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing custom verification email template.  For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def deleteCustomVerificationEmailTemplate(params: DeleteCustomVerificationEmailTemplateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCustomVerificationEmailTemplate(
      params: DeleteCustomVerificationEmailTemplateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified identity (an email address or a domain) from the list of verified identities. You can execute this operation no more than once per second.
      */
    def deleteIdentity(): awsDashSdkLib.libRequestMod.Request[DeleteIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteIdentity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified identity (an email address or a domain) from the list of verified identities. You can execute this operation no more than once per second.
      */
    def deleteIdentity(params: DeleteIdentityRequest): awsDashSdkLib.libRequestMod.Request[DeleteIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteIdentity(
      params: DeleteIdentityRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified sending authorization policy for the given identity (an email address or a domain). This API returns successfully even if a policy with the specified name does not exist.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def deleteIdentityPolicy(): awsDashSdkLib.libRequestMod.Request[DeleteIdentityPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteIdentityPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteIdentityPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteIdentityPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified sending authorization policy for the given identity (an email address or a domain). This API returns successfully even if a policy with the specified name does not exist.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def deleteIdentityPolicy(params: DeleteIdentityPolicyRequest): awsDashSdkLib.libRequestMod.Request[DeleteIdentityPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteIdentityPolicy(
      params: DeleteIdentityPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteIdentityPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteIdentityPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified IP address filter. For information about managing IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def deleteReceiptFilter(): awsDashSdkLib.libRequestMod.Request[DeleteReceiptFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReceiptFilter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReceiptFilterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReceiptFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified IP address filter. For information about managing IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def deleteReceiptFilter(params: DeleteReceiptFilterRequest): awsDashSdkLib.libRequestMod.Request[DeleteReceiptFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReceiptFilter(
      params: DeleteReceiptFilterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReceiptFilterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReceiptFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified receipt rule. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def deleteReceiptRule(): awsDashSdkLib.libRequestMod.Request[DeleteReceiptRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReceiptRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReceiptRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReceiptRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified receipt rule. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def deleteReceiptRule(params: DeleteReceiptRuleRequest): awsDashSdkLib.libRequestMod.Request[DeleteReceiptRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReceiptRule(
      params: DeleteReceiptRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReceiptRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReceiptRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified receipt rule set and all of the receipt rules it contains.  The currently active rule set cannot be deleted.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def deleteReceiptRuleSet(): awsDashSdkLib.libRequestMod.Request[DeleteReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReceiptRuleSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReceiptRuleSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified receipt rule set and all of the receipt rules it contains.  The currently active rule set cannot be deleted.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def deleteReceiptRuleSet(params: DeleteReceiptRuleSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReceiptRuleSet(
      params: DeleteReceiptRuleSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReceiptRuleSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an email template. You can execute this operation no more than once per second.
      */
    def deleteTemplate(): awsDashSdkLib.libRequestMod.Request[DeleteTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an email template. You can execute this operation no more than once per second.
      */
    def deleteTemplate(params: DeleteTemplateRequest): awsDashSdkLib.libRequestMod.Request[DeleteTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTemplate(
      params: DeleteTemplateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deprecated. Use the DeleteIdentity operation to delete email addresses and domains.
      */
    def deleteVerifiedEmailAddress(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVerifiedEmailAddress(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deprecated. Use the DeleteIdentity operation to delete email addresses and domains.
      */
    def deleteVerifiedEmailAddress(params: DeleteVerifiedEmailAddressRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVerifiedEmailAddress(
      params: DeleteVerifiedEmailAddressRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the metadata and receipt rules for the receipt rule set that is currently active. For information about setting up receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def describeActiveReceiptRuleSet(): awsDashSdkLib.libRequestMod.Request[DescribeActiveReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeActiveReceiptRuleSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeActiveReceiptRuleSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeActiveReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the metadata and receipt rules for the receipt rule set that is currently active. For information about setting up receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def describeActiveReceiptRuleSet(params: DescribeActiveReceiptRuleSetRequest): awsDashSdkLib.libRequestMod.Request[DescribeActiveReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeActiveReceiptRuleSet(
      params: DescribeActiveReceiptRuleSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeActiveReceiptRuleSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeActiveReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the details of the specified configuration set. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def describeConfigurationSet(): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeConfigurationSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigurationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the details of the specified configuration set. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def describeConfigurationSet(params: DescribeConfigurationSetRequest): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeConfigurationSet(
      params: DescribeConfigurationSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigurationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the details of the specified receipt rule. For information about setting up receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def describeReceiptRule(): awsDashSdkLib.libRequestMod.Request[DescribeReceiptRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReceiptRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReceiptRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReceiptRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the details of the specified receipt rule. For information about setting up receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def describeReceiptRule(params: DescribeReceiptRuleRequest): awsDashSdkLib.libRequestMod.Request[DescribeReceiptRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReceiptRule(
      params: DescribeReceiptRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReceiptRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReceiptRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the details of the specified receipt rule set. For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def describeReceiptRuleSet(): awsDashSdkLib.libRequestMod.Request[DescribeReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReceiptRuleSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReceiptRuleSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the details of the specified receipt rule set. For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def describeReceiptRuleSet(params: DescribeReceiptRuleSetRequest): awsDashSdkLib.libRequestMod.Request[DescribeReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReceiptRuleSet(
      params: DescribeReceiptRuleSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReceiptRuleSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the email sending status of the Amazon SES account for the current region. You can execute this operation no more than once per second.
      */
    def getAccountSendingEnabled(): awsDashSdkLib.libRequestMod.Request[GetAccountSendingEnabledResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccountSendingEnabled(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountSendingEnabledResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountSendingEnabledResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the custom email verification template for the template name you specify. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def getCustomVerificationEmailTemplate(): awsDashSdkLib.libRequestMod.Request[GetCustomVerificationEmailTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCustomVerificationEmailTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCustomVerificationEmailTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCustomVerificationEmailTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the custom email verification template for the template name you specify. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def getCustomVerificationEmailTemplate(params: GetCustomVerificationEmailTemplateRequest): awsDashSdkLib.libRequestMod.Request[GetCustomVerificationEmailTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCustomVerificationEmailTemplate(
      params: GetCustomVerificationEmailTemplateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCustomVerificationEmailTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCustomVerificationEmailTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the current status of Easy DKIM signing for an entity. For domain name identities, this operation also returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES has successfully verified that these tokens have been published. This operation takes a list of identities as input and returns the following information for each:   Whether Easy DKIM signing is enabled or disabled.   A set of DKIM tokens that represent the identity. If the identity is an email address, the tokens represent the domain of that address.   Whether Amazon SES has successfully verified the DKIM tokens published in the domain's DNS. This information is only returned for domain name identities, not for email addresses.   This operation is throttled at one request per second and can only get DKIM attributes for up to 100 identities at a time. For more information about creating DNS records using DKIM tokens, go to the Amazon SES Developer Guide.
      */
    def getIdentityDkimAttributes(): awsDashSdkLib.libRequestMod.Request[GetIdentityDkimAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIdentityDkimAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIdentityDkimAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIdentityDkimAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the current status of Easy DKIM signing for an entity. For domain name identities, this operation also returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES has successfully verified that these tokens have been published. This operation takes a list of identities as input and returns the following information for each:   Whether Easy DKIM signing is enabled or disabled.   A set of DKIM tokens that represent the identity. If the identity is an email address, the tokens represent the domain of that address.   Whether Amazon SES has successfully verified the DKIM tokens published in the domain's DNS. This information is only returned for domain name identities, not for email addresses.   This operation is throttled at one request per second and can only get DKIM attributes for up to 100 identities at a time. For more information about creating DNS records using DKIM tokens, go to the Amazon SES Developer Guide.
      */
    def getIdentityDkimAttributes(params: GetIdentityDkimAttributesRequest): awsDashSdkLib.libRequestMod.Request[GetIdentityDkimAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIdentityDkimAttributes(
      params: GetIdentityDkimAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIdentityDkimAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIdentityDkimAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the custom MAIL FROM attributes for a list of identities (email addresses : domains). This operation is throttled at one request per second and can only get custom MAIL FROM attributes for up to 100 identities at a time.
      */
    def getIdentityMailFromDomainAttributes(): awsDashSdkLib.libRequestMod.Request[GetIdentityMailFromDomainAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIdentityMailFromDomainAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIdentityMailFromDomainAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIdentityMailFromDomainAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the custom MAIL FROM attributes for a list of identities (email addresses : domains). This operation is throttled at one request per second and can only get custom MAIL FROM attributes for up to 100 identities at a time.
      */
    def getIdentityMailFromDomainAttributes(params: GetIdentityMailFromDomainAttributesRequest): awsDashSdkLib.libRequestMod.Request[GetIdentityMailFromDomainAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIdentityMailFromDomainAttributes(
      params: GetIdentityMailFromDomainAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIdentityMailFromDomainAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIdentityMailFromDomainAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Given a list of verified identities (email addresses and/or domains), returns a structure describing identity notification attributes. This operation is throttled at one request per second and can only get notification attributes for up to 100 identities at a time. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
      */
    def getIdentityNotificationAttributes(): awsDashSdkLib.libRequestMod.Request[GetIdentityNotificationAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIdentityNotificationAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIdentityNotificationAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIdentityNotificationAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Given a list of verified identities (email addresses and/or domains), returns a structure describing identity notification attributes. This operation is throttled at one request per second and can only get notification attributes for up to 100 identities at a time. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
      */
    def getIdentityNotificationAttributes(params: GetIdentityNotificationAttributesRequest): awsDashSdkLib.libRequestMod.Request[GetIdentityNotificationAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIdentityNotificationAttributes(
      params: GetIdentityNotificationAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIdentityNotificationAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIdentityNotificationAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the requested sending authorization policies for the given identity (an email address or a domain). The policies are returned as a map of policy names to policy contents. You can retrieve a maximum of 20 policies at a time.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def getIdentityPolicies(): awsDashSdkLib.libRequestMod.Request[GetIdentityPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIdentityPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIdentityPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIdentityPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the requested sending authorization policies for the given identity (an email address or a domain). The policies are returned as a map of policy names to policy contents. You can retrieve a maximum of 20 policies at a time.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def getIdentityPolicies(params: GetIdentityPoliciesRequest): awsDashSdkLib.libRequestMod.Request[GetIdentityPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIdentityPolicies(
      params: GetIdentityPoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIdentityPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIdentityPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Given a list of identities (email addresses and/or domains), returns the verification status and (for domain identities) the verification token for each identity. The verification status of an email address is "Pending" until the email address owner clicks the link within the verification email that Amazon SES sent to that address. If the email address owner clicks the link within 24 hours, the verification status of the email address changes to "Success". If the link is not clicked within 24 hours, the verification status changes to "Failed." In that case, if you still want to verify the email address, you must restart the verification process from the beginning. For domain identities, the domain's verification status is "Pending" as Amazon SES searches for the required TXT record in the DNS settings of the domain. When Amazon SES detects the record, the domain's verification status changes to "Success". If Amazon SES is unable to detect the record within 72 hours, the domain's verification status changes to "Failed." In that case, if you still want to verify the domain, you must restart the verification process from the beginning. This operation is throttled at one request per second and can only get verification attributes for up to 100 identities at a time.
      */
    def getIdentityVerificationAttributes(): awsDashSdkLib.libRequestMod.Request[GetIdentityVerificationAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIdentityVerificationAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIdentityVerificationAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIdentityVerificationAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Given a list of identities (email addresses and/or domains), returns the verification status and (for domain identities) the verification token for each identity. The verification status of an email address is "Pending" until the email address owner clicks the link within the verification email that Amazon SES sent to that address. If the email address owner clicks the link within 24 hours, the verification status of the email address changes to "Success". If the link is not clicked within 24 hours, the verification status changes to "Failed." In that case, if you still want to verify the email address, you must restart the verification process from the beginning. For domain identities, the domain's verification status is "Pending" as Amazon SES searches for the required TXT record in the DNS settings of the domain. When Amazon SES detects the record, the domain's verification status changes to "Success". If Amazon SES is unable to detect the record within 72 hours, the domain's verification status changes to "Failed." In that case, if you still want to verify the domain, you must restart the verification process from the beginning. This operation is throttled at one request per second and can only get verification attributes for up to 100 identities at a time.
      */
    def getIdentityVerificationAttributes(params: GetIdentityVerificationAttributesRequest): awsDashSdkLib.libRequestMod.Request[GetIdentityVerificationAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIdentityVerificationAttributes(
      params: GetIdentityVerificationAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIdentityVerificationAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIdentityVerificationAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides the sending limits for the Amazon SES account.  You can execute this operation no more than once per second.
      */
    def getSendQuota(): awsDashSdkLib.libRequestMod.Request[GetSendQuotaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSendQuota(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSendQuotaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSendQuotaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides sending statistics for the current AWS Region. The result is a list of data points, representing the last two weeks of sending activity. Each data point in the list contains statistics for a 15-minute period of time. You can execute this operation no more than once per second.
      */
    def getSendStatistics(): awsDashSdkLib.libRequestMod.Request[GetSendStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSendStatistics(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSendStatisticsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSendStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Displays the template object (which includes the Subject line, HTML part and text part) for the template you specify. You can execute this operation no more than once per second.
      */
    def getTemplate(): awsDashSdkLib.libRequestMod.Request[GetTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Displays the template object (which includes the Subject line, HTML part and text part) for the template you specify. You can execute this operation no more than once per second.
      */
    def getTemplate(params: GetTemplateRequest): awsDashSdkLib.libRequestMod.Request[GetTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTemplate(
      params: GetTemplateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides a list of the configuration sets associated with your Amazon SES account in the current AWS Region. For information about using configuration sets, see Monitoring Your Amazon SES Sending Activity in the Amazon SES Developer Guide.  You can execute this operation no more than once per second. This operation will return up to 1,000 configuration sets each time it is run. If your Amazon SES account has more than 1,000 configuration sets, this operation will also return a NextToken element. You can then execute the ListConfigurationSets operation again, passing the NextToken parameter and the value of the NextToken element to retrieve additional results.
      */
    def listConfigurationSets(): awsDashSdkLib.libRequestMod.Request[ListConfigurationSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listConfigurationSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListConfigurationSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListConfigurationSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides a list of the configuration sets associated with your Amazon SES account in the current AWS Region. For information about using configuration sets, see Monitoring Your Amazon SES Sending Activity in the Amazon SES Developer Guide.  You can execute this operation no more than once per second. This operation will return up to 1,000 configuration sets each time it is run. If your Amazon SES account has more than 1,000 configuration sets, this operation will also return a NextToken element. You can then execute the ListConfigurationSets operation again, passing the NextToken parameter and the value of the NextToken element to retrieve additional results.
      */
    def listConfigurationSets(params: ListConfigurationSetsRequest): awsDashSdkLib.libRequestMod.Request[ListConfigurationSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listConfigurationSets(
      params: ListConfigurationSetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListConfigurationSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListConfigurationSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the existing custom verification email templates for your account in the current AWS Region. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def listCustomVerificationEmailTemplates(): awsDashSdkLib.libRequestMod.Request[ListCustomVerificationEmailTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCustomVerificationEmailTemplates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCustomVerificationEmailTemplatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCustomVerificationEmailTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the existing custom verification email templates for your account in the current AWS Region. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def listCustomVerificationEmailTemplates(params: ListCustomVerificationEmailTemplatesRequest): awsDashSdkLib.libRequestMod.Request[ListCustomVerificationEmailTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCustomVerificationEmailTemplates(
      params: ListCustomVerificationEmailTemplatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCustomVerificationEmailTemplatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCustomVerificationEmailTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list containing all of the identities (email addresses and domains) for your AWS account in the current AWS Region, regardless of verification status. You can execute this operation no more than once per second.
      */
    def listIdentities(): awsDashSdkLib.libRequestMod.Request[ListIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listIdentities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIdentitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list containing all of the identities (email addresses and domains) for your AWS account in the current AWS Region, regardless of verification status. You can execute this operation no more than once per second.
      */
    def listIdentities(params: ListIdentitiesRequest): awsDashSdkLib.libRequestMod.Request[ListIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listIdentities(
      params: ListIdentitiesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIdentitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of sending authorization policies that are attached to the given identity (an email address or a domain). This API returns only a list. If you want the actual policy content, you can use GetIdentityPolicies.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def listIdentityPolicies(): awsDashSdkLib.libRequestMod.Request[ListIdentityPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listIdentityPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIdentityPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIdentityPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of sending authorization policies that are attached to the given identity (an email address or a domain). This API returns only a list. If you want the actual policy content, you can use GetIdentityPolicies.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def listIdentityPolicies(params: ListIdentityPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListIdentityPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listIdentityPolicies(
      params: ListIdentityPoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIdentityPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIdentityPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the IP address filters associated with your AWS account in the current AWS Region. For information about managing IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def listReceiptFilters(): awsDashSdkLib.libRequestMod.Request[ListReceiptFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listReceiptFilters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListReceiptFiltersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListReceiptFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the IP address filters associated with your AWS account in the current AWS Region. For information about managing IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def listReceiptFilters(params: ListReceiptFiltersRequest): awsDashSdkLib.libRequestMod.Request[ListReceiptFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listReceiptFilters(
      params: ListReceiptFiltersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListReceiptFiltersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListReceiptFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the receipt rule sets that exist under your AWS account in the current AWS Region. If there are additional receipt rule sets to be retrieved, you will receive a NextToken that you can provide to the next call to ListReceiptRuleSets to retrieve the additional entries. For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def listReceiptRuleSets(): awsDashSdkLib.libRequestMod.Request[ListReceiptRuleSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listReceiptRuleSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListReceiptRuleSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListReceiptRuleSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the receipt rule sets that exist under your AWS account in the current AWS Region. If there are additional receipt rule sets to be retrieved, you will receive a NextToken that you can provide to the next call to ListReceiptRuleSets to retrieve the additional entries. For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def listReceiptRuleSets(params: ListReceiptRuleSetsRequest): awsDashSdkLib.libRequestMod.Request[ListReceiptRuleSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listReceiptRuleSets(
      params: ListReceiptRuleSetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListReceiptRuleSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListReceiptRuleSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the email templates present in your Amazon SES account in the current AWS Region. You can execute this operation no more than once per second.
      */
    def listTemplates(): awsDashSdkLib.libRequestMod.Request[ListTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTemplates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTemplatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the email templates present in your Amazon SES account in the current AWS Region. You can execute this operation no more than once per second.
      */
    def listTemplates(params: ListTemplatesRequest): awsDashSdkLib.libRequestMod.Request[ListTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTemplates(
      params: ListTemplatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTemplatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deprecated. Use the ListIdentities operation to list the email addresses and domains associated with your account.
      */
    def listVerifiedEmailAddresses(): awsDashSdkLib.libRequestMod.Request[ListVerifiedEmailAddressesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVerifiedEmailAddresses(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVerifiedEmailAddressesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVerifiedEmailAddressesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates a sending authorization policy for the specified identity (an email address or a domain).  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def putIdentityPolicy(): awsDashSdkLib.libRequestMod.Request[PutIdentityPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putIdentityPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutIdentityPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutIdentityPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates a sending authorization policy for the specified identity (an email address or a domain).  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def putIdentityPolicy(params: PutIdentityPolicyRequest): awsDashSdkLib.libRequestMod.Request[PutIdentityPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putIdentityPolicy(
      params: PutIdentityPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutIdentityPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutIdentityPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reorders the receipt rules within a receipt rule set.  All of the rules in the rule set must be represented in this request. That is, this API will return an error if the reorder request doesn't explicitly position all of the rules.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def reorderReceiptRuleSet(): awsDashSdkLib.libRequestMod.Request[ReorderReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def reorderReceiptRuleSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReorderReceiptRuleSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReorderReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reorders the receipt rules within a receipt rule set.  All of the rules in the rule set must be represented in this request. That is, this API will return an error if the reorder request doesn't explicitly position all of the rules.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def reorderReceiptRuleSet(params: ReorderReceiptRuleSetRequest): awsDashSdkLib.libRequestMod.Request[ReorderReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def reorderReceiptRuleSet(
      params: ReorderReceiptRuleSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReorderReceiptRuleSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReorderReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates and sends a bounce message to the sender of an email you received through Amazon SES. You can only use this API on an email up to 24 hours after you receive it.  You cannot use this API to send generic bounces for mail that was not received by Amazon SES.  For information about receiving email through Amazon SES, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def sendBounce(): awsDashSdkLib.libRequestMod.Request[SendBounceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendBounce(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendBounceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendBounceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates and sends a bounce message to the sender of an email you received through Amazon SES. You can only use this API on an email up to 24 hours after you receive it.  You cannot use this API to send generic bounces for mail that was not received by Amazon SES.  For information about receiving email through Amazon SES, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def sendBounce(params: SendBounceRequest): awsDashSdkLib.libRequestMod.Request[SendBounceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendBounce(
      params: SendBounceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendBounceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendBounceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Composes an email message to multiple destinations. The message body is created using an email template. In order to send email using the SendBulkTemplatedEmail operation, your call to the API must meet the following requirements:   The call must refer to an existing email template. You can create email templates using the CreateTemplate operation.   The message must be sent from a verified email address or domain.   If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   Each Destination parameter must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.   The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call the SendBulkTemplatedEmail operation several times to send the message to each group.   The number of destinations you can contact in a single call to the API may be limited by your account's maximum sending rate.  
      */
    def sendBulkTemplatedEmail(): awsDashSdkLib.libRequestMod.Request[SendBulkTemplatedEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendBulkTemplatedEmail(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendBulkTemplatedEmailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendBulkTemplatedEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Composes an email message to multiple destinations. The message body is created using an email template. In order to send email using the SendBulkTemplatedEmail operation, your call to the API must meet the following requirements:   The call must refer to an existing email template. You can create email templates using the CreateTemplate operation.   The message must be sent from a verified email address or domain.   If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   Each Destination parameter must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.   The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call the SendBulkTemplatedEmail operation several times to send the message to each group.   The number of destinations you can contact in a single call to the API may be limited by your account's maximum sending rate.  
      */
    def sendBulkTemplatedEmail(params: SendBulkTemplatedEmailRequest): awsDashSdkLib.libRequestMod.Request[SendBulkTemplatedEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendBulkTemplatedEmail(
      params: SendBulkTemplatedEmailRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendBulkTemplatedEmailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendBulkTemplatedEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds an email address to the list of identities for your Amazon SES account in the current AWS Region and attempts to verify it. As a result of executing this operation, a customized verification email is sent to the specified address. To use this operation, you must first create a custom verification email template. For more information about creating and using custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def sendCustomVerificationEmail(): awsDashSdkLib.libRequestMod.Request[SendCustomVerificationEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendCustomVerificationEmail(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendCustomVerificationEmailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendCustomVerificationEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds an email address to the list of identities for your Amazon SES account in the current AWS Region and attempts to verify it. As a result of executing this operation, a customized verification email is sent to the specified address. To use this operation, you must first create a custom verification email template. For more information about creating and using custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def sendCustomVerificationEmail(params: SendCustomVerificationEmailRequest): awsDashSdkLib.libRequestMod.Request[SendCustomVerificationEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendCustomVerificationEmail(
      params: SendCustomVerificationEmailRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendCustomVerificationEmailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendCustomVerificationEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Composes an email message and immediately queues it for sending. In order to send email using the SendEmail operation, your message must meet the following requirements:   The message must be sent from a verified email address or domain. If you attempt to send email using a non-verified address or domain, the operation will result in an "Email address not verified" error.    If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   The message must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.   The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call the SendEmail operation several times to send the message to each group.    For every message that you send, the total number of recipients (including each recipient in the To:, CC: and BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your sending quota). For more information about sending quotas in Amazon SES, see Managing Your Amazon SES Sending Limits in the Amazon SES Developer Guide.  
      */
    def sendEmail(): awsDashSdkLib.libRequestMod.Request[SendEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendEmail(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendEmailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Composes an email message and immediately queues it for sending. In order to send email using the SendEmail operation, your message must meet the following requirements:   The message must be sent from a verified email address or domain. If you attempt to send email using a non-verified address or domain, the operation will result in an "Email address not verified" error.    If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   The message must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.   The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call the SendEmail operation several times to send the message to each group.    For every message that you send, the total number of recipients (including each recipient in the To:, CC: and BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your sending quota). For more information about sending quotas in Amazon SES, see Managing Your Amazon SES Sending Limits in the Amazon SES Developer Guide.  
      */
    def sendEmail(params: SendEmailRequest): awsDashSdkLib.libRequestMod.Request[SendEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendEmail(
      params: SendEmailRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendEmailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Composes an email message and immediately queues it for sending. This operation is more flexible than the SendEmail API operation. When you use the SendRawEmail operation, you can specify the headers of the message as well as its content. This flexibility is useful, for example, when you want to send a multipart MIME email (such a message that contains both a text and an HTML version). You can also use this operation to send messages that include attachments. The SendRawEmail operation has the following requirements:   You can only send email from verified email addresses or domains. If you try to send email from an address that isn't verified, the operation results in an "Email address not verified" error.   If your account is still in the Amazon SES sandbox, you can only send email to other verified addresses in your account, or to addresses that are associated with the Amazon SES mailbox simulator.   The maximum message size, including attachments, is 10 MB.   Each message has to include at least one recipient address. A recipient address includes any address on the To:, CC:, or BCC: lines.   If you send a single message to more than one recipient address, and one of the recipient addresses isn't in a valid format (that is, it's not in the format UserName@[SubDomain.]Domain.TopLevelDomain), Amazon SES rejects the entire message, even if the other addresses are valid.   Each message can include up to 50 recipient addresses across the To:, CC:, or BCC: lines. If you need to send a single message to more than 50 recipients, you have to split the list of recipient addresses into groups of less than 50 recipients, and send separate messages to each group.   Amazon SES allows you to specify 8-bit Content-Transfer-Encoding for MIME message parts. However, if Amazon SES has to modify the contents of your message (for example, if you use open and click tracking), 8-bit content isn't preserved. For this reason, we highly recommend that you encode all content that isn't 7-bit ASCII. For more information, see MIME Encoding in the Amazon SES Developer Guide.   Additionally, keep the following considerations in mind when using the SendRawEmail operation:   Although you can customize the message headers when using the SendRawEmail operation, Amazon SES will automatically apply its own Message-ID and Date headers; if you passed these headers when creating the message, they will be overwritten by the values that Amazon SES provides.   If you are using sending authorization to send on behalf of another user, SendRawEmail enables you to specify the cross-account identity for the email's Source, From, and Return-Path parameters in one of two ways: you can pass optional parameters SourceArn, FromArn, and/or ReturnPathArn to the API, or you can include the following X-headers in the header of your raw email:    X-SES-SOURCE-ARN     X-SES-FROM-ARN     X-SES-RETURN-PATH-ARN     Do not include these X-headers in the DKIM signature; Amazon SES will remove them before sending the email.  For most common sending authorization scenarios, we recommend that you specify the SourceIdentityArn parameter and not the FromIdentityArn or ReturnPathIdentityArn parameters. If you only specify the SourceIdentityArn parameter, Amazon SES will set the From and Return Path addresses to the identity specified in SourceIdentityArn. For more information about sending authorization, see the Using Sending Authorization with Amazon SES in the Amazon SES Developer Guide.    For every message that you send, the total number of recipients (including each recipient in the To:, CC: and BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your sending quota). For more information about sending quotas in Amazon SES, see Managing Your Amazon SES Sending Limits in the Amazon SES Developer Guide.   
      */
    def sendRawEmail(): awsDashSdkLib.libRequestMod.Request[SendRawEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendRawEmail(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendRawEmailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendRawEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Composes an email message and immediately queues it for sending. This operation is more flexible than the SendEmail API operation. When you use the SendRawEmail operation, you can specify the headers of the message as well as its content. This flexibility is useful, for example, when you want to send a multipart MIME email (such a message that contains both a text and an HTML version). You can also use this operation to send messages that include attachments. The SendRawEmail operation has the following requirements:   You can only send email from verified email addresses or domains. If you try to send email from an address that isn't verified, the operation results in an "Email address not verified" error.   If your account is still in the Amazon SES sandbox, you can only send email to other verified addresses in your account, or to addresses that are associated with the Amazon SES mailbox simulator.   The maximum message size, including attachments, is 10 MB.   Each message has to include at least one recipient address. A recipient address includes any address on the To:, CC:, or BCC: lines.   If you send a single message to more than one recipient address, and one of the recipient addresses isn't in a valid format (that is, it's not in the format UserName@[SubDomain.]Domain.TopLevelDomain), Amazon SES rejects the entire message, even if the other addresses are valid.   Each message can include up to 50 recipient addresses across the To:, CC:, or BCC: lines. If you need to send a single message to more than 50 recipients, you have to split the list of recipient addresses into groups of less than 50 recipients, and send separate messages to each group.   Amazon SES allows you to specify 8-bit Content-Transfer-Encoding for MIME message parts. However, if Amazon SES has to modify the contents of your message (for example, if you use open and click tracking), 8-bit content isn't preserved. For this reason, we highly recommend that you encode all content that isn't 7-bit ASCII. For more information, see MIME Encoding in the Amazon SES Developer Guide.   Additionally, keep the following considerations in mind when using the SendRawEmail operation:   Although you can customize the message headers when using the SendRawEmail operation, Amazon SES will automatically apply its own Message-ID and Date headers; if you passed these headers when creating the message, they will be overwritten by the values that Amazon SES provides.   If you are using sending authorization to send on behalf of another user, SendRawEmail enables you to specify the cross-account identity for the email's Source, From, and Return-Path parameters in one of two ways: you can pass optional parameters SourceArn, FromArn, and/or ReturnPathArn to the API, or you can include the following X-headers in the header of your raw email:    X-SES-SOURCE-ARN     X-SES-FROM-ARN     X-SES-RETURN-PATH-ARN     Do not include these X-headers in the DKIM signature; Amazon SES will remove them before sending the email.  For most common sending authorization scenarios, we recommend that you specify the SourceIdentityArn parameter and not the FromIdentityArn or ReturnPathIdentityArn parameters. If you only specify the SourceIdentityArn parameter, Amazon SES will set the From and Return Path addresses to the identity specified in SourceIdentityArn. For more information about sending authorization, see the Using Sending Authorization with Amazon SES in the Amazon SES Developer Guide.    For every message that you send, the total number of recipients (including each recipient in the To:, CC: and BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your sending quota). For more information about sending quotas in Amazon SES, see Managing Your Amazon SES Sending Limits in the Amazon SES Developer Guide.   
      */
    def sendRawEmail(params: SendRawEmailRequest): awsDashSdkLib.libRequestMod.Request[SendRawEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendRawEmail(
      params: SendRawEmailRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendRawEmailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendRawEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Composes an email message using an email template and immediately queues it for sending. In order to send email using the SendTemplatedEmail operation, your call to the API must meet the following requirements:   The call must refer to an existing email template. You can create email templates using the CreateTemplate operation.   The message must be sent from a verified email address or domain.   If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   Calls to the SendTemplatedEmail operation may only include one Destination parameter. A destination is a set of recipients who will receive the same version of the email. The Destination parameter can include up to 50 recipients, across the To:, CC: and BCC: fields.   The Destination parameter must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.    If your call to the SendTemplatedEmail operation includes all of the required parameters, Amazon SES accepts it and returns a Message ID. However, if Amazon SES can't render the email because the template contains errors, it doesn't send the email. Additionally, because it already accepted the message, Amazon SES doesn't return a message stating that it was unable to send the email. For these reasons, we highly recommend that you set up Amazon SES to send you notifications when Rendering Failure events occur. For more information, see Sending Personalized Email Using the Amazon SES API in the Amazon Simple Email Service Developer Guide. 
      */
    def sendTemplatedEmail(): awsDashSdkLib.libRequestMod.Request[SendTemplatedEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendTemplatedEmail(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendTemplatedEmailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendTemplatedEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Composes an email message using an email template and immediately queues it for sending. In order to send email using the SendTemplatedEmail operation, your call to the API must meet the following requirements:   The call must refer to an existing email template. You can create email templates using the CreateTemplate operation.   The message must be sent from a verified email address or domain.   If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   Calls to the SendTemplatedEmail operation may only include one Destination parameter. A destination is a set of recipients who will receive the same version of the email. The Destination parameter can include up to 50 recipients, across the To:, CC: and BCC: fields.   The Destination parameter must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.    If your call to the SendTemplatedEmail operation includes all of the required parameters, Amazon SES accepts it and returns a Message ID. However, if Amazon SES can't render the email because the template contains errors, it doesn't send the email. Additionally, because it already accepted the message, Amazon SES doesn't return a message stating that it was unable to send the email. For these reasons, we highly recommend that you set up Amazon SES to send you notifications when Rendering Failure events occur. For more information, see Sending Personalized Email Using the Amazon SES API in the Amazon Simple Email Service Developer Guide. 
      */
    def sendTemplatedEmail(params: SendTemplatedEmailRequest): awsDashSdkLib.libRequestMod.Request[SendTemplatedEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendTemplatedEmail(
      params: SendTemplatedEmailRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendTemplatedEmailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendTemplatedEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the specified receipt rule set as the active receipt rule set.  To disable your email-receiving through Amazon SES completely, you can call this API with RuleSetName set to null.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def setActiveReceiptRuleSet(): awsDashSdkLib.libRequestMod.Request[SetActiveReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setActiveReceiptRuleSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetActiveReceiptRuleSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetActiveReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the specified receipt rule set as the active receipt rule set.  To disable your email-receiving through Amazon SES completely, you can call this API with RuleSetName set to null.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def setActiveReceiptRuleSet(params: SetActiveReceiptRuleSetRequest): awsDashSdkLib.libRequestMod.Request[SetActiveReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setActiveReceiptRuleSet(
      params: SetActiveReceiptRuleSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetActiveReceiptRuleSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetActiveReceiptRuleSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables or disables Easy DKIM signing of email sent from an identity:   If Easy DKIM signing is enabled for a domain name identity (such as example.com), then Amazon SES will DKIM-sign all email sent by addresses under that domain name (for example, user@example.com).   If Easy DKIM signing is enabled for an email address, then Amazon SES will DKIM-sign all email sent by that email address.   For email addresses (for example, user@example.com), you can only enable Easy DKIM signing if the corresponding domain (in this case, example.com) has been set up for Easy DKIM using the AWS Console or the VerifyDomainDkim operation. You can execute this operation no more than once per second. For more information about Easy DKIM signing, go to the Amazon SES Developer Guide.
      */
    def setIdentityDkimEnabled(): awsDashSdkLib.libRequestMod.Request[SetIdentityDkimEnabledResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setIdentityDkimEnabled(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetIdentityDkimEnabledResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetIdentityDkimEnabledResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables or disables Easy DKIM signing of email sent from an identity:   If Easy DKIM signing is enabled for a domain name identity (such as example.com), then Amazon SES will DKIM-sign all email sent by addresses under that domain name (for example, user@example.com).   If Easy DKIM signing is enabled for an email address, then Amazon SES will DKIM-sign all email sent by that email address.   For email addresses (for example, user@example.com), you can only enable Easy DKIM signing if the corresponding domain (in this case, example.com) has been set up for Easy DKIM using the AWS Console or the VerifyDomainDkim operation. You can execute this operation no more than once per second. For more information about Easy DKIM signing, go to the Amazon SES Developer Guide.
      */
    def setIdentityDkimEnabled(params: SetIdentityDkimEnabledRequest): awsDashSdkLib.libRequestMod.Request[SetIdentityDkimEnabledResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setIdentityDkimEnabled(
      params: SetIdentityDkimEnabledRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetIdentityDkimEnabledResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetIdentityDkimEnabledResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Given an identity (an email address or a domain), enables or disables whether Amazon SES forwards bounce and complaint notifications as email. Feedback forwarding can only be disabled when Amazon Simple Notification Service (Amazon SNS) topics are specified for both bounces and complaints.  Feedback forwarding does not apply to delivery notifications. Delivery notifications are only available through Amazon SNS.  You can execute this operation no more than once per second. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
      */
    def setIdentityFeedbackForwardingEnabled(): awsDashSdkLib.libRequestMod.Request[SetIdentityFeedbackForwardingEnabledResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setIdentityFeedbackForwardingEnabled(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetIdentityFeedbackForwardingEnabledResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetIdentityFeedbackForwardingEnabledResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Given an identity (an email address or a domain), enables or disables whether Amazon SES forwards bounce and complaint notifications as email. Feedback forwarding can only be disabled when Amazon Simple Notification Service (Amazon SNS) topics are specified for both bounces and complaints.  Feedback forwarding does not apply to delivery notifications. Delivery notifications are only available through Amazon SNS.  You can execute this operation no more than once per second. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
      */
    def setIdentityFeedbackForwardingEnabled(params: SetIdentityFeedbackForwardingEnabledRequest): awsDashSdkLib.libRequestMod.Request[SetIdentityFeedbackForwardingEnabledResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setIdentityFeedbackForwardingEnabled(
      params: SetIdentityFeedbackForwardingEnabledRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetIdentityFeedbackForwardingEnabledResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetIdentityFeedbackForwardingEnabledResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Given an identity (an email address or a domain), sets whether Amazon SES includes the original email headers in the Amazon Simple Notification Service (Amazon SNS) notifications of a specified type. You can execute this operation no more than once per second. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
      */
    def setIdentityHeadersInNotificationsEnabled(): awsDashSdkLib.libRequestMod.Request[
        SetIdentityHeadersInNotificationsEnabledResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def setIdentityHeadersInNotificationsEnabled(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetIdentityHeadersInNotificationsEnabledResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        SetIdentityHeadersInNotificationsEnabledResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Given an identity (an email address or a domain), sets whether Amazon SES includes the original email headers in the Amazon Simple Notification Service (Amazon SNS) notifications of a specified type. You can execute this operation no more than once per second. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
      */
    def setIdentityHeadersInNotificationsEnabled(params: SetIdentityHeadersInNotificationsEnabledRequest): awsDashSdkLib.libRequestMod.Request[
        SetIdentityHeadersInNotificationsEnabledResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def setIdentityHeadersInNotificationsEnabled(
      params: SetIdentityHeadersInNotificationsEnabledRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetIdentityHeadersInNotificationsEnabledResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        SetIdentityHeadersInNotificationsEnabledResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Enables or disables the custom MAIL FROM domain setup for a verified identity (an email address or a domain).  To send emails using the specified MAIL FROM domain, you must add an MX record to your MAIL FROM domain's DNS settings. If you want your emails to pass Sender Policy Framework (SPF) checks, you must also add or update an SPF record. For more information, see the Amazon SES Developer Guide.  You can execute this operation no more than once per second.
      */
    def setIdentityMailFromDomain(): awsDashSdkLib.libRequestMod.Request[SetIdentityMailFromDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setIdentityMailFromDomain(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetIdentityMailFromDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetIdentityMailFromDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables or disables the custom MAIL FROM domain setup for a verified identity (an email address or a domain).  To send emails using the specified MAIL FROM domain, you must add an MX record to your MAIL FROM domain's DNS settings. If you want your emails to pass Sender Policy Framework (SPF) checks, you must also add or update an SPF record. For more information, see the Amazon SES Developer Guide.  You can execute this operation no more than once per second.
      */
    def setIdentityMailFromDomain(params: SetIdentityMailFromDomainRequest): awsDashSdkLib.libRequestMod.Request[SetIdentityMailFromDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setIdentityMailFromDomain(
      params: SetIdentityMailFromDomainRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetIdentityMailFromDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetIdentityMailFromDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets an Amazon Simple Notification Service (Amazon SNS) topic to use when delivering notifications. When you use this operation, you specify a verified identity, such as an email address or domain. When you send an email that uses the chosen identity in the Source field, Amazon SES sends notifications to the topic you specified. You can send bounce, complaint, or delivery notifications (or any combination of the three) to the Amazon SNS topic that you specify. You can execute this operation no more than once per second. For more information about feedback notification, see the Amazon SES Developer Guide.
      */
    def setIdentityNotificationTopic(): awsDashSdkLib.libRequestMod.Request[SetIdentityNotificationTopicResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setIdentityNotificationTopic(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetIdentityNotificationTopicResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetIdentityNotificationTopicResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets an Amazon Simple Notification Service (Amazon SNS) topic to use when delivering notifications. When you use this operation, you specify a verified identity, such as an email address or domain. When you send an email that uses the chosen identity in the Source field, Amazon SES sends notifications to the topic you specified. You can send bounce, complaint, or delivery notifications (or any combination of the three) to the Amazon SNS topic that you specify. You can execute this operation no more than once per second. For more information about feedback notification, see the Amazon SES Developer Guide.
      */
    def setIdentityNotificationTopic(params: SetIdentityNotificationTopicRequest): awsDashSdkLib.libRequestMod.Request[SetIdentityNotificationTopicResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setIdentityNotificationTopic(
      params: SetIdentityNotificationTopicRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetIdentityNotificationTopicResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetIdentityNotificationTopicResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the position of the specified receipt rule in the receipt rule set. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def setReceiptRulePosition(): awsDashSdkLib.libRequestMod.Request[SetReceiptRulePositionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setReceiptRulePosition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetReceiptRulePositionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetReceiptRulePositionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the position of the specified receipt rule in the receipt rule set. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def setReceiptRulePosition(params: SetReceiptRulePositionRequest): awsDashSdkLib.libRequestMod.Request[SetReceiptRulePositionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setReceiptRulePosition(
      params: SetReceiptRulePositionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetReceiptRulePositionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetReceiptRulePositionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a preview of the MIME content of an email when provided with a template and a set of replacement data. You can execute this operation no more than once per second.
      */
    def testRenderTemplate(): awsDashSdkLib.libRequestMod.Request[TestRenderTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testRenderTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestRenderTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestRenderTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a preview of the MIME content of an email when provided with a template and a set of replacement data. You can execute this operation no more than once per second.
      */
    def testRenderTemplate(params: TestRenderTemplateRequest): awsDashSdkLib.libRequestMod.Request[TestRenderTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testRenderTemplate(
      params: TestRenderTemplateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestRenderTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestRenderTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables or disables email sending across your entire Amazon SES account in the current AWS Region. You can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending across your Amazon SES account in a given AWS Region when reputation metrics (such as your bounce or complaint rates) reach certain thresholds. You can execute this operation no more than once per second.
      */
    def updateAccountSendingEnabled(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAccountSendingEnabled(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables or disables email sending across your entire Amazon SES account in the current AWS Region. You can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending across your Amazon SES account in a given AWS Region when reputation metrics (such as your bounce or complaint rates) reach certain thresholds. You can execute this operation no more than once per second.
      */
    def updateAccountSendingEnabled(params: UpdateAccountSendingEnabledRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAccountSendingEnabled(
      params: UpdateAccountSendingEnabledRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the event destination of a configuration set. Event destinations are associated with configuration sets, which enable you to publish email sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS). For information about using configuration sets, see Monitoring Your Amazon SES Sending Activity in the Amazon SES Developer Guide.   When you create or update an event destination, you must provide one, and only one, destination. The destination can be Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).  You can execute this operation no more than once per second.
      */
    def updateConfigurationSetEventDestination(): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateConfigurationSetEventDestination(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateConfigurationSetEventDestinationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the event destination of a configuration set. Event destinations are associated with configuration sets, which enable you to publish email sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS). For information about using configuration sets, see Monitoring Your Amazon SES Sending Activity in the Amazon SES Developer Guide.   When you create or update an event destination, you must provide one, and only one, destination. The destination can be Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).  You can execute this operation no more than once per second.
      */
    def updateConfigurationSetEventDestination(params: UpdateConfigurationSetEventDestinationRequest): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateConfigurationSetEventDestination(
      params: UpdateConfigurationSetEventDestinationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateConfigurationSetEventDestinationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables or disables the publishing of reputation metrics for emails sent using a specific configuration set in a given AWS Region. Reputation metrics include bounce and complaint rates. These metrics are published to Amazon CloudWatch. By using CloudWatch, you can create alarms when bounce or complaint rates exceed certain thresholds. You can execute this operation no more than once per second.
      */
    def updateConfigurationSetReputationMetricsEnabled(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateConfigurationSetReputationMetricsEnabled(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables or disables the publishing of reputation metrics for emails sent using a specific configuration set in a given AWS Region. Reputation metrics include bounce and complaint rates. These metrics are published to Amazon CloudWatch. By using CloudWatch, you can create alarms when bounce or complaint rates exceed certain thresholds. You can execute this operation no more than once per second.
      */
    def updateConfigurationSetReputationMetricsEnabled(params: UpdateConfigurationSetReputationMetricsEnabledRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateConfigurationSetReputationMetricsEnabled(
      params: UpdateConfigurationSetReputationMetricsEnabledRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables or disables email sending for messages sent using a specific configuration set in a given AWS Region. You can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending for a configuration set when the reputation metrics for that configuration set (such as your bounce on complaint rate) exceed certain thresholds. You can execute this operation no more than once per second.
      */
    def updateConfigurationSetSendingEnabled(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateConfigurationSetSendingEnabled(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables or disables email sending for messages sent using a specific configuration set in a given AWS Region. You can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending for a configuration set when the reputation metrics for that configuration set (such as your bounce on complaint rate) exceed certain thresholds. You can execute this operation no more than once per second.
      */
    def updateConfigurationSetSendingEnabled(params: UpdateConfigurationSetSendingEnabledRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateConfigurationSetSendingEnabled(
      params: UpdateConfigurationSetSendingEnabledRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies an association between a configuration set and a custom domain for open and click event tracking.  By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.
      */
    def updateConfigurationSetTrackingOptions(): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationSetTrackingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateConfigurationSetTrackingOptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateConfigurationSetTrackingOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationSetTrackingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies an association between a configuration set and a custom domain for open and click event tracking.  By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.
      */
    def updateConfigurationSetTrackingOptions(params: UpdateConfigurationSetTrackingOptionsRequest): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationSetTrackingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateConfigurationSetTrackingOptions(
      params: UpdateConfigurationSetTrackingOptionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateConfigurationSetTrackingOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationSetTrackingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def updateCustomVerificationEmailTemplate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCustomVerificationEmailTemplate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def updateCustomVerificationEmailTemplate(params: UpdateCustomVerificationEmailTemplateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCustomVerificationEmailTemplate(
      params: UpdateCustomVerificationEmailTemplateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a receipt rule. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def updateReceiptRule(): awsDashSdkLib.libRequestMod.Request[UpdateReceiptRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateReceiptRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateReceiptRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateReceiptRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a receipt rule. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def updateReceiptRule(params: UpdateReceiptRuleRequest): awsDashSdkLib.libRequestMod.Request[UpdateReceiptRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateReceiptRule(
      params: UpdateReceiptRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateReceiptRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateReceiptRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an email template. Email templates enable you to send personalized email to one or more destinations in a single API operation. For more information, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def updateTemplate(): awsDashSdkLib.libRequestMod.Request[UpdateTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an email template. Email templates enable you to send personalized email to one or more destinations in a single API operation. For more information, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
      */
    def updateTemplate(params: UpdateTemplateRequest): awsDashSdkLib.libRequestMod.Request[UpdateTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTemplate(
      params: UpdateTemplateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a set of DKIM tokens for a domain. DKIM tokens are character strings that represent your domain's identity. Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by Amazon SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection process may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign email originating from that domain. You can execute this operation no more than once per second. To enable or disable Easy DKIM signing for a domain, use the SetIdentityDkimEnabled operation. For more information about creating DNS records using DKIM tokens, go to the Amazon SES Developer Guide.
      */
    def verifyDomainDkim(): awsDashSdkLib.libRequestMod.Request[VerifyDomainDkimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def verifyDomainDkim(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ VerifyDomainDkimResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[VerifyDomainDkimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a set of DKIM tokens for a domain. DKIM tokens are character strings that represent your domain's identity. Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by Amazon SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection process may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign email originating from that domain. You can execute this operation no more than once per second. To enable or disable Easy DKIM signing for a domain, use the SetIdentityDkimEnabled operation. For more information about creating DNS records using DKIM tokens, go to the Amazon SES Developer Guide.
      */
    def verifyDomainDkim(params: VerifyDomainDkimRequest): awsDashSdkLib.libRequestMod.Request[VerifyDomainDkimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def verifyDomainDkim(
      params: VerifyDomainDkimRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ VerifyDomainDkimResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[VerifyDomainDkimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a domain to the list of identities for your Amazon SES account in the current AWS Region and attempts to verify it. For more information about verifying domains, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.  You can execute this operation no more than once per second.
      */
    def verifyDomainIdentity(): awsDashSdkLib.libRequestMod.Request[VerifyDomainIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def verifyDomainIdentity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ VerifyDomainIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[VerifyDomainIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a domain to the list of identities for your Amazon SES account in the current AWS Region and attempts to verify it. For more information about verifying domains, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.  You can execute this operation no more than once per second.
      */
    def verifyDomainIdentity(params: VerifyDomainIdentityRequest): awsDashSdkLib.libRequestMod.Request[VerifyDomainIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def verifyDomainIdentity(
      params: VerifyDomainIdentityRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ VerifyDomainIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[VerifyDomainIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deprecated. Use the VerifyEmailIdentity operation to verify a new email address.
      */
    def verifyEmailAddress(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def verifyEmailAddress(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deprecated. Use the VerifyEmailIdentity operation to verify a new email address.
      */
    def verifyEmailAddress(params: VerifyEmailAddressRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def verifyEmailAddress(
      params: VerifyEmailAddressRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds an email address to the list of identities for your Amazon SES account in the current AWS region and attempts to verify it. As a result of executing this operation, a verification email is sent to the specified address. You can execute this operation no more than once per second.
      */
    def verifyEmailIdentity(): awsDashSdkLib.libRequestMod.Request[VerifyEmailIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def verifyEmailIdentity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ VerifyEmailIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[VerifyEmailIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds an email address to the list of identities for your Amazon SES account in the current AWS region and attempts to verify it. As a result of executing this operation, a verification email is sent to the specified address. You can execute this operation no more than once per second.
      */
    def verifyEmailIdentity(params: VerifyEmailIdentityRequest): awsDashSdkLib.libRequestMod.Request[VerifyEmailIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def verifyEmailIdentity(
      params: VerifyEmailIdentityRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ VerifyEmailIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[VerifyEmailIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the identityExists state by periodically calling the underlying SES.getIdentityVerificationAttributesoperation every 3 seconds (at most 20 times).
      */
    @JSName("waitFor")
    def waitFor_identityExists(state: awsDashSdkLib.awsDashSdkLibStrings.identityExists): awsDashSdkLib.libRequestMod.Request[GetIdentityVerificationAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_identityExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.identityExists,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIdentityVerificationAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIdentityVerificationAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the identityExists state by periodically calling the underlying SES.getIdentityVerificationAttributesoperation every 3 seconds (at most 20 times).
      */
    @JSName("waitFor")
    def waitFor_identityExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.identityExists,
      params: GetIdentityVerificationAttributesRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[GetIdentityVerificationAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_identityExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.identityExists,
      params: GetIdentityVerificationAttributesRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIdentityVerificationAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIdentityVerificationAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateAccountSendingEnabledRequest extends js.Object {
    /**
      * Describes whether email sending is enabled or disabled for your Amazon SES account in the current AWS Region.
      */
    var Enabled: js.UndefOr[Enabled] = js.undefined
  }
  
  trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
    /**
      * The name of the configuration set that contains the event destination that you want to update.
      */
    var ConfigurationSetName: awsDashSdkLib.clientsSesMod.SESNs.ConfigurationSetName
    /**
      * The event destination object that you want to apply to the specified configuration set.
      */
    var EventDestination: awsDashSdkLib.clientsSesMod.SESNs.EventDestination
  }
  
  trait UpdateConfigurationSetEventDestinationResponse extends js.Object
  
  trait UpdateConfigurationSetReputationMetricsEnabledRequest extends js.Object {
    /**
      * The name of the configuration set that you want to update.
      */
    var ConfigurationSetName: awsDashSdkLib.clientsSesMod.SESNs.ConfigurationSetName
    /**
      * Describes whether or not Amazon SES will publish reputation metrics for the configuration set, such as bounce and complaint rates, to Amazon CloudWatch.
      */
    var Enabled: awsDashSdkLib.clientsSesMod.SESNs.Enabled
  }
  
  trait UpdateConfigurationSetSendingEnabledRequest extends js.Object {
    /**
      * The name of the configuration set that you want to update.
      */
    var ConfigurationSetName: awsDashSdkLib.clientsSesMod.SESNs.ConfigurationSetName
    /**
      * Describes whether email sending is enabled or disabled for the configuration set. 
      */
    var Enabled: awsDashSdkLib.clientsSesMod.SESNs.Enabled
  }
  
  trait UpdateConfigurationSetTrackingOptionsRequest extends js.Object {
    /**
      * The name of the configuration set for which you want to update the custom tracking domain.
      */
    var ConfigurationSetName: awsDashSdkLib.clientsSesMod.SESNs.ConfigurationSetName
    var TrackingOptions: awsDashSdkLib.clientsSesMod.SESNs.TrackingOptions
  }
  
  trait UpdateConfigurationSetTrackingOptionsResponse extends js.Object
  
  trait UpdateCustomVerificationEmailTemplateRequest extends js.Object {
    /**
      * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
      */
    var FailureRedirectionURL: js.UndefOr[FailureRedirectionURL] = js.undefined
    /**
      * The email address that the custom verification email is sent from.
      */
    var FromEmailAddress: js.UndefOr[FromAddress] = js.undefined
    /**
      * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
      */
    var SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL] = js.undefined
    /**
      * The content of the custom verification email. The total size of the email must be less than 10 MB. The message body may contain HTML, with some limitations. For more information, see Custom Verification Email Frequently Asked Questions in the Amazon SES Developer Guide.
      */
    var TemplateContent: js.UndefOr[TemplateContent] = js.undefined
    /**
      * The name of the custom verification email template that you want to update.
      */
    var TemplateName: awsDashSdkLib.clientsSesMod.SESNs.TemplateName
    /**
      * The subject line of the custom verification email.
      */
    var TemplateSubject: js.UndefOr[Subject] = js.undefined
  }
  
  trait UpdateReceiptRuleRequest extends js.Object {
    /**
      * A data structure that contains the updated receipt rule information.
      */
    var Rule: ReceiptRule
    /**
      * The name of the receipt rule set that the receipt rule belongs to.
      */
    var RuleSetName: ReceiptRuleSetName
  }
  
  trait UpdateReceiptRuleResponse extends js.Object
  
  trait UpdateTemplateRequest extends js.Object {
    var Template: awsDashSdkLib.clientsSesMod.SESNs.Template
  }
  
  trait UpdateTemplateResponse extends js.Object
  
  trait VerificationAttributes
    extends /* key */ org.scalablytyped.runtime.StringDictionary[IdentityVerificationAttributes]
  
  trait VerifyDomainDkimRequest extends js.Object {
    /**
      * The name of the domain to be verified for Easy DKIM signing.
      */
    var Domain: awsDashSdkLib.clientsSesMod.SESNs.Domain
  }
  
  trait VerifyDomainDkimResponse extends js.Object {
    /**
      * A set of character strings that represent the domain's identity. If the identity is an email address, the tokens represent the domain of that address. Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by Amazon SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection process may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign emails originating from that domain. For more information about creating DNS records using DKIM tokens, go to the Amazon SES Developer Guide.
      */
    var DkimTokens: VerificationTokenList
  }
  
  trait VerifyDomainIdentityRequest extends js.Object {
    /**
      * The domain to be verified.
      */
    var Domain: awsDashSdkLib.clientsSesMod.SESNs.Domain
  }
  
  trait VerifyDomainIdentityResponse extends js.Object {
    /**
      * A TXT record that you must place in the DNS settings of the domain to complete domain verification with Amazon SES. As Amazon SES searches for the TXT record, the domain's verification status is "Pending". When Amazon SES detects the record, the domain's verification status changes to "Success". If Amazon SES is unable to detect the record within 72 hours, the domain's verification status changes to "Failed." In that case, if you still want to verify the domain, you must restart the verification process from the beginning.
      */
    var VerificationToken: awsDashSdkLib.clientsSesMod.SESNs.VerificationToken
  }
  
  trait VerifyEmailAddressRequest extends js.Object {
    /**
      * The email address to be verified.
      */
    var EmailAddress: Address
  }
  
  trait VerifyEmailIdentityRequest extends js.Object {
    /**
      * The email address to be verified.
      */
    var EmailAddress: Address
  }
  
  trait VerifyEmailIdentityResponse extends js.Object
  
  trait WorkmailAction extends js.Object {
    /**
      * The ARN of the Amazon WorkMail organization. An example of an Amazon WorkMail organization ARN is arn:aws:workmail:us-west-2:123456789012:organization/m-68755160c4cb4e29a2b2f8fb58f359d7. For information about Amazon WorkMail organizations, see the Amazon WorkMail Administrator Guide.
      */
    var OrganizationArn: AmazonResourceName
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the WorkMail action is called. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
      */
    var TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
  }
  
  trait _BehaviorOnMXFailure extends js.Object
  
  trait _BounceType extends js.Object
  
  trait _BulkEmailStatus extends js.Object
  
  trait _ConfigurationSetAttribute extends js.Object
  
  trait _CustomMailFromStatus extends js.Object
  
  trait _DimensionValueSource extends js.Object
  
  trait _DsnAction extends js.Object
  
  trait _EventType extends js.Object
  
  trait _IdentityType extends js.Object
  
  trait _InvocationType extends js.Object
  
  trait _NotificationType extends js.Object
  
  trait _ReceiptFilterPolicy extends js.Object
  
  trait _SNSActionEncoding extends js.Object
  
  trait _TlsPolicy extends js.Object
  
  trait _VerificationStatus extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type Address = java.lang.String
  type AddressList = js.Array[Address]
  type AmazonResourceName = java.lang.String
  type ArrivalDate = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UseDefaultValue
    - awsDashSdkLib.awsDashSdkLibStrings.RejectMessage
    - java.lang.String
  */
  type BehaviorOnMXFailure = _BehaviorOnMXFailure | java.lang.String
  type BounceMessage = java.lang.String
  type BounceSmtpReplyCode = java.lang.String
  type BounceStatusCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DoesNotExist
    - awsDashSdkLib.awsDashSdkLibStrings.MessageTooLarge
    - awsDashSdkLib.awsDashSdkLibStrings.ExceededQuota
    - awsDashSdkLib.awsDashSdkLibStrings.ContentRejected
    - awsDashSdkLib.awsDashSdkLibStrings.Undefined
    - awsDashSdkLib.awsDashSdkLibStrings.TemporaryFailure
    - java.lang.String
  */
  type BounceType = _BounceType | java.lang.String
  type BouncedRecipientInfoList = js.Array[BouncedRecipientInfo]
  type BulkEmailDestinationList = js.Array[BulkEmailDestination]
  type BulkEmailDestinationStatusList = js.Array[BulkEmailDestinationStatus]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Success
    - awsDashSdkLib.awsDashSdkLibStrings.MessageRejected
    - awsDashSdkLib.awsDashSdkLibStrings.MailFromDomainNotVerified
    - awsDashSdkLib.awsDashSdkLibStrings.ConfigurationSetDoesNotExist
    - awsDashSdkLib.awsDashSdkLibStrings.TemplateDoesNotExist
    - awsDashSdkLib.awsDashSdkLibStrings.AccountSuspended
    - awsDashSdkLib.awsDashSdkLibStrings.AccountThrottled
    - awsDashSdkLib.awsDashSdkLibStrings.AccountDailyQuotaExceeded
    - awsDashSdkLib.awsDashSdkLibStrings.InvalidSendingPoolName
    - awsDashSdkLib.awsDashSdkLibStrings.AccountSendingPaused
    - awsDashSdkLib.awsDashSdkLibStrings.ConfigurationSetSendingPaused
    - awsDashSdkLib.awsDashSdkLibStrings.InvalidParameterValue
    - awsDashSdkLib.awsDashSdkLibStrings.TransientFailure
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type BulkEmailStatus = _BulkEmailStatus | java.lang.String
  type Charset = java.lang.String
  type Cidr = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchDimensionConfigurations = js.Array[CloudWatchDimensionConfiguration]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.eventDestinations
    - awsDashSdkLib.awsDashSdkLibStrings.trackingOptions
    - awsDashSdkLib.awsDashSdkLibStrings.reputationOptions
    - java.lang.String
  */
  type ConfigurationSetAttribute = _ConfigurationSetAttribute | java.lang.String
  type ConfigurationSetAttributeList = js.Array[ConfigurationSetAttribute]
  type ConfigurationSetName = java.lang.String
  type ConfigurationSets = js.Array[ConfigurationSet]
  type Counter = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.Success
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.TemporaryFailure
    - java.lang.String
  */
  type CustomMailFromStatus = _CustomMailFromStatus | java.lang.String
  type CustomRedirectDomain = java.lang.String
  type CustomVerificationEmailTemplates = js.Array[CustomVerificationEmailTemplate]
  type DefaultDimensionValue = java.lang.String
  type DiagnosticCode = java.lang.String
  type DimensionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.messageTag
    - awsDashSdkLib.awsDashSdkLibStrings.emailHeader
    - awsDashSdkLib.awsDashSdkLibStrings.linkTag
    - java.lang.String
  */
  type DimensionValueSource = _DimensionValueSource | java.lang.String
  type Domain = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - awsDashSdkLib.awsDashSdkLibStrings.delayed
    - awsDashSdkLib.awsDashSdkLibStrings.delivered
    - awsDashSdkLib.awsDashSdkLibStrings.relayed
    - awsDashSdkLib.awsDashSdkLibStrings.expanded
    - java.lang.String
  */
  type DsnAction = _DsnAction | java.lang.String
  type DsnStatus = java.lang.String
  type Enabled = scala.Boolean
  type Error = java.lang.String
  type EventDestinationName = java.lang.String
  type EventDestinations = js.Array[EventDestination]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.send
    - awsDashSdkLib.awsDashSdkLibStrings.reject
    - awsDashSdkLib.awsDashSdkLibStrings.bounce
    - awsDashSdkLib.awsDashSdkLibStrings.complaint
    - awsDashSdkLib.awsDashSdkLibStrings.delivery
    - awsDashSdkLib.awsDashSdkLibStrings.open
    - awsDashSdkLib.awsDashSdkLibStrings.click
    - awsDashSdkLib.awsDashSdkLibStrings.renderingFailure
    - java.lang.String
  */
  type EventType = _EventType | java.lang.String
  type EventTypes = js.Array[EventType]
  type Explanation = java.lang.String
  type ExtensionFieldList = js.Array[ExtensionField]
  type ExtensionFieldName = java.lang.String
  type ExtensionFieldValue = java.lang.String
  type FailureRedirectionURL = java.lang.String
  type FromAddress = java.lang.String
  type HeaderName = java.lang.String
  type HeaderValue = java.lang.String
  type HtmlPart = java.lang.String
  type Identity = java.lang.String
  type IdentityList = js.Array[Identity]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EmailAddress
    - awsDashSdkLib.awsDashSdkLibStrings.Domain
    - java.lang.String
  */
  type IdentityType = _IdentityType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Event
    - awsDashSdkLib.awsDashSdkLibStrings.RequestResponse
    - java.lang.String
  */
  type InvocationType = _InvocationType | java.lang.String
  type LastAttemptDate = stdLib.Date
  type LastFreshStart = stdLib.Date
  type MailFromDomainName = java.lang.String
  type Max24HourSend = scala.Double
  type MaxItems = scala.Double
  type MaxResults = scala.Double
  type MaxSendRate = scala.Double
  type MessageData = java.lang.String
  type MessageId = java.lang.String
  type MessageTagList = js.Array[MessageTag]
  type MessageTagName = java.lang.String
  type MessageTagValue = java.lang.String
  type NextToken = java.lang.String
  type NotificationTopic = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Bounce
    - awsDashSdkLib.awsDashSdkLibStrings.Complaint
    - awsDashSdkLib.awsDashSdkLibStrings.Delivery
    - java.lang.String
  */
  type NotificationType = _NotificationType | java.lang.String
  type Policy = java.lang.String
  type PolicyName = java.lang.String
  type PolicyNameList = js.Array[PolicyName]
  type RawMessageData = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsSesMod.Blob | java.lang.String
  type ReceiptActionsList = js.Array[ReceiptAction]
  type ReceiptFilterList = js.Array[ReceiptFilter]
  type ReceiptFilterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Block
    - awsDashSdkLib.awsDashSdkLibStrings.Allow
    - java.lang.String
  */
  type ReceiptFilterPolicy = _ReceiptFilterPolicy | java.lang.String
  type ReceiptRuleName = java.lang.String
  type ReceiptRuleNamesList = js.Array[ReceiptRuleName]
  type ReceiptRuleSetName = java.lang.String
  type ReceiptRuleSetsLists = js.Array[ReceiptRuleSetMetadata]
  type ReceiptRulesList = js.Array[ReceiptRule]
  type Recipient = java.lang.String
  type RecipientsList = js.Array[Recipient]
  type RemoteMta = java.lang.String
  type RenderedTemplate = java.lang.String
  type ReportingMta = java.lang.String
  type S3BucketName = java.lang.String
  type S3KeyPrefix = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`UTF-8`
    - awsDashSdkLib.awsDashSdkLibStrings.Base64
    - java.lang.String
  */
  type SNSActionEncoding = _SNSActionEncoding | java.lang.String
  type SendDataPointList = js.Array[SendDataPoint]
  type SentLast24Hours = scala.Double
  type StopScope = awsDashSdkLib.awsDashSdkLibStrings.RuleSet | java.lang.String
  type Subject = java.lang.String
  type SubjectPart = java.lang.String
  type SuccessRedirectionURL = java.lang.String
  type TemplateContent = java.lang.String
  type TemplateData = java.lang.String
  type TemplateMetadataList = js.Array[TemplateMetadata]
  type TemplateName = java.lang.String
  type TextPart = java.lang.String
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Require
    - awsDashSdkLib.awsDashSdkLibStrings.Optional
    - java.lang.String
  */
  type TlsPolicy = _TlsPolicy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.Success
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.TemporaryFailure
    - awsDashSdkLib.awsDashSdkLibStrings.NotStarted
    - java.lang.String
  */
  type VerificationStatus = _VerificationStatus | java.lang.String
  type VerificationToken = java.lang.String
  type VerificationTokenList = js.Array[VerificationToken]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2010-12-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

