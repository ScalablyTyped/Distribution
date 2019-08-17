package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.RuleSet
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type Address = String
  type AddressList = js.Array[Address]
  type AmazonResourceName = String
  type ArrivalDate = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UseDefaultValue
    - typings.awsDashSdk.awsDashSdkStrings.RejectMessage
    - java.lang.String
  */
  type BehaviorOnMXFailure = _BehaviorOnMXFailure | String
  type BounceMessage = String
  type BounceSmtpReplyCode = String
  type BounceStatusCode = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DoesNotExist
    - typings.awsDashSdk.awsDashSdkStrings.MessageTooLarge
    - typings.awsDashSdk.awsDashSdkStrings.ExceededQuota
    - typings.awsDashSdk.awsDashSdkStrings.ContentRejected
    - typings.awsDashSdk.awsDashSdkStrings.Undefined
    - typings.awsDashSdk.awsDashSdkStrings.TemporaryFailure
    - java.lang.String
  */
  type BounceType = _BounceType | String
  type BouncedRecipientInfoList = js.Array[BouncedRecipientInfo]
  type BulkEmailDestinationList = js.Array[BulkEmailDestination]
  type BulkEmailDestinationStatusList = js.Array[BulkEmailDestinationStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Success
    - typings.awsDashSdk.awsDashSdkStrings.MessageRejected
    - typings.awsDashSdk.awsDashSdkStrings.MailFromDomainNotVerified
    - typings.awsDashSdk.awsDashSdkStrings.ConfigurationSetDoesNotExist
    - typings.awsDashSdk.awsDashSdkStrings.TemplateDoesNotExist
    - typings.awsDashSdk.awsDashSdkStrings.AccountSuspended
    - typings.awsDashSdk.awsDashSdkStrings.AccountThrottled
    - typings.awsDashSdk.awsDashSdkStrings.AccountDailyQuotaExceeded
    - typings.awsDashSdk.awsDashSdkStrings.InvalidSendingPoolName
    - typings.awsDashSdk.awsDashSdkStrings.AccountSendingPaused
    - typings.awsDashSdk.awsDashSdkStrings.ConfigurationSetSendingPaused
    - typings.awsDashSdk.awsDashSdkStrings.InvalidParameterValue
    - typings.awsDashSdk.awsDashSdkStrings.TransientFailure
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type BulkEmailStatus = _BulkEmailStatus | String
  type Charset = String
  type Cidr = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchDimensionConfigurations = js.Array[CloudWatchDimensionConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.eventDestinations
    - typings.awsDashSdk.awsDashSdkStrings.trackingOptions
    - typings.awsDashSdk.awsDashSdkStrings.deliveryOptions
    - typings.awsDashSdk.awsDashSdkStrings.reputationOptions
    - java.lang.String
  */
  type ConfigurationSetAttribute = _ConfigurationSetAttribute | String
  type ConfigurationSetAttributeList = js.Array[ConfigurationSetAttribute]
  type ConfigurationSetName = String
  type ConfigurationSets = js.Array[ConfigurationSet]
  type Counter = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.Success
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.TemporaryFailure
    - java.lang.String
  */
  type CustomMailFromStatus = _CustomMailFromStatus | String
  type CustomRedirectDomain = String
  type CustomVerificationEmailTemplates = js.Array[CustomVerificationEmailTemplate]
  type DefaultDimensionValue = String
  type DiagnosticCode = String
  type DimensionName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.messageTag
    - typings.awsDashSdk.awsDashSdkStrings.emailHeader
    - typings.awsDashSdk.awsDashSdkStrings.linkTag
    - java.lang.String
  */
  type DimensionValueSource = _DimensionValueSource | String
  type DkimAttributes = StringDictionary[IdentityDkimAttributes]
  type Domain = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - typings.awsDashSdk.awsDashSdkStrings.delayed
    - typings.awsDashSdk.awsDashSdkStrings.delivered
    - typings.awsDashSdk.awsDashSdkStrings.relayed
    - typings.awsDashSdk.awsDashSdkStrings.expanded
    - java.lang.String
  */
  type DsnAction = _DsnAction | String
  type DsnStatus = String
  type Enabled = Boolean
  type Error = String
  type EventDestinationName = String
  type EventDestinations = js.Array[EventDestination]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.send
    - typings.awsDashSdk.awsDashSdkStrings.reject
    - typings.awsDashSdk.awsDashSdkStrings.bounce
    - typings.awsDashSdk.awsDashSdkStrings.complaint
    - typings.awsDashSdk.awsDashSdkStrings.delivery
    - typings.awsDashSdk.awsDashSdkStrings.open
    - typings.awsDashSdk.awsDashSdkStrings.click
    - typings.awsDashSdk.awsDashSdkStrings.renderingFailure
    - java.lang.String
  */
  type EventType = _EventType | String
  type EventTypes = js.Array[EventType]
  type Explanation = String
  type ExtensionFieldList = js.Array[ExtensionField]
  type ExtensionFieldName = String
  type ExtensionFieldValue = String
  type FailureRedirectionURL = String
  type FromAddress = String
  type HeaderName = String
  type HeaderValue = String
  type HtmlPart = String
  type Identity = String
  type IdentityList = js.Array[Identity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EmailAddress
    - typings.awsDashSdk.awsDashSdkStrings.Domain
    - java.lang.String
  */
  type IdentityType = _IdentityType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Event
    - typings.awsDashSdk.awsDashSdkStrings.RequestResponse
    - java.lang.String
  */
  type InvocationType = _InvocationType | String
  type LastAttemptDate = Date
  type LastFreshStart = Date
  type MailFromDomainAttributes = StringDictionary[IdentityMailFromDomainAttributes]
  type MailFromDomainName = String
  type Max24HourSend = Double
  type MaxItems = Double
  type MaxResults = Double
  type MaxSendRate = Double
  type MessageData = String
  type MessageId = String
  type MessageTagList = js.Array[MessageTag]
  type MessageTagName = String
  type MessageTagValue = String
  type NextToken = String
  type NotificationAttributes = StringDictionary[IdentityNotificationAttributes]
  type NotificationTopic = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Bounce
    - typings.awsDashSdk.awsDashSdkStrings.Complaint
    - typings.awsDashSdk.awsDashSdkStrings.Delivery
    - java.lang.String
  */
  type NotificationType = _NotificationType | String
  type Policy = String
  type PolicyMap = StringDictionary[Policy]
  type PolicyName = String
  type PolicyNameList = js.Array[PolicyName]
  type RawMessageData = Buffer | Uint8Array | Blob | String
  type ReceiptActionsList = js.Array[ReceiptAction]
  type ReceiptFilterList = js.Array[ReceiptFilter]
  type ReceiptFilterName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Block
    - typings.awsDashSdk.awsDashSdkStrings.Allow
    - java.lang.String
  */
  type ReceiptFilterPolicy = _ReceiptFilterPolicy | String
  type ReceiptRuleName = String
  type ReceiptRuleNamesList = js.Array[ReceiptRuleName]
  type ReceiptRuleSetName = String
  type ReceiptRuleSetsLists = js.Array[ReceiptRuleSetMetadata]
  type ReceiptRulesList = js.Array[ReceiptRule]
  type Recipient = String
  type RecipientsList = js.Array[Recipient]
  type RemoteMta = String
  type RenderedTemplate = String
  type ReportingMta = String
  type S3BucketName = String
  type S3KeyPrefix = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`UTF-8`
    - typings.awsDashSdk.awsDashSdkStrings.Base64
    - java.lang.String
  */
  type SNSActionEncoding = _SNSActionEncoding | String
  type SendDataPointList = js.Array[SendDataPoint]
  type SentLast24Hours = Double
  type StopScope = RuleSet | String
  type Subject = String
  type SubjectPart = String
  type SuccessRedirectionURL = String
  type TemplateContent = String
  type TemplateData = String
  type TemplateMetadataList = js.Array[TemplateMetadata]
  type TemplateName = String
  type TextPart = String
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Require
    - typings.awsDashSdk.awsDashSdkStrings.Optional
    - java.lang.String
  */
  type TlsPolicy = _TlsPolicy | String
  type VerificationAttributes = StringDictionary[IdentityVerificationAttributes]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.Success
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.TemporaryFailure
    - typings.awsDashSdk.awsDashSdkStrings.NotStarted
    - java.lang.String
  */
  type VerificationStatus = _VerificationStatus | String
  type VerificationToken = String
  type VerificationTokenList = js.Array[VerificationToken]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2010-12-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
