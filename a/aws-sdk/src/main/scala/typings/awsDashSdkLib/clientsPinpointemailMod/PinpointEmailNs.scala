package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/pinpointemail", "PinpointEmail")
@js.native
object PinpointEmailNs extends js.Object {
  trait BlacklistEntry extends js.Object {
    /**
      * Additional information about the blacklisting event, as provided by the blacklist maintainer.
      */
    var Description: js.UndefOr[BlacklistingDescription] = js.undefined
    /**
      * The time when the blacklisting event occurred, shown in Unix time format.
      */
    var ListingTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the blacklist that the IP address appears on.
      */
    var RblName: js.UndefOr[RblName] = js.undefined
  }
  
  trait BlacklistReport
    extends /* key */ org.scalablytyped.runtime.StringDictionary[BlacklistEntries]
  
  trait Body extends js.Object {
    /**
      * An object that represents the version of the message that is displayed in email clients that support HTML. HTML messages can include formatted text, hyperlinks, images, and more. 
      */
    var Html: js.UndefOr[Content] = js.undefined
    /**
      * An object that represents the version of the message that is displayed in email clients that don't support HTML, or clients where the recipient has disabled HTML rendering.
      */
    var Text: js.UndefOr[Content] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CloudWatchDestination extends js.Object {
    /**
      * An array of objects that define the dimensions to use when you send email events to Amazon CloudWatch.
      */
    var DimensionConfigurations: CloudWatchDimensionConfigurations
  }
  
  trait CloudWatchDimensionConfiguration extends js.Object {
    /**
      * The default value of the dimension that is published to Amazon CloudWatch if you don't provide the value of the dimension when you send an email. This value has to meet the following criteria:   It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   It can contain no more than 256 characters.  
      */
    var DefaultDimensionValue: DefaultDimensionValue
    /**
      * The name of an Amazon CloudWatch dimension associated with an email sending metric. The name has to meet the following criteria:   It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   It can contain no more than 256 characters.  
      */
    var DimensionName: DimensionName
    /**
      * The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon CloudWatch. If you want Amazon Pinpoint to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a parameter to the SendEmail/SendRawEmail API, choose messageTag. If you want Amazon Pinpoint to use your own email headers, choose emailHeader. If you want Amazon Pinpoint to use link tags, choose linkTags.
      */
    var DimensionValueSource: DimensionValueSource
  }
  
  trait Content extends js.Object {
    /**
      * The character set for the content. Because of the constraints of the SMTP protocol, Amazon Pinpoint uses 7-bit ASCII by default. If the text includes characters outside of the ASCII range, you have to specify a character set. For example, you could specify UTF-8, ISO-8859-1, or Shift_JIS.
      */
    var Charset: js.UndefOr[Charset] = js.undefined
    /**
      * The content of the message itself.
      */
    var Data: MessageData
  }
  
  trait CreateConfigurationSetEventDestinationRequest extends js.Object {
    /**
      * The name of the configuration set that you want to add an event destination to.
      */
    var ConfigurationSetName: ConfigurationSetName
    /**
      * An object that defines the event destination.
      */
    var EventDestination: EventDestinationDefinition
    /**
      * A name that identifies the event destination within the configuration set.
      */
    var EventDestinationName: EventDestinationName
  }
  
  trait CreateConfigurationSetEventDestinationResponse extends js.Object
  
  trait CreateConfigurationSetRequest extends js.Object {
    /**
      * The name of the configuration set.
      */
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined
    /**
      * An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set.
      */
    var DeliveryOptions: js.UndefOr[DeliveryOptions] = js.undefined
    /**
      * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the emails that you send that use the configuration set.
      */
    var ReputationOptions: js.UndefOr[ReputationOptions] = js.undefined
    /**
      * An object that defines whether or not Amazon Pinpoint can send email that you send using the configuration set.
      */
    var SendingOptions: js.UndefOr[SendingOptions] = js.undefined
    /**
      * An object that defines the open and click tracking options for emails that you send using the configuration set.
      */
    var TrackingOptions: js.UndefOr[TrackingOptions] = js.undefined
  }
  
  trait CreateConfigurationSetResponse extends js.Object
  
  trait CreateDedicatedIpPoolRequest extends js.Object {
    /**
      * The name of the dedicated IP pool.
      */
    var PoolName: PoolName
  }
  
  trait CreateDedicatedIpPoolResponse extends js.Object
  
  trait CreateDeliverabilityTestReportRequest extends js.Object {
    /**
      * The HTML body of the message that you sent when you performed the predictive inbox placement test.
      */
    var Content: EmailContent
    /**
      * The email address that the predictive inbox placement test email was sent from.
      */
    var FromEmailAddress: EmailAddress
    /**
      * A unique name that helps you to identify the predictive inbox placement test when you retrieve the results.
      */
    var ReportName: js.UndefOr[ReportName] = js.undefined
  }
  
  trait CreateDeliverabilityTestReportResponse extends js.Object {
    /**
      * The status of the predictive inbox placement test. If the status is IN_PROGRESS, then the predictive inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of creating the test. If the status is COMPLETE, then the test is finished, and you can use the GetDeliverabilityTestReport to view the results of the test.
      */
    var DeliverabilityTestStatus: DeliverabilityTestStatus
    /**
      * A unique string that identifies the predictive inbox placement test.
      */
    var ReportId: ReportId
  }
  
  trait CreateEmailIdentityRequest extends js.Object {
    /**
      * The email address or domain that you want to verify.
      */
    var EmailIdentity: Identity
  }
  
  trait CreateEmailIdentityResponse extends js.Object {
    /**
      * An object that contains information about the DKIM attributes for the identity. This object includes the tokens that you use to create the CNAME records that are required to complete the DKIM verification process.
      */
    var DkimAttributes: js.UndefOr[DkimAttributes] = js.undefined
    /**
      * The email identity type.
      */
    var IdentityType: js.UndefOr[IdentityType] = js.undefined
    /**
      * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified email addresses or domains. For more information about verifying identities, see the Amazon Pinpoint User Guide.
      */
    var VerifiedForSendingStatus: js.UndefOr[Enabled] = js.undefined
  }
  
  trait DailyVolume extends js.Object {
    /**
      * An object that contains inbox placement metrics for a specifid day in the analysis period, broken out by the recipient's email provider.
      */
    var DomainIspPlacements: js.UndefOr[DomainIspPlacements] = js.undefined
    /**
      * The date that the DailyVolume metrics apply to, in Unix time.
      */
    var StartDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * An object that contains inbox placement metrics for a specific day in the analysis period.
      */
    var VolumeStatistics: js.UndefOr[VolumeStatistics] = js.undefined
  }
  
  trait DedicatedIp extends js.Object {
    /**
      * An IP address that is reserved for use by your Amazon Pinpoint account.
      */
    var Ip: Ip
    /**
      * The name of the dedicated IP pool that the IP address is associated with.
      */
    var PoolName: js.UndefOr[PoolName] = js.undefined
    /**
      * Indicates how complete the dedicated IP warm-up process is. When this value equals 1, the address has completed the warm-up process and is ready for use.
      */
    var WarmupPercentage: Percentage100Wrapper
    /**
      * The warm-up status of a dedicated IP address. The status can have one of the following values:    IN_PROGRESS – The IP address isn't ready to use because the dedicated IP warm-up process is ongoing.    DONE – The dedicated IP warm-up process is complete, and the IP address is ready to use.  
      */
    var WarmupStatus: WarmupStatus
  }
  
  trait DeleteConfigurationSetEventDestinationRequest extends js.Object {
    /**
      * The name of the configuration set that contains the event destination that you want to delete.
      */
    var ConfigurationSetName: ConfigurationSetName
    /**
      * The name of the event destination that you want to delete.
      */
    var EventDestinationName: EventDestinationName
  }
  
  trait DeleteConfigurationSetEventDestinationResponse extends js.Object
  
  trait DeleteConfigurationSetRequest extends js.Object {
    /**
      * The name of the configuration set that you want to delete.
      */
    var ConfigurationSetName: ConfigurationSetName
  }
  
  trait DeleteConfigurationSetResponse extends js.Object
  
  trait DeleteDedicatedIpPoolRequest extends js.Object {
    /**
      * The name of the dedicated IP pool that you want to delete.
      */
    var PoolName: PoolName
  }
  
  trait DeleteDedicatedIpPoolResponse extends js.Object
  
  trait DeleteEmailIdentityRequest extends js.Object {
    /**
      * The identity (that is, the email address or domain) that you want to delete from your Amazon Pinpoint account.
      */
    var EmailIdentity: Identity
  }
  
  trait DeleteEmailIdentityResponse extends js.Object
  
  trait DeliverabilityTestReport extends js.Object {
    /**
      * The date and time when the predictive inbox placement test was created, in Unix time format.
      */
    var CreateDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The status of the predictive inbox placement test. If the status is IN_PROGRESS, then the predictive inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of creating the test. If the status is COMPLETE, then the test is finished, and you can use the GetDeliverabilityTestReport to view the results of the test.
      */
    var DeliverabilityTestStatus: js.UndefOr[DeliverabilityTestStatus] = js.undefined
    /**
      * The sender address that you specified for the predictive inbox placement test.
      */
    var FromEmailAddress: js.UndefOr[EmailAddress] = js.undefined
    /**
      * A unique string that identifies the predictive inbox placement test.
      */
    var ReportId: js.UndefOr[ReportId] = js.undefined
    /**
      * A name that helps you identify a predictive inbox placement test report.
      */
    var ReportName: js.UndefOr[ReportName] = js.undefined
    /**
      * The subject line for an email that you submitted in a predictive inbox placement test.
      */
    var Subject: js.UndefOr[DeliverabilityTestSubject] = js.undefined
  }
  
