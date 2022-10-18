package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.EAP_TLS
import typings.awsSdk.awsSdkStrings.VOICE
import typings.awsSdk.awsSdkStrings.WORK
import typings.awsSdk.awsSdkStrings.`en-US`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Address = String

type AddressBookDataList = js.Array[AddressBookData]

type AddressBookDescription = String

type AddressBookName = String

type AmazonId = String

type ApplianceDescription = String

type ApplianceFriendlyName = String

type ApplianceManufacturerName = String

type Arn = String

type AudioList = js.Array[Audio]

type AudioLocation = String

type AuthorizationResult = StringDictionary[Value]

type Boolean = scala.Boolean

type BulletPoint = String

type BulletPoints = js.Array[BulletPoint]

type BusinessReportDeliveryTime = js.Date

type BusinessReportDownloadUrl = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.NO_SUCH_BUCKET
  - typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - java.lang.String
*/
type BusinessReportFailureCode = _BusinessReportFailureCode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.CSV_ZIP
  - java.lang.String
*/
type BusinessReportFormat = _BusinessReportFormat | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ONE_DAY
  - typings.awsSdk.awsSdkStrings.ONE_WEEK
  - typings.awsSdk.awsSdkStrings.THIRTY_DAYS
  - java.lang.String
*/
type BusinessReportInterval = _BusinessReportInterval | String

type BusinessReportS3Path = String

type BusinessReportScheduleList = js.Array[BusinessReportSchedule]

type BusinessReportScheduleName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type BusinessReportStatus = _BusinessReportStatus | String

type CategoryId = Double

type CategoryList = js.Array[Category]

type CategoryName = String

type CertificateTime = js.Date

type ClientId = String

type ClientRequestToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SIP
  - typings.awsSdk.awsSdkStrings.SIPS
  - typings.awsSdk.awsSdkStrings.H323
  - java.lang.String
*/
type CommsProtocol = _CommsProtocol | String

type ConferenceProviderName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CHIME
  - typings.awsSdk.awsSdkStrings.BLUEJEANS
  - typings.awsSdk.awsSdkStrings.FUZE
  - typings.awsSdk.awsSdkStrings.GOOGLE_HANGOUTS
  - typings.awsSdk.awsSdkStrings.POLYCOM
  - typings.awsSdk.awsSdkStrings.RINGCENTRAL
  - typings.awsSdk.awsSdkStrings.SKYPE_FOR_BUSINESS
  - typings.awsSdk.awsSdkStrings.WEBEX
  - typings.awsSdk.awsSdkStrings.ZOOM
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type ConferenceProviderType = _ConferenceProviderType | String

type ConferenceProvidersList = js.Array[ConferenceProvider]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ONLINE
  - typings.awsSdk.awsSdkStrings.OFFLINE
  - java.lang.String
*/
type ConnectionStatus = _ConnectionStatus | String

type ConnectionStatusUpdatedTime = js.Date

type ContactDataList = js.Array[ContactData]

type ContactName = String

type CountryCode = String

type CurrentWiFiPassword = String

type CustomerS3BucketName = String

type Date = String

type DeveloperName = String

type DeviceDataCreatedTime = js.Date

type DeviceDataList = js.Array[DeviceData]

type DeviceEventList = js.Array[DeviceEvent]

type DeviceEventTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONNECTION_STATUS
  - typings.awsSdk.awsSdkStrings.DEVICE_STATUS
  - java.lang.String
*/
type DeviceEventType = _DeviceEventType | String

type DeviceEventValue = String

type DeviceLocale = String

type DeviceName = String

type DeviceRoomName = String

type DeviceSerialNumber = String

