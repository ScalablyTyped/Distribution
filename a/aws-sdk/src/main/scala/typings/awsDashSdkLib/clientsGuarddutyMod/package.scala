package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsGuarddutyMod {
  type AccountDetails = js.Array[AccountDetail]
  type AccountId = java.lang.String
  type AccountIds = js.Array[__string]
  type Activate = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Comments = java.lang.String
  type CountBySeverityFindingStatistic = scala.Double
  type CreatedAt = java.lang.String
  type DetectorId = java.lang.String
  type DetectorIds = js.Array[DetectorId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type DetectorStatus = _DetectorStatus | java.lang.String
  type Domain = java.lang.String
  type Email = java.lang.String
  type Enable = scala.Boolean
  type Eq = js.Array[__string]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.USEFUL
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_USEFUL
    - java.lang.String
  */
  type Feedback = _Feedback | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NOOP
    - awsDashSdkLib.awsDashSdkLibStrings.ARCHIVE
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
    - awsDashSdkLib.awsDashSdkLibStrings.FIFTEEN_MINUTES
    - awsDashSdkLib.awsDashSdkLibStrings.ONE_HOUR
    - awsDashSdkLib.awsDashSdkLibStrings.SIX_HOURS
    - java.lang.String
  */
  type FindingPublishingFrequency = _FindingPublishingFrequency | java.lang.String
  type FindingStatisticType = awsDashSdkLib.awsDashSdkLibStrings.COUNT_BY_SEVERITY | java.lang.String
  type FindingStatisticTypes = js.Array[FindingStatisticType]
  type FindingType = java.lang.String
  type FindingTypes = js.Array[FindingType]
  type Findings = js.Array[Finding]
  type InvitationId = java.lang.String
  type Invitations = js.Array[Invitation]
  type InvitedAt = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TXT
    - awsDashSdkLib.awsDashSdkLibStrings.STIX
    - awsDashSdkLib.awsDashSdkLibStrings.OTX_CSV
    - awsDashSdkLib.awsDashSdkLibStrings.ALIEN_VAULT
    - awsDashSdkLib.awsDashSdkLibStrings.PROOF_POINT
    - awsDashSdkLib.awsDashSdkLibStrings.FIRE_EYE
    - java.lang.String
  */
  type IpSetFormat = _IpSetFormat | java.lang.String
  type IpSetId = java.lang.String
  type IpSetIds = js.Array[IpSetId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVATING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DEACTIVATING
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type IpSetStatus = _IpSetStatus | java.lang.String
  type Ipv6Address = java.lang.String
  type Ipv6Addresses = js.Array[Ipv6Address]
  type Location = java.lang.String
  type MasterId = java.lang.String
  type MaxResults = scala.Double
  type Members = js.Array[Member]
  type Message = java.lang.String
  type Name = java.lang.String
  type Neq = js.Array[__string]
  type NetworkInterfaceId = java.lang.String
  type NetworkInterfaces = js.Array[NetworkInterface]
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ASC
    - awsDashSdkLib.awsDashSdkLibStrings.DESC
    - java.lang.String
  */
  type OrderBy = _OrderBy | java.lang.String
  type PrivateDnsName = java.lang.String
  type PrivateIpAddress = java.lang.String
  type PrivateIpAddresses = js.Array[PrivateIpAddressDetails]
  type ProductCodes = js.Array[ProductCode]
  type SecurityGroups = js.Array[SecurityGroup]
  type ServiceRole = java.lang.String
  type Tags = js.Array[Tag]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TXT
    - awsDashSdkLib.awsDashSdkLibStrings.STIX
    - awsDashSdkLib.awsDashSdkLibStrings.OTX_CSV
    - awsDashSdkLib.awsDashSdkLibStrings.ALIEN_VAULT
    - awsDashSdkLib.awsDashSdkLibStrings.PROOF_POINT
    - awsDashSdkLib.awsDashSdkLibStrings.FIRE_EYE
    - java.lang.String
  */
  type ThreatIntelSetFormat = _ThreatIntelSetFormat | java.lang.String
  type ThreatIntelSetId = java.lang.String
  type ThreatIntelSetIds = js.Array[ThreatIntelSetId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVATING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DEACTIVATING
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type ThreatIntelSetStatus = _ThreatIntelSetStatus | java.lang.String
  type UnprocessedAccounts = js.Array[UnprocessedAccount]
  type UpdatedAt = java.lang.String
  type __boolean = scala.Boolean
  type __double = scala.Double
  type __integer = scala.Double
  type __listOfPortProbeDetail = js.Array[PortProbeDetail]
  type __mapOfCondition = org.scalablytyped.runtime.StringDictionary[Condition]
  type __mapOfCountBySeverityFindingStatistic = org.scalablytyped.runtime.StringDictionary[CountBySeverityFindingStatistic]
  type __string = java.lang.String
  type __stringMin0Max64 = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-11-28`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