  trait DeliveryOptions extends js.Object {
    /**
      * The name of the dedicated IP pool that you want to associate with the configuration set.
      */
    var SendingPoolName: js.UndefOr[PoolName] = js.undefined
  }
  
  trait Destination extends js.Object {
    /**
      * An array that contains the email addresses of the "BCC" (blind carbon copy) recipients for the email.
      */
    var BccAddresses: js.UndefOr[EmailAddressList] = js.undefined
    /**
      * An array that contains the email addresses of the "CC" (carbon copy) recipients for the email.
      */
    var CcAddresses: js.UndefOr[EmailAddressList] = js.undefined
    /**
      * An array that contains the email addresses of the "To" recipients for the email.
      */
    var ToAddresses: js.UndefOr[EmailAddressList] = js.undefined
  }
  
  trait DkimAttributes extends js.Object {
    /**
      * If the value is true, then the messages that Amazon Pinpoint sends from the identity are DKIM-signed. If the value is false, then the messages that Amazon Pinpoint sends from the identity aren't DKIM-signed.
      */
    var SigningEnabled: js.UndefOr[Enabled] = js.undefined
    /**
      * Describes whether or not Amazon Pinpoint has successfully located the DKIM records in the DNS records for the domain. The status can be one of the following:    PENDING – Amazon Pinpoint hasn't yet located the DKIM records in the DNS configuration for the domain, but will continue to attempt to locate them.    SUCCESS – Amazon Pinpoint located the DKIM records in the DNS configuration for the domain and determined that they're correct. Amazon Pinpoint can now send DKIM-signed email from the identity.    FAILED – Amazon Pinpoint was unable to locate the DKIM records in the DNS settings for the domain, and won't continue to search for them.    TEMPORARY_FAILURE – A temporary issue occurred, which prevented Amazon Pinpoint from determining the DKIM status for the domain.    NOT_STARTED – Amazon Pinpoint hasn't yet started searching for the DKIM records in the DKIM records for the domain.  
      */
    var Status: js.UndefOr[DkimStatus] = js.undefined
    /**
      * A set of unique strings that you use to create a set of CNAME records that you add to the DNS configuration for your domain. When Amazon Pinpoint detects these records in the DNS configuration for your domain, the DKIM authentication process is complete. Amazon Pinpoint usually detects these records within about 72 hours of adding them to the DNS configuration for your domain.
      */
    var Tokens: js.UndefOr[DnsTokenList] = js.undefined
  }
  
  trait DomainIspPlacement extends js.Object {
    /**
      * The percentage of messages that were sent from the selected domain to the specified email provider that arrived in recipients' inboxes.
      */
    var InboxPercentage: js.UndefOr[Percentage] = js.undefined
    /**
      * The total number of messages that were sent from the selected domain to the specified email provider that arrived in recipients' inboxes.
      */
    var InboxRawCount: js.UndefOr[Volume] = js.undefined
    /**
      * The name of the email provider that the inbox placement data applies to.
      */
    var IspName: js.UndefOr[IspName] = js.undefined
    /**
      * The percentage of messages that were sent from the selected domain to the specified email provider that arrived in recipients' spam or junk mail folders.
      */
    var SpamPercentage: js.UndefOr[Percentage] = js.undefined
    /**
      * The total number of messages that were sent from the selected domain to the specified email provider that arrived in recipients' spam or junk mail folders.
      */
    var SpamRawCount: js.UndefOr[Volume] = js.undefined
  }
  
  trait EmailContent extends js.Object {
    /**
      * The raw email message. The message has to meet the following criteria:   The message has to contain a header and a body, separated by one blank line.   All of the required header fields must be present in the message.   Each part of a multipart MIME message must be formatted properly.   If you include attachments, they must be in a file format that Amazon Pinpoint supports.    The entire message must be Base64 encoded.   If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, you should encode that content to ensure that recipients' email clients render the message properly.   The length of any single line of text in the message can't exceed 1,000 characters. This restriction is defined in RFC 5321.  
      */
    var Raw: js.UndefOr[RawMessage] = js.undefined
    /**
      * The simple email message. The message consists of a subject and a message body.
      */
    var Simple: js.UndefOr[Message] = js.undefined
  }
  
  trait EventDestination extends js.Object {
    /**
      * An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
      */
    var CloudWatchDestination: js.UndefOr[CloudWatchDestination] = js.undefined
    /**
      * If true, the event destination is enabled. When the event destination is enabled, the specified event types are sent to the destinations in this EventDestinationDefinition. If false, the event destination is disabled. When the event destination is disabled, events aren't sent to the specified destinations.
      */
    var Enabled: js.UndefOr[Enabled] = js.undefined
    /**
      * An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
      */
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined
    /**
      * The types of events that Amazon Pinpoint sends to the specified event destinations.
      */
    var MatchingEventTypes: EventTypes
    /**
      * A name that identifies the event destination.
      */
    var Name: EventDestinationName
    /**
      * An object that defines a Amazon Pinpoint destination for email events. You can use Amazon Pinpoint events to create attributes in Amazon Pinpoint projects. You can use these attributes to create segments for your campaigns.
      */
    var PinpointDestination: js.UndefOr[PinpointDestination] = js.undefined
    /**
      * An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification when certain email events occur.
      */
    var SnsDestination: js.UndefOr[SnsDestination] = js.undefined
  }
  
  trait EventDestinationDefinition extends js.Object {
    /**
      * An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
      */
    var CloudWatchDestination: js.UndefOr[CloudWatchDestination] = js.undefined
    /**
      * If true, the event destination is enabled. When the event destination is enabled, the specified event types are sent to the destinations in this EventDestinationDefinition. If false, the event destination is disabled. When the event destination is disabled, events aren't sent to the specified destinations.
      */
    var Enabled: js.UndefOr[Enabled] = js.undefined
    /**
      * An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
      */
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined
    /**
      * An array that specifies which events Amazon Pinpoint should send to the destinations in this EventDestinationDefinition.
      */
    var MatchingEventTypes: js.UndefOr[EventTypes] = js.undefined
    /**
      * An object that defines a Amazon Pinpoint destination for email events. You can use Amazon Pinpoint events to create attributes in Amazon Pinpoint projects. You can use these attributes to create segments for your campaigns.
      */
    var PinpointDestination: js.UndefOr[PinpointDestination] = js.undefined
    /**
      * An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification when certain email events occur.
      */
    var SnsDestination: js.UndefOr[SnsDestination] = js.undefined
  }
  
  trait GetAccountRequest extends js.Object
  
  trait GetAccountResponse extends js.Object {
    /**
      * Indicates whether or not the automatic warm-up feature is enabled for dedicated IP addresses that are associated with your account.
      */
    var DedicatedIpAutoWarmupEnabled: js.UndefOr[Enabled] = js.undefined
    /**
      * The reputation status of your Amazon Pinpoint account. The status can be one of the following:    HEALTHY – There are no reputation-related issues that currently impact your account.    PROBATION – We've identified some issues with your Amazon Pinpoint account. We're placing your account under review while you work on correcting these issues.    SHUTDOWN – Your account's ability to send email is currently paused because of an issue with the email sent from your account. When you correct the issue, you can contact us and request that your account's ability to send email is resumed.  
      */
    var EnforcementStatus: js.UndefOr[GeneralEnforcementStatus] = js.undefined
    /**
      * Indicates whether or not your account has production access in the current AWS Region. If the value is false, then your account is in the sandbox. When your account is in the sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your maximum sending rate) is 1. If the value is true, then your account has production access. When your account has production access, you can send email to any address. The sending quota and maximum sending rate for your account vary based on your specific use case.
      */
    var ProductionAccessEnabled: js.UndefOr[Enabled] = js.undefined
    /**
      * An object that contains information about the per-day and per-second sending limits for your Amazon Pinpoint account in the current AWS Region.
      */
    var SendQuota: js.UndefOr[SendQuota] = js.undefined
    /**
      * Indicates whether or not email sending is enabled for your Amazon Pinpoint account in the current AWS Region.
      */
    var SendingEnabled: js.UndefOr[Enabled] = js.undefined
  }
  
  trait GetBlacklistReportsRequest extends js.Object {
    /**
      * A list of IP addresses that you want to retrieve blacklist information about. You can only specify the dedicated IP addresses that you use to send email using Amazon Pinpoint or Amazon SES.
      */
    var BlacklistItemNames: BlacklistItemNames
  }
  
  trait GetBlacklistReportsResponse extends js.Object {
    /**
      * An object that contains information about a blacklist that one of your dedicated IP addresses appears on.
      */
    var BlacklistReport: BlacklistReport
  }
  
  trait GetConfigurationSetEventDestinationsRequest extends js.Object {
    /**
      * The name of the configuration set that contains the event destination.
      */
    var ConfigurationSetName: ConfigurationSetName
  }
  
