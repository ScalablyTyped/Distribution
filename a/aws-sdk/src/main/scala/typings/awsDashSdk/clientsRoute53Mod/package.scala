package typings.awsDashSdk

import typings.awsDashSdk.awsDashSdkStrings.MAX_ZONES_BY_REUSABLE_DELEGATION_SET
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRoute53Mod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MAX_HEALTH_CHECKS_BY_OWNER
    - typings.awsDashSdk.awsDashSdkStrings.MAX_HOSTED_ZONES_BY_OWNER
    - typings.awsDashSdk.awsDashSdkStrings.MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER
    - typings.awsDashSdk.awsDashSdkStrings.MAX_REUSABLE_DELEGATION_SETS_BY_OWNER
    - typings.awsDashSdk.awsDashSdkStrings.MAX_TRAFFIC_POLICIES_BY_OWNER
    - java.lang.String
  */
  type AccountLimitType = _AccountLimitType | String
  type AlarmName = String
  type AliasHealthEnabled = Boolean
  type AssociateVPCComment = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE
    - typings.awsDashSdk.awsDashSdkStrings.DELETE
    - typings.awsDashSdk.awsDashSdkStrings.UPSERT
    - java.lang.String
  */
  type ChangeAction = _ChangeAction | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.INSYNC
    - java.lang.String
  */
  type ChangeStatus = _ChangeStatus | String
  type Changes = js.Array[Change]
  type CheckerIpRanges = js.Array[IPAddressCidr]
  type ChildHealthCheckList = js.Array[HealthCheckId]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchLogsLogGroupArn = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`us-east-1`
    - typings.awsDashSdk.awsDashSdkStrings.`us-east-2`
    - typings.awsDashSdk.awsDashSdkStrings.`us-west-1`
    - typings.awsDashSdk.awsDashSdkStrings.`us-west-2`
    - typings.awsDashSdk.awsDashSdkStrings.`ca-central-1`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-central-1`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-west-1`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-west-2`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-west-3`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-east-1`
    - typings.awsDashSdk.awsDashSdkStrings.`me-south-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-south-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-southeast-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-southeast-2`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-northeast-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-northeast-2`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-northeast-3`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-north-1`
    - typings.awsDashSdk.awsDashSdkStrings.`sa-east-1`
    - typings.awsDashSdk.awsDashSdkStrings.`cn-northwest-1`
    - typings.awsDashSdk.awsDashSdkStrings.`cn-north-1`
    - java.lang.String
  */
  type CloudWatchRegion = _CloudWatchRegion | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThanOrEqualToThreshold
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThanThreshold
    - typings.awsDashSdk.awsDashSdkStrings.LessThanThreshold
    - typings.awsDashSdk.awsDashSdkStrings.LessThanOrEqualToThreshold
    - java.lang.String
  */
  type ComparisonOperator = _ComparisonOperator | String
  type DNSName = String
  type DNSRCode = String
  type DelegationSetNameServers = js.Array[DNSName]
  type DelegationSets = js.Array[DelegationSet]
  type DimensionField = String
  type DimensionList = js.Array[Dimension]
  type Disabled = Boolean
  type DisassociateVPCComment = String
  type EnableSNI = Boolean
  type EvaluationPeriods = Double
  type FailureThreshold = Double
  type FullyQualifiedDomainName = String
  type GeoLocationContinentCode = String
  type GeoLocationContinentName = String
  type GeoLocationCountryCode = String
  type GeoLocationCountryName = String
  type GeoLocationDetailsList = js.Array[GeoLocationDetails]
  type GeoLocationSubdivisionCode = String
  type GeoLocationSubdivisionName = String
  type HealthCheckCount = Double
  type HealthCheckId = String
  type HealthCheckNonce = String
  type HealthCheckObservations = js.Array[HealthCheckObservation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`us-east-1`
    - typings.awsDashSdk.awsDashSdkStrings.`us-west-1`
    - typings.awsDashSdk.awsDashSdkStrings.`us-west-2`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-west-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-southeast-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-southeast-2`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-northeast-1`
    - typings.awsDashSdk.awsDashSdkStrings.`sa-east-1`
    - java.lang.String
  */
  type HealthCheckRegion = _HealthCheckRegion | String
  type HealthCheckRegionList = js.Array[HealthCheckRegion]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HTTP
    - typings.awsDashSdk.awsDashSdkStrings.HTTPS
    - typings.awsDashSdk.awsDashSdkStrings.HTTP_STR_MATCH
    - typings.awsDashSdk.awsDashSdkStrings.HTTPS_STR_MATCH
    - typings.awsDashSdk.awsDashSdkStrings.TCP
    - typings.awsDashSdk.awsDashSdkStrings.CALCULATED
    - typings.awsDashSdk.awsDashSdkStrings.CLOUDWATCH_METRIC
    - java.lang.String
  */
  type HealthCheckType = _HealthCheckType | String
  type HealthCheckVersion = Double
  type HealthChecks = js.Array[HealthCheck]
  type HealthThreshold = Double
  type HostedZoneCount = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MAX_RRSETS_BY_ZONE
    - typings.awsDashSdk.awsDashSdkStrings.MAX_VPCS_ASSOCIATED_BY_ZONE
    - java.lang.String
  */
  type HostedZoneLimitType = _HostedZoneLimitType | String
  type HostedZoneRRSetCount = Double
  type HostedZones = js.Array[HostedZone]
  type IPAddress = String
  type IPAddressCidr = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Healthy
    - typings.awsDashSdk.awsDashSdkStrings.Unhealthy
    - typings.awsDashSdk.awsDashSdkStrings.LastKnownStatus
    - java.lang.String
  */
  type InsufficientDataHealthStatus = _InsufficientDataHealthStatus | String
  type Inverted = Boolean
  type IsPrivateZone = Boolean
  type LimitValue = Double
  type MaxResults = String
  type MeasureLatency = Boolean
  type Message = String
  type MetricName = String
  type Nameserver = String
  type Namespace = String
  type Nonce = String
  type PageMarker = String
  type PageMaxItems = String
  type PageTruncated = Boolean
  type PaginationToken = String
  type Period = Double
  type Port = Double
  type QueryLoggingConfigId = String
  type QueryLoggingConfigs = js.Array[QueryLoggingConfig]
  type RData = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SOA
    - typings.awsDashSdk.awsDashSdkStrings.A
    - typings.awsDashSdk.awsDashSdkStrings.TXT
    - typings.awsDashSdk.awsDashSdkStrings.NS
    - typings.awsDashSdk.awsDashSdkStrings.CNAME
    - typings.awsDashSdk.awsDashSdkStrings.MX
    - typings.awsDashSdk.awsDashSdkStrings.NAPTR
    - typings.awsDashSdk.awsDashSdkStrings.PTR
    - typings.awsDashSdk.awsDashSdkStrings.SRV
    - typings.awsDashSdk.awsDashSdkStrings.SPF
    - typings.awsDashSdk.awsDashSdkStrings.AAAA
    - typings.awsDashSdk.awsDashSdkStrings.CAA
    - java.lang.String
  */
  type RRType = _RRType | String
  type RecordData = js.Array[RecordDataEntry]
  type RecordDataEntry = String
  type RequestInterval = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FullyQualifiedDomainName
    - typings.awsDashSdk.awsDashSdkStrings.Regions
    - typings.awsDashSdk.awsDashSdkStrings.ResourcePath
    - typings.awsDashSdk.awsDashSdkStrings.ChildHealthChecks
    - java.lang.String
  */
  type ResettableElementName = _ResettableElementName | String
  type ResettableElementNameList = js.Array[ResettableElementName]
  type ResourceDescription = String
  type ResourceId = String
  type ResourcePath = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PRIMARY
    - typings.awsDashSdk.awsDashSdkStrings.SECONDARY
    - java.lang.String
  */
  type ResourceRecordSetFailover = _ResourceRecordSetFailover | String
  type ResourceRecordSetIdentifier = String
  type ResourceRecordSetMultiValueAnswer = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`us-east-1`
    - typings.awsDashSdk.awsDashSdkStrings.`us-east-2`
    - typings.awsDashSdk.awsDashSdkStrings.`us-west-1`
    - typings.awsDashSdk.awsDashSdkStrings.`us-west-2`
    - typings.awsDashSdk.awsDashSdkStrings.`ca-central-1`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-west-1`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-west-2`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-west-3`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-central-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-southeast-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-southeast-2`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-northeast-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-northeast-2`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-northeast-3`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-north-1`
    - typings.awsDashSdk.awsDashSdkStrings.`sa-east-1`
    - typings.awsDashSdk.awsDashSdkStrings.`cn-north-1`
    - typings.awsDashSdk.awsDashSdkStrings.`cn-northwest-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-east-1`
    - typings.awsDashSdk.awsDashSdkStrings.`me-south-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-south-1`
    - java.lang.String
  */
  type ResourceRecordSetRegion = _ResourceRecordSetRegion | String
  type ResourceRecordSetWeight = Double
  type ResourceRecordSets = js.Array[ResourceRecordSet]
  type ResourceRecords = js.Array[ResourceRecord]
  type ResourceTagSetList = js.Array[ResourceTagSet]
  type ResourceURI = String
  type ReusableDelegationSetLimitType = MAX_ZONES_BY_REUSABLE_DELEGATION_SET | String
  type SearchString = String
  type ServicePrincipal = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Average
    - typings.awsDashSdk.awsDashSdkStrings.Sum
    - typings.awsDashSdk.awsDashSdkStrings.SampleCount
    - typings.awsDashSdk.awsDashSdkStrings.Maximum
    - typings.awsDashSdk.awsDashSdkStrings.Minimum
    - java.lang.String
  */
  type Statistic = _Statistic | String
  type Status = String
  type SubnetMask = String
  type TTL = Double
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagResourceId = String
  type TagResourceIdList = js.Array[TagResourceId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.healthcheck
    - typings.awsDashSdk.awsDashSdkStrings.hostedzone
    - java.lang.String
  */
  type TagResourceType = _TagResourceType | String
  type TagValue = String
  type Threshold = Double
  type TimeStamp = Date
  type TrafficPolicies = js.Array[TrafficPolicy]
  type TrafficPolicyComment = String
  type TrafficPolicyDocument = String
  type TrafficPolicyId = String
  type TrafficPolicyInstanceCount = Double
  type TrafficPolicyInstanceId = String
  type TrafficPolicyInstanceState = String
  type TrafficPolicyInstances = js.Array[TrafficPolicyInstance]
  type TrafficPolicyName = String
  type TrafficPolicySummaries = js.Array[TrafficPolicySummary]
  type TrafficPolicyVersion = Double
  type TrafficPolicyVersionMarker = String
  type TransportProtocol = String
  type UsageCount = Double
  type VPCId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`us-east-1`
    - typings.awsDashSdk.awsDashSdkStrings.`us-east-2`
    - typings.awsDashSdk.awsDashSdkStrings.`us-west-1`
    - typings.awsDashSdk.awsDashSdkStrings.`us-west-2`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-west-1`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-west-2`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-west-3`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-central-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-east-1`
    - typings.awsDashSdk.awsDashSdkStrings.`me-south-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-southeast-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-southeast-2`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-south-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-northeast-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-northeast-2`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-northeast-3`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-north-1`
    - typings.awsDashSdk.awsDashSdkStrings.`sa-east-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ca-central-1`
    - typings.awsDashSdk.awsDashSdkStrings.`cn-north-1`
    - java.lang.String
  */
  type VPCRegion = _VPCRegion | String
  type VPCs = js.Array[VPC]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2013-04-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
