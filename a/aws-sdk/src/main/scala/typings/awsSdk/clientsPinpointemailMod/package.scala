package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmazonResourceName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USE_DEFAULT_VALUE
  - typings.awsSdk.awsSdkStrings.REJECT_MESSAGE
  - java.lang.String
*/
type BehaviorOnMxFailure = _BehaviorOnMxFailure | String

type BlacklistEntries = js.Array[BlacklistEntry]

type BlacklistItemName = String

type BlacklistItemNames = js.Array[BlacklistItemName]

type BlacklistReport = StringDictionary[BlacklistEntries]

type BlacklistingDescription = String

type CampaignId = String

type Charset = String

type CloudWatchDimensionConfigurations = js.Array[CloudWatchDimensionConfiguration]

type ConfigurationSetName = String

type ConfigurationSetNameList = js.Array[ConfigurationSetName]

type CustomRedirectDomain = String

type DailyVolumes = js.Array[DailyVolume]

type DedicatedIpList = js.Array[DedicatedIp]

type DefaultDimensionValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.PENDING_EXPIRATION
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type DeliverabilityDashboardAccountStatus = _DeliverabilityDashboardAccountStatus | String

type DeliverabilityTestReports = js.Array[DeliverabilityTestReport]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type DeliverabilityTestStatus = _DeliverabilityTestStatus | String

type DeliverabilityTestSubject = String

type DimensionName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MESSAGE_TAG
  - typings.awsSdk.awsSdkStrings.EMAIL_HEADER
  - typings.awsSdk.awsSdkStrings.LINK_TAG
  - java.lang.String
*/
type DimensionValueSource = _DimensionValueSource | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.TEMPORARY_FAILURE
  - typings.awsSdk.awsSdkStrings.NOT_STARTED
  - java.lang.String
*/
type DkimStatus = _DkimStatus | String

type DnsToken = String

type DnsTokenList = js.Array[DnsToken]

type Domain = String

type DomainDeliverabilityCampaignList = js.Array[DomainDeliverabilityCampaign]

type DomainDeliverabilityTrackingOptions = js.Array[DomainDeliverabilityTrackingOption]

type DomainIspPlacements = js.Array[DomainIspPlacement]

type EmailAddress = String

type EmailAddressList = js.Array[EmailAddress]

type Enabled = Boolean

type Esp = String

type Esps = js.Array[Esp]

type EventDestinationName = String

type EventDestinations = js.Array[EventDestination]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SEND
  - typings.awsSdk.awsSdkStrings.REJECT
  - typings.awsSdk.awsSdkStrings.BOUNCE
  - typings.awsSdk.awsSdkStrings.COMPLAINT
  - typings.awsSdk.awsSdkStrings.DELIVERY
  - typings.awsSdk.awsSdkStrings.OPEN
  - typings.awsSdk.awsSdkStrings.CLICK
  - typings.awsSdk.awsSdkStrings.RENDERING_FAILURE
  - java.lang.String
*/
type EventType = _EventType | String

type EventTypes = js.Array[EventType]

type GeneralEnforcementStatus = String

type Identity = String

type IdentityInfoList = js.Array[IdentityInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EMAIL_ADDRESS
  - typings.awsSdk.awsSdkStrings.DOMAIN
  - typings.awsSdk.awsSdkStrings.MANAGED_DOMAIN
  - java.lang.String
*/
type IdentityType = _IdentityType | String

type ImageUrl = String

type Ip = String

type IpList = js.Array[Ip]

type IspName = String

type IspNameList = js.Array[IspName]

type IspPlacements = js.Array[IspPlacement]

type LastFreshStart = js.Date

type ListOfDedicatedIpPools = js.Array[PoolName]

type MailFromDomainName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.TEMPORARY_FAILURE
  - java.lang.String
*/
type MailFromDomainStatus = _MailFromDomainStatus | String

type Max24HourSend = Double

type MaxItems = Double

type MaxSendRate = Double

type MessageContent = String

type MessageData = String

type MessageTagList = js.Array[MessageTag]

type MessageTagName = String

type MessageTagValue = String

type NextToken = String

type OutboundMessageId = String

type Percentage = Double

type Percentage100Wrapper = Double

type PoolName = String

type RawMessageData = Buffer | js.typedarray.Uint8Array | Blob | String

type RblName = String

type ReportId = String

type ReportName = String

type SendingPoolName = String

type SentLast24Hours = Double

type Subject = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TemplateArn = String

type TemplateData = String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REQUIRE
  - typings.awsSdk.awsSdkStrings.OPTIONAL
  - java.lang.String
*/
type TlsPolicy = _TlsPolicy | String

type Volume = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DONE
  - java.lang.String
*/
type WarmupStatus = _WarmupStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-07-26`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
