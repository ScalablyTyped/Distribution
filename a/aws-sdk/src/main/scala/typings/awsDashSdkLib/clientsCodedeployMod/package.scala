package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCodedeployMod {
  type AdditionalDeploymentStatusInfo = java.lang.String
  type AlarmList = js.Array[Alarm]
  type AlarmName = java.lang.String
  type ApplicationId = java.lang.String
  type ApplicationName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.registerTime
    - awsDashSdkLib.awsDashSdkLibStrings.firstUsedTime
    - awsDashSdkLib.awsDashSdkLibStrings.lastUsedTime
    - java.lang.String
  */
  type ApplicationRevisionSortBy = _ApplicationRevisionSortBy | java.lang.String
  type ApplicationsInfoList = js.Array[ApplicationInfo]
  type ApplicationsList = js.Array[ApplicationName]
  type Arn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEPLOYMENT_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.DEPLOYMENT_STOP_ON_ALARM
    - awsDashSdkLib.awsDashSdkLibStrings.DEPLOYMENT_STOP_ON_REQUEST
    - java.lang.String
  */
  type AutoRollbackEvent = _AutoRollbackEvent | java.lang.String
  type AutoRollbackEventsList = js.Array[AutoRollbackEvent]
  type AutoScalingGroupHook = java.lang.String
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type AutoScalingGroupName = java.lang.String
  type AutoScalingGroupNameList = js.Array[AutoScalingGroupName]
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.tar
    - awsDashSdkLib.awsDashSdkLibStrings.tgz
    - awsDashSdkLib.awsDashSdkLibStrings.zip
    - awsDashSdkLib.awsDashSdkLibStrings.YAML
    - awsDashSdkLib.awsDashSdkLibStrings.JSON
    - java.lang.String
  */
  type BundleType = _BundleType | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CommitId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Server
    - awsDashSdkLib.awsDashSdkLibStrings.Lambda
    - awsDashSdkLib.awsDashSdkLibStrings.ECS
    - java.lang.String
  */
  type ComputePlatform = _ComputePlatform | java.lang.String
  type DeploymentConfigId = java.lang.String
  type DeploymentConfigName = java.lang.String
  type DeploymentConfigsList = js.Array[DeploymentConfigName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.user
    - awsDashSdkLib.awsDashSdkLibStrings.autoscaling
    - awsDashSdkLib.awsDashSdkLibStrings.codeDeployRollback
    - java.lang.String
  */
  type DeploymentCreator = _DeploymentCreator | java.lang.String
  type DeploymentGroupId = java.lang.String
  type DeploymentGroupInfoList = js.Array[DeploymentGroupInfo]
  type DeploymentGroupName = java.lang.String
  type DeploymentGroupsList = js.Array[DeploymentGroupName]
  type DeploymentId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.WITH_TRAFFIC_CONTROL
    - awsDashSdkLib.awsDashSdkLibStrings.WITHOUT_TRAFFIC_CONTROL
    - java.lang.String
  */
  type DeploymentOption = _DeploymentOption | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CONTINUE_DEPLOYMENT
    - awsDashSdkLib.awsDashSdkLibStrings.STOP_DEPLOYMENT
    - java.lang.String
  */
  type DeploymentReadyAction = _DeploymentReadyAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Created
    - awsDashSdkLib.awsDashSdkLibStrings.Queued
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Stopped
    - awsDashSdkLib.awsDashSdkLibStrings.Ready
    - java.lang.String
  */
  type DeploymentStatus = _DeploymentStatus | java.lang.String
  type DeploymentStatusList = js.Array[DeploymentStatus]
  type DeploymentStatusMessageList = js.Array[ErrorMessage]
  type DeploymentTargetList = js.Array[DeploymentTarget]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceTarget
    - awsDashSdkLib.awsDashSdkLibStrings.LambdaTarget
    - awsDashSdkLib.awsDashSdkLibStrings.ECSTarget
    - java.lang.String
  */
  type DeploymentTargetType = _DeploymentTargetType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PLACE
    - awsDashSdkLib.awsDashSdkLibStrings.BLUE_GREEN
    - java.lang.String
  */
  type DeploymentType = _DeploymentType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.READY_WAIT
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATION_WAIT
    - java.lang.String
  */
  type DeploymentWaitType = _DeploymentWaitType | java.lang.String
  type DeploymentsInfoList = js.Array[DeploymentInfo]
  type DeploymentsList = js.Array[DeploymentId]
  type Description = java.lang.String
  type Duration = scala.Double
  type EC2TagFilterList = js.Array[EC2TagFilter]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.KEY_ONLY
    - awsDashSdkLib.awsDashSdkLibStrings.VALUE_ONLY
    - awsDashSdkLib.awsDashSdkLibStrings.KEY_AND_VALUE
    - java.lang.String
  */
  type EC2TagFilterType = _EC2TagFilterType | java.lang.String
  type EC2TagSetList = js.Array[EC2TagFilterList]
  type ECSClusterName = java.lang.String
  type ECSServiceList = js.Array[ECSService]
  type ECSServiceName = java.lang.String
  type ECSTaskSetCount = scala.Double
  type ECSTaskSetIdentifier = java.lang.String
  type ECSTaskSetList = js.Array[ECSTaskSet]
  type ECSTaskSetStatus = java.lang.String
  type ELBInfoList = js.Array[ELBInfo]
  type ELBName = java.lang.String
  type ETag = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AGENT_ISSUE
    - awsDashSdkLib.awsDashSdkLibStrings.ALARM_ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.APPLICATION_MISSING
    - awsDashSdkLib.awsDashSdkLibStrings.AUTOSCALING_VALIDATION_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.AUTO_SCALING_CONFIGURATION
    - awsDashSdkLib.awsDashSdkLibStrings.AUTO_SCALING_IAM_ROLE_PERMISSIONS
    - awsDashSdkLib.awsDashSdkLibStrings.CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND
    - awsDashSdkLib.awsDashSdkLibStrings.CUSTOMER_APPLICATION_UNHEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.DEPLOYMENT_GROUP_MISSING
    - awsDashSdkLib.awsDashSdkLibStrings.ECS_UPDATE_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.ELASTIC_LOAD_BALANCING_INVALID
    - awsDashSdkLib.awsDashSdkLibStrings.ELB_INVALID_INSTANCE
    - awsDashSdkLib.awsDashSdkLibStrings.HEALTH_CONSTRAINTS
    - awsDashSdkLib.awsDashSdkLibStrings.HEALTH_CONSTRAINTS_INVALID
    - awsDashSdkLib.awsDashSdkLibStrings.HOOK_EXECUTION_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.IAM_ROLE_MISSING
    - awsDashSdkLib.awsDashSdkLibStrings.IAM_ROLE_PERMISSIONS
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_ECS_SERVICE
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_LAMBDA_CONFIGURATION
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_LAMBDA_FUNCTION
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_REVISION
    - awsDashSdkLib.awsDashSdkLibStrings.MANUAL_STOP
    - awsDashSdkLib.awsDashSdkLibStrings.MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION
    - awsDashSdkLib.awsDashSdkLibStrings.MISSING_ELB_INFORMATION
    - awsDashSdkLib.awsDashSdkLibStrings.MISSING_GITHUB_TOKEN
    - awsDashSdkLib.awsDashSdkLibStrings.NO_EC2_SUBSCRIPTION
    - awsDashSdkLib.awsDashSdkLibStrings.NO_INSTANCES
    - awsDashSdkLib.awsDashSdkLibStrings.OVER_MAX_INSTANCES
    - awsDashSdkLib.awsDashSdkLibStrings.RESOURCE_LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.REVISION_MISSING
    - awsDashSdkLib.awsDashSdkLibStrings.THROTTLED
    - awsDashSdkLib.awsDashSdkLibStrings.TIMEOUT
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DISALLOW
    - awsDashSdkLib.awsDashSdkLibStrings.OVERWRITE
    - awsDashSdkLib.awsDashSdkLibStrings.RETAIN
    - java.lang.String
  */
  type FileExistsBehavior = _FileExistsBehavior | java.lang.String
  type FilterValue = java.lang.String
  type FilterValueList = js.Array[FilterValue]
  type GitHubAccountTokenName = java.lang.String
  type GitHubAccountTokenNameList = js.Array[GitHubAccountTokenName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DISCOVER_EXISTING
    - awsDashSdkLib.awsDashSdkLibStrings.COPY_AUTO_SCALING_GROUP
    - java.lang.String
  */
  type GreenFleetProvisioningAction = _GreenFleetProvisioningAction | java.lang.String
  type IamSessionArn = java.lang.String
  type IamUserArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATE
    - awsDashSdkLib.awsDashSdkLibStrings.KEEP_ALIVE
    - java.lang.String
  */
  type InstanceAction = _InstanceAction | java.lang.String
  type InstanceArn = java.lang.String
  type InstanceCount = scala.Double
  type InstanceId = java.lang.String
  type InstanceInfoList = js.Array[InstanceInfo]
  type InstanceName = java.lang.String
  type InstanceNameList = js.Array[InstanceName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Skipped
    - awsDashSdkLib.awsDashSdkLibStrings.Unknown
    - awsDashSdkLib.awsDashSdkLibStrings.Ready
    - java.lang.String
  */
  type InstanceStatus = _InstanceStatus | java.lang.String
  type InstanceStatusList = js.Array[InstanceStatus]
  type InstanceSummaryList = js.Array[InstanceSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Blue
    - awsDashSdkLib.awsDashSdkLibStrings.Green
    - java.lang.String
  */
  type InstanceType = _InstanceType | java.lang.String
  type InstanceTypeList = js.Array[InstanceType]
  type InstancesList = js.Array[InstanceId]
  type Key = java.lang.String
  type LambdaFunctionAlias = java.lang.String
  type LambdaFunctionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Success
    - awsDashSdkLib.awsDashSdkLibStrings.ScriptMissing
    - awsDashSdkLib.awsDashSdkLibStrings.ScriptNotExecutable
    - awsDashSdkLib.awsDashSdkLibStrings.ScriptTimedOut
    - awsDashSdkLib.awsDashSdkLibStrings.ScriptFailed
    - awsDashSdkLib.awsDashSdkLibStrings.UnknownError
    - java.lang.String
  */
  type LifecycleErrorCode = _LifecycleErrorCode | java.lang.String
  type LifecycleEventHookExecutionId = java.lang.String
  type LifecycleEventList = js.Array[LifecycleEvent]
  type LifecycleEventName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Skipped
    - awsDashSdkLib.awsDashSdkLibStrings.Unknown
    - java.lang.String
  */
  type LifecycleEventStatus = _LifecycleEventStatus | java.lang.String
  type LifecycleMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.include
    - awsDashSdkLib.awsDashSdkLibStrings.exclude
    - awsDashSdkLib.awsDashSdkLibStrings.ignore
    - java.lang.String
  */
  type ListStateFilterAction = _ListStateFilterAction | java.lang.String
  type ListenerArn = java.lang.String
  type ListenerArnList = js.Array[ListenerArn]
  type LogTail = java.lang.String
  type Message = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HOST_COUNT
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_PERCENT
    - java.lang.String
  */
  type MinimumHealthyHostsType = _MinimumHealthyHostsType | java.lang.String
  type MinimumHealthyHostsValue = scala.Double
  type NextToken = java.lang.String
  type NullableBoolean = scala.Boolean
  type OnPremisesTagSetList = js.Array[TagFilterList]
  type Percentage = scala.Double
  type RawStringContent = java.lang.String
  type RawStringSha256 = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Registered
    - awsDashSdkLib.awsDashSdkLibStrings.Deregistered
    - java.lang.String
  */
  type RegistrationStatus = _RegistrationStatus | java.lang.String
  type Repository = java.lang.String
  type RevisionInfoList = js.Array[RevisionInfo]
  type RevisionLocationList = js.Array[RevisionLocation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.S3
    - awsDashSdkLib.awsDashSdkLibStrings.GitHub
    - awsDashSdkLib.awsDashSdkLibStrings.String
    - awsDashSdkLib.awsDashSdkLibStrings.AppSpecContent
    - java.lang.String
  */
  type RevisionLocationType = _RevisionLocationType | java.lang.String
  type Role = java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type ScriptName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ascending
    - awsDashSdkLib.awsDashSdkLibStrings.descending
    - java.lang.String
  */
  type SortOrder = _SortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - java.lang.String
  */
  type StopStatus = _StopStatus | java.lang.String
  type TagFilterList = js.Array[TagFilter]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.KEY_ONLY
    - awsDashSdkLib.awsDashSdkLibStrings.VALUE_ONLY
    - awsDashSdkLib.awsDashSdkLibStrings.KEY_AND_VALUE
    - java.lang.String
  */
  type TagFilterType = _TagFilterType | java.lang.String
  type TagKeyList = js.Array[Key]
  type TagList = js.Array[Tag]
  type TargetArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TargetStatus
    - awsDashSdkLib.awsDashSdkLibStrings.ServerInstanceLabel
    - java.lang.String
  */
  type TargetFilterName = _TargetFilterName | java.lang.String
  type TargetFilters = org.scalablytyped.runtime.StringDictionary[FilterValueList]
  type TargetGroupInfoList = js.Array[TargetGroupInfo]
  type TargetGroupName = java.lang.String
  type TargetGroupPairInfoList = js.Array[TargetGroupPairInfo]
  type TargetId = java.lang.String
  type TargetIdList = js.Array[TargetId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Blue
    - awsDashSdkLib.awsDashSdkLibStrings.Green
    - java.lang.String
  */
  type TargetLabel = _TargetLabel | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Skipped
    - awsDashSdkLib.awsDashSdkLibStrings.Unknown
    - awsDashSdkLib.awsDashSdkLibStrings.Ready
    - java.lang.String
  */
  type TargetStatus = _TargetStatus | java.lang.String
  type Time = stdLib.Date
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TimeBasedCanary
    - awsDashSdkLib.awsDashSdkLibStrings.TimeBasedLinear
    - awsDashSdkLib.awsDashSdkLibStrings.AllAtOnce
    - java.lang.String
  */
  type TrafficRoutingType = _TrafficRoutingType | java.lang.String
  type TrafficWeight = scala.Double
  type TriggerConfigList = js.Array[TriggerConfig]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DeploymentStart
    - awsDashSdkLib.awsDashSdkLibStrings.DeploymentSuccess
    - awsDashSdkLib.awsDashSdkLibStrings.DeploymentFailure
    - awsDashSdkLib.awsDashSdkLibStrings.DeploymentStop
    - awsDashSdkLib.awsDashSdkLibStrings.DeploymentRollback
    - awsDashSdkLib.awsDashSdkLibStrings.DeploymentReady
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceStart
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceSuccess
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceFailure
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceReady
    - java.lang.String
  */
  type TriggerEventType = _TriggerEventType | java.lang.String
  type TriggerEventTypeList = js.Array[TriggerEventType]
  type TriggerName = java.lang.String
  type TriggerTargetArn = java.lang.String
  type Value = java.lang.String
  type Version = java.lang.String
  type VersionId = java.lang.String
  type WaitTimeInMins = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-10-06`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
