package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPinpointemailMod {
  type AmazonResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.USE_DEFAULT_VALUE
    - awsDashSdkLib.awsDashSdkLibStrings.REJECT_MESSAGE
    - java.lang.String
  */
  type BehaviorOnMxFailure = _BehaviorOnMxFailure | java.lang.String
  type BlacklistEntries = js.Array[BlacklistEntry]
  type BlacklistItemName = java.lang.String
  type BlacklistItemNames = js.Array[BlacklistItemName]
  type BlacklistReport = org.scalablytyped.runtime.StringDictionary[BlacklistEntries]
  type BlacklistingDescription = java.lang.String
  type CampaignId = java.lang.String
  type Charset = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchDimensionConfigurations = js.Array[CloudWatchDimensionConfiguration]
  type ConfigurationSetName = java.lang.String
  type ConfigurationSetNameList = js.Array[ConfigurationSetName]
  type CustomRedirectDomain = java.lang.String
  type DailyVolumes = js.Array[DailyVolume]
  type DedicatedIpList = js.Array[DedicatedIp]
  type DefaultDimensionValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_EXPIRATION
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type DeliverabilityDashboardAccountStatus = _DeliverabilityDashboardAccountStatus | java.lang.String
  type DeliverabilityTestReports = js.Array[DeliverabilityTestReport]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - java.lang.String
  */
  type DeliverabilityTestStatus = _DeliverabilityTestStatus | java.lang.String
  type DeliverabilityTestSubject = java.lang.String
  type DimensionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MESSAGE_TAG
    - awsDashSdkLib.awsDashSdkLibStrings.EMAIL_HEADER
    - awsDashSdkLib.awsDashSdkLibStrings.LINK_TAG
    - java.lang.String
  */
  type DimensionValueSource = _DimensionValueSource | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.TEMPORARY_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_STARTED
    - java.lang.String
  */
  type DkimStatus = _DkimStatus | java.lang.String
  type DnsToken = java.lang.String
  type DnsTokenList = js.Array[DnsToken]
  type Domain = java.lang.String
  type DomainDeliverabilityCampaignList = js.Array[DomainDeliverabilityCampaign]
  type DomainDeliverabilityTrackingOptions = js.Array[DomainDeliverabilityTrackingOption]
  type DomainIspPlacements = js.Array[DomainIspPlacement]
  type EmailAddress = java.lang.String
  type EmailAddressList = js.Array[EmailAddress]
  type Enabled = scala.Boolean
  type Esp = java.lang.String
  type Esps = js.Array[Esp]
  type EventDestinationName = java.lang.String
  type EventDestinations = js.Array[EventDestination]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SEND
    - awsDashSdkLib.awsDashSdkLibStrings.REJECT
    - awsDashSdkLib.awsDashSdkLibStrings.BOUNCE
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLAINT
    - awsDashSdkLib.awsDashSdkLibStrings.DELIVERY
    - awsDashSdkLib.awsDashSdkLibStrings.OPEN
    - awsDashSdkLib.awsDashSdkLibStrings.CLICK
    - awsDashSdkLib.awsDashSdkLibStrings.RENDERING_FAILURE
    - java.lang.String
  */
  type EventType = _EventType | java.lang.String
  type EventTypes = js.Array[EventType]
  type GeneralEnforcementStatus = java.lang.String
  type Identity = java.lang.String
  type IdentityInfoList = js.Array[IdentityInfo]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EMAIL_ADDRESS
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN
    - awsDashSdkLib.awsDashSdkLibStrings.MANAGED_DOMAIN
    - java.lang.String
  */
  type IdentityType = _IdentityType | java.lang.String
  type ImageUrl = java.lang.String
  type Ip = java.lang.String
  type IpList = js.Array[Ip]
  type IspName = java.lang.String
  type IspNameList = js.Array[IspName]
  type IspPlacements = js.Array[IspPlacement]
  type LastFreshStart = stdLib.Date
  type ListOfDedicatedIpPools = js.Array[PoolName]
  type MailFromDomainName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.TEMPORARY_FAILURE
    - java.lang.String
  */
  type MailFromDomainStatus = _MailFromDomainStatus | java.lang.String
  type Max24HourSend = scala.Double
  type MaxItems = scala.Double
  type MaxSendRate = scala.Double
  type MessageContent = java.lang.String
  type MessageData = java.lang.String
  type MessageTagList = js.Array[MessageTag]
  type MessageTagName = java.lang.String
  type MessageTagValue = java.lang.String
  type NextToken = java.lang.String
  type OutboundMessageId = java.lang.String
  type Percentage = scala.Double
  type Percentage100Wrapper = scala.Double
  type PoolName = java.lang.String
  type RawMessageData = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type RblName = java.lang.String
  type ReportId = java.lang.String
  type ReportName = java.lang.String
  type SendingPoolName = java.lang.String
  type SentLast24Hours = scala.Double
  type Subject = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.REQUIRE
    - awsDashSdkLib.awsDashSdkLibStrings.OPTIONAL
    - java.lang.String
  */
  type TlsPolicy = _TlsPolicy | java.lang.String
  type Volume = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.DONE
    - java.lang.String
  */
  type WarmupStatus = _WarmupStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-07-26`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
