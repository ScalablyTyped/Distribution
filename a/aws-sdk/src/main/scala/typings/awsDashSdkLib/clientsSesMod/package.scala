package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSesMod {
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
    - awsDashSdkLib.awsDashSdkLibStrings.deliveryOptions
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
  type DkimAttributes = org.scalablytyped.runtime.StringDictionary[IdentityDkimAttributes]
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
  type MailFromDomainAttributes = org.scalablytyped.runtime.StringDictionary[IdentityMailFromDomainAttributes]
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
  type NotificationAttributes = org.scalablytyped.runtime.StringDictionary[IdentityNotificationAttributes]
  type NotificationTopic = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Bounce
    - awsDashSdkLib.awsDashSdkLibStrings.Complaint
    - awsDashSdkLib.awsDashSdkLibStrings.Delivery
    - java.lang.String
  */
  type NotificationType = _NotificationType | java.lang.String
  type Policy = java.lang.String
  type PolicyMap = org.scalablytyped.runtime.StringDictionary[Policy]
  type PolicyName = java.lang.String
  type PolicyNameList = js.Array[PolicyName]
  type RawMessageData = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
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
  type VerificationAttributes = org.scalablytyped.runtime.StringDictionary[IdentityVerificationAttributes]
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