  trait GetConfigurationSetEventDestinationsResponse extends js.Object {
    /**
      * An array that includes all of the events destinations that have been configured for the configuration set.
      */
    var EventDestinations: js.UndefOr[EventDestinations] = js.undefined
  }
  
  trait GetConfigurationSetRequest extends js.Object {
    /**
      * The name of the configuration set that you want to obtain more information about.
      */
    var ConfigurationSetName: ConfigurationSetName
  }
  
  trait GetConfigurationSetResponse extends js.Object {
    /**
      * The name of the configuration set.
      */
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined
    /**
      * An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set.
      */
    var DeliveryOptions: js.UndefOr[DeliveryOptions] = js.undefined
    /**
      * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the emails that you send that use the configuration set.
      */
    var ReputationOptions: js.UndefOr[ReputationOptions] = js.undefined
    /**
      * An object that defines whether or not Amazon Pinpoint can send email that you send using the configuration set.
      */
    var SendingOptions: js.UndefOr[SendingOptions] = js.undefined
    /**
      * An object that defines the open and click tracking options for emails that you send using the configuration set.
      */
    var TrackingOptions: js.UndefOr[TrackingOptions] = js.undefined
  }
  
  trait GetDedicatedIpRequest extends js.Object {
    /**
      * The IP address that you want to obtain more information about. The value you specify has to be a dedicated IP address that's assocaited with your Amazon Pinpoint account.
      */
    var Ip: Ip
  }
  
  trait GetDedicatedIpResponse extends js.Object {
    /**
      * An object that contains information about a dedicated IP address.
      */
    var DedicatedIp: js.UndefOr[DedicatedIp] = js.undefined
  }
  
  trait GetDedicatedIpsRequest extends js.Object {
    /**
      * A token returned from a previous call to GetDedicatedIps to indicate the position of the dedicated IP pool in the list of IP pools.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The number of results to show in a single call to GetDedicatedIpsRequest. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results.
      */
    var PageSize: js.UndefOr[MaxItems] = js.undefined
    /**
      * The name of the IP pool that the dedicated IP address is associated with.
      */
    var PoolName: js.UndefOr[PoolName] = js.undefined
  }
  
  trait GetDedicatedIpsResponse extends js.Object {
    /**
      * A list of dedicated IP addresses that are reserved for use by your Amazon Pinpoint account.
      */
    var DedicatedIps: js.UndefOr[DedicatedIpList] = js.undefined
    /**
      * A token that indicates that there are additional dedicated IP addresses to list. To view additional addresses, issue another request to GetDedicatedIps, passing this token in the NextToken parameter.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetDeliverabilityDashboardOptionsRequest extends js.Object
  
  trait GetDeliverabilityDashboardOptionsResponse extends js.Object {
    /**
      * Indicates whether the Deliverability dashboard is enabled. If the value is true, then the dashboard is enabled.
      */
    var DashboardEnabled: Enabled
  }
  
  trait GetDeliverabilityTestReportRequest extends js.Object {
    /**
      * A unique string that identifies the predictive inbox placement test.
      */
    var ReportId: ReportId
  }
  
  trait GetDeliverabilityTestReportResponse extends js.Object {
    /**
      * An object that contains the results of the predictive inbox placement test.
      */
    var DeliverabilityTestReport: DeliverabilityTestReport
    /**
      * An object that describes how the test email was handled by several email providers, including Gmail, Hotmail, Yahoo, AOL, and others.
      */
    var IspPlacements: IspPlacements
    /**
      * An object that contains the message that you sent when you performed this predictive inbox placement test.
      */
    var Message: js.UndefOr[MessageContent] = js.undefined
    /**
      * An object that specifies how many test messages that were sent during the predictive inbox placement test were delivered to recipients' inboxes, how many were sent to recipients' spam folders, and how many weren't delivered.
      */
    var OverallPlacement: PlacementStatistics
  }
  
  trait GetDomainStatisticsReportRequest extends js.Object {
    /**
      * The domain that you want to obtain deliverability metrics for.
      */
    var Domain: Identity
    /**
      * The last day (in Unix time) that you want to obtain domain deliverability metrics for. The EndDate that you specify has to be less than or equal to 30 days after the StartDate.
      */
    var EndDate: Timestamp
    /**
      * The first day (in Unix time) that you want to obtain domain deliverability metrics for.
      */
    var StartDate: Timestamp
  }
  
  trait GetDomainStatisticsReportResponse extends js.Object {
    /**
      * An object that contains deliverability metrics for the domain that you specified. This object contains data for each day, starting on the StartDate and ending on the EndDate.
      */
    var DailyVolumes: DailyVolumes
    /**
      * An object that contains deliverability metrics for the domain that you specified. The data in this object is a summary of all of the data that was collected from the StartDate to the EndDate.
      */
    var OverallVolume: OverallVolume
  }
  
  trait GetEmailIdentityRequest extends js.Object {
    /**
      * The email identity that you want to retrieve details for.
      */
    var EmailIdentity: Identity
  }
  
  trait GetEmailIdentityResponse extends js.Object {
    /**
      * An object that contains information about the DKIM attributes for the identity. This object includes the tokens that you use to create the CNAME records that are required to complete the DKIM verification process.
      */
    var DkimAttributes: js.UndefOr[DkimAttributes] = js.undefined
    /**
      * The feedback forwarding configuration for the identity. If the value is true, Amazon Pinpoint sends you email notifications when bounce or complaint events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the original email. When you set this value to false, Amazon Pinpoint sends notifications through other mechanisms, such as by notifying an Amazon SNS topic or another event destination. You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications, Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
      */
    var FeedbackForwardingStatus: js.UndefOr[Enabled] = js.undefined
    /**
      * The email identity type.
      */
    var IdentityType: js.UndefOr[IdentityType] = js.undefined
    /**
      * An object that contains information about the Mail-From attributes for the email identity.
      */
    var MailFromAttributes: js.UndefOr[MailFromAttributes] = js.undefined
    /**
      * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified email addresses or domains. For more information about verifying identities, see the Amazon Pinpoint User Guide.
      */
    var VerifiedForSendingStatus: js.UndefOr[Enabled] = js.undefined
  }
  
  trait IdentityInfo extends js.Object {
    /**
      * The address or domain of the identity.
      */
    var IdentityName: js.UndefOr[Identity] = js.undefined
    /**
      * The email identity type. The identity type can be one of the following:    EMAIL_ADDRESS – The identity is an email address.    DOMAIN – The identity is a domain.    MANAGED_DOMAIN – The identity is a domain that is managed by AWS.  
      */
    var IdentityType: js.UndefOr[IdentityType] = js.undefined
    /**
      * Indicates whether or not you can send email from the identity. In Amazon Pinpoint, an identity is an email address or domain that you send email from. Before you can send email from an identity, you have to demostrate that you own the identity, and that you authorize Amazon Pinpoint to send email from that identity.
      */
    var SendingEnabled: js.UndefOr[Enabled] = js.undefined
  }
  
  trait IspPlacement extends js.Object {
    /**
      * The name of the email provider that the inbox placement data applies to.
      */
    var IspName: js.UndefOr[IspName] = js.undefined
    /**
      * An object that contains inbox placement metrics for a specific email provider.
      */
    var PlacementStatistics: js.UndefOr[PlacementStatistics] = js.undefined
  }
  
  trait KinesisFirehoseDestination extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that Amazon Pinpoint sends email events to.
      */
    var DeliveryStreamArn: AmazonResourceName
    /**
      * The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint uses when sending email events to the Amazon Kinesis Data Firehose stream.
      */
    var IamRoleArn: AmazonResourceName
  }
  
  trait ListConfigurationSetsRequest extends js.Object {
    /**
      * A token returned from a previous call to ListConfigurationSets to indicate the position in the list of configuration sets.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The number of results to show in a single call to ListConfigurationSets. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results.
      */
    var PageSize: js.UndefOr[MaxItems] = js.undefined
  }
  
  trait ListConfigurationSetsResponse extends js.Object {
    /**
      * An array that contains all of the configuration sets in your Amazon Pinpoint account in the current AWS Region.
      */
    var ConfigurationSets: js.UndefOr[ConfigurationSetNameList] = js.undefined
    /**
      * A token that indicates that there are additional configuration sets to list. To view additional configuration sets, issue another request to ListConfigurationSets, and pass this token in the NextToken parameter.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDedicatedIpPoolsRequest extends js.Object {
    /**
      * A token returned from a previous call to ListDedicatedIpPools to indicate the position in the list of dedicated IP pools.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The number of results to show in a single call to ListDedicatedIpPools. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results.
      */
    var PageSize: js.UndefOr[MaxItems] = js.undefined
  }
  
  trait ListDedicatedIpPoolsResponse extends js.Object {
    /**
      * A list of all of the dedicated IP pools that are associated with your Amazon Pinpoint account.
      */
    var DedicatedIpPools: js.UndefOr[ListOfDedicatedIpPools] = js.undefined
    /**
      * A token that indicates that there are additional IP pools to list. To view additional IP pools, issue another request to ListDedicatedIpPools, passing this token in the NextToken parameter.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDeliverabilityTestReportsRequest extends js.Object {
    /**
      * A token returned from a previous call to ListDeliverabilityTestReports to indicate the position in the list of predictive inbox placement tests.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The number of results to show in a single call to ListDeliverabilityTestReports. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results. The value you specify has to be at least 0, and can be no more than 1000.
      */
    var PageSize: js.UndefOr[MaxItems] = js.undefined
  }
  
