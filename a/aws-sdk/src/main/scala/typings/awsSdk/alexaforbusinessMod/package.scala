package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object alexaforbusinessMod {
  
  type Address = java.lang.String
  
  type AddressBookDataList = js.Array[typings.awsSdk.alexaforbusinessMod.AddressBookData]
  
  type AddressBookDescription = java.lang.String
  
  type AddressBookName = java.lang.String
  
  type AmazonId = java.lang.String
  
  type ApplianceDescription = java.lang.String
  
  type ApplianceFriendlyName = java.lang.String
  
  type ApplianceManufacturerName = java.lang.String
  
  type Arn = java.lang.String
  
  type AudioList = js.Array[typings.awsSdk.alexaforbusinessMod.Audio]
  
  type AudioLocation = java.lang.String
  
  type AuthorizationResult = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.alexaforbusinessMod.Value]
  
  type Boolean = scala.Boolean
  
  type BulletPoint = java.lang.String
  
  type BulletPoints = js.Array[typings.awsSdk.alexaforbusinessMod.BulletPoint]
  
  type BusinessReportDeliveryTime = typings.std.Date
  
  type BusinessReportDownloadUrl = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
    - typings.awsSdk.awsSdkStrings.NO_SUCH_BUCKET
    - typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
    - java.lang.String
  */
  type BusinessReportFailureCode = typings.awsSdk.alexaforbusinessMod._BusinessReportFailureCode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CSV
    - typings.awsSdk.awsSdkStrings.CSV_ZIP
    - java.lang.String
  */
  type BusinessReportFormat = typings.awsSdk.alexaforbusinessMod._BusinessReportFormat | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ONE_DAY
    - typings.awsSdk.awsSdkStrings.ONE_WEEK
    - typings.awsSdk.awsSdkStrings.THIRTY_DAYS
    - java.lang.String
  */
  type BusinessReportInterval = typings.awsSdk.alexaforbusinessMod._BusinessReportInterval | java.lang.String
  
  type BusinessReportS3Path = java.lang.String
  
  type BusinessReportScheduleList = js.Array[typings.awsSdk.alexaforbusinessMod.BusinessReportSchedule]
  
  type BusinessReportScheduleName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type BusinessReportStatus = typings.awsSdk.alexaforbusinessMod._BusinessReportStatus | java.lang.String
  
  type CategoryId = scala.Double
  
  type CategoryList = js.Array[typings.awsSdk.alexaforbusinessMod.Category]
  
  type CategoryName = java.lang.String
  
  type CertificateTime = typings.std.Date
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.alexaforbusinessMod.ClientApiVersions
  
  type ClientId = java.lang.String
  
  type ClientRequestToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SIP
    - typings.awsSdk.awsSdkStrings.SIPS
    - typings.awsSdk.awsSdkStrings.H323
    - java.lang.String
  */
  type CommsProtocol = typings.awsSdk.alexaforbusinessMod._CommsProtocol | java.lang.String
  
  type ConferenceProviderName = java.lang.String
  
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
  type ConferenceProviderType = typings.awsSdk.alexaforbusinessMod._ConferenceProviderType | java.lang.String
  
  type ConferenceProvidersList = js.Array[typings.awsSdk.alexaforbusinessMod.ConferenceProvider]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ONLINE
    - typings.awsSdk.awsSdkStrings.OFFLINE
    - java.lang.String
  */
  type ConnectionStatus = typings.awsSdk.alexaforbusinessMod._ConnectionStatus | java.lang.String
  
  type ConnectionStatusUpdatedTime = typings.std.Date
  
  type ContactDataList = js.Array[typings.awsSdk.alexaforbusinessMod.ContactData]
  
  type ContactName = java.lang.String
  
  type CountryCode = java.lang.String
  
  type CurrentWiFiPassword = java.lang.String
  
  type CustomerS3BucketName = java.lang.String
  
  type Date = java.lang.String
  
  type DeveloperName = java.lang.String
  
  type DeviceDataCreatedTime = typings.std.Date
  
  type DeviceDataList = js.Array[typings.awsSdk.alexaforbusinessMod.DeviceData]
  
  type DeviceEventList = js.Array[typings.awsSdk.alexaforbusinessMod.DeviceEvent]
  
  type DeviceEventTime = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CONNECTION_STATUS
    - typings.awsSdk.awsSdkStrings.DEVICE_STATUS
    - java.lang.String
  */
  type DeviceEventType = typings.awsSdk.alexaforbusinessMod._DeviceEventType | java.lang.String
  
  type DeviceEventValue = java.lang.String
  
  type DeviceLocale = java.lang.String
  
  type DeviceName = java.lang.String
  
  type DeviceRoomName = java.lang.String
  
  type DeviceSerialNumber = java.lang.String
  
  type DeviceSerialNumberForAVS = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.READY
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.WAS_OFFLINE
    - typings.awsSdk.awsSdkStrings.DEREGISTERED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type DeviceStatus = typings.awsSdk.alexaforbusinessMod._DeviceStatus | java.lang.String
  
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
  type DeviceStatusDetailCode = typings.awsSdk.alexaforbusinessMod._DeviceStatusDetailCode | java.lang.String
  
  type DeviceStatusDetails = js.Array[typings.awsSdk.alexaforbusinessMod.DeviceStatusDetail]
  
  type DeviceType = java.lang.String
  
  type DeviceUsageType = typings.awsSdk.awsSdkStrings.VOICE | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.METRIC
    - typings.awsSdk.awsSdkStrings.IMPERIAL
    - java.lang.String
  */
  type DistanceUnit = typings.awsSdk.alexaforbusinessMod._DistanceUnit | java.lang.String
  
  type Email = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type EnablementType = typings.awsSdk.alexaforbusinessMod._EnablementType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type EnablementTypeFilter = typings.awsSdk.alexaforbusinessMod._EnablementTypeFilter | java.lang.String
  
  type EndOfMeetingReminderMinutesList = js.Array[typings.awsSdk.alexaforbusinessMod.Minutes]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ANNOUNCEMENT_TIME_CHECK
    - typings.awsSdk.awsSdkStrings.ANNOUNCEMENT_VARIABLE_TIME_LEFT
    - typings.awsSdk.awsSdkStrings.CHIME
    - typings.awsSdk.awsSdkStrings.KNOCK
    - java.lang.String
  */
  type EndOfMeetingReminderType = typings.awsSdk.alexaforbusinessMod._EndOfMeetingReminderType | java.lang.String
  
  type EndUserLicenseAgreement = java.lang.String
  
  type Endpoint = java.lang.String
  
  type EnrollmentId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INITIALIZED
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.REGISTERED
    - typings.awsSdk.awsSdkStrings.DISASSOCIATING
    - typings.awsSdk.awsSdkStrings.DEREGISTERING
    - java.lang.String
  */
  type EnrollmentStatus = typings.awsSdk.alexaforbusinessMod._EnrollmentStatus | java.lang.String
  
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
  type Feature = typings.awsSdk.alexaforbusinessMod._Feature | java.lang.String
  
  type Features = js.Array[typings.awsSdk.alexaforbusinessMod.Feature]
  
  type FilterKey = java.lang.String
  
  type FilterList = js.Array[typings.awsSdk.alexaforbusinessMod.Filter]
  
  type FilterValue = java.lang.String
  
  type FilterValueList = js.Array[typings.awsSdk.alexaforbusinessMod.FilterValue]
  
  type GatewayDescription = java.lang.String
  
  type GatewayGroupDescription = java.lang.String
  
  type GatewayGroupName = java.lang.String
  
  type GatewayGroupSummaries = js.Array[typings.awsSdk.alexaforbusinessMod.GatewayGroupSummary]
  
  type GatewayName = java.lang.String
  
  type GatewaySummaries = js.Array[typings.awsSdk.alexaforbusinessMod.GatewaySummary]
  
  type GatewayVersion = java.lang.String
  
  type GenericKeyword = java.lang.String
  
  type GenericKeywords = js.Array[typings.awsSdk.alexaforbusinessMod.GenericKeyword]
  
  type IconUrl = java.lang.String
  
  type InvocationPhrase = java.lang.String
  
  type Key = java.lang.String
  
  type Locale = typings.awsSdk.awsSdkStrings.`en-US` | java.lang.String
  
  type MacAddress = java.lang.String
  
  type MaxResults = scala.Double
  
  type MaxVolumeLimit = scala.Double
  
  type Minutes = scala.Double
  
  type NetworkEapMethod = typings.awsSdk.awsSdkStrings.EAP_TLS | java.lang.String
  
  type NetworkProfileDataList = js.Array[typings.awsSdk.alexaforbusinessMod.NetworkProfileData]
  
  type NetworkProfileDescription = java.lang.String
  
  type NetworkProfileName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OPEN
    - typings.awsSdk.awsSdkStrings.WEP
    - typings.awsSdk.awsSdkStrings.WPA_PSK
    - typings.awsSdk.awsSdkStrings.WPA2_PSK
    - typings.awsSdk.awsSdkStrings.WPA2_ENTERPRISE
    - java.lang.String
  */
  type NetworkSecurityType = typings.awsSdk.alexaforbusinessMod._NetworkSecurityType | java.lang.String
  
  type NetworkSsid = java.lang.String
  
  type NewInThisVersionBulletPoints = js.Array[typings.awsSdk.alexaforbusinessMod.BulletPoint]
  
  type NextToken = java.lang.String
  
  type NextWiFiPassword = java.lang.String
  
  type OneClickIdDelay = java.lang.String
  
  type OneClickPinDelay = java.lang.String
  
  type OrganizationName = java.lang.String
  
  type OutboundPhoneNumber = java.lang.String
  
  type PhoneNumberList = js.Array[typings.awsSdk.alexaforbusinessMod.PhoneNumber]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MOBILE
    - typings.awsSdk.awsSdkStrings.WORK
    - typings.awsSdk.awsSdkStrings.HOME
    - java.lang.String
  */
  type PhoneNumberType = typings.awsSdk.alexaforbusinessMod._PhoneNumberType | java.lang.String
  
  type PrivacyPolicy = java.lang.String
  
  type ProductDescription = java.lang.String
  
  type ProductId = java.lang.String
  
  type ProfileDataList = js.Array[typings.awsSdk.alexaforbusinessMod.ProfileData]
  
  type ProfileName = java.lang.String
  
  type ProviderCalendarId = java.lang.String
  
  type RawPhoneNumber = java.lang.String
  
  type ReleaseDate = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.YES
    - typings.awsSdk.awsSdkStrings.NO
    - typings.awsSdk.awsSdkStrings.OPTIONAL
    - java.lang.String
  */
  type RequirePin = typings.awsSdk.alexaforbusinessMod._RequirePin | java.lang.String
  
  type ReviewKey = java.lang.String
  
  type ReviewValue = java.lang.String
  
  type Reviews = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.alexaforbusinessMod.ReviewValue]
  
  type RoomDataList = js.Array[typings.awsSdk.alexaforbusinessMod.RoomData]
  
  type RoomDescription = java.lang.String
  
  type RoomName = java.lang.String
  
  type RoomSkillParameterKey = java.lang.String
  
  type RoomSkillParameterValue = java.lang.String
  
  type RoomSkillParameters = js.Array[typings.awsSdk.alexaforbusinessMod.RoomSkillParameter]
  
  type S3KeyPrefix = java.lang.String
  
  type SampleUtterances = js.Array[typings.awsSdk.alexaforbusinessMod.Utterance]
  
  type ShortDescription = java.lang.String
  
  type ShortSkillIdList = js.Array[typings.awsSdk.alexaforbusinessMod.SkillId]
  
  type SipAddressList = js.Array[typings.awsSdk.alexaforbusinessMod.SipAddress]
  
  type SipType = typings.awsSdk.awsSdkStrings.WORK | java.lang.String
  
  type SipUri = java.lang.String
  
  type SkillGroupDataList = js.Array[typings.awsSdk.alexaforbusinessMod.SkillGroupData]
  
  type SkillGroupDescription = java.lang.String
  
  type SkillGroupName = java.lang.String
  
  type SkillId = java.lang.String
  
  type SkillListMaxResults = scala.Double
  
  type SkillName = java.lang.String
  
  type SkillStoreType = java.lang.String
  
  type SkillSummaryList = js.Array[typings.awsSdk.alexaforbusinessMod.SkillSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PUBLIC
    - typings.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type SkillType = typings.awsSdk.alexaforbusinessMod._SkillType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PUBLIC
    - typings.awsSdk.awsSdkStrings.PRIVATE
    - typings.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type SkillTypeFilter = typings.awsSdk.alexaforbusinessMod._SkillTypeFilter | java.lang.String
  
  type SkillTypes = js.Array[typings.awsSdk.alexaforbusinessMod.SkillStoreType]
  
  type SkillsStoreSkillList = js.Array[typings.awsSdk.alexaforbusinessMod.SkillsStoreSkill]
  
  type SmartHomeApplianceList = js.Array[typings.awsSdk.alexaforbusinessMod.SmartHomeAppliance]
  
  type SoftwareVersion = java.lang.String
  
  type SortKey = java.lang.String
  
  type SortList = js.Array[typings.awsSdk.alexaforbusinessMod.Sort]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASC
    - typings.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type SortValue = typings.awsSdk.alexaforbusinessMod._SortValue | java.lang.String
  
  type SsmlList = js.Array[typings.awsSdk.alexaforbusinessMod.Ssml]
  
  type SsmlValue = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.alexaforbusinessMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.alexaforbusinessMod.Tag]
  
  type TagValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FAHRENHEIT
    - typings.awsSdk.awsSdkStrings.CELSIUS
    - java.lang.String
  */
  type TemperatureUnit = typings.awsSdk.alexaforbusinessMod._TemperatureUnit | java.lang.String
  
  type TextList = js.Array[typings.awsSdk.alexaforbusinessMod.Text]
  
  type TextValue = java.lang.String
  
  type TimeToLiveInSeconds = scala.Double
  
  type Timezone = java.lang.String
  
  type TotalCount = scala.Double
  
  type TrustAnchor = java.lang.String
  
  type TrustAnchorList = js.Array[typings.awsSdk.alexaforbusinessMod.TrustAnchor]
  
  type Url = java.lang.String
  
  type UserCode = java.lang.String
  
  type UserDataList = js.Array[typings.awsSdk.alexaforbusinessMod.UserData]
  
  type UserId = java.lang.String
  
  type Utterance = java.lang.String
  
  type Value = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALEXA
    - typings.awsSdk.awsSdkStrings.AMAZON
    - typings.awsSdk.awsSdkStrings.ECHO
    - typings.awsSdk.awsSdkStrings.COMPUTER
    - java.lang.String
  */
  type WakeWord = typings.awsSdk.alexaforbusinessMod._WakeWord | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-11-09`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.alexaforbusinessMod._apiVersion | java.lang.String
  
  type userFirstName = java.lang.String
  
  type userLastName = java.lang.String
  
  type userUserId = java.lang.String
}
