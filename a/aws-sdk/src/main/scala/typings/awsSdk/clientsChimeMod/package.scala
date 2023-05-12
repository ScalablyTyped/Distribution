package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.ChatBot
import typings.awsSdk.awsSdkStrings.ChimeSdkMeeting
import typings.awsSdk.awsSdkStrings.ContentOnly
import typings.awsSdk.awsSdkStrings.PHI
import typings.awsSdk.awsSdkStrings.PII
import typings.awsSdk.awsSdkStrings.S3Bucket
import typings.awsSdk.awsSdkStrings.VideoOnly
import typings.awsSdk.awsSdkStrings.`en-US`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountList = js.Array[Account]

type AccountName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Suspended_
  - typings.awsSdk.awsSdkStrings.Active_
  - java.lang.String
*/
type AccountStatus = _AccountStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Team
  - typings.awsSdk.awsSdkStrings.EnterpriseDirectory
  - typings.awsSdk.awsSdkStrings.EnterpriseLWA
  - typings.awsSdk.awsSdkStrings.EnterpriseOIDC
  - java.lang.String
*/
type AccountType = _AccountType | java.lang.String

type Alpha2CountryCode = java.lang.String

type AppInstanceAdminList = js.Array[AppInstanceAdminSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Channel_
  - typings.awsSdk.awsSdkStrings.ChannelMessage
  - java.lang.String
*/
type AppInstanceDataType = _AppInstanceDataType | java.lang.String

type AppInstanceList = js.Array[AppInstanceSummary]

type AppInstanceStreamingConfigurationList = js.Array[AppInstanceStreamingConfiguration]

type AppInstanceUserList = js.Array[AppInstanceUserSummary]

type AreaCode = java.lang.String

type Arn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ArtifactsState = _ArtifactsState | java.lang.String

type AttendeeIdList = js.Array[GuidString]

type AttendeeList = js.Array[Attendee]

type AttendeeTagKeyList = js.Array[TagKey]

type AttendeeTagList = js.Array[Tag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AudioOnly
  - typings.awsSdk.awsSdkStrings.AudioWithActiveSpeakerVideo
  - java.lang.String
*/
type AudioMuxType = _AudioMuxType | java.lang.String

type BatchCreateAttendeeErrorList = js.Array[CreateAttendeeError]

type BatchCreateChannelMembershipErrors = js.Array[BatchCreateChannelMembershipError]

type Boolean = scala.Boolean

type BotList = js.Array[Bot]

type BotType = ChatBot | java.lang.String

type CallingName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Unassigned
  - typings.awsSdk.awsSdkStrings.UpdateInProgress
  - typings.awsSdk.awsSdkStrings.UpdateSucceeded
  - typings.awsSdk.awsSdkStrings.UpdateFailed
  - java.lang.String
*/
type CallingNameStatus = _CallingNameStatus | java.lang.String

type CallingRegion = java.lang.String

type CallingRegionList = js.Array[CallingRegion]

type CandidateAddressList = js.Array[CandidateAddress]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Voice_
  - typings.awsSdk.awsSdkStrings.SMS
  - java.lang.String
*/
type Capability = _Capability | java.lang.String

type CapabilityList = js.Array[Capability]

type ChannelBanSummaryList = js.Array[ChannelBanSummary]

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

type ContentMuxType = ContentOnly | java.lang.String

type Country = java.lang.String

type CountryList = js.Array[Country]

type CpsLimit = Double

type CreateAttendeeRequestItemList = js.Array[CreateAttendeeRequestItem]

type CreateMeetingWithAttendeesRequestItemList = js.Array[CreateAttendeeRequestItem]

type CredentialList = js.Array[Credential]

type DNISEmergencyCallingConfigurationList = js.Array[DNISEmergencyCallingConfiguration]

type DataRetentionInHours = Double

type E164PhoneNumber = java.lang.String

type E164PhoneNumberList = js.Array[E164PhoneNumber]

type EmailAddress = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NotSent
  - typings.awsSdk.awsSdkStrings.Sent_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type EmailStatus = _EmailStatus | java.lang.String

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

type ExternalMeetingIdType = java.lang.String

type ExternalUserIdList = js.Array[ExternalUserIdType]

type ExternalUserIdType = java.lang.String

type FunctionArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Country_
  - typings.awsSdk.awsSdkStrings.AreaCode
  - java.lang.String
*/
type GeoMatchLevel = _GeoMatchLevel | java.lang.String

type GuidString = java.lang.String

type Integer = Double

type InviteList = js.Array[Invite]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.Accepted_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type InviteStatus = _InviteStatus | java.lang.String

type Iso8601Timestamp = js.Date

type JoinTokenString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Basic_
  - typings.awsSdk.awsSdkStrings.Plus_
  - typings.awsSdk.awsSdkStrings.Pro
  - typings.awsSdk.awsSdkStrings.ProTrial
  - java.lang.String
*/
type License = _License | java.lang.String

type LicenseList = js.Array[License]

type MaxResults = Double

type MediaCapturePipelineList = js.Array[MediaCapturePipeline]

type MediaPipelineSinkType = S3Bucket | java.lang.String

type MediaPipelineSourceType = ChimeSdkMeeting | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Initializing_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Stopping_
  - typings.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
type MediaPipelineStatus = _MediaPipelineStatus | java.lang.String

type MeetingList = js.Array[Meeting]

type MeetingTagKeyList = js.Array[TagKey]

type MeetingTagList = js.Array[Tag]

type MemberArns = js.Array[ChimeArn]

type MemberErrorList = js.Array[MemberError]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.User_
  - typings.awsSdk.awsSdkStrings.Bot_
  - typings.awsSdk.awsSdkStrings.Webhook
  - java.lang.String
*/
type MemberType = _MemberType | java.lang.String

type Members = js.Array[Identity]

type MembershipItemList = js.Array[MembershipItem]

type MessageId = java.lang.String

type Metadata = java.lang.String

type NextToken = java.lang.String

type NextTokenString = java.lang.String

type NonEmptyContent = java.lang.String

type NonEmptyResourceName = java.lang.String

type NonEmptyString = java.lang.String

type NonEmptyString128 = java.lang.String

type NonEmptyStringList = js.Array[String]

type NonNullableBoolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EventBridge
  - typings.awsSdk.awsSdkStrings.SNS
  - typings.awsSdk.awsSdkStrings.SQS
  - java.lang.String
*/
type NotificationTarget = _NotificationTarget | java.lang.String

type NullableBoolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PreferSticky
  - typings.awsSdk.awsSdkStrings.AvoidSticky
  - java.lang.String
*/
type NumberSelectionBehavior = _NumberSelectionBehavior | java.lang.String

type OrderedPhoneNumberList = js.Array[OrderedPhoneNumber]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Processing_
  - typings.awsSdk.awsSdkStrings.Acquired
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type OrderedPhoneNumberStatus = _OrderedPhoneNumberStatus | java.lang.String

type OriginationRouteList = js.Array[OriginationRoute]

type OriginationRoutePriority = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TCP
  - typings.awsSdk.awsSdkStrings.UDP
  - java.lang.String
*/
type OriginationRouteProtocol = _OriginationRouteProtocol | java.lang.String

type OriginationRouteWeight = Double

type ParticipantPhoneNumberList = js.Array[E164PhoneNumber]

type Participants = js.Array[Participant]

type PhoneNumberAssociationList = js.Array[PhoneNumberAssociation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AccountId
  - typings.awsSdk.awsSdkStrings.UserId
  - typings.awsSdk.awsSdkStrings.VoiceConnectorId
  - typings.awsSdk.awsSdkStrings.VoiceConnectorGroupId
  - typings.awsSdk.awsSdkStrings.SipRuleId
  - java.lang.String
*/
type PhoneNumberAssociationName = _PhoneNumberAssociationName | java.lang.String

type PhoneNumberCountriesList = js.Array[PhoneNumberCountry]

type PhoneNumberErrorList = js.Array[PhoneNumberError]

type PhoneNumberList = js.Array[PhoneNumber]

type PhoneNumberMaxResults = Double

type PhoneNumberOrderList = js.Array[PhoneNumberOrder]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Processing_
  - typings.awsSdk.awsSdkStrings.Successful_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Partial_
  - java.lang.String
*/
type PhoneNumberOrderStatus = _PhoneNumberOrderStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BusinessCalling
  - typings.awsSdk.awsSdkStrings.VoiceConnector
  - typings.awsSdk.awsSdkStrings.SipMediaApplicationDialIn
  - java.lang.String
*/
type PhoneNumberProductType = _PhoneNumberProductType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AcquireInProgress
  - typings.awsSdk.awsSdkStrings.AcquireFailed
  - typings.awsSdk.awsSdkStrings.Unassigned
  - typings.awsSdk.awsSdkStrings.Assigned_
  - typings.awsSdk.awsSdkStrings.ReleaseInProgress
  - typings.awsSdk.awsSdkStrings.DeleteInProgress
  - typings.awsSdk.awsSdkStrings.ReleaseFailed
  - typings.awsSdk.awsSdkStrings.DeleteFailed
  - java.lang.String
*/
type PhoneNumberStatus = _PhoneNumberStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Local_
  - typings.awsSdk.awsSdkStrings.TollFree
  - java.lang.String
*/
type PhoneNumberType = _PhoneNumberType | java.lang.String

type PhoneNumberTypeList = js.Array[PhoneNumberType]

type Port = Double

type PositiveInteger = Double

type ProfileServiceMaxResults = Double

type ProxySessionNameString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Open_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Closed_
  - java.lang.String
*/
type ProxySessionStatus = _ProxySessionStatus | java.lang.String

type ProxySessions = js.Array[ProxySession]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Unregistered_
  - typings.awsSdk.awsSdkStrings.Registered_
  - typings.awsSdk.awsSdkStrings.Suspended_
  - java.lang.String
*/
type RegistrationStatus = _RegistrationStatus | java.lang.String

type ResourceName = java.lang.String

type ResultMax = Double

type RetentionDays = Double

type RoomList = js.Array[Room]

type RoomMembershipList = js.Array[RoomMembership]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Administrator_
  - typings.awsSdk.awsSdkStrings.Member_
  - java.lang.String
*/
type RoomMembershipRole = _RoomMembershipRole | java.lang.String

type SMAUpdateCallArgumentsMap = StringDictionary[SensitiveString]

type SensitiveNonEmptyString = java.lang.String

type SensitiveString = java.lang.String

type SensitiveStringList = js.Array[SensitiveString]

type SigninDelegateGroupList = js.Array[SigninDelegateGroup]

type SipApplicationPriority = Double

type SipHeadersMap = StringDictionary[SensitiveString]

type SipMediaApplicationEndpointList = js.Array[SipMediaApplicationEndpoint]

type SipMediaApplicationList = js.Array[SipMediaApplication]

type SipMediaApplicationName = java.lang.String

type SipRuleList = js.Array[SipRule]

type SipRuleName = java.lang.String

type SipRuleTargetApplicationList = js.Array[SipRuleTargetApplication]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ToPhoneNumber
  - typings.awsSdk.awsSdkStrings.RequestUriHostname
  - java.lang.String
*/
type SipRuleTriggerType = _SipRuleTriggerType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type StreamingNotificationTargetList = js.Array[StreamingNotificationTarget]

type String = java.lang.String

type String128 = java.lang.String

type StringList = js.Array[String]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Timestamp = js.Date

type TollFreePrefix = java.lang.String

type TranscribeContentIdentificationType = PII | java.lang.String

type TranscribeContentRedactionType = PII | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`en-US`
  - typings.awsSdk.awsSdkStrings.`en-GB`
  - typings.awsSdk.awsSdkStrings.`es-US`
  - typings.awsSdk.awsSdkStrings.`fr-CA`
  - typings.awsSdk.awsSdkStrings.`fr-FR`
  - typings.awsSdk.awsSdkStrings.`en-AU`
  - typings.awsSdk.awsSdkStrings.`it-IT`
  - typings.awsSdk.awsSdkStrings.`de-DE`
  - typings.awsSdk.awsSdkStrings.`pt-BR`
  - typings.awsSdk.awsSdkStrings.`ja-JP`
  - typings.awsSdk.awsSdkStrings.`ko-KR`
  - typings.awsSdk.awsSdkStrings.`zh-CN`
  - typings.awsSdk.awsSdkStrings.`th-TH`
  - typings.awsSdk.awsSdkStrings.`hi-IN`
  - java.lang.String
*/
type TranscribeLanguageCode = _TranscribeLanguageCode | java.lang.String

type TranscribeLanguageModelName = java.lang.String

type TranscribeLanguageOptions = java.lang.String

type TranscribeMedicalContentIdentificationType = PHI | java.lang.String

type TranscribeMedicalLanguageCode = `en-US` | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`us-east-1`
  - typings.awsSdk.awsSdkStrings.`us-east-2`
  - typings.awsSdk.awsSdkStrings.`us-west-2`
  - typings.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typings.awsSdk.awsSdkStrings.`ca-central-1`
  - typings.awsSdk.awsSdkStrings.`eu-west-1`
  - typings.awsSdk.awsSdkStrings.auto__
  - java.lang.String
*/
type TranscribeMedicalRegion = _TranscribeMedicalRegion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRIMARYCARE
  - typings.awsSdk.awsSdkStrings.CARDIOLOGY
  - typings.awsSdk.awsSdkStrings.NEUROLOGY
  - typings.awsSdk.awsSdkStrings.ONCOLOGY
  - typings.awsSdk.awsSdkStrings.RADIOLOGY
  - typings.awsSdk.awsSdkStrings.UROLOGY
  - java.lang.String
*/
type TranscribeMedicalSpecialty = _TranscribeMedicalSpecialty | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONVERSATION
  - typings.awsSdk.awsSdkStrings.DICTATION
  - java.lang.String
*/
type TranscribeMedicalType = _TranscribeMedicalType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.low__
  - typings.awsSdk.awsSdkStrings.medium__
  - typings.awsSdk.awsSdkStrings.high__
  - java.lang.String
*/
type TranscribePartialResultsStability = _TranscribePartialResultsStability | java.lang.String

type TranscribePiiEntityTypes = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`us-east-2`
  - typings.awsSdk.awsSdkStrings.`us-east-1`
  - typings.awsSdk.awsSdkStrings.`us-west-2`
  - typings.awsSdk.awsSdkStrings.`ap-northeast-2`
  - typings.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typings.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typings.awsSdk.awsSdkStrings.`ca-central-1`
  - typings.awsSdk.awsSdkStrings.`eu-central-1`
  - typings.awsSdk.awsSdkStrings.`eu-west-1`
  - typings.awsSdk.awsSdkStrings.`eu-west-2`
  - typings.awsSdk.awsSdkStrings.`sa-east-1`
  - typings.awsSdk.awsSdkStrings.auto__
  - java.lang.String
*/
type TranscribeRegion = _TranscribeRegion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.remove__
  - typings.awsSdk.awsSdkStrings.mask__
  - typings.awsSdk.awsSdkStrings.tag_
  - java.lang.String
*/
type TranscribeVocabularyFilterMethod = _TranscribeVocabularyFilterMethod | java.lang.String

type TranscribeVocabularyNamesOrFilterNamesString = java.lang.String

type UpdatePhoneNumberRequestItemList = js.Array[UpdatePhoneNumberRequestItem]

type UpdateUserRequestItemList = js.Array[UpdateUserRequestItem]

type UriType = java.lang.String

type UrlType = java.lang.String

type UserEmailList = js.Array[EmailAddress]

type UserErrorList = js.Array[UserError]

type UserId = java.lang.String

type UserIdList = js.Array[NonEmptyString]

type UserList = js.Array[User]

type UserName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PrivateUser
  - typings.awsSdk.awsSdkStrings.SharedDevice
  - java.lang.String
*/
type UserType = _UserType | java.lang.String

type ValidationResult = Double

type VideoMuxType = VideoOnly | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`us-east-1`
  - typings.awsSdk.awsSdkStrings.`us-west-2`
  - java.lang.String
*/
type VoiceConnectorAwsRegion = _VoiceConnectorAwsRegion | java.lang.String

type VoiceConnectorGroupList = js.Array[VoiceConnectorGroup]

type VoiceConnectorGroupName = java.lang.String

type VoiceConnectorItemList = js.Array[VoiceConnectorItem]

type VoiceConnectorItemPriority = Double

type VoiceConnectorList = js.Array[VoiceConnector]

type VoiceConnectorName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-05-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
