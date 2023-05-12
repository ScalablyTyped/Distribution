package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.AUTOMATIC_BISECT
import typings.awsSdk.awsSdkStrings.TASK_DEFINITION
import typings.awsSdk.awsSdkStrings.s3_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arn = java.lang.String

type ArnOrJsonPath = java.lang.String

type ArnOrUrl = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type AssignPublicIp = _AssignPublicIp | java.lang.String

type BatchArraySize = Double

type BatchDependsOn = js.Array[BatchJobDependency]

type BatchEnvironmentVariableList = js.Array[BatchEnvironmentVariable]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.N_TO_N
  - typings.awsSdk.awsSdkStrings.SEQUENTIAL
  - java.lang.String
*/
type BatchJobDependencyType = _BatchJobDependencyType | java.lang.String

type BatchParametersMap = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GPU
  - typings.awsSdk.awsSdkStrings.MEMORY
  - typings.awsSdk.awsSdkStrings.VCPU
  - java.lang.String
*/
type BatchResourceRequirementType = _BatchResourceRequirementType | java.lang.String

type BatchResourceRequirementsList = js.Array[BatchResourceRequirement]

type BatchRetryAttempts = Double

type Boolean = scala.Boolean

type CapacityProvider = java.lang.String

type CapacityProviderStrategy = js.Array[CapacityProviderStrategyItem]

type CapacityProviderStrategyItemBase = Double

type CapacityProviderStrategyItemWeight = Double

type Database = java.lang.String

type DbUser = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRIM_HORIZON
  - typings.awsSdk.awsSdkStrings.LATEST
  - java.lang.String
*/
type DynamoDBStreamStartPosition = _DynamoDBStreamStartPosition | java.lang.String

type EcsContainerOverrideList = js.Array[EcsContainerOverride]

type EcsEnvironmentFileList = js.Array[EcsEnvironmentFile]

type EcsEnvironmentFileType = s3_ | java.lang.String

type EcsEnvironmentVariableList = js.Array[EcsEnvironmentVariable]

type EcsInferenceAcceleratorOverrideList = js.Array[EcsInferenceAcceleratorOverride]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GPU
  - typings.awsSdk.awsSdkStrings.InferenceAccelerator
  - java.lang.String
*/
type EcsResourceRequirementType = _EcsResourceRequirementType | java.lang.String

type EcsResourceRequirementsList = js.Array[EcsResourceRequirement]

type EndpointString = java.lang.String

type EphemeralStorageSize = Double

type EventBridgeDetailType = java.lang.String

type EventBridgeEndpointId = java.lang.String

type EventBridgeEventResourceList = js.Array[ArnOrJsonPath]

type EventBridgeEventSource = java.lang.String

type EventPattern = java.lang.String

type FilterList = js.Array[Filter]

type HeaderKey = java.lang.String

type HeaderParametersMap = StringDictionary[HeaderValue]

type HeaderValue = java.lang.String

type InputTemplate = java.lang.String

type Integer = Double

type JsonPath = java.lang.String

type KafkaBootstrapServers = js.Array[EndpointString]

type KafkaTopicName = java.lang.String

type KinesisPartitionKey = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRIM_HORIZON
  - typings.awsSdk.awsSdkStrings.LATEST
  - typings.awsSdk.awsSdkStrings.AT_TIMESTAMP
  - java.lang.String
*/
type KinesisStreamStartPosition = _KinesisStreamStartPosition | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EC2
  - typings.awsSdk.awsSdkStrings.FARGATE
  - typings.awsSdk.awsSdkStrings.EXTERNAL
  - java.lang.String
*/
type LaunchType = _LaunchType | java.lang.String

type LimitMax10 = Double

type LimitMax100 = Double

type LimitMax10000 = Double

type LimitMin1 = Double

type LogStreamName = java.lang.String

type MQBrokerQueueName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRIM_HORIZON
  - typings.awsSdk.awsSdkStrings.LATEST
  - java.lang.String
*/
type MSKStartPosition = _MSKStartPosition | java.lang.String

type MaximumBatchingWindowInSeconds = Double

type MaximumRecordAgeInSeconds = Double

type MaximumRetryAttemptsESM = Double

type MessageDeduplicationId = java.lang.String

type MessageGroupId = java.lang.String

type NextToken = java.lang.String

type OnPartialBatchItemFailureStreams = AUTOMATIC_BISECT | java.lang.String

type OptionalArn = java.lang.String

type PathParameter = java.lang.String

type PathParameterList = js.Array[PathParameter]

type PipeArn = java.lang.String

type PipeDescription = java.lang.String

type PipeList = js.Array[Pipe]

type PipeName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typings.awsSdk.awsSdkStrings.START_FAILED
  - typings.awsSdk.awsSdkStrings.STOP_FAILED
  - java.lang.String
*/
type PipeState = _PipeState | java.lang.String

type PipeStateReason = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REQUEST_RESPONSE
  - typings.awsSdk.awsSdkStrings.FIRE_AND_FORGET
  - java.lang.String
*/
type PipeTargetInvocationType = _PipeTargetInvocationType | java.lang.String

type PlacementConstraintExpression = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.distinctInstance
  - typings.awsSdk.awsSdkStrings.memberOf
  - java.lang.String
*/
type PlacementConstraintType = _PlacementConstraintType | java.lang.String

type PlacementConstraints = js.Array[PlacementConstraint]

type PlacementStrategies = js.Array[PlacementStrategy]

type PlacementStrategyField = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.random__
  - typings.awsSdk.awsSdkStrings.spread_
  - typings.awsSdk.awsSdkStrings.binpack
  - java.lang.String
*/
type PlacementStrategyType = _PlacementStrategyType | java.lang.String

type PropagateTags = TASK_DEFINITION | java.lang.String

type QueryStringKey = java.lang.String

type QueryStringParametersMap = StringDictionary[QueryStringValue]

type QueryStringValue = java.lang.String

type ReferenceId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type RequestedPipeState = _RequestedPipeState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type RequestedPipeStateDescribeResponse = _RequestedPipeStateDescribeResponse | java.lang.String

type ResourceArn = java.lang.String

type RoleArn = java.lang.String

type SageMakerPipelineParameterList = js.Array[SageMakerPipelineParameter]

type SageMakerPipelineParameterName = java.lang.String

type SageMakerPipelineParameterValue = java.lang.String

type SecretManagerArn = java.lang.String

type SecretManagerArnOrJsonPath = java.lang.String

type SecurityGroup = java.lang.String

type SecurityGroupId = java.lang.String

type SecurityGroupIds = js.Array[SecurityGroupId]

type SecurityGroups = js.Array[SecurityGroup]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRIM_HORIZON
  - typings.awsSdk.awsSdkStrings.LATEST
  - java.lang.String
*/
type SelfManagedKafkaStartPosition = _SelfManagedKafkaStartPosition | java.lang.String

type Sql = java.lang.String

type Sqls = js.Array[Sql]

type StatementName = java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type Subnet = java.lang.String

type SubnetId = java.lang.String

type SubnetIds = js.Array[SubnetId]

type Subnets = js.Array[Subnet]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Timestamp = js.Date

type URI = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-10-07`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
