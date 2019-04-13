package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRoute53Mod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MAX_HEALTH_CHECKS_BY_OWNER
    - awsDashSdkLib.awsDashSdkLibStrings.MAX_HOSTED_ZONES_BY_OWNER
    - awsDashSdkLib.awsDashSdkLibStrings.MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER
    - awsDashSdkLib.awsDashSdkLibStrings.MAX_REUSABLE_DELEGATION_SETS_BY_OWNER
    - awsDashSdkLib.awsDashSdkLibStrings.MAX_TRAFFIC_POLICIES_BY_OWNER
    - java.lang.String
  */
  type AccountLimitType = _AccountLimitType | java.lang.String
  type AlarmName = java.lang.String
  type AliasHealthEnabled = scala.Boolean
  type AssociateVPCComment = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE
    - awsDashSdkLib.awsDashSdkLibStrings.UPSERT
    - java.lang.String
  */
  type ChangeAction = _ChangeAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.INSYNC
    - java.lang.String
  */
  type ChangeStatus = _ChangeStatus | java.lang.String
  type Changes = js.Array[Change]
  type CheckerIpRanges = js.Array[IPAddressCidr]
  type ChildHealthCheckList = js.Array[HealthCheckId]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchLogsLogGroupArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`us-east-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-east-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-west-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-west-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`ca-central-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-central-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-3`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-south-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-3`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-north-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`sa-east-1`
    - java.lang.String
  */
  type CloudWatchRegion = _CloudWatchRegion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GreaterThanOrEqualToThreshold
    - awsDashSdkLib.awsDashSdkLibStrings.GreaterThanThreshold
    - awsDashSdkLib.awsDashSdkLibStrings.LessThanThreshold
    - awsDashSdkLib.awsDashSdkLibStrings.LessThanOrEqualToThreshold
    - java.lang.String
  */
  type ComparisonOperator = _ComparisonOperator | java.lang.String
  type DNSName = java.lang.String
  type DNSRCode = java.lang.String
  type DelegationSetNameServers = js.Array[DNSName]
  type DelegationSets = js.Array[DelegationSet]
  type DimensionField = java.lang.String
  type DimensionList = js.Array[Dimension]
  type Disabled = scala.Boolean
  type DisassociateVPCComment = java.lang.String
  type EnableSNI = scala.Boolean
  type EvaluationPeriods = scala.Double
  type FailureThreshold = scala.Double
  type FullyQualifiedDomainName = java.lang.String
  type GeoLocationContinentCode = java.lang.String
  type GeoLocationContinentName = java.lang.String
  type GeoLocationCountryCode = java.lang.String
  type GeoLocationCountryName = java.lang.String
  type GeoLocationDetailsList = js.Array[GeoLocationDetails]
  type GeoLocationSubdivisionCode = java.lang.String
  type GeoLocationSubdivisionName = java.lang.String
  type HealthCheckCount = scala.Double
  type HealthCheckId = java.lang.String
  type HealthCheckNonce = java.lang.String
  type HealthCheckObservations = js.Array[HealthCheckObservation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`us-east-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-west-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-west-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`sa-east-1`
    - java.lang.String
  */
  type HealthCheckRegion = _HealthCheckRegion | java.lang.String
  type HealthCheckRegionList = js.Array[HealthCheckRegion]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPS
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP_STR_MATCH
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPS_STR_MATCH
    - awsDashSdkLib.awsDashSdkLibStrings.TCP
    - awsDashSdkLib.awsDashSdkLibStrings.CALCULATED
    - awsDashSdkLib.awsDashSdkLibStrings.CLOUDWATCH_METRIC
    - java.lang.String
  */
  type HealthCheckType = _HealthCheckType | java.lang.String
  type HealthCheckVersion = scala.Double
  type HealthChecks = js.Array[HealthCheck]
  type HealthThreshold = scala.Double
  type HostedZoneCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MAX_RRSETS_BY_ZONE
    - awsDashSdkLib.awsDashSdkLibStrings.MAX_VPCS_ASSOCIATED_BY_ZONE
    - java.lang.String
  */
  type HostedZoneLimitType = _HostedZoneLimitType | java.lang.String
  type HostedZoneRRSetCount = scala.Double
  type HostedZones = js.Array[HostedZone]
  type IPAddress = java.lang.String
  type IPAddressCidr = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Healthy
    - awsDashSdkLib.awsDashSdkLibStrings.Unhealthy
    - awsDashSdkLib.awsDashSdkLibStrings.LastKnownStatus
    - java.lang.String
  */
  type InsufficientDataHealthStatus = _InsufficientDataHealthStatus | java.lang.String
  type Inverted = scala.Boolean
  type IsPrivateZone = scala.Boolean
  type LimitValue = scala.Double
  type MaxResults = java.lang.String
  type MeasureLatency = scala.Boolean
  type Message = java.lang.String
  type MetricName = java.lang.String
  type Nameserver = java.lang.String
  type Namespace = java.lang.String
  type Nonce = java.lang.String
  type PageMarker = java.lang.String
  type PageMaxItems = java.lang.String
  type PageTruncated = scala.Boolean
  type PaginationToken = java.lang.String
  type Period = scala.Double
  type Port = scala.Double
  type QueryLoggingConfigId = java.lang.String
  type QueryLoggingConfigs = js.Array[QueryLoggingConfig]
  type RData = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SOA
    - awsDashSdkLib.awsDashSdkLibStrings.A
    - awsDashSdkLib.awsDashSdkLibStrings.TXT
    - awsDashSdkLib.awsDashSdkLibStrings.NS
    - awsDashSdkLib.awsDashSdkLibStrings.CNAME
    - awsDashSdkLib.awsDashSdkLibStrings.MX
    - awsDashSdkLib.awsDashSdkLibStrings.NAPTR
    - awsDashSdkLib.awsDashSdkLibStrings.PTR
    - awsDashSdkLib.awsDashSdkLibStrings.SRV
    - awsDashSdkLib.awsDashSdkLibStrings.SPF
    - awsDashSdkLib.awsDashSdkLibStrings.AAAA
    - awsDashSdkLib.awsDashSdkLibStrings.CAA
    - java.lang.String
  */
  type RRType = _RRType | java.lang.String
  type RecordData = js.Array[RecordDataEntry]
  type RecordDataEntry = java.lang.String
  type RequestInterval = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FullyQualifiedDomainName
    - awsDashSdkLib.awsDashSdkLibStrings.Regions
    - awsDashSdkLib.awsDashSdkLibStrings.ResourcePath
    - awsDashSdkLib.awsDashSdkLibStrings.ChildHealthChecks
    - java.lang.String
  */
  type ResettableElementName = _ResettableElementName | java.lang.String
  type ResettableElementNameList = js.Array[ResettableElementName]
  type ResourceDescription = java.lang.String
  type ResourceId = java.lang.String
  type ResourcePath = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PRIMARY
    - awsDashSdkLib.awsDashSdkLibStrings.SECONDARY
    - java.lang.String
  */
  type ResourceRecordSetFailover = _ResourceRecordSetFailover | java.lang.String
  type ResourceRecordSetIdentifier = java.lang.String
  type ResourceRecordSetMultiValueAnswer = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`us-east-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-east-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-west-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-west-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`ca-central-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-3`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-central-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-3`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-north-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`sa-east-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`cn-north-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`cn-northwest-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-south-1`
    - java.lang.String
  */
  type ResourceRecordSetRegion = _ResourceRecordSetRegion | java.lang.String
  type ResourceRecordSetWeight = scala.Double
  type ResourceRecordSets = js.Array[ResourceRecordSet]
  type ResourceRecords = js.Array[ResourceRecord]
  type ResourceTagSetList = js.Array[ResourceTagSet]
  type ResourceURI = java.lang.String
  type ReusableDelegationSetLimitType = awsDashSdkLib.awsDashSdkLibStrings.MAX_ZONES_BY_REUSABLE_DELEGATION_SET | java.lang.String
  type SearchString = java.lang.String
  type ServicePrincipal = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Average
    - awsDashSdkLib.awsDashSdkLibStrings.Sum
    - awsDashSdkLib.awsDashSdkLibStrings.SampleCount
    - awsDashSdkLib.awsDashSdkLibStrings.Maximum
    - awsDashSdkLib.awsDashSdkLibStrings.Minimum
    - java.lang.String
  */
  type Statistic = _Statistic | java.lang.String
  type Status = java.lang.String
  type SubnetMask = java.lang.String
  type TTL = scala.Double
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagResourceId = java.lang.String
  type TagResourceIdList = js.Array[TagResourceId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.healthcheck
    - awsDashSdkLib.awsDashSdkLibStrings.hostedzone
    - java.lang.String
  */
  type TagResourceType = _TagResourceType | java.lang.String
  type TagValue = java.lang.String
  type Threshold = scala.Double
  type TimeStamp = stdLib.Date
  type TrafficPolicies = js.Array[TrafficPolicy]
  type TrafficPolicyComment = java.lang.String
  type TrafficPolicyDocument = java.lang.String
  type TrafficPolicyId = java.lang.String
  type TrafficPolicyInstanceCount = scala.Double
  type TrafficPolicyInstanceId = java.lang.String
  type TrafficPolicyInstanceState = java.lang.String
  type TrafficPolicyInstances = js.Array[TrafficPolicyInstance]
  type TrafficPolicyName = java.lang.String
  type TrafficPolicySummaries = js.Array[TrafficPolicySummary]
  type TrafficPolicyVersion = scala.Double
  type TrafficPolicyVersionMarker = java.lang.String
  type TransportProtocol = java.lang.String
  type UsageCount = scala.Double
  type VPCId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`us-east-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-east-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-west-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-west-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-3`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-central-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-south-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-3`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-north-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`sa-east-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ca-central-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`cn-north-1`
    - java.lang.String
  */
  type VPCRegion = _VPCRegion | java.lang.String
  type VPCs = js.Array[VPC]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2013-04-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