type DeviceSerialNumberForAVS = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.WAS_OFFLINE
  - typings.awsSdk.awsSdkStrings.DEREGISTERED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type DeviceStatus = _DeviceStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEVICE_SOFTWARE_UPDATE_NEEDED
  - typings.awsSdk.awsSdkStrings.DEVICE_WAS_OFFLINE
  - typings.awsSdk.awsSdkStrings.CREDENTIALS_ACCESS_FAILURE
  - typings.awsSdk.awsSdkStrings.TLS_VERSION_MISMATCH
  - typings.awsSdk.awsSdkStrings.ASSOCIATION_REJECTION
  - typings.awsSdk.awsSdkStrings.AUTHENTICATION_FAILURE
  - typings.awsSdk.awsSdkStrings.DHCP_FAILURE
  - typings.awsSdk.awsSdkStrings.INTERNET_UNAVAILABLE
  - typings.awsSdk.awsSdkStrings.DNS_FAILURE
  - typings.awsSdk.awsSdkStrings.UNKNOWN_FAILURE
  - typings.awsSdk.awsSdkStrings.CERTIFICATE_ISSUING_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.INVALID_CERTIFICATE_AUTHORITY
  - typings.awsSdk.awsSdkStrings.NETWORK_PROFILE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.INVALID_PASSWORD_STATE
  - typings.awsSdk.awsSdkStrings.PASSWORD_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.PASSWORD_MANAGER_ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.CERTIFICATE_AUTHORITY_ACCESS_DENIED
  - java.lang.String
*/
type DeviceStatusDetailCode = _DeviceStatusDetailCode | String

type DeviceStatusDetails = js.Array[DeviceStatusDetail]

type DeviceType = String

type DeviceUsageType = VOICE | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.METRIC
  - typings.awsSdk.awsSdkStrings.IMPERIAL
  - java.lang.String
*/
type DistanceUnit = _DistanceUnit | String

type Email = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type EnablementType = _EnablementType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type EnablementTypeFilter = _EnablementTypeFilter | String

type EndOfMeetingReminderMinutesList = js.Array[Minutes]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ANNOUNCEMENT_TIME_CHECK
  - typings.awsSdk.awsSdkStrings.ANNOUNCEMENT_VARIABLE_TIME_LEFT
  - typings.awsSdk.awsSdkStrings.CHIME
  - typings.awsSdk.awsSdkStrings.KNOCK
  - java.lang.String
*/
type EndOfMeetingReminderType = _EndOfMeetingReminderType | String

type EndUserLicenseAgreement = String

type Endpoint = String

type EnrollmentId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIALIZED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.REGISTERED
  - typings.awsSdk.awsSdkStrings.DISASSOCIATING
  - typings.awsSdk.awsSdkStrings.DEREGISTERING
  - java.lang.String
*/
type EnrollmentStatus = _EnrollmentStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BLUETOOTH
  - typings.awsSdk.awsSdkStrings.VOLUME
  - typings.awsSdk.awsSdkStrings.NOTIFICATIONS
  - typings.awsSdk.awsSdkStrings.LISTS
  - typings.awsSdk.awsSdkStrings.SKILLS
  - typings.awsSdk.awsSdkStrings.NETWORK_PROFILE
  - typings.awsSdk.awsSdkStrings.SETTINGS
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type Feature = _Feature | String

type Features = js.Array[Feature]

type FilterKey = String

type FilterList = js.Array[Filter]

type FilterValue = String

type FilterValueList = js.Array[FilterValue]

type GatewayDescription = String

type GatewayGroupDescription = String

type GatewayGroupName = String

type GatewayGroupSummaries = js.Array[GatewayGroupSummary]

type GatewayName = String

type GatewaySummaries = js.Array[GatewaySummary]

type GatewayVersion = String

type GenericKeyword = String

type GenericKeywords = js.Array[GenericKeyword]

type IconUrl = String

type InvocationPhrase = String

type Key = String

type Locale = `en-US` | String

type MacAddress = String

type MaxResults = Double

type MaxVolumeLimit = Double

type Minutes = Double

type NetworkEapMethod = EAP_TLS | String

