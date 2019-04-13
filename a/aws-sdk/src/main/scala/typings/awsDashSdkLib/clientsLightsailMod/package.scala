package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsLightsailMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.inbound
    - awsDashSdkLib.awsDashSdkLibStrings.outbound
    - java.lang.String
  */
  type AccessDirection = _AccessDirection | java.lang.String
  type AttachedDiskMap = org.scalablytyped.runtime.StringDictionary[DiskMapList]
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type Base64 = java.lang.String
  type BlueprintList = js.Array[Blueprint]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.os
    - awsDashSdkLib.awsDashSdkLibStrings.app
    - java.lang.String
  */
  type BlueprintType = _BlueprintType | java.lang.String
  type BundleList = js.Array[Bundle]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudFormationStackRecordList = js.Array[CloudFormationStackRecord]
  type CloudFormationStackRecordSourceInfoList = js.Array[CloudFormationStackRecordSourceInfo]
  type CloudFormationStackRecordSourceType = awsDashSdkLib.awsDashSdkLibStrings.ExportSnapshotRecord | java.lang.String
  type DiskInfoList = js.Array[DiskInfo]
  type DiskList = js.Array[Disk]
  type DiskMapList = js.Array[DiskMap]
  type DiskSnapshotList = js.Array[DiskSnapshot]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.completed
    - awsDashSdkLib.awsDashSdkLibStrings.error
    - awsDashSdkLib.awsDashSdkLibStrings.unknown
    - java.lang.String
  */
  type DiskSnapshotState = _DiskSnapshotState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.error
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.`in-use`
    - awsDashSdkLib.awsDashSdkLibStrings.unknown
    - java.lang.String
  */
  type DiskState = _DiskState | java.lang.String
  type DomainEntryList = js.Array[DomainEntry]
  type DomainEntryOptions = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type DomainEntryOptionsKeys = java.lang.String
  type DomainEntryType = java.lang.String
  type DomainList = js.Array[Domain]
  type DomainName = java.lang.String
  type DomainNameList = js.Array[DomainName]
  type ExportSnapshotRecordList = js.Array[ExportSnapshotRecord]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.DiskSnapshot
    - java.lang.String
  */
  type ExportSnapshotRecordSourceType = _ExportSnapshotRecordSourceType | java.lang.String
  type HostKeysList = js.Array[HostKeyAttributes]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ssh
    - awsDashSdkLib.awsDashSdkLibStrings.rdp
    - java.lang.String
  */
  type InstanceAccessProtocol = _InstanceAccessProtocol | java.lang.String
  type InstanceEntryList = js.Array[InstanceEntry]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LbDOTRegistrationInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.LbDOTInitialHealthChecking
    - awsDashSdkLib.awsDashSdkLibStrings.LbDOTInternalError
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceDOTResponseCodeMismatch
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceDOTTimeout
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceDOTFailedHealthChecks
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceDOTNotRegistered
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceDOTNotInUse
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceDOTDeregistrationInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceDOTInvalidState
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceDOTIpUnusable
    - java.lang.String
  */
  type InstanceHealthReason = _InstanceHealthReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.initial
    - awsDashSdkLib.awsDashSdkLibStrings.healthy
    - awsDashSdkLib.awsDashSdkLibStrings.unhealthy
    - awsDashSdkLib.awsDashSdkLibStrings.unused
    - awsDashSdkLib.awsDashSdkLibStrings.draining
    - awsDashSdkLib.awsDashSdkLibStrings.unavailable
    - java.lang.String
  */
  type InstanceHealthState = _InstanceHealthState | java.lang.String
  type InstanceHealthSummaryList = js.Array[InstanceHealthSummary]
  type InstanceList = js.Array[Instance]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CPUUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.NetworkIn
    - awsDashSdkLib.awsDashSdkLibStrings.NetworkOut
    - awsDashSdkLib.awsDashSdkLibStrings.StatusCheckFailed
    - awsDashSdkLib.awsDashSdkLibStrings.StatusCheckFailed_Instance
    - awsDashSdkLib.awsDashSdkLibStrings.StatusCheckFailed_System
    - java.lang.String
  */
  type InstanceMetricName = _InstanceMetricName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LINUX_UNIX
    - awsDashSdkLib.awsDashSdkLibStrings.WINDOWS
    - java.lang.String
  */
  type InstancePlatform = _InstancePlatform | java.lang.String
  type InstancePlatformList = js.Array[InstancePlatform]
  type InstancePortInfoList = js.Array[InstancePortInfo]
  type InstancePortStateList = js.Array[InstancePortState]
  type InstanceSnapshotList = js.Array[InstanceSnapshot]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.error
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - java.lang.String
  */
  type InstanceSnapshotState = _InstanceSnapshotState | java.lang.String
  type IpAddress = java.lang.String
  type IpV6Address = java.lang.String
  type IsoDate = stdLib.Date
  type KeyPairList = js.Array[KeyPair]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HealthCheckPath
    - awsDashSdkLib.awsDashSdkLibStrings.SessionStickinessEnabled
    - awsDashSdkLib.awsDashSdkLibStrings.SessionStickiness_LB_CookieDurationSeconds
    - java.lang.String
  */
  type LoadBalancerAttributeName = _LoadBalancerAttributeName | java.lang.String
  type LoadBalancerConfigurationOptions = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LoadBalancerList = js.Array[LoadBalancer]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ClientTLSNegotiationErrorCount
    - awsDashSdkLib.awsDashSdkLibStrings.HealthyHostCount
    - awsDashSdkLib.awsDashSdkLibStrings.UnhealthyHostCount
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPCode_LB_4XX_Count
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPCode_LB_5XX_Count
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPCode_Instance_2XX_Count
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPCode_Instance_3XX_Count
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPCode_Instance_4XX_Count
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPCode_Instance_5XX_Count
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceResponseTime
    - awsDashSdkLib.awsDashSdkLibStrings.RejectedConnectionCount
    - awsDashSdkLib.awsDashSdkLibStrings.RequestCount
    - java.lang.String
  */
  type LoadBalancerMetricName = _LoadBalancerMetricName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP_HTTPS
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP
    - java.lang.String
  */
  type LoadBalancerProtocol = _LoadBalancerProtocol | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.provisioning
    - awsDashSdkLib.awsDashSdkLibStrings.active_impaired
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - awsDashSdkLib.awsDashSdkLibStrings.unknown
    - java.lang.String
  */
  type LoadBalancerState = _LoadBalancerState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_VALIDATION
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - java.lang.String
  */
  type LoadBalancerTlsCertificateDomainStatus = _LoadBalancerTlsCertificateDomainStatus | java.lang.String
  type LoadBalancerTlsCertificateDomainValidationOptionList = js.Array[LoadBalancerTlsCertificateDomainValidationOption]
  type LoadBalancerTlsCertificateDomainValidationRecordList = js.Array[LoadBalancerTlsCertificateDomainValidationRecord]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NO_AVAILABLE_CONTACTS
    - awsDashSdkLib.awsDashSdkLibStrings.ADDITIONAL_VERIFICATION_REQUIRED
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_NOT_ALLOWED
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_PUBLIC_DOMAIN
    - awsDashSdkLib.awsDashSdkLibStrings.OTHER
    - java.lang.String
  */
  type LoadBalancerTlsCertificateFailureReason = _LoadBalancerTlsCertificateFailureReason | java.lang.String
  type LoadBalancerTlsCertificateList = js.Array[LoadBalancerTlsCertificate]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_AUTO_RENEWAL
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_VALIDATION
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type LoadBalancerTlsCertificateRenewalStatus = _LoadBalancerTlsCertificateRenewalStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNSPECIFIED
    - awsDashSdkLib.awsDashSdkLibStrings.KEY_COMPROMISE
    - awsDashSdkLib.awsDashSdkLibStrings.CA_COMPROMISE
    - awsDashSdkLib.awsDashSdkLibStrings.AFFILIATION_CHANGED
    - awsDashSdkLib.awsDashSdkLibStrings.SUPERCEDED
    - awsDashSdkLib.awsDashSdkLibStrings.CESSATION_OF_OPERATION
    - awsDashSdkLib.awsDashSdkLibStrings.CERTIFICATE_HOLD
    - awsDashSdkLib.awsDashSdkLibStrings.REMOVE_FROM_CRL
    - awsDashSdkLib.awsDashSdkLibStrings.PRIVILEGE_WITHDRAWN
    - awsDashSdkLib.awsDashSdkLibStrings.A_A_COMPROMISE
    - java.lang.String
  */
  type LoadBalancerTlsCertificateRevocationReason = _LoadBalancerTlsCertificateRevocationReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_VALIDATION
    - awsDashSdkLib.awsDashSdkLibStrings.ISSUED
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
    - awsDashSdkLib.awsDashSdkLibStrings.VALIDATION_TIMED_OUT
    - awsDashSdkLib.awsDashSdkLibStrings.REVOKED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - java.lang.String
  */
  type LoadBalancerTlsCertificateStatus = _LoadBalancerTlsCertificateStatus | java.lang.String
  type LoadBalancerTlsCertificateSummaryList = js.Array[LoadBalancerTlsCertificateSummary]
  type LogEventList = js.Array[LogEvent]
  type MetricDatapointList = js.Array[MetricDatapoint]
  type MetricPeriod = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Minimum
    - awsDashSdkLib.awsDashSdkLibStrings.Maximum
    - awsDashSdkLib.awsDashSdkLibStrings.Sum
    - awsDashSdkLib.awsDashSdkLibStrings.Average
    - awsDashSdkLib.awsDashSdkLibStrings.SampleCount
    - java.lang.String
  */
  type MetricStatistic = _MetricStatistic | java.lang.String
  type MetricStatisticList = js.Array[MetricStatistic]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Seconds
    - awsDashSdkLib.awsDashSdkLibStrings.Microseconds
    - awsDashSdkLib.awsDashSdkLibStrings.Milliseconds
    - awsDashSdkLib.awsDashSdkLibStrings.Bytes
    - awsDashSdkLib.awsDashSdkLibStrings.Kilobytes
    - awsDashSdkLib.awsDashSdkLibStrings.Megabytes
    - awsDashSdkLib.awsDashSdkLibStrings.Gigabytes
    - awsDashSdkLib.awsDashSdkLibStrings.Terabytes
    - awsDashSdkLib.awsDashSdkLibStrings.Bits
    - awsDashSdkLib.awsDashSdkLibStrings.Kilobits
    - awsDashSdkLib.awsDashSdkLibStrings.Megabits
    - awsDashSdkLib.awsDashSdkLibStrings.Gigabits
    - awsDashSdkLib.awsDashSdkLibStrings.Terabits
    - awsDashSdkLib.awsDashSdkLibStrings.Percent
    - awsDashSdkLib.awsDashSdkLibStrings.Count
    - awsDashSdkLib.awsDashSdkLibStrings.`Bytes/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Kilobytes/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Megabytes/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Gigabytes/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Terabytes/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Bits/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Kilobits/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Megabits/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Gigabits/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Terabits/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Count/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.None
    - java.lang.String
  */
  type MetricUnit = _MetricUnit | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.tcp
    - awsDashSdkLib.awsDashSdkLibStrings.all
    - awsDashSdkLib.awsDashSdkLibStrings.udp
    - java.lang.String
  */
  type NetworkProtocol = _NetworkProtocol | java.lang.String
  type NonEmptyString = java.lang.String
  type OperationList = js.Array[Operation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NotStarted
    - awsDashSdkLib.awsDashSdkLibStrings.Started
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - java.lang.String
  */
  type OperationStatus = _OperationStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteKnownHostKeys
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteInstance
    - awsDashSdkLib.awsDashSdkLibStrings.CreateInstance
    - awsDashSdkLib.awsDashSdkLibStrings.StopInstance
    - awsDashSdkLib.awsDashSdkLibStrings.StartInstance
    - awsDashSdkLib.awsDashSdkLibStrings.RebootInstance
    - awsDashSdkLib.awsDashSdkLibStrings.OpenInstancePublicPorts
    - awsDashSdkLib.awsDashSdkLibStrings.PutInstancePublicPorts
    - awsDashSdkLib.awsDashSdkLibStrings.CloseInstancePublicPorts
    - awsDashSdkLib.awsDashSdkLibStrings.AllocateStaticIp
    - awsDashSdkLib.awsDashSdkLibStrings.ReleaseStaticIp
    - awsDashSdkLib.awsDashSdkLibStrings.AttachStaticIp
    - awsDashSdkLib.awsDashSdkLibStrings.DetachStaticIp
    - awsDashSdkLib.awsDashSdkLibStrings.UpdateDomainEntry
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteDomainEntry
    - awsDashSdkLib.awsDashSdkLibStrings.CreateDomain
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteDomain
    - awsDashSdkLib.awsDashSdkLibStrings.CreateInstanceSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteInstanceSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.CreateInstancesFromSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.CreateLoadBalancer
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteLoadBalancer
    - awsDashSdkLib.awsDashSdkLibStrings.AttachInstancesToLoadBalancer
    - awsDashSdkLib.awsDashSdkLibStrings.DetachInstancesFromLoadBalancer
    - awsDashSdkLib.awsDashSdkLibStrings.UpdateLoadBalancerAttribute
    - awsDashSdkLib.awsDashSdkLibStrings.CreateLoadBalancerTlsCertificate
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteLoadBalancerTlsCertificate
    - awsDashSdkLib.awsDashSdkLibStrings.AttachLoadBalancerTlsCertificate
    - awsDashSdkLib.awsDashSdkLibStrings.CreateDisk
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteDisk
    - awsDashSdkLib.awsDashSdkLibStrings.AttachDisk
    - awsDashSdkLib.awsDashSdkLibStrings.DetachDisk
    - awsDashSdkLib.awsDashSdkLibStrings.CreateDiskSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteDiskSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.CreateDiskFromSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.CreateRelationalDatabase
    - awsDashSdkLib.awsDashSdkLibStrings.UpdateRelationalDatabase
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteRelationalDatabase
    - awsDashSdkLib.awsDashSdkLibStrings.CreateRelationalDatabaseFromSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.CreateRelationalDatabaseSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteRelationalDatabaseSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.UpdateRelationalDatabaseParameters
    - awsDashSdkLib.awsDashSdkLibStrings.StartRelationalDatabase
    - awsDashSdkLib.awsDashSdkLibStrings.RebootRelationalDatabase
    - awsDashSdkLib.awsDashSdkLibStrings.StopRelationalDatabase
    - java.lang.String
  */
  type OperationType = _OperationType | java.lang.String
  type PendingMaintenanceActionList = js.Array[PendingMaintenanceAction]
  type Port = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Public
    - awsDashSdkLib.awsDashSdkLibStrings.Private
    - java.lang.String
  */
  type PortAccessType = _PortAccessType | java.lang.String
  type PortInfoList = js.Array[PortInfo]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.CLOSED
    - java.lang.String
  */
  type PortInfoSourceType = _PortInfoSourceType | java.lang.String
  type PortList = js.Array[Port]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.open
    - awsDashSdkLib.awsDashSdkLibStrings.closed
    - java.lang.String
  */
  type PortState = _PortState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Started
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type RecordState = _RecordState | java.lang.String
  type RegionList = js.Array[Region]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`us-east-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-east-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-west-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-west-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-3`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-central-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ca-central-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-south-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-2`
    - java.lang.String
  */
  type RegionName = _RegionName | java.lang.String
  type RelationalDatabaseBlueprintList = js.Array[RelationalDatabaseBlueprint]
  type RelationalDatabaseBundleList = js.Array[RelationalDatabaseBundle]
  type RelationalDatabaseEngine = awsDashSdkLib.awsDashSdkLibStrings.mysql | java.lang.String
  type RelationalDatabaseEventList = js.Array[RelationalDatabaseEvent]
  type RelationalDatabaseList = js.Array[RelationalDatabase]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CPUUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.DatabaseConnections
    - awsDashSdkLib.awsDashSdkLibStrings.DiskQueueDepth
    - awsDashSdkLib.awsDashSdkLibStrings.FreeStorageSpace
    - awsDashSdkLib.awsDashSdkLibStrings.NetworkReceiveThroughput
    - awsDashSdkLib.awsDashSdkLibStrings.NetworkTransmitThroughput
    - java.lang.String
  */
  type RelationalDatabaseMetricName = _RelationalDatabaseMetricName | java.lang.String
  type RelationalDatabaseParameterList = js.Array[RelationalDatabaseParameter]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CURRENT
    - awsDashSdkLib.awsDashSdkLibStrings.PREVIOUS
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - java.lang.String
  */
  type RelationalDatabasePasswordVersion = _RelationalDatabasePasswordVersion | java.lang.String
  type RelationalDatabaseSnapshotList = js.Array[RelationalDatabaseSnapshot]
  type ResourceName = java.lang.String
  type ResourceNameList = js.Array[ResourceName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Instance
    - awsDashSdkLib.awsDashSdkLibStrings.StaticIp
    - awsDashSdkLib.awsDashSdkLibStrings.KeyPair
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.Domain
    - awsDashSdkLib.awsDashSdkLibStrings.PeeredVpc
    - awsDashSdkLib.awsDashSdkLibStrings.LoadBalancer
    - awsDashSdkLib.awsDashSdkLibStrings.LoadBalancerTlsCertificate
    - awsDashSdkLib.awsDashSdkLibStrings.Disk
    - awsDashSdkLib.awsDashSdkLibStrings.DiskSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.RelationalDatabase
    - awsDashSdkLib.awsDashSdkLibStrings.RelationalDatabaseSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.ExportSnapshotRecord
    - awsDashSdkLib.awsDashSdkLibStrings.CloudFormationStackRecord
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type SensitiveString = java.lang.String
  type StaticIpList = js.Array[StaticIp]
  type StringList = js.Array[java.lang.String]
  type StringMax256 = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-11-28`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type double = scala.Double
  type float = scala.Double
  type integer = scala.Double
  type timestamp = stdLib.Date
}
