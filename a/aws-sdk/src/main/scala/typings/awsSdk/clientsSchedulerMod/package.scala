package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.TASK_DEFINITION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type AssignPublicIp = _AssignPublicIp | String

type CapacityProvider = String

type CapacityProviderStrategy = js.Array[CapacityProviderStrategyItem]

type CapacityProviderStrategyItemBase = Double

type CapacityProviderStrategyItemWeight = Double

type ClientToken = String

type CreationDate = js.Date

type DeadLetterConfigArnString = String

type Description = String

type DetailType = String

type EnableECSManagedTags = Boolean

type EnableExecuteCommand = Boolean

type EndDate = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.FLEXIBLE
  - java.lang.String
*/
type FlexibleTimeWindowMode = _FlexibleTimeWindowMode | String

type Group = String

type KmsKeyArn = String

type LastModificationDate = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EC2
  - typings.awsSdk.awsSdkStrings.FARGATE
  - typings.awsSdk.awsSdkStrings.EXTERNAL
  - java.lang.String
*/
type LaunchType = _LaunchType | String

type MaxResults = Double

type MaximumEventAgeInSeconds = Double

type MaximumRetryAttempts = Double

type MaximumWindowInMinutes = Double

type MessageGroupId = String

type Name = String

type NamePrefix = String

type NextToken = String

type PlacementConstraintExpression = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.distinctInstance
  - typings.awsSdk.awsSdkStrings.memberOf
  - java.lang.String
*/
type PlacementConstraintType = _PlacementConstraintType | String

type PlacementConstraints = js.Array[PlacementConstraint]

type PlacementStrategies = js.Array[PlacementStrategy]

type PlacementStrategyField = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.random__
  - typings.awsSdk.awsSdkStrings.spread_
  - typings.awsSdk.awsSdkStrings.binpack
  - java.lang.String
*/
type PlacementStrategyType = _PlacementStrategyType | String

type PlatformVersion = String

type PropagateTags = TASK_DEFINITION | String

type ReferenceId = String

type RoleArn = String

type SageMakerPipelineParameterList = js.Array[SageMakerPipelineParameter]

type SageMakerPipelineParameterName = String

type SageMakerPipelineParameterValue = String

type ScheduleArn = String

type ScheduleExpression = String

type ScheduleExpressionTimezone = String

type ScheduleGroupArn = String

type ScheduleGroupList = js.Array[ScheduleGroupSummary]

type ScheduleGroupName = String

type ScheduleGroupNamePrefix = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type ScheduleGroupState = _ScheduleGroupState | String

type ScheduleList = js.Array[ScheduleSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ScheduleState = _ScheduleState | String

type SecurityGroup = String

type SecurityGroups = js.Array[SecurityGroup]

type Source = String

type StartDate = js.Date

type Subnet = String

type Subnets = js.Array[Subnet]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagMap = StringDictionary[TagValue]

type TagResourceArn = String

type TagValue = String

type Tags = js.Array[TagMap]

type TargetArn = String

type TargetInput = String

type TargetPartitionKey = String

type TaskCount = Double

type TaskDefinitionArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-06-30`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