type NetworkProfileDataList = js.Array[NetworkProfileData]

type NetworkProfileDescription = String

type NetworkProfileName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OPEN
  - typings.awsSdk.awsSdkStrings.WEP
  - typings.awsSdk.awsSdkStrings.WPA_PSK
  - typings.awsSdk.awsSdkStrings.WPA2_PSK
  - typings.awsSdk.awsSdkStrings.WPA2_ENTERPRISE
  - java.lang.String
*/
type NetworkSecurityType = _NetworkSecurityType | String

type NetworkSsid = String

type NewInThisVersionBulletPoints = js.Array[BulletPoint]

type NextToken = String

type NextWiFiPassword = String

type OneClickIdDelay = String

type OneClickPinDelay = String

type OrganizationName = String

type OutboundPhoneNumber = String

type PhoneNumberList = js.Array[PhoneNumber]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MOBILE
  - typings.awsSdk.awsSdkStrings.WORK
  - typings.awsSdk.awsSdkStrings.HOME
  - java.lang.String
*/
type PhoneNumberType = _PhoneNumberType | String

type PrivacyPolicy = String

type ProductDescription = String

type ProductId = String

type ProfileDataList = js.Array[ProfileData]

type ProfileName = String

type ProviderCalendarId = String

type RawPhoneNumber = String

type ReleaseDate = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.YES
  - typings.awsSdk.awsSdkStrings.NO
  - typings.awsSdk.awsSdkStrings.OPTIONAL
  - java.lang.String
*/
type RequirePin = _RequirePin | String

type ReviewKey = String

type ReviewValue = String

type Reviews = StringDictionary[ReviewValue]

type RoomDataList = js.Array[RoomData]

type RoomDescription = String

type RoomName = String

type RoomSkillParameterKey = String

type RoomSkillParameterValue = String

type RoomSkillParameters = js.Array[RoomSkillParameter]

type S3KeyPrefix = String

type SampleUtterances = js.Array[Utterance]

type ShortDescription = String

type ShortSkillIdList = js.Array[SkillId]

type SipAddressList = js.Array[SipAddress]

type SipType = WORK | String

type SipUri = String

type SkillGroupDataList = js.Array[SkillGroupData]

type SkillGroupDescription = String

type SkillGroupName = String

type SkillId = String

type SkillListMaxResults = Double

type SkillName = String

type SkillStoreType = String

type SkillSummaryList = js.Array[SkillSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLIC
  - typings.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type SkillType = _SkillType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLIC
  - typings.awsSdk.awsSdkStrings.PRIVATE
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type SkillTypeFilter = _SkillTypeFilter | String

type SkillTypes = js.Array[SkillStoreType]

type SkillsStoreSkillList = js.Array[SkillsStoreSkill]

type SmartHomeApplianceList = js.Array[SmartHomeAppliance]

type SoftwareVersion = String

type SortKey = String

type SortList = js.Array[Sort]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASC
  - typings.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type SortValue = _SortValue | String

type SsmlList = js.Array[Ssml]

type SsmlValue = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAHRENHEIT
  - typings.awsSdk.awsSdkStrings.CELSIUS
  - java.lang.String
*/
type TemperatureUnit = _TemperatureUnit | String

type TextList = js.Array[Text]

type TextValue = String

type TimeToLiveInSeconds = Double

type Timezone = String

type TotalCount = Double

type TrustAnchor = String

type TrustAnchorList = js.Array[TrustAnchor]

type Url = String

type UserCode = String

type UserDataList = js.Array[UserData]

type UserId = String

type Utterance = String

type Value = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALEXA
  - typings.awsSdk.awsSdkStrings.AMAZON
  - typings.awsSdk.awsSdkStrings.ECHO
  - typings.awsSdk.awsSdkStrings.COMPUTER
  - java.lang.String
*/
type WakeWord = _WakeWord | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-11-09`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type userFirstName = String

type userLastName = String

type userUserId = String
