package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.ASYNC
import typings.awsSdk.awsSdkStrings.MEMBERS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.FILTERED
  - java.lang.String
*/
type AllowNotifications = _AllowNotifications | java.lang.String

type BatchCreateChannelMembershipErrors = js.Array[BatchCreateChannelMembershipError]

type CallbackIdType = java.lang.String

type ChannelAssociatedWithFlowSummaryList = js.Array[ChannelAssociatedWithFlowSummary]

type ChannelBanSummaryList = js.Array[ChannelBanSummary]

type ChannelFlowExecutionOrder = Double

type ChannelFlowSummaryList = js.Array[ChannelFlowSummary]

type ChannelId = java.lang.String

type ChannelMemberArns = js.Array[ChimeArn]

type ChannelMembershipForAppInstanceUserSummaryList = js.Array[ChannelMembershipForAppInstanceUserSummary]

type ChannelMembershipSummaryList = js.Array[ChannelMembershipSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEFAULT
  - typings.awsSdk.awsSdkStrings.HIDDEN
  - java.lang.String
*/
type ChannelMembershipType = _ChannelMembershipType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PERSISTENT
  - typings.awsSdk.awsSdkStrings.NON_PERSISTENT
  - java.lang.String
*/
type ChannelMessagePersistenceType = _ChannelMessagePersistenceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SENT
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.DENIED
  - java.lang.String
*/
type ChannelMessageStatus = _ChannelMessageStatus | java.lang.String

type ChannelMessageSummaryList = js.Array[ChannelMessageSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.CONTROL
  - java.lang.String
*/
type ChannelMessageType = _ChannelMessageType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNRESTRICTED
  - typings.awsSdk.awsSdkStrings.RESTRICTED
  - java.lang.String
*/
type ChannelMode = _ChannelMode | java.lang.String

type ChannelModeratedByAppInstanceUserSummaryList = js.Array[ChannelModeratedByAppInstanceUserSummary]

type ChannelModeratorArns = js.Array[ChimeArn]

type ChannelModeratorSummaryList = js.Array[ChannelModeratorSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLIC
  - typings.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type ChannelPrivacy = _ChannelPrivacy | java.lang.String

type ChannelSummaryList = js.Array[ChannelSummary]

type ChimeArn = java.lang.String

type ClientRequestToken = java.lang.String

type Content = java.lang.String

type ContentType = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BadRequest
  - typings.awsSdk.awsSdkStrings.Conflict_
  - typings.awsSdk.awsSdkStrings.Forbidden
  - typings.awsSdk.awsSdkStrings.NotFound
  - typings.awsSdk.awsSdkStrings.PreconditionFailed
  - typings.awsSdk.awsSdkStrings.ResourceLimitExceeded
  - typings.awsSdk.awsSdkStrings.ServiceFailure
  - typings.awsSdk.awsSdkStrings.AccessDenied
  - typings.awsSdk.awsSdkStrings.ServiceUnavailable
  - typings.awsSdk.awsSdkStrings.Throttled_
  - typings.awsSdk.awsSdkStrings.Throttling_
  - typings.awsSdk.awsSdkStrings.Unauthorized_
  - typings.awsSdk.awsSdkStrings.Unprocessable
  - typings.awsSdk.awsSdkStrings.VoiceConnectorGroupAssociationsExist
  - typings.awsSdk.awsSdkStrings.PhoneNumberAssociationsExist
  - java.lang.String
*/
type ErrorCode = _ErrorCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED_TIMESTAMP
  - typings.awsSdk.awsSdkStrings.LAST_MESSAGE_TIMESTAMP
  - java.lang.String
*/
type ExpirationCriterion = _ExpirationCriterion | java.lang.String

type ExpirationDays = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONTINUE
  - typings.awsSdk.awsSdkStrings.ABORT
  - java.lang.String
*/
type FallbackAction = _FallbackAction | java.lang.String

type FilterRule = java.lang.String

type InvocationType = ASYNC | java.lang.String

type LambdaFunctionArn = java.lang.String

type MaxResults = Double

type MaximumSubChannels = Double

type MemberArns = js.Array[ChimeArn]

type Members = js.Array[Identity]

type MembershipCount = Double

type MessageAttributeMap = StringDictionary[MessageAttributeValue]

type MessageAttributeName = java.lang.String

type MessageAttributeStringValue = java.lang.String

type MessageAttributeStringValues = js.Array[MessageAttributeStringValue]

type MessageId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Channel_
  - typings.awsSdk.awsSdkStrings.ChannelMessage
  - java.lang.String
*/
type MessagingDataType = _MessagingDataType | java.lang.String

type Metadata = java.lang.String

type MinimumMembershipPercentage = Double

type NextToken = java.lang.String

type NonEmptyContent = java.lang.String

type NonEmptyResourceName = java.lang.String

type NonNullableBoolean = Boolean

type ProcessorList = js.Array[Processor]

type PushNotificationBody = java.lang.String

type PushNotificationTitle = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEFAULT
  - typings.awsSdk.awsSdkStrings.VOIP
  - java.lang.String
*/
type PushNotificationType = _PushNotificationType | java.lang.String

type ResourceName = java.lang.String

type SearchFieldKey = MEMBERS | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQUALS
  - typings.awsSdk.awsSdkStrings.INCLUDES
  - java.lang.String
*/
type SearchFieldOperator = _SearchFieldOperator | java.lang.String

type SearchFieldValue = java.lang.String

type SearchFieldValues = js.Array[SearchFieldValue]

type SearchFields = js.Array[SearchField]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type StatusDetail = java.lang.String

type StreamingConfigurationList = js.Array[StreamingConfiguration]

type String = java.lang.String

type SubChannelId = java.lang.String

type SubChannelSummaryList = js.Array[SubChannelSummary]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TargetMembershipsPerSubChannel = Double

type Timestamp = js.Date

type UrlType = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-05-15`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
