package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.NetAppONTAP
import typings.awsSdk.awsSdkStrings.SIMPLE_PATTERN
import typings.awsSdk.awsSdkStrings.SVM
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActivationKey = String

type AgentArn = String

type AgentArnList = js.Array[AgentArn]

type AgentList = js.Array[AgentListEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ONLINE
  - typings.awsSdk.awsSdkStrings.OFFLINE
  - java.lang.String
*/
type AgentStatus = _AgentStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.BEST_EFFORT
  - java.lang.String
*/
type Atime = _Atime | String

type BytesPerSecond = Double

type CollectionDurationMinutes = Double

type DestinationNetworkInterfaceArns = js.Array[NetworkInterfaceArn]

type DiscoveryAgentArnList = js.Array[AgentArn]

type DiscoveryJobArn = String

type DiscoveryJobList = js.Array[DiscoveryJobListEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.WARNING
  - typings.awsSdk.awsSdkStrings.TERMINATED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.COMPLETED_WITH_ISSUES
  - java.lang.String
*/
type DiscoveryJobStatus = _DiscoveryJobStatus | String

type DiscoveryMaxResults = Double

type DiscoveryNextToken = String

type DiscoveryResourceFilter = SVM | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SVM
  - typings.awsSdk.awsSdkStrings.VOLUME
  - typings.awsSdk.awsSdkStrings.CLUSTER
  - java.lang.String
*/
type DiscoveryResourceType = _DiscoveryResourceType | String

type DiscoveryServerHostname = String

type DiscoveryServerPort = Double

type DiscoverySystemType = NetAppONTAP | String

type DiscoveryTime = js.Date

type Duration = Double

type Ec2SecurityGroupArn = String

type Ec2SecurityGroupArnList = js.Array[Ec2SecurityGroupArn]

type Ec2SubnetArn = String

type EfsAccessPointArn = String

type EfsFilesystemArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.TLS1_2
  - java.lang.String
*/
type EfsInTransitEncryption = _EfsInTransitEncryption | String

type EfsSubdirectory = String

type EnabledProtocols = js.Array[PtolemyString]

type Endpoint = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLIC
  - typings.awsSdk.awsSdkStrings.PRIVATE_LINK
  - typings.awsSdk.awsSdkStrings.FIPS
  - java.lang.String
*/
type EndpointType = _EndpointType | String

type ErrorMessage = String

type FilterAttributeValue = String

type FilterList = js.Array[FilterRule]

type FilterMembers = js.Array[PtolemyString]

type FilterType = SIMPLE_PATTERN | String

type FilterValue = String

type FilterValues = js.Array[FilterAttributeValue]

type FsxFilesystemArn = String

type FsxLustreSubdirectory = String

type FsxOntapSubdirectory = String

type FsxOpenZfsSubdirectory = String

type FsxWindowsSubdirectory = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.INT_VALUE
  - typings.awsSdk.awsSdkStrings.NAME
  - typings.awsSdk.awsSdkStrings.BOTH
  - java.lang.String
*/
type Gid = _Gid | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SIMPLE
  - typings.awsSdk.awsSdkStrings.KERBEROS
  - java.lang.String
*/
type HdfsAuthenticationType = _HdfsAuthenticationType | String

type HdfsBlockSize = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.AUTHENTICATION
  - typings.awsSdk.awsSdkStrings.INTEGRITY
  - typings.awsSdk.awsSdkStrings.PRIVACY
  - java.lang.String
*/
type HdfsDataTransferProtection = _HdfsDataTransferProtection | String

type HdfsNameNodeList = js.Array[HdfsNameNode]

type HdfsReplicationFactor = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.AUTHENTICATION
  - typings.awsSdk.awsSdkStrings.INTEGRITY
  - typings.awsSdk.awsSdkStrings.PRIVACY
  - java.lang.String
*/
type HdfsRpcProtection = _HdfsRpcProtection | String

type HdfsServerHostname = String

type HdfsServerPort = Double

type HdfsSubdirectory = String

type HdfsUser = String

type IamRoleArn = String

type InputTagList = js.Array[TagListEntry]

type KerberosKeytabFile = Buffer | js.typedarray.Uint8Array | Blob | String

type KerberosKrb5ConfFile = Buffer | js.typedarray.Uint8Array | Blob | String

type KerberosPrincipal = String

type KmsKeyProviderUri = String

type LocationArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LocationUri
  - typings.awsSdk.awsSdkStrings.LocationType
  - typings.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type LocationFilterName = _LocationFilterName | String

type LocationFilters = js.Array[LocationFilter]

type LocationList = js.Array[LocationListEntry]

type LocationUri = String

type LogGroupArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.BASIC
  - typings.awsSdk.awsSdkStrings.TRANSFER
  - java.lang.String
*/
type LogLevel = _LogLevel | String

type MaxResults = Double

type Metrics = js.Array[ResourceMetrics]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.PRESERVE
  - java.lang.String
*/
type Mtime = _Mtime | String

type Name = String

type NetAppONTAPClusters = js.Array[NetAppONTAPCluster]

type NetAppONTAPSVMs = js.Array[NetAppONTAPSVM]

type NetAppONTAPVolumes = js.Array[NetAppONTAPVolume]

type NetworkInterfaceArn = String

type NextToken = String

type NfsSubdirectory = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTOMATIC
  - typings.awsSdk.awsSdkStrings.NFS3
  - typings.awsSdk.awsSdkStrings.NFS4_0
  - typings.awsSdk.awsSdkStrings.NFS4_1
  - java.lang.String
*/
type NfsVersion = _NfsVersion | String

type NonNegativeDouble = Double

type NonNegativeLong = Double

type ObjectStorageAccessKey = String

type ObjectStorageBucketName = String

type ObjectStorageCertificate = Buffer | js.typedarray.Uint8Array | Blob | String

type ObjectStorageSecretKey = String

type ObjectStorageServerPort = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTPS
  - typings.awsSdk.awsSdkStrings.HTTP
  - java.lang.String
*/
type ObjectStorageServerProtocol = _ObjectStorageServerProtocol | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRESERVE
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ObjectTags = _ObjectTags | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Equals_
  - typings.awsSdk.awsSdkStrings.NotEquals
  - typings.awsSdk.awsSdkStrings.In_
  - typings.awsSdk.awsSdkStrings.LessThanOrEqual
  - typings.awsSdk.awsSdkStrings.LessThan
  - typings.awsSdk.awsSdkStrings.GreaterThanOrEqual
  - typings.awsSdk.awsSdkStrings.GreaterThan
  - typings.awsSdk.awsSdkStrings.Contains_
  - typings.awsSdk.awsSdkStrings.NotContains
  - typings.awsSdk.awsSdkStrings.BeginsWith
  - java.lang.String
*/
type Operator = _Operator | String

type OutputTagList = js.Array[TagListEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALWAYS
  - typings.awsSdk.awsSdkStrings.NEVER
  - java.lang.String
*/
type OverwriteMode = _OverwriteMode | String

type PLSecurityGroupArnList = js.Array[Ec2SecurityGroupArn]

type PLSubnetArnList = js.Array[Ec2SubnetArn]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type PhaseStatus = _PhaseStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.PRESERVE
  - java.lang.String
*/
type PosixPermissions = _PosixPermissions | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRESERVE
  - typings.awsSdk.awsSdkStrings.REMOVE
  - java.lang.String
*/
type PreserveDeletedFiles = _PreserveDeletedFiles | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.PRESERVE
  - java.lang.String
*/
type PreserveDevices = _PreserveDevices | String

type PtolemyBoolean = Boolean

type PtolemyPassword = String

type PtolemyString = String

type PtolemyUUID = String

type PtolemyUsername = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type RecommendationStatus = _RecommendationStatus | String

type Recommendations = js.Array[Recommendation]

type RecommendationsConfigMap = StringDictionary[PtolemyString]

type ResourceFilters = StringDictionary[FilterMembers]

type ResourceId = String

type ResourceIds = js.Array[ResourceId]

type S3BucketArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.STANDARD_IA
  - typings.awsSdk.awsSdkStrings.ONEZONE_IA
  - typings.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typings.awsSdk.awsSdkStrings.GLACIER
  - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - typings.awsSdk.awsSdkStrings.OUTPOSTS
  - typings.awsSdk.awsSdkStrings.GLACIER_INSTANT_RETRIEVAL
  - java.lang.String
*/
type S3StorageClass = _S3StorageClass | String

type S3Subdirectory = String

type ScheduleExpressionCron = String

type SecretsManagerArn = String

type ServerHostname = String

type SmbDomain = String

type SmbPassword = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.OWNER_DACL
  - typings.awsSdk.awsSdkStrings.OWNER_DACL_SACL
  - java.lang.String
*/
type SmbSecurityDescriptorCopyFlags = _SmbSecurityDescriptorCopyFlags | String

type SmbSubdirectory = String

type SmbUser = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTOMATIC
  - typings.awsSdk.awsSdkStrings.SMB2
  - typings.awsSdk.awsSdkStrings.SMB3
  - typings.awsSdk.awsSdkStrings.SMB1
  - typings.awsSdk.awsSdkStrings.SMB2_0
  - java.lang.String
*/
type SmbVersion = _SmbVersion | String

type SourceNetworkInterfaceArns = js.Array[NetworkInterfaceArn]

type StorageSystemArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PASS
  - typings.awsSdk.awsSdkStrings.FAIL
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type StorageSystemConnectivityStatus = _StorageSystemConnectivityStatus | String

type StorageSystemList = js.Array[StorageSystemListEntry]

type StorageVirtualMachineArn = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagValue = String

type TaggableResourceArn = String

type TaskArn = String

type TaskExecutionArn = String

type TaskExecutionList = js.Array[TaskExecutionListEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUEUED
  - typings.awsSdk.awsSdkStrings.LAUNCHING
  - typings.awsSdk.awsSdkStrings.PREPARING
  - typings.awsSdk.awsSdkStrings.TRANSFERRING
  - typings.awsSdk.awsSdkStrings.VERIFYING
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type TaskExecutionStatus = _TaskExecutionStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LocationId
  - typings.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type TaskFilterName = _TaskFilterName | String

type TaskFilters = js.Array[TaskFilter]

type TaskList = js.Array[TaskListEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type TaskQueueing = _TaskQueueing | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.QUEUED
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.UNAVAILABLE
  - java.lang.String
*/
type TaskStatus = _TaskStatus | String

type Time = js.Date

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CHANGED
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type TransferMode = _TransferMode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.INT_VALUE
  - typings.awsSdk.awsSdkStrings.NAME
  - typings.awsSdk.awsSdkStrings.BOTH
  - java.lang.String
*/
type Uid = _Uid | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.POINT_IN_TIME_CONSISTENT
  - typings.awsSdk.awsSdkStrings.ONLY_FILES_TRANSFERRED
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type VerifyMode = _VerifyMode | String

type VpcEndpointId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-11-09`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type long = Double
