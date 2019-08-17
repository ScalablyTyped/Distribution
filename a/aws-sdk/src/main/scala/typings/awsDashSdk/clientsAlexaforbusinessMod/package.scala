package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAlexaforbusinessMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.EAP_TLS
  import typings.awsDashSdk.awsDashSdkStrings.VOICE
  import typings.awsDashSdk.awsDashSdkStrings.WORK
  import typings.awsDashSdk.awsDashSdkStrings.`en-US`
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

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
  type BusinessReportDeliveryTime = Date
  type BusinessReportDownloadUrl = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACCESS_DENIED
    - typings.awsDashSdk.awsDashSdkStrings.NO_SUCH_BUCKET
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_FAILURE
    - java.lang.String
  */
  type BusinessReportFailureCode = _BusinessReportFailureCode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CSV
    - typings.awsDashSdk.awsDashSdkStrings.CSV_ZIP
    - java.lang.String
  */
  type BusinessReportFormat = _BusinessReportFormat | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ONE_DAY
    - typings.awsDashSdk.awsDashSdkStrings.ONE_WEEK
    - java.lang.String
  */
  type BusinessReportInterval = _BusinessReportInterval | String
  type BusinessReportS3Path = String
  type BusinessReportScheduleList = js.Array[BusinessReportSchedule]
  type BusinessReportScheduleName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type BusinessReportStatus = _BusinessReportStatus | String
  type CategoryId = Double
  type CategoryList = js.Array[Category]
  type CategoryName = String
  type CertificateTime = Date
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientId = String
  type ClientRequestToken = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SIP
    - typings.awsDashSdk.awsDashSdkStrings.SIPS
    - typings.awsDashSdk.awsDashSdkStrings.H323
    - java.lang.String
  */
  type CommsProtocol = _CommsProtocol | String
  type ConferenceProviderName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CHIME
    - typings.awsDashSdk.awsDashSdkStrings.BLUEJEANS
    - typings.awsDashSdk.awsDashSdkStrings.FUZE
    - typings.awsDashSdk.awsDashSdkStrings.GOOGLE_HANGOUTS
    - typings.awsDashSdk.awsDashSdkStrings.POLYCOM
    - typings.awsDashSdk.awsDashSdkStrings.RINGCENTRAL
    - typings.awsDashSdk.awsDashSdkStrings.SKYPE_FOR_BUSINESS
    - typings.awsDashSdk.awsDashSdkStrings.WEBEX
    - typings.awsDashSdk.awsDashSdkStrings.ZOOM
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOM
    - java.lang.String
  */
  type ConferenceProviderType = _ConferenceProviderType | String
  type ConferenceProvidersList = js.Array[ConferenceProvider]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ONLINE
    - typings.awsDashSdk.awsDashSdkStrings.OFFLINE
    - java.lang.String
  */
  type ConnectionStatus = _ConnectionStatus | String
  type ContactDataList = js.Array[ContactData]
  type ContactName = String
  type CountryCode = String
  type CurrentWiFiPassword = String
  type CustomerS3BucketName = String
  type DeveloperName = String
  type DeviceDataList = js.Array[DeviceData]
  type DeviceEventList = js.Array[DeviceEvent]
  type DeviceEventTime = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONNECTION_STATUS
    - typings.awsDashSdk.awsDashSdkStrings.DEVICE_STATUS
    - java.lang.String
  */
  type DeviceEventType = _DeviceEventType | String
  type DeviceEventValue = String
  type DeviceName = String
  type DeviceSerialNumber = String
  type DeviceSerialNumberForAVS = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.READY
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.WAS_OFFLINE
    - typings.awsDashSdk.awsDashSdkStrings.DEREGISTERED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type DeviceStatus = _DeviceStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEVICE_SOFTWARE_UPDATE_NEEDED
    - typings.awsDashSdk.awsDashSdkStrings.DEVICE_WAS_OFFLINE
    - typings.awsDashSdk.awsDashSdkStrings.CREDENTIALS_ACCESS_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.TLS_VERSION_MISMATCH
    - typings.awsDashSdk.awsDashSdkStrings.ASSOCIATION_REJECTION
    - typings.awsDashSdk.awsDashSdkStrings.AUTHENTICATION_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.DHCP_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.INTERNET_UNAVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.DNS_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.CERTIFICATE_ISSUING_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_CERTIFICATE_AUTHORITY
    - typings.awsDashSdk.awsDashSdkStrings.NETWORK_PROFILE_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_PASSWORD_STATE
    - typings.awsDashSdk.awsDashSdkStrings.PASSWORD_NOT_FOUND
    - java.lang.String
  */
  type DeviceStatusDetailCode = _DeviceStatusDetailCode | String
  type DeviceStatusDetails = js.Array[DeviceStatusDetail]
  type DeviceType = String
  type DeviceUsageType = VOICE | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.METRIC
    - typings.awsDashSdk.awsDashSdkStrings.IMPERIAL
    - java.lang.String
  */
  type DistanceUnit = _DistanceUnit | String
  type Email = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - java.lang.String
  */
  type EnablementType = _EnablementType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - java.lang.String
  */
  type EnablementTypeFilter = _EnablementTypeFilter | String
  type EndUserLicenseAgreement = String
  type Endpoint = String
  type EnrollmentId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INITIALIZED
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.REGISTERED
    - typings.awsDashSdk.awsDashSdkStrings.DISASSOCIATING
    - typings.awsDashSdk.awsDashSdkStrings.DEREGISTERING
    - java.lang.String
  */
  type EnrollmentStatus = _EnrollmentStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BLUETOOTH
    - typings.awsDashSdk.awsDashSdkStrings.VOLUME
    - typings.awsDashSdk.awsDashSdkStrings.NOTIFICATIONS
    - typings.awsDashSdk.awsDashSdkStrings.LISTS
    - typings.awsDashSdk.awsDashSdkStrings.SKILLS
    - typings.awsDashSdk.awsDashSdkStrings.NETWORK_PROFILE
    - typings.awsDashSdk.awsDashSdkStrings.SETTINGS
    - typings.awsDashSdk.awsDashSdkStrings.ALL
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
  type NetworkEapMethod = EAP_TLS | String
  type NetworkProfileDataList = js.Array[NetworkProfileData]
  type NetworkProfileDescription = String
  type NetworkProfileName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OPEN
    - typings.awsDashSdk.awsDashSdkStrings.WEP
    - typings.awsDashSdk.awsDashSdkStrings.WPA_PSK
    - typings.awsDashSdk.awsDashSdkStrings.WPA2_PSK
    - typings.awsDashSdk.awsDashSdkStrings.WPA2_ENTERPRISE
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
    - typings.awsDashSdk.awsDashSdkStrings.MOBILE
    - typings.awsDashSdk.awsDashSdkStrings.WORK
    - typings.awsDashSdk.awsDashSdkStrings.HOME
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
    - typings.awsDashSdk.awsDashSdkStrings.YES
    - typings.awsDashSdk.awsDashSdkStrings.NO
    - typings.awsDashSdk.awsDashSdkStrings.OPTIONAL
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
    - typings.awsDashSdk.awsDashSdkStrings.PUBLIC
    - typings.awsDashSdk.awsDashSdkStrings.PRIVATE
    - java.lang.String
  */
  type SkillType = _SkillType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PUBLIC
    - typings.awsDashSdk.awsDashSdkStrings.PRIVATE
    - typings.awsDashSdk.awsDashSdkStrings.ALL
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
    - typings.awsDashSdk.awsDashSdkStrings.ASC
    - typings.awsDashSdk.awsDashSdkStrings.DESC
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
    - typings.awsDashSdk.awsDashSdkStrings.FAHRENHEIT
    - typings.awsDashSdk.awsDashSdkStrings.CELSIUS
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
    - typings.awsDashSdk.awsDashSdkStrings.ALEXA
    - typings.awsDashSdk.awsDashSdkStrings.AMAZON
    - typings.awsDashSdk.awsDashSdkStrings.ECHO
    - typings.awsDashSdk.awsDashSdkStrings.COMPUTER
    - java.lang.String
  */
  type WakeWord = _WakeWord | String
  type _Date = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-11-09`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type user_FirstName = String
  type user_LastName = String
  type user_UserId = String
}
