package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.ACCOUNT_TIER
import typings.awsSdk.awsSdkStrings.`end-user-opted-out`
import typings.awsSdk.awsSdkStrings.`keyword-action`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountAttributeList = js.Array[AccountAttribute]

type AccountAttributeName = ACCOUNT_TIER | java.lang.String

type AccountLimitList = js.Array[AccountLimit]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PHONE_NUMBERS
  - typings.awsSdk.awsSdkStrings.POOLS
  - typings.awsSdk.awsSdkStrings.CONFIGURATION_SETS
  - typings.awsSdk.awsSdkStrings.OPT_OUT_LISTS
  - java.lang.String
*/
type AccountLimitName = _AccountLimitName | java.lang.String

type AmazonResourceName = java.lang.String

type Boolean = scala.Boolean

type ClientToken = java.lang.String

type ConfigurationSetFilterList = js.Array[ConfigurationSetFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`event-destination-name`
  - typings.awsSdk.awsSdkStrings.`matching-event-types`
  - typings.awsSdk.awsSdkStrings.`default-message-type`
  - typings.awsSdk.awsSdkStrings.`default-sender-id`
  - java.lang.String
*/
type ConfigurationSetFilterName = _ConfigurationSetFilterName | java.lang.String

type ConfigurationSetInformationList = js.Array[ConfigurationSetInformation]

type ConfigurationSetName = java.lang.String

type ConfigurationSetNameList = js.Array[ConfigurationSetNameOrArn]

type ConfigurationSetNameOrArn = java.lang.String

type ContextKey = java.lang.String

type ContextMap = StringDictionary[ContextValue]

type ContextValue = java.lang.String

type DeliveryStreamArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_TEMPLATE_ID
  - typings.awsSdk.awsSdkStrings.IN_ENTITY_ID
  - java.lang.String
*/
type DestinationCountryParameterKey = _DestinationCountryParameterKey | java.lang.String

type DestinationCountryParameterValue = java.lang.String

type DestinationCountryParameters = StringDictionary[DestinationCountryParameterValue]

type EventDestinationList = js.Array[EventDestination]

type EventDestinationName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.TEXT_ALL
  - typings.awsSdk.awsSdkStrings.TEXT_SENT
  - typings.awsSdk.awsSdkStrings.TEXT_PENDING
  - typings.awsSdk.awsSdkStrings.TEXT_QUEUED
  - typings.awsSdk.awsSdkStrings.TEXT_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.TEXT_DELIVERED
  - typings.awsSdk.awsSdkStrings.TEXT_INVALID
  - typings.awsSdk.awsSdkStrings.TEXT_INVALID_MESSAGE
  - typings.awsSdk.awsSdkStrings.TEXT_UNREACHABLE
  - typings.awsSdk.awsSdkStrings.TEXT_CARRIER_UNREACHABLE
  - typings.awsSdk.awsSdkStrings.TEXT_BLOCKED
  - typings.awsSdk.awsSdkStrings.TEXT_CARRIER_BLOCKED
  - typings.awsSdk.awsSdkStrings.TEXT_SPAM
  - typings.awsSdk.awsSdkStrings.TEXT_UNKNOWN
  - typings.awsSdk.awsSdkStrings.TEXT_TTL_EXPIRED
  - typings.awsSdk.awsSdkStrings.VOICE_ALL
  - typings.awsSdk.awsSdkStrings.VOICE_INITIATED
  - typings.awsSdk.awsSdkStrings.VOICE_RINGING
  - typings.awsSdk.awsSdkStrings.VOICE_ANSWERED
  - typings.awsSdk.awsSdkStrings.VOICE_COMPLETED
  - typings.awsSdk.awsSdkStrings.VOICE_BUSY
  - typings.awsSdk.awsSdkStrings.VOICE_NO_ANSWER
  - typings.awsSdk.awsSdkStrings.VOICE_FAILED
  - typings.awsSdk.awsSdkStrings.VOICE_TTL_EXPIRED
  - java.lang.String
*/
type EventType = _EventType | java.lang.String

type EventTypeList = js.Array[EventType]

type FilterValue = java.lang.String

type FilterValueList = js.Array[FilterValue]

type IamRoleArn = java.lang.String

type IsoCountryCode = java.lang.String

type Keyword = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTOMATIC_RESPONSE
  - typings.awsSdk.awsSdkStrings.OPT_OUT
  - typings.awsSdk.awsSdkStrings.OPT_IN
  - java.lang.String
*/
type KeywordAction = _KeywordAction | java.lang.String

type KeywordFilterList = js.Array[KeywordFilter]

type KeywordFilterName = `keyword-action` | java.lang.String

type KeywordInformationList = js.Array[KeywordInformation]

type KeywordList = js.Array[Keyword]

type KeywordMessage = java.lang.String

type LogGroupArn = java.lang.String

type MaxPrice = java.lang.String

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRANSACTIONAL
  - typings.awsSdk.awsSdkStrings.PROMOTIONAL
  - java.lang.String
*/
type MessageType = _MessageType | java.lang.String

type MessageTypeList = js.Array[MessageType]

type MonthlyLimit = Double

type NextToken = java.lang.String

type NonEmptyTagList = js.Array[Tag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SMS
  - typings.awsSdk.awsSdkStrings.VOICE
  - java.lang.String
*/
type NumberCapability = _NumberCapability | java.lang.String

type NumberCapabilityList = js.Array[NumberCapability]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.ASSOCIATING
  - typings.awsSdk.awsSdkStrings.DISASSOCIATING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type NumberStatus = _NumberStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SHORT_CODE
  - typings.awsSdk.awsSdkStrings.LONG_CODE
  - typings.awsSdk.awsSdkStrings.TOLL_FREE
  - typings.awsSdk.awsSdkStrings.TEN_DLC
  - java.lang.String
*/
type NumberType = _NumberType | java.lang.String

type OptOutListInformationList = js.Array[OptOutListInformation]

type OptOutListName = java.lang.String

type OptOutListNameList = js.Array[OptOutListNameOrArn]

type OptOutListNameOrArn = java.lang.String

type OptedOutFilterList = js.Array[OptedOutFilter]

type OptedOutFilterName = `end-user-opted-out` | java.lang.String

type OptedOutNumberInformationList = js.Array[OptedOutNumberInformation]

type OptedOutNumberList = js.Array[PhoneNumber]

type OriginationIdentityMetadataList = js.Array[OriginationIdentityMetadata]

type PhoneNumber = java.lang.String

type PhoneNumberFilterList = js.Array[PhoneNumberFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.status__
  - typings.awsSdk.awsSdkStrings.`iso-country-code`
  - typings.awsSdk.awsSdkStrings.`message-type`
  - typings.awsSdk.awsSdkStrings.`number-capability`
  - typings.awsSdk.awsSdkStrings.`number-type`
  - typings.awsSdk.awsSdkStrings.`two-way-enabled`
  - typings.awsSdk.awsSdkStrings.`self-managed-opt-outs-enabled`
  - typings.awsSdk.awsSdkStrings.`opt-out-list-name`
  - typings.awsSdk.awsSdkStrings.`deletion-protection-enabled`
  - java.lang.String
*/
type PhoneNumberFilterName = _PhoneNumberFilterName | java.lang.String

type PhoneNumberIdList = js.Array[PhoneNumberIdOrArn]

type PhoneNumberIdOrArn = java.lang.String

type PhoneNumberInformationList = js.Array[PhoneNumberInformation]

type PhoneOrPoolIdOrArn = java.lang.String

type PhoneOrSenderIdOrArn = java.lang.String

type PoolFilterList = js.Array[PoolFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.status__
  - typings.awsSdk.awsSdkStrings.`message-type`
  - typings.awsSdk.awsSdkStrings.`two-way-enabled`
  - typings.awsSdk.awsSdkStrings.`self-managed-opt-outs-enabled`
  - typings.awsSdk.awsSdkStrings.`opt-out-list-name`
  - typings.awsSdk.awsSdkStrings.`shared-routes-enabled`
  - typings.awsSdk.awsSdkStrings.`deletion-protection-enabled`
  - java.lang.String
*/
type PoolFilterName = _PoolFilterName | java.lang.String

type PoolIdList = js.Array[PoolIdOrArn]

type PoolIdOrArn = java.lang.String

type PoolInformationList = js.Array[PoolInformation]

type PoolOriginationIdentitiesFilterList = js.Array[PoolOriginationIdentitiesFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`iso-country-code`
  - typings.awsSdk.awsSdkStrings.`number-capability`
  - java.lang.String
*/
type PoolOriginationIdentitiesFilterName = _PoolOriginationIdentitiesFilterName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type PoolStatus = _PoolStatus | java.lang.String

type PrimitiveBoolean = scala.Boolean

type PrimitiveLong = Double

type RegistrationId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LONG_CODE
  - typings.awsSdk.awsSdkStrings.TOLL_FREE
  - typings.awsSdk.awsSdkStrings.TEN_DLC
  - java.lang.String
*/
type RequestableNumberType = _RequestableNumberType | java.lang.String

type SenderId = java.lang.String

type SenderIdFilterList = js.Array[SenderIdFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`sender-id`
  - typings.awsSdk.awsSdkStrings.`iso-country-code`
  - typings.awsSdk.awsSdkStrings.`message-type`
  - java.lang.String
*/
type SenderIdFilterName = _SenderIdFilterName | java.lang.String

type SenderIdInformationList = js.Array[SenderIdInformation]

type SenderIdList = js.Array[SenderIdAndCountry]

type SenderIdOrArn = java.lang.String

type SnsTopicArn = java.lang.String

type SpendLimitList = js.Array[SpendLimit]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TEXT_MESSAGE_MONTHLY_SPEND_LIMIT
  - typings.awsSdk.awsSdkStrings.VOICE_MESSAGE_MONTHLY_SPEND_LIMIT
  - java.lang.String
*/
type SpendLimitName = _SpendLimitName | java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TextMessageBody = java.lang.String

type TextMessageOriginationIdentity = java.lang.String

type TimeToLive = Double

type Timestamp = js.Date

type TwoWayChannelArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AMY
  - typings.awsSdk.awsSdkStrings.ASTRID
  - typings.awsSdk.awsSdkStrings.BIANCA
  - typings.awsSdk.awsSdkStrings.BRIAN
  - typings.awsSdk.awsSdkStrings.CAMILA
  - typings.awsSdk.awsSdkStrings.CARLA
  - typings.awsSdk.awsSdkStrings.CARMEN
  - typings.awsSdk.awsSdkStrings.CELINE
  - typings.awsSdk.awsSdkStrings.CHANTAL
  - typings.awsSdk.awsSdkStrings.CONCHITA
  - typings.awsSdk.awsSdkStrings.CRISTIANO
  - typings.awsSdk.awsSdkStrings.DORA
  - typings.awsSdk.awsSdkStrings.EMMA
  - typings.awsSdk.awsSdkStrings.ENRIQUE
  - typings.awsSdk.awsSdkStrings.EWA
  - typings.awsSdk.awsSdkStrings.FILIZ
  - typings.awsSdk.awsSdkStrings.GERAINT
  - typings.awsSdk.awsSdkStrings.GIORGIO
  - typings.awsSdk.awsSdkStrings.GWYNETH
  - typings.awsSdk.awsSdkStrings.HANS
  - typings.awsSdk.awsSdkStrings.INES
  - typings.awsSdk.awsSdkStrings.IVY
  - typings.awsSdk.awsSdkStrings.JACEK
  - typings.awsSdk.awsSdkStrings.JAN
  - typings.awsSdk.awsSdkStrings.JOANNA
  - typings.awsSdk.awsSdkStrings.JOEY
  - typings.awsSdk.awsSdkStrings.JUSTIN
  - typings.awsSdk.awsSdkStrings.KARL
  - typings.awsSdk.awsSdkStrings.KENDRA
  - typings.awsSdk.awsSdkStrings.KIMBERLY
  - typings.awsSdk.awsSdkStrings.LEA
  - typings.awsSdk.awsSdkStrings.LIV
  - typings.awsSdk.awsSdkStrings.LOTTE
  - typings.awsSdk.awsSdkStrings.LUCIA
  - typings.awsSdk.awsSdkStrings.LUPE
  - typings.awsSdk.awsSdkStrings.MADS
  - typings.awsSdk.awsSdkStrings.MAJA
  - typings.awsSdk.awsSdkStrings.MARLENE
  - typings.awsSdk.awsSdkStrings.MATHIEU
  - typings.awsSdk.awsSdkStrings.MATTHEW
  - typings.awsSdk.awsSdkStrings.MAXIM
  - typings.awsSdk.awsSdkStrings.MIA
  - typings.awsSdk.awsSdkStrings.MIGUEL
  - typings.awsSdk.awsSdkStrings.MIZUKI
  - typings.awsSdk.awsSdkStrings.NAJA
  - typings.awsSdk.awsSdkStrings.NICOLE
  - typings.awsSdk.awsSdkStrings.PENELOPE
  - typings.awsSdk.awsSdkStrings.RAVEENA
  - typings.awsSdk.awsSdkStrings.RICARDO
  - typings.awsSdk.awsSdkStrings.RUBEN
  - typings.awsSdk.awsSdkStrings.RUSSELL
  - typings.awsSdk.awsSdkStrings.SALLI
  - typings.awsSdk.awsSdkStrings.SEOYEON
  - typings.awsSdk.awsSdkStrings.TAKUMI
  - typings.awsSdk.awsSdkStrings.TATYANA
  - typings.awsSdk.awsSdkStrings.VICKI
  - typings.awsSdk.awsSdkStrings.VITORIA
  - typings.awsSdk.awsSdkStrings.ZEINA
  - typings.awsSdk.awsSdkStrings.ZHIYU
  - java.lang.String
*/
type VoiceId = _VoiceId | java.lang.String

type VoiceMessageBody = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TEXT
  - typings.awsSdk.awsSdkStrings.SSML
  - java.lang.String
*/
type VoiceMessageBodyTextType = _VoiceMessageBodyTextType | java.lang.String

type VoiceMessageOriginationIdentity = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2022-03-31`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
