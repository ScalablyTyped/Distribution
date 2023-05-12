package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.`en-US`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AlexaSkillId = java.lang.String

type AlexaSkillIdList = js.Array[AlexaSkillId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type AlexaSkillStatus = _AlexaSkillStatus | java.lang.String

type Alpha2CountryCode = java.lang.String

type AreaCode = java.lang.String

type Arn = java.lang.String

type Boolean = scala.Boolean

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

type ClientRequestId = java.lang.String

type ConfidenceScore = Double

type Country = java.lang.String

type CountryList = js.Array[Country]

type CpsLimit = Double

type CredentialList = js.Array[Credential]

type DNISEmergencyCallingConfigurationList = js.Array[DNISEmergencyCallingConfiguration]

type DataRetentionInHours = Double

type E164PhoneNumber = java.lang.String

type E164PhoneNumberList = js.Array[E164PhoneNumber]

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
  - typings.awsSdk.awsSdkStrings.Gone
  - java.lang.String
*/
type ErrorCode = _ErrorCode | java.lang.String

type FunctionArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Country_
  - typings.awsSdk.awsSdkStrings.AreaCode
  - java.lang.String
*/
type GeoMatchLevel = _GeoMatchLevel | java.lang.String

type GuidString = java.lang.String

type Integer = Double

type Iso8601Timestamp = js.Date

type LanguageCode = `en-US` | java.lang.String

type NextTokenString = java.lang.String

type NonEmptyString = java.lang.String

type NonEmptyString128 = java.lang.String

type NonEmptyString256 = java.lang.String

type NonEmptyStringList = js.Array[String]

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
  - typings.awsSdk.awsSdkStrings.PendingDocuments
  - typings.awsSdk.awsSdkStrings.Submitted_
  - typings.awsSdk.awsSdkStrings.FOC
  - typings.awsSdk.awsSdkStrings.ChangeRequested
  - typings.awsSdk.awsSdkStrings.Exception_
  - typings.awsSdk.awsSdkStrings.CancelRequested
  - typings.awsSdk.awsSdkStrings.Cancelled_
  - java.lang.String
*/
type PhoneNumberOrderStatus = _PhoneNumberOrderStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.New_
  - typings.awsSdk.awsSdkStrings.Porting
  - java.lang.String
*/
type PhoneNumberOrderType = _PhoneNumberOrderType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VoiceConnector
  - typings.awsSdk.awsSdkStrings.SipMediaApplicationDialIn
  - java.lang.String
*/
type PhoneNumberProductType = _PhoneNumberProductType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Cancelled_
  - typings.awsSdk.awsSdkStrings.PortinCancelRequested
  - typings.awsSdk.awsSdkStrings.PortinInProgress
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

type ProxySessionNameString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Open_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Closed_
  - java.lang.String
*/
type ProxySessionStatus = _ProxySessionStatus | java.lang.String

type ProxySessions = js.Array[ProxySession]

type ResultMax = Double

type SMACreateCallArgumentsMap = StringDictionary[SensitiveString]

type SMAUpdateCallArgumentsMap = StringDictionary[SensitiveString]

type SensitiveNonEmptyString = java.lang.String

type SensitiveString = java.lang.String

type SensitiveStringList = js.Array[SensitiveString]

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

type SpeakerSearchResultList = js.Array[SpeakerSearchResult]

type StreamingNotificationTargetList = js.Array[StreamingNotificationTarget]

type String = java.lang.String

type String128 = java.lang.String

type StringList = js.Array[String]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TollFreePrefix = java.lang.String

type UpdatePhoneNumberRequestItemList = js.Array[UpdatePhoneNumberRequestItem]

type ValidationResult = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`us-east-1`
  - typings.awsSdk.awsSdkStrings.`us-west-2`
  - typings.awsSdk.awsSdkStrings.`ca-central-1`
  - typings.awsSdk.awsSdkStrings.`eu-central-1`
  - typings.awsSdk.awsSdkStrings.`eu-west-1`
  - typings.awsSdk.awsSdkStrings.`eu-west-2`
  - typings.awsSdk.awsSdkStrings.`ap-northeast-2`
  - typings.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typings.awsSdk.awsSdkStrings.`ap-southeast-1`
  - typings.awsSdk.awsSdkStrings.`ap-southeast-2`
  - java.lang.String
*/
type VoiceConnectorAwsRegion = _VoiceConnectorAwsRegion | java.lang.String

type VoiceConnectorAwsRegionList = js.Array[VoiceConnectorAwsRegion]

type VoiceConnectorGroupList = js.Array[VoiceConnectorGroup]

type VoiceConnectorGroupName = java.lang.String

type VoiceConnectorItemList = js.Array[VoiceConnectorItem]

type VoiceConnectorItemPriority = Double

type VoiceConnectorList = js.Array[VoiceConnector]

type VoiceConnectorName = java.lang.String

type VoiceProfileDomainDescription = java.lang.String

type VoiceProfileDomainName = java.lang.String

type VoiceProfileDomainSummaryList = js.Array[VoiceProfileDomainSummary]

type VoiceProfileSummaryList = js.Array[VoiceProfileSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2022-08-03`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
