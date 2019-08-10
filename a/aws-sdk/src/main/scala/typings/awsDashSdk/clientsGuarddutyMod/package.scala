package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.awsDashSdkStrings.COUNT_BY_SEVERITY
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsGuarddutyMod {
  type AccountDetails = js.Array[AccountDetail]
  type AccountId = java.lang.String
  type AccountIds = js.Array[AccountId]
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = java.lang.String
  type CountBySeverity = StringDictionary[Integer]
  type Criterion = StringDictionary[Condition]
  type DetectorId = java.lang.String
  type DetectorIds = js.Array[DetectorId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type DetectorStatus = _DetectorStatus | java.lang.String
  type Double = scala.Double
  type Email = java.lang.String
  type Eq = js.Array[String]
  type Equals = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USEFUL
    - typings.awsDashSdk.awsDashSdkStrings.NOT_USEFUL
    - java.lang.String
  */
  type Feedback = _Feedback | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NOOP
    - typings.awsDashSdk.awsDashSdkStrings.ARCHIVE
    - java.lang.String
  */
  type FilterAction = _FilterAction | java.lang.String
  type FilterDescription = java.lang.String
  type FilterName = java.lang.String
  type FilterNames = js.Array[FilterName]
  type FilterRank = scala.Double
  type FindingId = java.lang.String
  type FindingIds = js.Array[FindingId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FIFTEEN_MINUTES
    - typings.awsDashSdk.awsDashSdkStrings.ONE_HOUR
    - typings.awsDashSdk.awsDashSdkStrings.SIX_HOURS
    - java.lang.String
  */
  type FindingPublishingFrequency = _FindingPublishingFrequency | java.lang.String
  type FindingStatisticType = COUNT_BY_SEVERITY | java.lang.String
  type FindingStatisticTypes = js.Array[FindingStatisticType]
  type FindingType = java.lang.String
  type FindingTypes = js.Array[FindingType]
  type Findings = js.Array[Finding]
  type GuardDutyArn = java.lang.String
  type Integer = scala.Double
  type Invitations = js.Array[Invitation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TXT
    - typings.awsDashSdk.awsDashSdkStrings.STIX
    - typings.awsDashSdk.awsDashSdkStrings.OTX_CSV
    - typings.awsDashSdk.awsDashSdkStrings.ALIEN_VAULT
    - typings.awsDashSdk.awsDashSdkStrings.PROOF_POINT
    - typings.awsDashSdk.awsDashSdkStrings.FIRE_EYE
    - java.lang.String
  */
  type IpSetFormat = _IpSetFormat | java.lang.String
  type IpSetIds = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DEACTIVATING
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_PENDING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type IpSetStatus = _IpSetStatus | java.lang.String
  type Ipv6Addresses = js.Array[String]
  type Location = java.lang.String
  type Long = scala.Double
  type MaxResults = scala.Double
  type Members = js.Array[Member]
  type Name = java.lang.String
  type Neq = js.Array[String]
  type NetworkInterfaces = js.Array[NetworkInterface]
  type NotEquals = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASC
    - typings.awsDashSdk.awsDashSdkStrings.DESC
    - java.lang.String
  */
  type OrderBy = _OrderBy | java.lang.String
  type PortProbeDetails = js.Array[PortProbeDetail]
  type PrivateIpAddresses = js.Array[PrivateIpAddressDetails]
  type ProductCodes = js.Array[ProductCode]
  type SecurityGroups = js.Array[SecurityGroup]
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagMap = StringDictionary[TagValue]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TXT
    - typings.awsDashSdk.awsDashSdkStrings.STIX
    - typings.awsDashSdk.awsDashSdkStrings.OTX_CSV
    - typings.awsDashSdk.awsDashSdkStrings.ALIEN_VAULT
    - typings.awsDashSdk.awsDashSdkStrings.PROOF_POINT
    - typings.awsDashSdk.awsDashSdkStrings.FIRE_EYE
    - java.lang.String
  */
  type ThreatIntelSetFormat = _ThreatIntelSetFormat | java.lang.String
  type ThreatIntelSetIds = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DEACTIVATING
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_PENDING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type ThreatIntelSetStatus = _ThreatIntelSetStatus | java.lang.String
  type ThreatIntelligenceDetails = js.Array[ThreatIntelligenceDetail]
  type ThreatNames = js.Array[String]
  type UnprocessedAccounts = js.Array[UnprocessedAccount]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-11-28`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
