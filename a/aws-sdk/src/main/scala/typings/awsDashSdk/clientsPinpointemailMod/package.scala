package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPinpointemailMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type AmazonResourceName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USE_DEFAULT_VALUE
    - typings.awsDashSdk.awsDashSdkStrings.REJECT_MESSAGE
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
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchDimensionConfigurations = js.Array[CloudWatchDimensionConfiguration]
  type ConfigurationSetName = String
  type ConfigurationSetNameList = js.Array[ConfigurationSetName]
  type CustomRedirectDomain = String
  type DailyVolumes = js.Array[DailyVolume]
  type DedicatedIpList = js.Array[DedicatedIp]
  type DefaultDimensionValue = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_EXPIRATION
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type DeliverabilityDashboardAccountStatus = _DeliverabilityDashboardAccountStatus | String
  type DeliverabilityTestReports = js.Array[DeliverabilityTestReport]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - java.lang.String
  */
  type DeliverabilityTestStatus = _DeliverabilityTestStatus | String
  type DeliverabilityTestSubject = String
  type DimensionName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MESSAGE_TAG
    - typings.awsDashSdk.awsDashSdkStrings.EMAIL_HEADER
    - typings.awsDashSdk.awsDashSdkStrings.LINK_TAG
    - java.lang.String
  */
  type DimensionValueSource = _DimensionValueSource | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.TEMPORARY_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.NOT_STARTED
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
    - typings.awsDashSdk.awsDashSdkStrings.SEND
    - typings.awsDashSdk.awsDashSdkStrings.REJECT
    - typings.awsDashSdk.awsDashSdkStrings.BOUNCE
    - typings.awsDashSdk.awsDashSdkStrings.COMPLAINT
    - typings.awsDashSdk.awsDashSdkStrings.DELIVERY
    - typings.awsDashSdk.awsDashSdkStrings.OPEN
    - typings.awsDashSdk.awsDashSdkStrings.CLICK
    - typings.awsDashSdk.awsDashSdkStrings.RENDERING_FAILURE
    - java.lang.String
  */
  type EventType = _EventType | String
  type EventTypes = js.Array[EventType]
  type GeneralEnforcementStatus = String
  type Identity = String
  type IdentityInfoList = js.Array[IdentityInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EMAIL_ADDRESS
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN
    - typings.awsDashSdk.awsDashSdkStrings.MANAGED_DOMAIN
    - java.lang.String
  */
  type IdentityType = _IdentityType | String
  type ImageUrl = String
  type Ip = String
  type IpList = js.Array[Ip]
  type IspName = String
  type IspNameList = js.Array[IspName]
  type IspPlacements = js.Array[IspPlacement]
  type LastFreshStart = Date
  type ListOfDedicatedIpPools = js.Array[PoolName]
  type MailFromDomainName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.TEMPORARY_FAILURE
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
  type RawMessageData = Buffer | Uint8Array | Blob | String
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
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.REQUIRE
    - typings.awsDashSdk.awsDashSdkStrings.OPTIONAL
    - java.lang.String
  */
  type TlsPolicy = _TlsPolicy | String
  type Volume = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.DONE
    - java.lang.String
  */
  type WarmupStatus = _WarmupStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-07-26`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
