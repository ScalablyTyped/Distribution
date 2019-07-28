package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCodedeployMod {
  type AdditionalDeploymentStatusInfo = String
  type AlarmList = js.Array[Alarm]
  type AlarmName = String
  type ApplicationId = String
  type ApplicationName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.registerTime
    - typings.awsDashSdk.awsDashSdkStrings.firstUsedTime
    - typings.awsDashSdk.awsDashSdkStrings.lastUsedTime
    - java.lang.String
  */
  type ApplicationRevisionSortBy = _ApplicationRevisionSortBy | String
  type ApplicationsInfoList = js.Array[ApplicationInfo]
  type ApplicationsList = js.Array[ApplicationName]
  type Arn = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEPLOYMENT_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.DEPLOYMENT_STOP_ON_ALARM
    - typings.awsDashSdk.awsDashSdkStrings.DEPLOYMENT_STOP_ON_REQUEST
    - java.lang.String
  */
  type AutoRollbackEvent = _AutoRollbackEvent | String
  type AutoRollbackEventsList = js.Array[AutoRollbackEvent]
  type AutoScalingGroupHook = String
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type AutoScalingGroupName = String
  type AutoScalingGroupNameList = js.Array[AutoScalingGroupName]
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.tar
    - typings.awsDashSdk.awsDashSdkStrings.tgz
    - typings.awsDashSdk.awsDashSdkStrings.zip
    - typings.awsDashSdk.awsDashSdkStrings.YAML
    - typings.awsDashSdk.awsDashSdkStrings.JSON
    - java.lang.String
  */
  type BundleType = _BundleType | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CommitId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Server
    - typings.awsDashSdk.awsDashSdkStrings.Lambda
    - typings.awsDashSdk.awsDashSdkStrings.ECS
    - java.lang.String
  */
  type ComputePlatform = _ComputePlatform | String
  type DeploymentConfigId = String
  type DeploymentConfigName = String
  type DeploymentConfigsList = js.Array[DeploymentConfigName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.user
    - typings.awsDashSdk.awsDashSdkStrings.autoscaling
    - typings.awsDashSdk.awsDashSdkStrings.codeDeployRollback
    - java.lang.String
  */
  type DeploymentCreator = _DeploymentCreator | String
  type DeploymentGroupId = String
  type DeploymentGroupInfoList = js.Array[DeploymentGroupInfo]
  type DeploymentGroupName = String
  type DeploymentGroupsList = js.Array[DeploymentGroupName]
  type DeploymentId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WITH_TRAFFIC_CONTROL
    - typings.awsDashSdk.awsDashSdkStrings.WITHOUT_TRAFFIC_CONTROL
    - java.lang.String
  */
  type DeploymentOption = _DeploymentOption | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONTINUE_DEPLOYMENT
    - typings.awsDashSdk.awsDashSdkStrings.STOP_DEPLOYMENT
    - java.lang.String
  */
  type DeploymentReadyAction = _DeploymentReadyAction | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Created
    - typings.awsDashSdk.awsDashSdkStrings.Queued
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Stopped
    - typings.awsDashSdk.awsDashSdkStrings.Ready
    - java.lang.String
  */
  type DeploymentStatus = _DeploymentStatus | String
  type DeploymentStatusList = js.Array[DeploymentStatus]
  type DeploymentStatusMessageList = js.Array[ErrorMessage]
  type DeploymentTargetList = js.Array[DeploymentTarget]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InstanceTarget
    - typings.awsDashSdk.awsDashSdkStrings.LambdaTarget
    - typings.awsDashSdk.awsDashSdkStrings.ECSTarget
    - java.lang.String
  */
  type DeploymentTargetType = _DeploymentTargetType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PLACE
    - typings.awsDashSdk.awsDashSdkStrings.BLUE_GREEN
    - java.lang.String
  */
  type DeploymentType = _DeploymentType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.READY_WAIT
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATION_WAIT
    - java.lang.String
  */
  type DeploymentWaitType = _DeploymentWaitType | String
  type DeploymentsInfoList = js.Array[DeploymentInfo]
  type DeploymentsList = js.Array[DeploymentId]
  type Description = String
  type Duration = Double
  type EC2TagFilterList = js.Array[EC2TagFilter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.KEY_ONLY
    - typings.awsDashSdk.awsDashSdkStrings.VALUE_ONLY
    - typings.awsDashSdk.awsDashSdkStrings.KEY_AND_VALUE
    - java.lang.String
  */
  type EC2TagFilterType = _EC2TagFilterType | String
  type EC2TagSetList = js.Array[EC2TagFilterList]
  type ECSClusterName = String
  type ECSServiceList = js.Array[ECSService]
  type ECSServiceName = String
  type ECSTaskSetCount = Double
  type ECSTaskSetIdentifier = String
  type ECSTaskSetList = js.Array[ECSTaskSet]
  type ECSTaskSetStatus = String
  type ELBInfoList = js.Array[ELBInfo]
  type ELBName = String
  type ETag = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AGENT_ISSUE
    - typings.awsDashSdk.awsDashSdkStrings.ALARM_ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.APPLICATION_MISSING
    - typings.awsDashSdk.awsDashSdkStrings.AUTOSCALING_VALIDATION_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.AUTO_SCALING_CONFIGURATION
    - typings.awsDashSdk.awsDashSdkStrings.AUTO_SCALING_IAM_ROLE_PERMISSIONS
    - typings.awsDashSdk.awsDashSdkStrings.CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOMER_APPLICATION_UNHEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.DEPLOYMENT_GROUP_MISSING
    - typings.awsDashSdk.awsDashSdkStrings.ECS_UPDATE_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.ELASTIC_LOAD_BALANCING_INVALID
    - typings.awsDashSdk.awsDashSdkStrings.ELB_INVALID_INSTANCE
    - typings.awsDashSdk.awsDashSdkStrings.HEALTH_CONSTRAINTS
    - typings.awsDashSdk.awsDashSdkStrings.HEALTH_CONSTRAINTS_INVALID
    - typings.awsDashSdk.awsDashSdkStrings.HOOK_EXECUTION_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.IAM_ROLE_MISSING
    - typings.awsDashSdk.awsDashSdkStrings.IAM_ROLE_PERMISSIONS
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_ECS_SERVICE
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_LAMBDA_CONFIGURATION
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_LAMBDA_FUNCTION
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_REVISION
    - typings.awsDashSdk.awsDashSdkStrings.MANUAL_STOP
    - typings.awsDashSdk.awsDashSdkStrings.MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION
    - typings.awsDashSdk.awsDashSdkStrings.MISSING_ELB_INFORMATION
    - typings.awsDashSdk.awsDashSdkStrings.MISSING_GITHUB_TOKEN
    - typings.awsDashSdk.awsDashSdkStrings.NO_EC2_SUBSCRIPTION
    - typings.awsDashSdk.awsDashSdkStrings.NO_INSTANCES
    - typings.awsDashSdk.awsDashSdkStrings.OVER_MAX_INSTANCES
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.REVISION_MISSING
    - typings.awsDashSdk.awsDashSdkStrings.THROTTLED
    - typings.awsDashSdk.awsDashSdkStrings.TIMEOUT
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | String
  type ErrorMessage = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISALLOW
    - typings.awsDashSdk.awsDashSdkStrings.OVERWRITE
    - typings.awsDashSdk.awsDashSdkStrings.RETAIN
    - java.lang.String
  */
  type FileExistsBehavior = _FileExistsBehavior | String
  type FilterValue = String
  type FilterValueList = js.Array[FilterValue]
  type GitHubAccountTokenName = String
  type GitHubAccountTokenNameList = js.Array[GitHubAccountTokenName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISCOVER_EXISTING
    - typings.awsDashSdk.awsDashSdkStrings.COPY_AUTO_SCALING_GROUP
    - java.lang.String
  */
  type GreenFleetProvisioningAction = _GreenFleetProvisioningAction | String
  type IamSessionArn = String
  type IamUserArn = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATE
    - typings.awsDashSdk.awsDashSdkStrings.KEEP_ALIVE
    - java.lang.String
  */
  type InstanceAction = _InstanceAction | String
  type InstanceArn = String
  type InstanceCount = Double
  type InstanceId = String
  type InstanceInfoList = js.Array[InstanceInfo]
  type InstanceName = String
  type InstanceNameList = js.Array[InstanceName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Skipped
    - typings.awsDashSdk.awsDashSdkStrings.Unknown
    - typings.awsDashSdk.awsDashSdkStrings.Ready
    - java.lang.String
  */
  type InstanceStatus = _InstanceStatus | String
  type InstanceStatusList = js.Array[InstanceStatus]
  type InstanceSummaryList = js.Array[InstanceSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Blue
    - typings.awsDashSdk.awsDashSdkStrings.Green
    - java.lang.String
  */
  type InstanceType = _InstanceType | String
  type InstanceTypeList = js.Array[InstanceType]
  type InstancesList = js.Array[InstanceId]
  type Key = String
  type LambdaFunctionAlias = String
  type LambdaFunctionName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Success
    - typings.awsDashSdk.awsDashSdkStrings.ScriptMissing
    - typings.awsDashSdk.awsDashSdkStrings.ScriptNotExecutable
    - typings.awsDashSdk.awsDashSdkStrings.ScriptTimedOut
    - typings.awsDashSdk.awsDashSdkStrings.ScriptFailed
    - typings.awsDashSdk.awsDashSdkStrings.UnknownError
    - java.lang.String
  */
  type LifecycleErrorCode = _LifecycleErrorCode | String
  type LifecycleEventHookExecutionId = String
  type LifecycleEventList = js.Array[LifecycleEvent]
  type LifecycleEventName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Skipped
    - typings.awsDashSdk.awsDashSdkStrings.Unknown
    - java.lang.String
  */
  type LifecycleEventStatus = _LifecycleEventStatus | String
  type LifecycleMessage = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.include
    - typings.awsDashSdk.awsDashSdkStrings.exclude
    - typings.awsDashSdk.awsDashSdkStrings.ignore
    - java.lang.String
  */
  type ListStateFilterAction = _ListStateFilterAction | String
  type ListenerArn = String
  type ListenerArnList = js.Array[ListenerArn]
  type LogTail = String
  type Message = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HOST_COUNT
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_PERCENT
    - java.lang.String
  */
  type MinimumHealthyHostsType = _MinimumHealthyHostsType | String
  type MinimumHealthyHostsValue = Double
  type NextToken = String
  type NullableBoolean = scala.Boolean
  type OnPremisesTagSetList = js.Array[TagFilterList]
  type Percentage = Double
  type RawStringContent = String
  type RawStringSha256 = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Registered
    - typings.awsDashSdk.awsDashSdkStrings.Deregistered
    - java.lang.String
  */
  type RegistrationStatus = _RegistrationStatus | String
  type Repository = String
  type RevisionInfoList = js.Array[RevisionInfo]
  type RevisionLocationList = js.Array[RevisionLocation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.S3
    - typings.awsDashSdk.awsDashSdkStrings.GitHub
    - typings.awsDashSdk.awsDashSdkStrings.String
    - typings.awsDashSdk.awsDashSdkStrings.AppSpecContent
    - java.lang.String
  */
  type RevisionLocationType = _RevisionLocationType | String
  type Role = String
  type S3Bucket = String
  type S3Key = String
  type ScriptName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ascending
    - typings.awsDashSdk.awsDashSdkStrings.descending
    - java.lang.String
  */
  type SortOrder = _SortOrder | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded
    - java.lang.String
  */
  type StopStatus = _StopStatus | String
  type TagFilterList = js.Array[TagFilter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.KEY_ONLY
    - typings.awsDashSdk.awsDashSdkStrings.VALUE_ONLY
    - typings.awsDashSdk.awsDashSdkStrings.KEY_AND_VALUE
    - java.lang.String
  */
  type TagFilterType = _TagFilterType | String
  type TagKeyList = js.Array[Key]
  type TagList = js.Array[Tag]
  type TargetArn = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TargetStatus
    - typings.awsDashSdk.awsDashSdkStrings.ServerInstanceLabel
    - java.lang.String
  */
  type TargetFilterName = _TargetFilterName | String
  type TargetFilters = StringDictionary[FilterValueList]
  type TargetGroupInfoList = js.Array[TargetGroupInfo]
  type TargetGroupName = String
  type TargetGroupPairInfoList = js.Array[TargetGroupPairInfo]
  type TargetId = String
  type TargetIdList = js.Array[TargetId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Blue
    - typings.awsDashSdk.awsDashSdkStrings.Green
    - java.lang.String
  */
  type TargetLabel = _TargetLabel | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Skipped
    - typings.awsDashSdk.awsDashSdkStrings.Unknown
    - typings.awsDashSdk.awsDashSdkStrings.Ready
    - java.lang.String
  */
  type TargetStatus = _TargetStatus | String
  type Time = Date
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TimeBasedCanary
    - typings.awsDashSdk.awsDashSdkStrings.TimeBasedLinear
    - typings.awsDashSdk.awsDashSdkStrings.AllAtOnce
    - java.lang.String
  */
  type TrafficRoutingType = _TrafficRoutingType | String
  type TrafficWeight = Double
  type TriggerConfigList = js.Array[TriggerConfig]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DeploymentStart
    - typings.awsDashSdk.awsDashSdkStrings.DeploymentSuccess
    - typings.awsDashSdk.awsDashSdkStrings.DeploymentFailure
    - typings.awsDashSdk.awsDashSdkStrings.DeploymentStop
    - typings.awsDashSdk.awsDashSdkStrings.DeploymentRollback
    - typings.awsDashSdk.awsDashSdkStrings.DeploymentReady
    - typings.awsDashSdk.awsDashSdkStrings.InstanceStart
    - typings.awsDashSdk.awsDashSdkStrings.InstanceSuccess
    - typings.awsDashSdk.awsDashSdkStrings.InstanceFailure
    - typings.awsDashSdk.awsDashSdkStrings.InstanceReady
    - java.lang.String
  */
  type TriggerEventType = _TriggerEventType | String
  type TriggerEventTypeList = js.Array[TriggerEventType]
  type TriggerName = String
  type TriggerTargetArn = String
  type Value = String
  type Version = String
  type VersionId = String
  type WaitTimeInMins = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2014-10-06`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
