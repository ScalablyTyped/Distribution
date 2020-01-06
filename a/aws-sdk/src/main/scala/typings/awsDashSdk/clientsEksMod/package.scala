package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEksMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AL2_x86_64
    - typings.awsDashSdk.awsDashSdkStrings.AL2_x86_64_GPU
    - java.lang.String
  */
  type AMITypes = _AMITypes | java.lang.String
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type Boolean = scala.Boolean
  type BoxedBoolean = scala.Boolean
  type BoxedInteger = Double
  type Capacity = Double
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClusterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - java.lang.String
  */
  type ClusterStatus = _ClusterStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SubnetNotFound
    - typings.awsDashSdk.awsDashSdkStrings.SecurityGroupNotFound
    - typings.awsDashSdk.awsDashSdkStrings.EniLimitReached
    - typings.awsDashSdk.awsDashSdkStrings.IpNotAvailable
    - typings.awsDashSdk.awsDashSdkStrings.AccessDenied
    - typings.awsDashSdk.awsDashSdkStrings.OperationNotPermitted
    - typings.awsDashSdk.awsDashSdkStrings.VpcIdNotFound
    - typings.awsDashSdk.awsDashSdkStrings.Unknown_
    - typings.awsDashSdk.awsDashSdkStrings.NodeCreationFailure
    - typings.awsDashSdk.awsDashSdkStrings.PodEvictionFailure
    - typings.awsDashSdk.awsDashSdkStrings.InsufficientFreeAddresses
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | java.lang.String
  type ErrorDetails = js.Array[ErrorDetail]
  type FargateProfileLabel = StringDictionary[String]
  type FargateProfileSelectors = js.Array[FargateProfileSelector]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type FargateProfileStatus = _FargateProfileStatus | java.lang.String
  type FargateProfilesRequestMaxResults = Double
  type IssueList = js.Array[Issue]
  type ListClustersRequestMaxResults = Double
  type ListNodegroupsRequestMaxResults = Double
  type ListUpdatesRequestMaxResults = Double
  type LogSetups = js.Array[LogSetup]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.api_
    - typings.awsDashSdk.awsDashSdkStrings.audit_
    - typings.awsDashSdk.awsDashSdkStrings.authenticator
    - typings.awsDashSdk.awsDashSdkStrings.controllerManager
    - typings.awsDashSdk.awsDashSdkStrings.scheduler
    - java.lang.String
  */
  type LogType = _LogType | java.lang.String
  type LogTypes = js.Array[LogType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AutoScalingGroupNotFound
    - typings.awsDashSdk.awsDashSdkStrings.Ec2SecurityGroupNotFound
    - typings.awsDashSdk.awsDashSdkStrings.Ec2SecurityGroupDeletionFailure
    - typings.awsDashSdk.awsDashSdkStrings.Ec2LaunchTemplateNotFound
    - typings.awsDashSdk.awsDashSdkStrings.Ec2LaunchTemplateVersionMismatch
    - typings.awsDashSdk.awsDashSdkStrings.IamInstanceProfileNotFound
    - typings.awsDashSdk.awsDashSdkStrings.IamNodeRoleNotFound
    - typings.awsDashSdk.awsDashSdkStrings.AsgInstanceLaunchFailures
    - typings.awsDashSdk.awsDashSdkStrings.InstanceLimitExceeded
    - typings.awsDashSdk.awsDashSdkStrings.InsufficientFreeAddresses
    - typings.awsDashSdk.awsDashSdkStrings.AccessDenied
    - typings.awsDashSdk.awsDashSdkStrings.InternalFailure
    - java.lang.String
  */
  type NodegroupIssueCode = _NodegroupIssueCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DEGRADED
    - java.lang.String
  */
  type NodegroupStatus = _NodegroupStatus | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagMap = StringDictionary[TagValue]
  type TagValue = java.lang.String
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Version_
    - typings.awsDashSdk.awsDashSdkStrings.PlatformVersion
    - typings.awsDashSdk.awsDashSdkStrings.EndpointPrivateAccess
    - typings.awsDashSdk.awsDashSdkStrings.EndpointPublicAccess
    - typings.awsDashSdk.awsDashSdkStrings.ClusterLogging
    - typings.awsDashSdk.awsDashSdkStrings.DesiredSize
    - typings.awsDashSdk.awsDashSdkStrings.LabelsToAdd
    - typings.awsDashSdk.awsDashSdkStrings.LabelsToRemove
    - typings.awsDashSdk.awsDashSdkStrings.MaxSize
    - typings.awsDashSdk.awsDashSdkStrings.MinSize
    - typings.awsDashSdk.awsDashSdkStrings.ReleaseVersion
    - typings.awsDashSdk.awsDashSdkStrings.PublicAccessCidrs
    - java.lang.String
  */
  type UpdateParamType = _UpdateParamType | java.lang.String
  type UpdateParams = js.Array[UpdateParam]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled_
    - typings.awsDashSdk.awsDashSdkStrings.Successful_
    - java.lang.String
  */
  type UpdateStatus = _UpdateStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.VersionUpdate
    - typings.awsDashSdk.awsDashSdkStrings.EndpointAccessUpdate
    - typings.awsDashSdk.awsDashSdkStrings.LoggingUpdate
    - typings.awsDashSdk.awsDashSdkStrings.ConfigUpdate
    - java.lang.String
  */
  type UpdateType = _UpdateType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-11-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type labelKey = java.lang.String
  type labelValue = java.lang.String
  type labelsKeyList = js.Array[String]
  type labelsMap = StringDictionary[labelValue]
}