  trait ListDeliverabilityTestReportsResponse extends js.Object {
    /**
      * An object that contains a lists of predictive inbox placement tests that you've performed.
      */
    var DeliverabilityTestReports: DeliverabilityTestReports
    /**
      * A token that indicates that there are additional predictive inbox placement tests to list. To view additional predictive inbox placement tests, issue another request to ListDeliverabilityTestReports, and pass this token in the NextToken parameter.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListEmailIdentitiesRequest extends js.Object {
    /**
      * A token returned from a previous call to ListEmailIdentities to indicate the position in the list of identities.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The number of results to show in a single call to ListEmailIdentities. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results. The value you specify has to be at least 0, and can be no more than 1000.
      */
    var PageSize: js.UndefOr[MaxItems] = js.undefined
  }
  
  trait ListEmailIdentitiesResponse extends js.Object {
    /**
      * An array that includes all of the identities associated with your Amazon Pinpoint account.
      */
    var EmailIdentities: js.UndefOr[IdentityInfoList] = js.undefined
    /**
      * A token that indicates that there are additional configuration sets to list. To view additional configuration sets, issue another request to ListEmailIdentities, and pass this token in the NextToken parameter.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait MailFromAttributes extends js.Object {
    /**
      * The action that Amazon Pinpoint to takes if it can't read the required MX record for a custom MAIL FROM domain. When you set this value to UseDefaultValue, Amazon Pinpoint uses amazonses.com as the MAIL FROM domain. When you set this value to RejectMessage, Amazon Pinpoint returns a MailFromDomainNotVerified error, and doesn't attempt to deliver the email. These behaviors are taken when the custom MAIL FROM domain configuration is in the Pending, Failed, and TemporaryFailure states.
      */
    var BehaviorOnMxFailure: BehaviorOnMxFailure
    /**
      * The name of a domain that an email identity uses as a custom MAIL FROM domain.
      */
    var MailFromDomain: MailFromDomainName
    /**
      * The status of the MAIL FROM domain. This status can have the following values:    PENDING – Amazon Pinpoint hasn't started searching for the MX record yet.    SUCCESS – Amazon Pinpoint detected the required MX record for the MAIL FROM domain.    FAILED – Amazon Pinpoint can't find the required MX record, or the record no longer exists.    TEMPORARY_FAILURE – A temporary issue occurred, which prevented Amazon Pinpoint from determining the status of the MAIL FROM domain.  
      */
    var MailFromDomainStatus: MailFromDomainStatus
  }
  
  trait Message extends js.Object {
    /**
      * The body of the message. You can specify an HTML version of the message, a text-only version of the message, or both.
      */
    var Body: Body
    /**
      * The subject line of the email. The subject line can only contain 7-bit ASCII characters. However, you can specify non-ASCII characters in the subject line by using encoded-word syntax, as described in RFC 2047.
      */
    var Subject: Content
  }
  
  trait MessageTag extends js.Object {
    /**
      * The name of the message tag. The message tag name has to meet the following criteria:   It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes (-).   It can contain no more than 256 characters.  
      */
    var Name: MessageTagName
    /**
      * The value of the message tag. The message tag value has to meet the following criteria:   It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes (-).   It can contain no more than 256 characters.  
      */
    var Value: MessageTagValue
  }
  
  trait OverallVolume extends js.Object {
    /**
      * An object that contains inbox and junk mail placement metrics for individual email providers.
      */
    var DomainIspPlacements: js.UndefOr[DomainIspPlacements] = js.undefined
    /**
      * The percentage of emails that were sent from the domain that were read by their recipients.
      */
    var ReadRatePercent: js.UndefOr[Percentage] = js.undefined
    /**
      * An object that contains information about the numbers of messages that arrived in recipients' inboxes and junk mail folders.
      */
    var VolumeStatistics: js.UndefOr[VolumeStatistics] = js.undefined
  }
  
