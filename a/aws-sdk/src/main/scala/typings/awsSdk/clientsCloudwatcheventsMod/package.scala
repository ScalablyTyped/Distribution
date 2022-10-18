package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.TASK_DEFINITION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = java.lang.String

type Action = java.lang.String

type ApiDestinationArn = java.lang.String

type ApiDestinationDescription = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.POST
  - typings.awsSdk.awsSdkStrings.GET
  - typings.awsSdk.awsSdkStrings.HEAD
  - typings.awsSdk.awsSdkStrings.OPTIONS
  - typings.awsSdk.awsSdkStrings.PUT
  - typings.awsSdk.awsSdkStrings.PATCH
  - typings.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type ApiDestinationHttpMethod = _ApiDestinationHttpMethod | java.lang.String

type ApiDestinationInvocationRateLimitPerSecond = Double

type ApiDestinationName = java.lang.String

type ApiDestinationResponseList = js.Array[ApiDestination]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type ApiDestinationState = _ApiDestinationState | java.lang.String

type ArchiveArn = java.lang.String

type ArchiveDescription = java.lang.String

type ArchiveName = java.lang.String

type ArchiveResponseList = js.Array[Archive]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type ArchiveState = _ArchiveState | java.lang.String

type ArchiveStateReason = java.lang.String

type Arn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type AssignPublicIp = _AssignPublicIp | java.lang.String

type AuthHeaderParameters = java.lang.String

type Boolean = scala.Boolean

type CapacityProvider = java.lang.String

type CapacityProviderStrategy = js.Array[CapacityProviderStrategyItem]

type CapacityProviderStrategyItemBase = Double

type CapacityProviderStrategyItemWeight = Double

type ConnectionArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BASIC
  - typings.awsSdk.awsSdkStrings.OAUTH_CLIENT_CREDENTIALS
  - typings.awsSdk.awsSdkStrings.API_KEY
  - java.lang.String
*/
type ConnectionAuthorizationType = _ConnectionAuthorizationType | java.lang.String

type ConnectionBodyParametersList = js.Array[ConnectionBodyParameter]

type ConnectionDescription = java.lang.String

type ConnectionHeaderParametersList = js.Array[ConnectionHeaderParameter]

type ConnectionName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GET
  - typings.awsSdk.awsSdkStrings.POST
  - typings.awsSdk.awsSdkStrings.PUT
  - java.lang.String
*/
type ConnectionOAuthHttpMethod = _ConnectionOAuthHttpMethod | java.lang.String

type ConnectionQueryStringParametersList = js.Array[ConnectionQueryStringParameter]

type ConnectionResponseList = js.Array[Connection]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.AUTHORIZED
  - typings.awsSdk.awsSdkStrings.DEAUTHORIZED
  - typings.awsSdk.awsSdkStrings.AUTHORIZING
  - typings.awsSdk.awsSdkStrings.DEAUTHORIZING
  - java.lang.String
*/
type ConnectionState = _ConnectionState | java.lang.String

type ConnectionStateReason = java.lang.String

type CreatedBy = java.lang.String

type Database = java.lang.String

type DbUser = java.lang.String

type ErrorCode = java.lang.String

type ErrorMessage = java.lang.String

type EventBusList = js.Array[EventBus]

type EventBusName = java.lang.String

type EventBusNameOrArn = java.lang.String

type EventId = java.lang.String

type EventPattern = java.lang.String

type EventResource = java.lang.String

type EventResourceList = js.Array[EventResource]

type EventSourceList = js.Array[EventSource]

type EventSourceName = java.lang.String

type EventSourceNamePrefix = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type EventSourceState = _EventSourceState | java.lang.String

type EventTime = js.Date

type HeaderKey = java.lang.String

type HeaderParametersMap = StringDictionary[HeaderValue]

type HeaderValue = java.lang.String

type HttpsEndpoint = java.lang.String

type InputTransformerPathKey = java.lang.String

type Integer = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EC2
  - typings.awsSdk.awsSdkStrings.FARGATE
  - typings.awsSdk.awsSdkStrings.EXTERNAL
  - java.lang.String
*/
type LaunchType = _LaunchType | java.lang.String

type LimitMax100 = Double

type LimitMin1 = Double

type Long = Double

type ManagedBy = java.lang.String

type MaximumEventAgeInSeconds = Double

type MaximumRetryAttempts = Double

type MessageGroupId = java.lang.String

type NextToken = java.lang.String

type NonPartnerEventBusName = java.lang.String

type NonPartnerEventBusNameOrArn = java.lang.String

type PartnerEventSourceAccountList = js.Array[PartnerEventSourceAccount]

type PartnerEventSourceList = js.Array[PartnerEventSource]

type PartnerEventSourceNamePrefix = java.lang.String

type PathParameter = java.lang.String

type PathParameterList = js.Array[PathParameter]

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

type Principal = java.lang.String

type PropagateTags = TASK_DEFINITION | java.lang.String

type PutEventsRequestEntryList = js.Array[PutEventsRequestEntry]

type PutEventsResultEntryList = js.Array[PutEventsResultEntry]

type PutPartnerEventsRequestEntryList = js.Array[PutPartnerEventsRequestEntry]

type PutPartnerEventsResultEntryList = js.Array[PutPartnerEventsResultEntry]

type PutTargetsResultEntryList = js.Array[PutTargetsResultEntry]

type QueryStringKey = java.lang.String

type QueryStringParametersMap = StringDictionary[QueryStringValue]

type QueryStringValue = java.lang.String

type RedshiftSecretManagerArn = java.lang.String

type ReferenceId = java.lang.String

type RemoveTargetsResultEntryList = js.Array[RemoveTargetsResultEntry]

type ReplayArn = java.lang.String

type ReplayDescription = java.lang.String

type ReplayDestinationFilters = js.Array[Arn]

type ReplayList = js.Array[Replay]

type ReplayName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.CANCELLING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ReplayState = _ReplayState | java.lang.String

type ReplayStateReason = java.lang.String

type ResourceArn = java.lang.String

type RetentionDays = Double

type RoleArn = java.lang.String

type RuleArn = java.lang.String

type RuleDescription = java.lang.String

type RuleName = java.lang.String

type RuleNameList = js.Array[RuleName]

type RuleResponseList = js.Array[Rule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type RuleState = _RuleState | java.lang.String

type RunCommandTargetKey = java.lang.String

type RunCommandTargetValue = java.lang.String

type RunCommandTargetValues = js.Array[RunCommandTargetValue]

type RunCommandTargets = js.Array[RunCommandTarget]

type SageMakerPipelineParameterList = js.Array[SageMakerPipelineParameter]

type SageMakerPipelineParameterName = java.lang.String

type SageMakerPipelineParameterValue = java.lang.String

type ScheduleExpression = java.lang.String

type SecretsManagerSecretArn = java.lang.String

type Sql = java.lang.String

type StatementId = java.lang.String

type StatementName = java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TargetArn = java.lang.String

type TargetId = java.lang.String

type TargetIdList = js.Array[TargetId]

type TargetInput = java.lang.String

type TargetInputPath = java.lang.String

type TargetList = js.Array[Target]

type TargetPartitionKeyPath = java.lang.String

type Timestamp = js.Date

type TraceHeader = java.lang.String

type TransformerInput = java.lang.String

type TransformerPaths = StringDictionary[TargetInputPath]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2014-02-03`
  - typings.awsSdk.awsSdkStrings.`2015-10-07`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
