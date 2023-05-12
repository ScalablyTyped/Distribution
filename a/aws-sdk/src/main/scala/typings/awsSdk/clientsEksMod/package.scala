package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AL2_x86_64
  - typings.awsSdk.awsSdkStrings.AL2_x86_64_GPU
  - typings.awsSdk.awsSdkStrings.AL2_ARM_64
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - typings.awsSdk.awsSdkStrings.BOTTLEROCKET_ARM_64
  - typings.awsSdk.awsSdkStrings.BOTTLEROCKET_x86_64
  - typings.awsSdk.awsSdkStrings.BOTTLEROCKET_ARM_64_NVIDIA
  - typings.awsSdk.awsSdkStrings.BOTTLEROCKET_x86_64_NVIDIA
  - typings.awsSdk.awsSdkStrings.WINDOWS_CORE_2019_x86_64
  - typings.awsSdk.awsSdkStrings.WINDOWS_FULL_2019_x86_64
  - typings.awsSdk.awsSdkStrings.WINDOWS_CORE_2022_x86_64
  - typings.awsSdk.awsSdkStrings.WINDOWS_FULL_2022_x86_64
  - java.lang.String
*/
type AMITypes = _AMITypes | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AccessDenied
  - typings.awsSdk.awsSdkStrings.InternalFailure
  - typings.awsSdk.awsSdkStrings.ClusterUnreachable
  - typings.awsSdk.awsSdkStrings.InsufficientNumberOfReplicas
  - typings.awsSdk.awsSdkStrings.ConfigurationConflict
  - typings.awsSdk.awsSdkStrings.AdmissionRequestDenied
  - typings.awsSdk.awsSdkStrings.UnsupportedAddonModification
  - typings.awsSdk.awsSdkStrings.K8sResourceNotFound
  - java.lang.String
*/
type AddonIssueCode = _AddonIssueCode | java.lang.String