  trait PinpointDestination extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the Amazon Pinpoint project that you want to send email events to.
      */
    var ApplicationArn: js.UndefOr[AmazonResourceName] = js.undefined
  }
  
  trait PlacementStatistics extends js.Object {
    /**
      * The percentage of emails that were authenticated by using DomainKeys Identified Mail (DKIM) during the predictive inbox placement test.
      */
    var DkimPercentage: js.UndefOr[Percentage] = js.undefined
    /**
      * The percentage of emails that arrived in recipients' inboxes during the predictive inbox placement test.
      */
    var InboxPercentage: js.UndefOr[Percentage] = js.undefined
    /**
      * The percentage of emails that didn't arrive in recipients' inboxes at all during the predictive inbox placement test.
      */
    var MissingPercentage: js.UndefOr[Percentage] = js.undefined
    /**
      * The percentage of emails that arrived in recipients' spam or junk mail folders during the predictive inbox placement test.
      */
    var SpamPercentage: js.UndefOr[Percentage] = js.undefined
    /**
      * The percentage of emails that were authenticated by using Sender Policy Framework (SPF) during the predictive inbox placement test.
      */
    var SpfPercentage: js.UndefOr[Percentage] = js.undefined
  }
  
  trait PutAccountDedicatedIpWarmupAttributesRequest extends js.Object {
    /**
      * Enables or disables the automatic warm-up feature for dedicated IP addresses that are associated with your Amazon Pinpoint account in the current AWS Region. Set to true to enable the automatic warm-up feature, or set to false to disable it.
      */
    var AutoWarmupEnabled: js.UndefOr[Enabled] = js.undefined
  }
  
  trait PutAccountDedicatedIpWarmupAttributesResponse extends js.Object
  
  trait PutAccountSendingAttributesRequest extends js.Object {
    /**
      * Enables or disables your account's ability to send email. Set to true to enable email sending, or set to false to disable email sending.  If AWS paused your account's ability to send email, you can't use this operation to resume your account's ability to send email. 
      */
    var SendingEnabled: js.UndefOr[Enabled] = js.undefined
  }
  
  trait PutAccountSendingAttributesResponse extends js.Object
  
  trait PutConfigurationSetDeliveryOptionsRequest extends js.Object {
    /**
      * The name of the configuration set that you want to associate with a dedicated IP pool.
      */
    var ConfigurationSetName: ConfigurationSetName
    /**
      * The name of the dedicated IP pool that you want to associate with the configuration set.
      */
    var SendingPoolName: js.UndefOr[SendingPoolName] = js.undefined
  }
  
  trait PutConfigurationSetDeliveryOptionsResponse extends js.Object
  
  trait PutConfigurationSetReputationOptionsRequest extends js.Object {
    /**
      * The name of the configuration set that you want to enable or disable reputation metric tracking for.
      */
    var ConfigurationSetName: ConfigurationSetName
    /**
      * If true, tracking of reputation metrics is enabled for the configuration set. If false, tracking of reputation metrics is disabled for the configuration set.
      */
    var ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined
  }
  
  trait PutConfigurationSetReputationOptionsResponse extends js.Object
  
  trait PutConfigurationSetSendingOptionsRequest extends js.Object {
    /**
      * The name of the configuration set that you want to enable or disable email sending for.
      */
    var ConfigurationSetName: ConfigurationSetName
    /**
      * If true, email sending is enabled for the configuration set. If false, email sending is disabled for the configuration set.
      */
    var SendingEnabled: js.UndefOr[Enabled] = js.undefined
  }
  
  trait PutConfigurationSetSendingOptionsResponse extends js.Object
  
  trait PutConfigurationSetTrackingOptionsRequest extends js.Object {
    /**
      * The name of the configuration set that you want to add a custom tracking domain to.
      */
    var ConfigurationSetName: ConfigurationSetName
    /**
      * The domain that you want to use to track open and click events.
      */
    var CustomRedirectDomain: js.UndefOr[CustomRedirectDomain] = js.undefined
  }
  
  trait PutConfigurationSetTrackingOptionsResponse extends js.Object
  
  trait PutDedicatedIpInPoolRequest extends js.Object {
    /**
      * The name of the IP pool that you want to add the dedicated IP address to. You have to specify an IP pool that already exists.
      */
    var DestinationPoolName: PoolName
    /**
      * The IP address that you want to move to the dedicated IP pool. The value you specify has to be a dedicated IP address that's associated with your Amazon Pinpoint account.
      */
    var Ip: Ip
  }
  
  trait PutDedicatedIpInPoolResponse extends js.Object
  
  trait PutDedicatedIpWarmupAttributesRequest extends js.Object {
    /**
      * The dedicated IP address that you want to update the warm-up attributes for.
      */
    var Ip: Ip
    /**
      * The warm-up percentage that you want to associate with the dedicated IP address.
      */
    var WarmupPercentage: Percentage100Wrapper
  }
  
  trait PutDedicatedIpWarmupAttributesResponse extends js.Object
  
  trait PutDeliverabilityDashboardOptionRequest extends js.Object {
    /**
      * Indicates whether the Deliverability dashboard is enabled. If the value is true, then the dashboard is enabled.
      */
    var DashboardEnabled: Enabled
  }
  
  trait PutDeliverabilityDashboardOptionResponse extends js.Object
  
  trait PutEmailIdentityDkimAttributesRequest extends js.Object {
    /**
      * The email identity that you want to change the DKIM settings for.
      */
    var EmailIdentity: Identity
    /**
      * Sets the DKIM signing configuration for the identity. When you set this value true, then the messages that Amazon Pinpoint sends from the identity are DKIM-signed. When you set this value to false, then the messages that Amazon Pinpoint sends from the identity aren't DKIM-signed.
      */
    var SigningEnabled: js.UndefOr[Enabled] = js.undefined
  }
  
  trait PutEmailIdentityDkimAttributesResponse extends js.Object
  
  trait PutEmailIdentityFeedbackAttributesRequest extends js.Object {
    /**
      * Sets the feedback forwarding configuration for the identity. If the value is true, Amazon Pinpoint sends you email notifications when bounce or complaint events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the original email. When you set this value to false, Amazon Pinpoint sends notifications through other mechanisms, such as by notifying an Amazon SNS topic or another event destination. You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications, Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
      */
    var EmailForwardingEnabled: js.UndefOr[Enabled] = js.undefined
    /**
      * The email identity that you want to configure bounce and complaint feedback forwarding for.
      */
    var EmailIdentity: Identity
  }
  
  trait PutEmailIdentityFeedbackAttributesResponse extends js.Object
  
  trait PutEmailIdentityMailFromAttributesRequest extends js.Object {
    /**
      * The action that you want Amazon Pinpoint to take if it can't read the required MX record when you send an email. When you set this value to UseDefaultValue, Amazon Pinpoint uses amazonses.com as the MAIL FROM domain. When you set this value to RejectMessage, Amazon Pinpoint returns a MailFromDomainNotVerified error, and doesn't attempt to deliver the email. These behaviors are taken when the custom MAIL FROM domain configuration is in the Pending, Failed, and TemporaryFailure states.
      */
    var BehaviorOnMxFailure: js.UndefOr[BehaviorOnMxFailure] = js.undefined
    /**
      * The verified email identity that you want to set up the custom MAIL FROM domain for.
      */
    var EmailIdentity: Identity
    /**
      *  The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must meet the following criteria:   It has to be a subdomain of the verified identity.   It can't be used to receive email.   It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback forwarding emails.  
      */
    var MailFromDomain: js.UndefOr[MailFromDomainName] = js.undefined
  }
  
  trait PutEmailIdentityMailFromAttributesResponse extends js.Object
  
  trait RawMessage extends js.Object {
    /**
      * The raw email message. The message has to meet the following criteria:   The message has to contain a header and a body, separated by one blank line.   All of the required header fields must be present in the message.   Each part of a multipart MIME message must be formatted properly.   Attachments must be in a file format that Amazon Pinpoint supports.    The entire message must be Base64 encoded.   If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, you should encode that content to ensure that recipients' email clients render the message properly.   The length of any single line of text in the message can't exceed 1,000 characters. This restriction is defined in RFC 5321.  
      */
    var Data: RawMessageData
  }
  
  trait ReputationOptions extends js.Object {
    /**
      * The date and time (in Unix time) when the reputation metrics were last given a fresh start. When your account is given a fresh start, your reputation metrics are calculated starting from the date of the fresh start.
      */
    var LastFreshStart: js.UndefOr[LastFreshStart] = js.undefined
    /**
      * If true, tracking of reputation metrics is enabled for the configuration set. If false, tracking of reputation metrics is disabled for the configuration set.
      */
    var ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined
  }
  
  trait SendEmailRequest extends js.Object {
    /**
      * The name of the configuration set that you want to use when sending the email.
      */
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined
    /**
      * An object that contains the body of the message. You can send either a Simple message or a Raw message.
      */
    var Content: EmailContent
    /**
      * An object that contains the recipients of the email message.
      */
    var Destination: Destination
    /**
      * A list of tags, in the form of name/value pairs, to apply to an email that you send using the SendEmail operation. Tags correspond to characteristics of the email that you define, so that you can publish email sending events. 
      */
    var EmailTags: js.UndefOr[MessageTagList] = js.undefined
    /**
      * The address that Amazon Pinpoint should send bounce and complaint notifications to.
      */
    var FeedbackForwardingEmailAddress: js.UndefOr[EmailAddress] = js.undefined
    /**
      * The email address that you want to use as the "From" address for the email. The address that you specify has to be verified. 
      */
    var FromEmailAddress: js.UndefOr[EmailAddress] = js.undefined
    /**
      * The "Reply-to" email addresses for the message. When the recipient replies to the message, each Reply-to address receives the reply.
      */
    var ReplyToAddresses: js.UndefOr[EmailAddressList] = js.undefined
  }
  
  trait SendEmailResponse extends js.Object {
    /**
      * A unique identifier for the message that is generated when Amazon Pinpoint accepts the message.  It is possible for Amazon Pinpoint to accept a message without sending it. This can happen when the message you're trying to send has an attachment doesn't pass a virus check, or when you send a templated email that contains invalid personalization content, for example. 
      */
    var MessageId: js.UndefOr[OutboundMessageId] = js.undefined
  }
  
  trait SendQuota extends js.Object {
    /**
      * The maximum number of emails that you can send in the current AWS Region over a 24-hour period. This value is also called your sending quota.
      */
    var Max24HourSend: js.UndefOr[Max24HourSend] = js.undefined
    /**
      * The maximum number of emails that you can send per second in the current AWS Region. This value is also called your maximum sending rate or your maximum TPS (transactions per second) rate.
      */
    var MaxSendRate: js.UndefOr[MaxSendRate] = js.undefined
    /**
      * The number of emails sent from your Amazon Pinpoint account in the current AWS Region over the past 24 hours.
      */
    var SentLast24Hours: js.UndefOr[SentLast24Hours] = js.undefined
  }
  
  trait SendingOptions extends js.Object {
    /**
      * If true, email sending is enabled for the configuration set. If false, email sending is disabled for the configuration set.
      */
    var SendingEnabled: js.UndefOr[Enabled] = js.undefined
  }
  
  trait SnsDestination extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish email events to. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
      */
    var TopicArn: AmazonResourceName
  }
  
  trait TrackingOptions extends js.Object {
    /**
      * The domain that you want to use for tracking open and click events.
      */
    var CustomRedirectDomain: CustomRedirectDomain
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Create a configuration set. Configuration sets are groups of rules that you can apply to the emails you send using Amazon Pinpoint. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email. 
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
      * Create a configuration set. Configuration sets are groups of rules that you can apply to the emails you send using Amazon Pinpoint. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email. 
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
      * Create an event destination. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage. A single configuration set can include more than one event destination.
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
      * Create an event destination. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage. A single configuration set can include more than one event destination.
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
      * Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are associated with your Amazon Pinpoint account. You can associate a pool with a configuration set. When you send an email that uses that configuration set, Amazon Pinpoint sends it using only the IP addresses in the associated pool.
      */
    def createDedicatedIpPool(): awsDashSdkLib.libRequestMod.Request[CreateDedicatedIpPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDedicatedIpPool(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDedicatedIpPoolResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDedicatedIpPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are associated with your Amazon Pinpoint account. You can associate a pool with a configuration set. When you send an email that uses that configuration set, Amazon Pinpoint sends it using only the IP addresses in the associated pool.
      */
    def createDedicatedIpPool(params: CreateDedicatedIpPoolRequest): awsDashSdkLib.libRequestMod.Request[CreateDedicatedIpPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDedicatedIpPool(
      params: CreateDedicatedIpPoolRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDedicatedIpPoolResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDedicatedIpPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new predictive inbox placement test. Predictive inbox placement tests can help you predict how your messages will be handled by various email providers around the world. When you perform a predictive inbox placement test, you provide a sample message that contains the content that you plan to send to your customers. Amazon Pinpoint then sends that message to special email addresses spread across several major email providers. After about 24 hours, the test is complete, and you can use the GetDeliverabilityTestReport operation to view the results of the test.
      */
    def createDeliverabilityTestReport(): awsDashSdkLib.libRequestMod.Request[CreateDeliverabilityTestReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDeliverabilityTestReport(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDeliverabilityTestReportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDeliverabilityTestReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new predictive inbox placement test. Predictive inbox placement tests can help you predict how your messages will be handled by various email providers around the world. When you perform a predictive inbox placement test, you provide a sample message that contains the content that you plan to send to your customers. Amazon Pinpoint then sends that message to special email addresses spread across several major email providers. After about 24 hours, the test is complete, and you can use the GetDeliverabilityTestReport operation to view the results of the test.
      */
    def createDeliverabilityTestReport(params: CreateDeliverabilityTestReportRequest): awsDashSdkLib.libRequestMod.Request[CreateDeliverabilityTestReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDeliverabilityTestReport(
      params: CreateDeliverabilityTestReportRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDeliverabilityTestReportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDeliverabilityTestReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Verifies an email identity for use with Amazon Pinpoint. In Amazon Pinpoint, an identity is an email address or domain that you use when you send email. Before you can use an identity to send email with Amazon Pinpoint, you first have to verify it. By verifying an address, you demonstrate that you're the owner of the address, and that you've given Amazon Pinpoint permission to send email from the address. When you verify an email address, Amazon Pinpoint sends an email to the address. Your email address is verified as soon as you follow the link in the verification email.  When you verify a domain, this operation provides a set of DKIM tokens, which you can convert into CNAME tokens. You add these CNAME tokens to the DNS configuration for your domain. Your domain is verified when Amazon Pinpoint detects these records in the DNS configuration for your domain. It usually takes around 72 hours to complete the domain verification process.
      */
    def createEmailIdentity(): awsDashSdkLib.libRequestMod.Request[CreateEmailIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createEmailIdentity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEmailIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEmailIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Verifies an email identity for use with Amazon Pinpoint. In Amazon Pinpoint, an identity is an email address or domain that you use when you send email. Before you can use an identity to send email with Amazon Pinpoint, you first have to verify it. By verifying an address, you demonstrate that you're the owner of the address, and that you've given Amazon Pinpoint permission to send email from the address. When you verify an email address, Amazon Pinpoint sends an email to the address. Your email address is verified as soon as you follow the link in the verification email.  When you verify a domain, this operation provides a set of DKIM tokens, which you can convert into CNAME tokens. You add these CNAME tokens to the DNS configuration for your domain. Your domain is verified when Amazon Pinpoint detects these records in the DNS configuration for your domain. It usually takes around 72 hours to complete the domain verification process.
      */
    def createEmailIdentity(params: CreateEmailIdentityRequest): awsDashSdkLib.libRequestMod.Request[CreateEmailIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createEmailIdentity(
      params: CreateEmailIdentityRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEmailIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEmailIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an existing configuration set. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
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
      * Delete an existing configuration set. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
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
      * Delete an event destination. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
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
      * Delete an event destination. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
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
      * Delete a dedicated IP pool.
      */
    def deleteDedicatedIpPool(): awsDashSdkLib.libRequestMod.Request[DeleteDedicatedIpPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDedicatedIpPool(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDedicatedIpPoolResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDedicatedIpPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete a dedicated IP pool.
      */
    def deleteDedicatedIpPool(params: DeleteDedicatedIpPoolRequest): awsDashSdkLib.libRequestMod.Request[DeleteDedicatedIpPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDedicatedIpPool(
      params: DeleteDedicatedIpPoolRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDedicatedIpPoolResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDedicatedIpPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an email identity that you previously verified for use with Amazon Pinpoint. An identity can be either an email address or a domain name.
      */
    def deleteEmailIdentity(): awsDashSdkLib.libRequestMod.Request[DeleteEmailIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEmailIdentity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEmailIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEmailIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an email identity that you previously verified for use with Amazon Pinpoint. An identity can be either an email address or a domain name.
      */
    def deleteEmailIdentity(params: DeleteEmailIdentityRequest): awsDashSdkLib.libRequestMod.Request[DeleteEmailIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEmailIdentity(
      params: DeleteEmailIdentityRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEmailIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEmailIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtain information about the email-sending status and capabilities of your Amazon Pinpoint account in the current AWS Region.
      */
    def getAccount(): awsDashSdkLib.libRequestMod.Request[GetAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtain information about the email-sending status and capabilities of your Amazon Pinpoint account in the current AWS Region.
      */
    def getAccount(params: GetAccountRequest): awsDashSdkLib.libRequestMod.Request[GetAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccount(
      params: GetAccountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieve a list of the blacklists that your dedicated IP addresses appear on.
      */
    def getBlacklistReports(): awsDashSdkLib.libRequestMod.Request[GetBlacklistReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBlacklistReports(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBlacklistReportsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBlacklistReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieve a list of the blacklists that your dedicated IP addresses appear on.
      */
    def getBlacklistReports(params: GetBlacklistReportsRequest): awsDashSdkLib.libRequestMod.Request[GetBlacklistReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBlacklistReports(
      params: GetBlacklistReportsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBlacklistReportsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBlacklistReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get information about an existing configuration set, including the dedicated IP pool that it's associated with, whether or not it's enabled for sending email, and more. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
      */
    def getConfigurationSet(): awsDashSdkLib.libRequestMod.Request[GetConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getConfigurationSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConfigurationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get information about an existing configuration set, including the dedicated IP pool that it's associated with, whether or not it's enabled for sending email, and more. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
      */
    def getConfigurationSet(params: GetConfigurationSetRequest): awsDashSdkLib.libRequestMod.Request[GetConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getConfigurationSet(
      params: GetConfigurationSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConfigurationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieve a list of event destinations that are associated with a configuration set. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
      */
    def getConfigurationSetEventDestinations(): awsDashSdkLib.libRequestMod.Request[GetConfigurationSetEventDestinationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getConfigurationSetEventDestinations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConfigurationSetEventDestinationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConfigurationSetEventDestinationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieve a list of event destinations that are associated with a configuration set. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
      */
    def getConfigurationSetEventDestinations(params: GetConfigurationSetEventDestinationsRequest): awsDashSdkLib.libRequestMod.Request[GetConfigurationSetEventDestinationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getConfigurationSetEventDestinations(
      params: GetConfigurationSetEventDestinationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConfigurationSetEventDestinationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConfigurationSetEventDestinationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get information about a dedicated IP address, including the name of the dedicated IP pool that it's associated with, as well information about the automatic warm-up process for the address.
      */
    def getDedicatedIp(): awsDashSdkLib.libRequestMod.Request[GetDedicatedIpResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDedicatedIp(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDedicatedIpResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDedicatedIpResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get information about a dedicated IP address, including the name of the dedicated IP pool that it's associated with, as well information about the automatic warm-up process for the address.
      */
    def getDedicatedIp(params: GetDedicatedIpRequest): awsDashSdkLib.libRequestMod.Request[GetDedicatedIpResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDedicatedIp(
      params: GetDedicatedIpRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDedicatedIpResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDedicatedIpResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List the dedicated IP addresses that are associated with your Amazon Pinpoint account.
      */
    def getDedicatedIps(): awsDashSdkLib.libRequestMod.Request[GetDedicatedIpsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDedicatedIps(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDedicatedIpsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDedicatedIpsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List the dedicated IP addresses that are associated with your Amazon Pinpoint account.
      */
    def getDedicatedIps(params: GetDedicatedIpsRequest): awsDashSdkLib.libRequestMod.Request[GetDedicatedIpsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDedicatedIps(
      params: GetDedicatedIpsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDedicatedIpsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDedicatedIpsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Show the status of the Deliverability dashboard. When the Deliverability dashboard is enabled, you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of a calendar month, AWS prorates the monthly charge based on how many days have elapsed in the current calendar month.
      */
    def getDeliverabilityDashboardOptions(): awsDashSdkLib.libRequestMod.Request[GetDeliverabilityDashboardOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDeliverabilityDashboardOptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeliverabilityDashboardOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeliverabilityDashboardOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Show the status of the Deliverability dashboard. When the Deliverability dashboard is enabled, you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of a calendar month, AWS prorates the monthly charge based on how many days have elapsed in the current calendar month.
      */
    def getDeliverabilityDashboardOptions(params: GetDeliverabilityDashboardOptionsRequest): awsDashSdkLib.libRequestMod.Request[GetDeliverabilityDashboardOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDeliverabilityDashboardOptions(
      params: GetDeliverabilityDashboardOptionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeliverabilityDashboardOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeliverabilityDashboardOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieve the results of a predictive inbox placement test.
      */
    def getDeliverabilityTestReport(): awsDashSdkLib.libRequestMod.Request[GetDeliverabilityTestReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDeliverabilityTestReport(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeliverabilityTestReportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeliverabilityTestReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieve the results of a predictive inbox placement test.
      */
    def getDeliverabilityTestReport(params: GetDeliverabilityTestReportRequest): awsDashSdkLib.libRequestMod.Request[GetDeliverabilityTestReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDeliverabilityTestReport(
      params: GetDeliverabilityTestReportRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeliverabilityTestReportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeliverabilityTestReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieve inbox placement and engagement rates for the domains that you use to send email.
      */
    def getDomainStatisticsReport(): awsDashSdkLib.libRequestMod.Request[GetDomainStatisticsReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDomainStatisticsReport(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDomainStatisticsReportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDomainStatisticsReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieve inbox placement and engagement rates for the domains that you use to send email.
      */
    def getDomainStatisticsReport(params: GetDomainStatisticsReportRequest): awsDashSdkLib.libRequestMod.Request[GetDomainStatisticsReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDomainStatisticsReport(
      params: GetDomainStatisticsReportRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDomainStatisticsReportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDomainStatisticsReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides information about a specific identity associated with your Amazon Pinpoint account, including the identity's verification status, its DKIM authentication status, and its custom Mail-From settings.
      */
    def getEmailIdentity(): awsDashSdkLib.libRequestMod.Request[GetEmailIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEmailIdentity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEmailIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEmailIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides information about a specific identity associated with your Amazon Pinpoint account, including the identity's verification status, its DKIM authentication status, and its custom Mail-From settings.
      */
    def getEmailIdentity(params: GetEmailIdentityRequest): awsDashSdkLib.libRequestMod.Request[GetEmailIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEmailIdentity(
      params: GetEmailIdentityRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEmailIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEmailIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List all of the configuration sets associated with your Amazon Pinpoint account in the current region. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
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
      * List all of the configuration sets associated with your Amazon Pinpoint account in the current region. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
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
      * List all of the dedicated IP pools that exist in your Amazon Pinpoint account in the current AWS Region.
      */
    def listDedicatedIpPools(): awsDashSdkLib.libRequestMod.Request[ListDedicatedIpPoolsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDedicatedIpPools(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDedicatedIpPoolsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDedicatedIpPoolsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List all of the dedicated IP pools that exist in your Amazon Pinpoint account in the current AWS Region.
      */
    def listDedicatedIpPools(params: ListDedicatedIpPoolsRequest): awsDashSdkLib.libRequestMod.Request[ListDedicatedIpPoolsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDedicatedIpPools(
      params: ListDedicatedIpPoolsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDedicatedIpPoolsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDedicatedIpPoolsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Show a list of the predictive inbox placement tests that you've performed, regardless of their statuses. For predictive inbox placement tests that are complete, you can use the GetDeliverabilityTestReport operation to view the results.
      */
    def listDeliverabilityTestReports(): awsDashSdkLib.libRequestMod.Request[ListDeliverabilityTestReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDeliverabilityTestReports(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeliverabilityTestReportsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeliverabilityTestReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Show a list of the predictive inbox placement tests that you've performed, regardless of their statuses. For predictive inbox placement tests that are complete, you can use the GetDeliverabilityTestReport operation to view the results.
      */
    def listDeliverabilityTestReports(params: ListDeliverabilityTestReportsRequest): awsDashSdkLib.libRequestMod.Request[ListDeliverabilityTestReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDeliverabilityTestReports(
      params: ListDeliverabilityTestReportsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeliverabilityTestReportsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeliverabilityTestReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of all of the email identities that are associated with your Amazon Pinpoint account. An identity can be either an email address or a domain. This operation returns identities that are verified as well as those that aren't.
      */
    def listEmailIdentities(): awsDashSdkLib.libRequestMod.Request[ListEmailIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listEmailIdentities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEmailIdentitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEmailIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of all of the email identities that are associated with your Amazon Pinpoint account. An identity can be either an email address or a domain. This operation returns identities that are verified as well as those that aren't.
      */
    def listEmailIdentities(params: ListEmailIdentitiesRequest): awsDashSdkLib.libRequestMod.Request[ListEmailIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listEmailIdentities(
      params: ListEmailIdentitiesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEmailIdentitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEmailIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enable or disable the automatic warm-up feature for dedicated IP addresses.
      */
    def putAccountDedicatedIpWarmupAttributes(): awsDashSdkLib.libRequestMod.Request[PutAccountDedicatedIpWarmupAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putAccountDedicatedIpWarmupAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutAccountDedicatedIpWarmupAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutAccountDedicatedIpWarmupAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enable or disable the automatic warm-up feature for dedicated IP addresses.
      */
    def putAccountDedicatedIpWarmupAttributes(params: PutAccountDedicatedIpWarmupAttributesRequest): awsDashSdkLib.libRequestMod.Request[PutAccountDedicatedIpWarmupAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putAccountDedicatedIpWarmupAttributes(
      params: PutAccountDedicatedIpWarmupAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutAccountDedicatedIpWarmupAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutAccountDedicatedIpWarmupAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enable or disable the ability of your account to send email.
      */
    def putAccountSendingAttributes(): awsDashSdkLib.libRequestMod.Request[PutAccountSendingAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putAccountSendingAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutAccountSendingAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutAccountSendingAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enable or disable the ability of your account to send email.
      */
    def putAccountSendingAttributes(params: PutAccountSendingAttributesRequest): awsDashSdkLib.libRequestMod.Request[PutAccountSendingAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putAccountSendingAttributes(
      params: PutAccountSendingAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutAccountSendingAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutAccountSendingAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associate a configuration set with a dedicated IP pool. You can use dedicated IP pools to create groups of dedicated IP addresses for sending specific types of email.
      */
    def putConfigurationSetDeliveryOptions(): awsDashSdkLib.libRequestMod.Request[PutConfigurationSetDeliveryOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putConfigurationSetDeliveryOptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutConfigurationSetDeliveryOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutConfigurationSetDeliveryOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associate a configuration set with a dedicated IP pool. You can use dedicated IP pools to create groups of dedicated IP addresses for sending specific types of email.
      */
    def putConfigurationSetDeliveryOptions(params: PutConfigurationSetDeliveryOptionsRequest): awsDashSdkLib.libRequestMod.Request[PutConfigurationSetDeliveryOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putConfigurationSetDeliveryOptions(
      params: PutConfigurationSetDeliveryOptionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutConfigurationSetDeliveryOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutConfigurationSetDeliveryOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enable or disable collection of reputation metrics for emails that you send using a particular configuration set in a specific AWS Region.
      */
    def putConfigurationSetReputationOptions(): awsDashSdkLib.libRequestMod.Request[PutConfigurationSetReputationOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putConfigurationSetReputationOptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutConfigurationSetReputationOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutConfigurationSetReputationOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enable or disable collection of reputation metrics for emails that you send using a particular configuration set in a specific AWS Region.
      */
    def putConfigurationSetReputationOptions(params: PutConfigurationSetReputationOptionsRequest): awsDashSdkLib.libRequestMod.Request[PutConfigurationSetReputationOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putConfigurationSetReputationOptions(
      params: PutConfigurationSetReputationOptionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutConfigurationSetReputationOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutConfigurationSetReputationOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enable or disable email sending for messages that use a particular configuration set in a specific AWS Region.
      */
    def putConfigurationSetSendingOptions(): awsDashSdkLib.libRequestMod.Request[PutConfigurationSetSendingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putConfigurationSetSendingOptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutConfigurationSetSendingOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutConfigurationSetSendingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enable or disable email sending for messages that use a particular configuration set in a specific AWS Region.
      */
    def putConfigurationSetSendingOptions(params: PutConfigurationSetSendingOptionsRequest): awsDashSdkLib.libRequestMod.Request[PutConfigurationSetSendingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putConfigurationSetSendingOptions(
      params: PutConfigurationSetSendingOptionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutConfigurationSetSendingOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutConfigurationSetSendingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Specify a custom domain to use for open and click tracking elements in email that you send using Amazon Pinpoint.
      */
    def putConfigurationSetTrackingOptions(): awsDashSdkLib.libRequestMod.Request[PutConfigurationSetTrackingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putConfigurationSetTrackingOptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutConfigurationSetTrackingOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutConfigurationSetTrackingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Specify a custom domain to use for open and click tracking elements in email that you send using Amazon Pinpoint.
      */
    def putConfigurationSetTrackingOptions(params: PutConfigurationSetTrackingOptionsRequest): awsDashSdkLib.libRequestMod.Request[PutConfigurationSetTrackingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putConfigurationSetTrackingOptions(
      params: PutConfigurationSetTrackingOptionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutConfigurationSetTrackingOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutConfigurationSetTrackingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Move a dedicated IP address to an existing dedicated IP pool.  The dedicated IP address that you specify must already exist, and must be associated with your Amazon Pinpoint account.  The dedicated IP pool you specify must already exist. You can create a new pool by using the CreateDedicatedIpPool operation. 
      */
    def putDedicatedIpInPool(): awsDashSdkLib.libRequestMod.Request[PutDedicatedIpInPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putDedicatedIpInPool(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutDedicatedIpInPoolResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutDedicatedIpInPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Move a dedicated IP address to an existing dedicated IP pool.  The dedicated IP address that you specify must already exist, and must be associated with your Amazon Pinpoint account.  The dedicated IP pool you specify must already exist. You can create a new pool by using the CreateDedicatedIpPool operation. 
      */
    def putDedicatedIpInPool(params: PutDedicatedIpInPoolRequest): awsDashSdkLib.libRequestMod.Request[PutDedicatedIpInPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putDedicatedIpInPool(
      params: PutDedicatedIpInPoolRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutDedicatedIpInPoolResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutDedicatedIpInPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * 
      */
    def putDedicatedIpWarmupAttributes(): awsDashSdkLib.libRequestMod.Request[PutDedicatedIpWarmupAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putDedicatedIpWarmupAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutDedicatedIpWarmupAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutDedicatedIpWarmupAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * 
      */
    def putDedicatedIpWarmupAttributes(params: PutDedicatedIpWarmupAttributesRequest): awsDashSdkLib.libRequestMod.Request[PutDedicatedIpWarmupAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putDedicatedIpWarmupAttributes(
      params: PutDedicatedIpWarmupAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutDedicatedIpWarmupAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutDedicatedIpWarmupAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of a calendar month, we prorate the monthly charge based on how many days have elapsed in the current calendar month.
      */
    def putDeliverabilityDashboardOption(): awsDashSdkLib.libRequestMod.Request[PutDeliverabilityDashboardOptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putDeliverabilityDashboardOption(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutDeliverabilityDashboardOptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutDeliverabilityDashboardOptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of a calendar month, we prorate the monthly charge based on how many days have elapsed in the current calendar month.
      */
    def putDeliverabilityDashboardOption(params: PutDeliverabilityDashboardOptionRequest): awsDashSdkLib.libRequestMod.Request[PutDeliverabilityDashboardOptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putDeliverabilityDashboardOption(
      params: PutDeliverabilityDashboardOptionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutDeliverabilityDashboardOptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutDeliverabilityDashboardOptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to enable or disable DKIM authentication for an email identity.
      */
    def putEmailIdentityDkimAttributes(): awsDashSdkLib.libRequestMod.Request[PutEmailIdentityDkimAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putEmailIdentityDkimAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEmailIdentityDkimAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEmailIdentityDkimAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to enable or disable DKIM authentication for an email identity.
      */
    def putEmailIdentityDkimAttributes(params: PutEmailIdentityDkimAttributesRequest): awsDashSdkLib.libRequestMod.Request[PutEmailIdentityDkimAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putEmailIdentityDkimAttributes(
      params: PutEmailIdentityDkimAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEmailIdentityDkimAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEmailIdentityDkimAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to enable or disable feedback forwarding for an identity. This setting determines what happens when an identity is used to send an email that results in a bounce or complaint event. When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when bounce or complaint events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the original email. When you disable feedback forwarding, Amazon Pinpoint sends notifications through other mechanisms, such as by notifying an Amazon SNS topic. You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications, Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
      */
    def putEmailIdentityFeedbackAttributes(): awsDashSdkLib.libRequestMod.Request[PutEmailIdentityFeedbackAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putEmailIdentityFeedbackAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEmailIdentityFeedbackAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEmailIdentityFeedbackAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to enable or disable feedback forwarding for an identity. This setting determines what happens when an identity is used to send an email that results in a bounce or complaint event. When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when bounce or complaint events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the original email. When you disable feedback forwarding, Amazon Pinpoint sends notifications through other mechanisms, such as by notifying an Amazon SNS topic. You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications, Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
      */
    def putEmailIdentityFeedbackAttributes(params: PutEmailIdentityFeedbackAttributesRequest): awsDashSdkLib.libRequestMod.Request[PutEmailIdentityFeedbackAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putEmailIdentityFeedbackAttributes(
      params: PutEmailIdentityFeedbackAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEmailIdentityFeedbackAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEmailIdentityFeedbackAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to enable or disable the custom Mail-From domain configuration for an email identity.
      */
    def putEmailIdentityMailFromAttributes(): awsDashSdkLib.libRequestMod.Request[PutEmailIdentityMailFromAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putEmailIdentityMailFromAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEmailIdentityMailFromAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEmailIdentityMailFromAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to enable or disable the custom Mail-From domain configuration for an email identity.
      */
    def putEmailIdentityMailFromAttributes(params: PutEmailIdentityMailFromAttributesRequest): awsDashSdkLib.libRequestMod.Request[PutEmailIdentityMailFromAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putEmailIdentityMailFromAttributes(
      params: PutEmailIdentityMailFromAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEmailIdentityMailFromAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEmailIdentityMailFromAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sends an email message. You can use the Amazon Pinpoint Email API to send two types of messages:    Simple – A standard email message. When you create this type of message, you specify the sender, the recipient, and the message body, and Amazon Pinpoint assembles the message for you.    Raw – A raw, MIME-formatted email message. When you send this type of email, you have to specify all of the message headers, as well as the message body. You can use this message type to send messages that contain attachments. The message that you specify has to be a valid MIME message.  
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
      * Sends an email message. You can use the Amazon Pinpoint Email API to send two types of messages:    Simple – A standard email message. When you create this type of message, you specify the sender, the recipient, and the message body, and Amazon Pinpoint assembles the message for you.    Raw – A raw, MIME-formatted email message. When you send this type of email, you have to specify all of the message headers, as well as the message body. You can use this message type to send messages that contain attachments. The message that you specify has to be a valid MIME message.  
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
      * Update the configuration of an event destination for a configuration set. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
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
      * Update the configuration of an event destination for a configuration set. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
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
  }
  
  trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
    /**
      * The name of the configuration set that contains the event destination that you want to modify.
      */
    var ConfigurationSetName: ConfigurationSetName
    /**
      * An object that defines the event destination.
      */
    var EventDestination: EventDestinationDefinition
    /**
      * The name of the event destination that you want to modify.
      */
    var EventDestinationName: EventDestinationName
  }
  
  trait UpdateConfigurationSetEventDestinationResponse extends js.Object
  
  trait VolumeStatistics extends js.Object {
    /**
      * The total number of emails that arrived in recipients' inboxes.
      */
    var InboxRawCount: js.UndefOr[Volume] = js.undefined
    /**
      * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' inboxes.
      */
    var ProjectedInbox: js.UndefOr[Volume] = js.undefined
    /**
      * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' spam or junk mail folders.
      */
    var ProjectedSpam: js.UndefOr[Volume] = js.undefined
    /**
      * The total number of emails that arrived in recipients' spam or junk mail folders.
      */
    var SpamRawCount: js.UndefOr[Volume] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AmazonResourceName = java.lang.String
  type BehaviorOnMxFailure = awsDashSdkLib.awsDashSdkLibStrings.USE_DEFAULT_VALUE | awsDashSdkLib.awsDashSdkLibStrings.REJECT_MESSAGE | java.lang.String
  type BlacklistEntries = js.Array[BlacklistEntry]
  type BlacklistItemName = java.lang.String
  type BlacklistItemNames = js.Array[BlacklistItemName]
  type BlacklistingDescription = java.lang.String
  type Charset = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchDimensionConfigurations = js.Array[CloudWatchDimensionConfiguration]
  type ConfigurationSetName = java.lang.String
  type ConfigurationSetNameList = js.Array[ConfigurationSetName]
  type CustomRedirectDomain = java.lang.String
  type DailyVolumes = js.Array[DailyVolume]
  type DedicatedIpList = js.Array[DedicatedIp]
  type DefaultDimensionValue = java.lang.String
  type DeliverabilityTestReports = js.Array[DeliverabilityTestReport]
  type DeliverabilityTestStatus = awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED | java.lang.String
  type DeliverabilityTestSubject = java.lang.String
  type DimensionName = java.lang.String
  type DimensionValueSource = awsDashSdkLib.awsDashSdkLibStrings.MESSAGE_TAG | awsDashSdkLib.awsDashSdkLibStrings.EMAIL_HEADER | awsDashSdkLib.awsDashSdkLibStrings.LINK_TAG | java.lang.String
  type DkimStatus = awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.SUCCESS | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.TEMPORARY_FAILURE | awsDashSdkLib.awsDashSdkLibStrings.NOT_STARTED | java.lang.String
  type DnsToken = java.lang.String
  type DnsTokenList = js.Array[DnsToken]
  type DomainIspPlacements = js.Array[DomainIspPlacement]
  type EmailAddress = java.lang.String
  type EmailAddressList = js.Array[EmailAddress]
  type Enabled = scala.Boolean
  type EventDestinationName = java.lang.String
  type EventDestinations = js.Array[EventDestination]
  type EventType = awsDashSdkLib.awsDashSdkLibStrings.SEND | awsDashSdkLib.awsDashSdkLibStrings.REJECT | awsDashSdkLib.awsDashSdkLibStrings.BOUNCE | awsDashSdkLib.awsDashSdkLibStrings.COMPLAINT | awsDashSdkLib.awsDashSdkLibStrings.DELIVERY | awsDashSdkLib.awsDashSdkLibStrings.OPEN | awsDashSdkLib.awsDashSdkLibStrings.CLICK | awsDashSdkLib.awsDashSdkLibStrings.RENDERING_FAILURE | java.lang.String
  type EventTypes = js.Array[EventType]
  type GeneralEnforcementStatus = java.lang.String
  type Identity = java.lang.String
  type IdentityInfoList = js.Array[IdentityInfo]
  type IdentityType = awsDashSdkLib.awsDashSdkLibStrings.EMAIL_ADDRESS | awsDashSdkLib.awsDashSdkLibStrings.DOMAIN | awsDashSdkLib.awsDashSdkLibStrings.MANAGED_DOMAIN | java.lang.String
  type Ip = java.lang.String
  type IspName = java.lang.String
  type IspPlacements = js.Array[IspPlacement]
  type LastFreshStart = stdLib.Date
  type ListOfDedicatedIpPools = js.Array[PoolName]
  type MailFromDomainName = java.lang.String
  type MailFromDomainStatus = awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.SUCCESS | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.TEMPORARY_FAILURE | java.lang.String
  type Max24HourSend = scala.Double
  type MaxItems = scala.Double
  type MaxSendRate = scala.Double
  type MessageContent = java.lang.String
  type MessageData = java.lang.String
  type MessageTagList = js.Array[MessageTag]
  type MessageTagName = java.lang.String
  type MessageTagValue = java.lang.String
  type NextToken = java.lang.String
  type OutboundMessageId = java.lang.String
  type Percentage = scala.Double
  type Percentage100Wrapper = scala.Double
  type PoolName = java.lang.String
  type RawMessageData = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsPinpointemailMod.Blob | java.lang.String
  type RblName = java.lang.String
  type ReportId = java.lang.String
  type ReportName = java.lang.String
  type SendingPoolName = java.lang.String
  type SentLast24Hours = scala.Double
  type Timestamp = stdLib.Date
  type Volume = scala.Double
  type WarmupStatus = awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.DONE | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-07-26` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