type AddonIssueList = js.Array[AddonIssue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.DEGRADED
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type AddonStatus = _AddonStatus | java.lang.String

type AddonVersionInfoList = js.Array[AddonVersionInfo]

type Addons = js.Array[AddonInfo]

type AutoScalingGroupList = js.Array[AutoScalingGroup]

type Boolean = scala.Boolean

type BoxedBoolean = scala.Boolean

type BoxedInteger = Double

type Capacity = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ON_DEMAND
  - typings.awsSdk.awsSdkStrings.SPOT
  - java.lang.String
*/
type CapacityTypes = _CapacityTypes | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AccessDenied
  - typings.awsSdk.awsSdkStrings.ClusterUnreachable
  - typings.awsSdk.awsSdkStrings.ConfigurationConflict
  - typings.awsSdk.awsSdkStrings.InternalFailure
  - typings.awsSdk.awsSdkStrings.ResourceLimitExceeded
  - typings.awsSdk.awsSdkStrings.ResourceNotFound
  - java.lang.String
*/
type ClusterIssueCode = _ClusterIssueCode | java.lang.String

type ClusterIssueList = js.Array[ClusterIssue]

type ClusterName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type ClusterStatus = _ClusterStatus | java.lang.String

type Compatibilities = js.Array[Compatibility]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EKS_ANYWHERE
  - typings.awsSdk.awsSdkStrings.ANTHOS
  - typings.awsSdk.awsSdkStrings.GKE
  - typings.awsSdk.awsSdkStrings.AKS
  - typings.awsSdk.awsSdkStrings.OPENSHIFT
  - typings.awsSdk.awsSdkStrings.TANZU
  - typings.awsSdk.awsSdkStrings.RANCHER
  - typings.awsSdk.awsSdkStrings.EC2
  - typings.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
type ConnectorConfigProvider = _ConnectorConfigProvider | java.lang.String

type DescribeAddonVersionsRequestMaxResults = Double

type EncryptionConfigList = js.Array[EncryptionConfig]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SubnetNotFound
  - typings.awsSdk.awsSdkStrings.SecurityGroupNotFound
  - typings.awsSdk.awsSdkStrings.EniLimitReached
  - typings.awsSdk.awsSdkStrings.IpNotAvailable
  - typings.awsSdk.awsSdkStrings.AccessDenied
  - typings.awsSdk.awsSdkStrings.OperationNotPermitted
  - typings.awsSdk.awsSdkStrings.VpcIdNotFound
  - typings.awsSdk.awsSdkStrings.Unknown_
  - typings.awsSdk.awsSdkStrings.NodeCreationFailure
  - typings.awsSdk.awsSdkStrings.PodEvictionFailure
  - typings.awsSdk.awsSdkStrings.InsufficientFreeAddresses
  - typings.awsSdk.awsSdkStrings.ClusterUnreachable
  - typings.awsSdk.awsSdkStrings.InsufficientNumberOfReplicas
  - typings.awsSdk.awsSdkStrings.ConfigurationConflict
  - typings.awsSdk.awsSdkStrings.AdmissionRequestDenied
  - typings.awsSdk.awsSdkStrings.UnsupportedAddonModification
  - typings.awsSdk.awsSdkStrings.K8sResourceNotFound
  - java.lang.String
*/
type ErrorCode = _ErrorCode | java.lang.String

type ErrorDetails = js.Array[ErrorDetail]

type FargateProfileLabel = StringDictionary[String]

type FargateProfileSelectors = js.Array[FargateProfileSelector]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type FargateProfileStatus = _FargateProfileStatus | java.lang.String

type FargateProfilesRequestMaxResults = Double

type IdentityProviderConfigs = js.Array[IdentityProviderConfig]

type IncludeClustersList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ipv4__
  - typings.awsSdk.awsSdkStrings.ipv6__
  - java.lang.String
*/
type IpFamily = _IpFamily | java.lang.String

type IssueList = js.Array[Issue]

type ListAddonsRequestMaxResults = Double

type ListClustersRequestMaxResults = Double

type ListIdentityProviderConfigsRequestMaxResults = Double

type ListNodegroupsRequestMaxResults = Double

type ListUpdatesRequestMaxResults = Double

type LogSetups = js.Array[LogSetup]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.api_
  - typings.awsSdk.awsSdkStrings.audit_
  - typings.awsSdk.awsSdkStrings.authenticator
  - typings.awsSdk.awsSdkStrings.controllerManager
  - typings.awsSdk.awsSdkStrings.scheduler
  - java.lang.String
*/
type LogType = _LogType | java.lang.String

type LogTypes = js.Array[LogType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AutoScalingGroupNotFound
  - typings.awsSdk.awsSdkStrings.AutoScalingGroupInvalidConfiguration
  - typings.awsSdk.awsSdkStrings.Ec2SecurityGroupNotFound
  - typings.awsSdk.awsSdkStrings.Ec2SecurityGroupDeletionFailure
  - typings.awsSdk.awsSdkStrings.Ec2LaunchTemplateNotFound
  - typings.awsSdk.awsSdkStrings.Ec2LaunchTemplateVersionMismatch
  - typings.awsSdk.awsSdkStrings.Ec2SubnetNotFound
  - typings.awsSdk.awsSdkStrings.Ec2SubnetInvalidConfiguration
  - typings.awsSdk.awsSdkStrings.IamInstanceProfileNotFound
  - typings.awsSdk.awsSdkStrings.IamLimitExceeded
  - typings.awsSdk.awsSdkStrings.IamNodeRoleNotFound
  - typings.awsSdk.awsSdkStrings.NodeCreationFailure
  - typings.awsSdk.awsSdkStrings.AsgInstanceLaunchFailures
  - typings.awsSdk.awsSdkStrings.InstanceLimitExceeded
  - typings.awsSdk.awsSdkStrings.InsufficientFreeAddresses
  - typings.awsSdk.awsSdkStrings.AccessDenied
  - typings.awsSdk.awsSdkStrings.InternalFailure
  - typings.awsSdk.awsSdkStrings.ClusterUnreachable
  - typings.awsSdk.awsSdkStrings.Ec2SubnetMissingIpv6Assignment
  - java.lang.String
*/
type NodegroupIssueCode = _NodegroupIssueCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.DEGRADED
  - java.lang.String
*/
type NodegroupStatus = _NodegroupStatus | java.lang.String

type NonZeroInteger = Double

type PercentCapacity = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OVERWRITE
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.PRESERVE
  - java.lang.String
*/
type ResolveConflicts = _ResolveConflicts | java.lang.String

type RoleArn = java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NO_SCHEDULE
  - typings.awsSdk.awsSdkStrings.NO_EXECUTE
  - typings.awsSdk.awsSdkStrings.PREFER_NO_SCHEDULE
  - java.lang.String
*/
type TaintEffect = _TaintEffect | java.lang.String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Version_
  - typings.awsSdk.awsSdkStrings.PlatformVersion
  - typings.awsSdk.awsSdkStrings.EndpointPrivateAccess
  - typings.awsSdk.awsSdkStrings.EndpointPublicAccess
  - typings.awsSdk.awsSdkStrings.ClusterLogging
  - typings.awsSdk.awsSdkStrings.DesiredSize
  - typings.awsSdk.awsSdkStrings.LabelsToAdd
  - typings.awsSdk.awsSdkStrings.LabelsToRemove
  - typings.awsSdk.awsSdkStrings.TaintsToAdd
  - typings.awsSdk.awsSdkStrings.TaintsToRemove
  - typings.awsSdk.awsSdkStrings.MaxSize
  - typings.awsSdk.awsSdkStrings.MinSize
  - typings.awsSdk.awsSdkStrings.ReleaseVersion
  - typings.awsSdk.awsSdkStrings.PublicAccessCidrs
  - typings.awsSdk.awsSdkStrings.LaunchTemplateName
  - typings.awsSdk.awsSdkStrings.LaunchTemplateVersion
  - typings.awsSdk.awsSdkStrings.IdentityProviderConfig
  - typings.awsSdk.awsSdkStrings.EncryptionConfig
  - typings.awsSdk.awsSdkStrings.AddonVersion
  - typings.awsSdk.awsSdkStrings.ServiceAccountRoleArn
  - typings.awsSdk.awsSdkStrings.ResolveConflicts
  - typings.awsSdk.awsSdkStrings.MaxUnavailable
  - typings.awsSdk.awsSdkStrings.MaxUnavailablePercentage
  - java.lang.String
*/
type UpdateParamType = _UpdateParamType | java.lang.String

type UpdateParams = js.Array[UpdateParam]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Cancelled_
  - typings.awsSdk.awsSdkStrings.Successful_
  - java.lang.String
*/
type UpdateStatus = _UpdateStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VersionUpdate
  - typings.awsSdk.awsSdkStrings.EndpointAccessUpdate
  - typings.awsSdk.awsSdkStrings.LoggingUpdate
  - typings.awsSdk.awsSdkStrings.ConfigUpdate
  - typings.awsSdk.awsSdkStrings.AssociateIdentityProviderConfig
  - typings.awsSdk.awsSdkStrings.DisassociateIdentityProviderConfig
  - typings.awsSdk.awsSdkStrings.AssociateEncryptionConfig
  - typings.awsSdk.awsSdkStrings.AddonUpdate
  - java.lang.String
*/
type UpdateType = _UpdateType | java.lang.String

type ZeroCapacity = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-11-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - java.lang.String
*/
type configStatus = _configStatus | java.lang.String

type labelKey = java.lang.String

type labelValue = java.lang.String

type labelsKeyList = js.Array[String]

type labelsMap = StringDictionary[labelValue]

type requiredClaimsKey = java.lang.String

type requiredClaimsMap = StringDictionary[requiredClaimsValue]

type requiredClaimsValue = java.lang.String

type taintKey = java.lang.String

type taintValue = java.lang.String

type taintsList = js.Array[Taint]
