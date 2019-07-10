package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsGameliftMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACCEPT
    - awsDashSdkLib.awsDashSdkLibStrings.REJECT
    - java.lang.String
  */
  type AcceptanceType = _AcceptanceType | java.lang.String
  type AliasId = java.lang.String
  type AliasList = js.Array[Alias]
  type ArnStringModel = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AUTOMATIC
    - awsDashSdkLib.awsDashSdkLibStrings.MANUAL
    - java.lang.String
  */
  type BackfillMode = _BackfillMode | java.lang.String
  type BooleanModel = scala.Boolean
  type BuildId = java.lang.String
  type BuildList = js.Array[Build]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INITIALIZED
    - awsDashSdkLib.awsDashSdkLibStrings.READY
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type BuildStatus = _BuildStatus | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GreaterThanOrEqualToThreshold
    - awsDashSdkLib.awsDashSdkLibStrings.GreaterThanThreshold
    - awsDashSdkLib.awsDashSdkLibStrings.LessThanThreshold
    - awsDashSdkLib.awsDashSdkLibStrings.LessThanOrEqualToThreshold
    - java.lang.String
  */
  type ComparisonOperatorType = _ComparisonOperatorType | java.lang.String
  type CustomEventData = java.lang.String
  type DesiredPlayerSessionList = js.Array[DesiredPlayerSession]
  type Double = scala.Double
  type DoubleObject = scala.Double
  type EC2InstanceLimitList = js.Array[EC2InstanceLimit]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.t2DOTmicro
    - awsDashSdkLib.awsDashSdkLibStrings.t2DOTsmall
    - awsDashSdkLib.awsDashSdkLibStrings.t2DOTmedium
    - awsDashSdkLib.awsDashSdkLibStrings.t2DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c3DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c3DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c3DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c3DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c3DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c4DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c4DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c4DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c4DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c4DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r3DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r3DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r3DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r3DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r3DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m3DOTmedium
    - awsDashSdkLib.awsDashSdkLibStrings.m3DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m3DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m3DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m4DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m4DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m4DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m4DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m4DOT10xlarge
    - java.lang.String
  */
  type EC2InstanceType = _EC2InstanceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GENERIC_EVENT
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_CREATED
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_SCALING_EVENT
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_STATE_DOWNLOADING
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_STATE_VALIDATING
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_STATE_BUILDING
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_STATE_ACTIVATING
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_STATE_ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_STATE_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_INITIALIZATION_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_BINARY_DOWNLOAD_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_VALIDATION_TIMED_OUT
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_ACTIVATION_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_ACTIVATION_FAILED_NO_INSTANCES
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED
    - awsDashSdkLib.awsDashSdkLibStrings.SERVER_PROCESS_INVALID_PATH
    - awsDashSdkLib.awsDashSdkLibStrings.SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT
    - awsDashSdkLib.awsDashSdkLibStrings.SERVER_PROCESS_PROCESS_READY_TIMEOUT
    - awsDashSdkLib.awsDashSdkLibStrings.SERVER_PROCESS_CRASHED
    - awsDashSdkLib.awsDashSdkLibStrings.SERVER_PROCESS_TERMINATED_UNHEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.SERVER_PROCESS_FORCE_TERMINATED
    - awsDashSdkLib.awsDashSdkLibStrings.SERVER_PROCESS_PROCESS_EXIT_TIMEOUT
    - awsDashSdkLib.awsDashSdkLibStrings.GAME_SESSION_ACTIVATION_TIMEOUT
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_CREATION_EXTRACTING_BUILD
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_CREATION_RUNNING_INSTALLER
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_CREATION_VALIDATING_RUNTIME_CONFIG
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_VPC_PEERING_SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_VPC_PEERING_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.FLEET_VPC_PEERING_DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_INTERRUPTED
    - java.lang.String
  */
  type EventCode = _EventCode | java.lang.String
  type EventList = js.Array[Event]
  type FleetAction = awsDashSdkLib.awsDashSdkLibStrings.AUTO_SCALING | java.lang.String
  type FleetActionList = js.Array[FleetAction]
  type FleetAttributesList = js.Array[FleetAttributes]
  type FleetCapacityList = js.Array[FleetCapacity]
  type FleetId = java.lang.String
  type FleetIdList = js.Array[FleetId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NEW
    - awsDashSdkLib.awsDashSdkLibStrings.DOWNLOADING
    - awsDashSdkLib.awsDashSdkLibStrings.VALIDATING
    - awsDashSdkLib.awsDashSdkLibStrings.BUILDING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVATING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATED
    - java.lang.String
  */
  type FleetStatus = _FleetStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ON_DEMAND
    - awsDashSdkLib.awsDashSdkLibStrings.SPOT
    - java.lang.String
  */
  type FleetType = _FleetType | java.lang.String
  type FleetUtilizationList = js.Array[FleetUtilization]
  type Float = scala.Double
  type FreeText = java.lang.String
  type GamePropertyKey = java.lang.String
  type GamePropertyList = js.Array[GameProperty]
  type GamePropertyValue = java.lang.String
  type GameSessionActivationTimeoutSeconds = scala.Double
  type GameSessionData = java.lang.String
  type GameSessionDetailList = js.Array[GameSessionDetail]
  type GameSessionList = js.Array[GameSession]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.FULFILLED
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELLED
    - awsDashSdkLib.awsDashSdkLibStrings.TIMED_OUT
    - java.lang.String
  */
  type GameSessionPlacementState = _GameSessionPlacementState | java.lang.String
  type GameSessionQueueDestinationList = js.Array[GameSessionQueueDestination]
  type GameSessionQueueList = js.Array[GameSessionQueue]
  type GameSessionQueueName = java.lang.String
  type GameSessionQueueNameList = js.Array[GameSessionQueueName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVATING
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATED
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATING
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - java.lang.String
  */
  type GameSessionStatus = _GameSessionStatus | java.lang.String
  type GameSessionStatusReason = awsDashSdkLib.awsDashSdkLibStrings.INTERRUPTED | java.lang.String
  type IdStringModel = java.lang.String
  type InstanceId = java.lang.String
  type InstanceList = js.Array[Instance]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATING
    - java.lang.String
  */
  type InstanceStatus = _InstanceStatus | java.lang.String
  type Integer = scala.Double
  type IpAddress = java.lang.String
  type IpPermissionsList = js.Array[IpPermission]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TCP
    - awsDashSdkLib.awsDashSdkLibStrings.UDP
    - java.lang.String
  */
  type IpProtocol = _IpProtocol | java.lang.String
  type LatencyMap = org.scalablytyped.runtime.StringDictionary[PositiveInteger]
  type MatchedPlayerSessionList = js.Array[MatchedPlayerSession]
  type MatchmakerData = java.lang.String
  type MatchmakingAcceptanceTimeoutInteger = scala.Double
  type MatchmakingConfigurationList = js.Array[MatchmakingConfiguration]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELLED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.PLACING
    - awsDashSdkLib.awsDashSdkLibStrings.QUEUED
    - awsDashSdkLib.awsDashSdkLibStrings.REQUIRES_ACCEPTANCE
    - awsDashSdkLib.awsDashSdkLibStrings.SEARCHING
    - awsDashSdkLib.awsDashSdkLibStrings.TIMED_OUT
    - java.lang.String
  */
  type MatchmakingConfigurationStatus = _MatchmakingConfigurationStatus | java.lang.String
  type MatchmakingIdList = js.Array[MatchmakingIdStringModel]
  type MatchmakingIdStringModel = java.lang.String
  type MatchmakingRequestTimeoutInteger = scala.Double
  type MatchmakingRuleSetList = js.Array[MatchmakingRuleSet]
  type MatchmakingRuleSetNameList = js.Array[MatchmakingIdStringModel]
  type MatchmakingTicketList = js.Array[MatchmakingTicket]
  type MaxConcurrentGameSessionActivations = scala.Double
  type MetricGroup = java.lang.String
  type MetricGroupList = js.Array[MetricGroup]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ActivatingGameSessions
    - awsDashSdkLib.awsDashSdkLibStrings.ActiveGameSessions
    - awsDashSdkLib.awsDashSdkLibStrings.ActiveInstances
    - awsDashSdkLib.awsDashSdkLibStrings.AvailableGameSessions
    - awsDashSdkLib.awsDashSdkLibStrings.AvailablePlayerSessions
    - awsDashSdkLib.awsDashSdkLibStrings.CurrentPlayerSessions
    - awsDashSdkLib.awsDashSdkLibStrings.IdleInstances
    - awsDashSdkLib.awsDashSdkLibStrings.PercentAvailableGameSessions
    - awsDashSdkLib.awsDashSdkLibStrings.PercentIdleInstances
    - awsDashSdkLib.awsDashSdkLibStrings.QueueDepth
    - awsDashSdkLib.awsDashSdkLibStrings.WaitTime
    - java.lang.String
  */
  type MetricName = _MetricName | java.lang.String
  type NonBlankAndLengthConstraintString = java.lang.String
  type NonBlankString = java.lang.String
  type NonEmptyString = java.lang.String
  type NonZeroAndMaxString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.WINDOWS_2012
    - awsDashSdkLib.awsDashSdkLibStrings.AMAZON_LINUX
    - java.lang.String
  */
  type OperatingSystem = _OperatingSystem | java.lang.String
  type PlacedPlayerSessionList = js.Array[PlacedPlayerSession]
  type PlayerAttributeMap = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type PlayerData = java.lang.String
  type PlayerDataMap = org.scalablytyped.runtime.StringDictionary[PlayerData]
  type PlayerIdList = js.Array[NonZeroAndMaxString]
  type PlayerLatencyList = js.Array[PlayerLatency]
  type PlayerLatencyPolicyList = js.Array[PlayerLatencyPolicy]
  type PlayerList = js.Array[Player]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACCEPT_ALL
    - awsDashSdkLib.awsDashSdkLibStrings.DENY_ALL
    - java.lang.String
  */
  type PlayerSessionCreationPolicy = _PlayerSessionCreationPolicy | java.lang.String
  type PlayerSessionId = java.lang.String
  type PlayerSessionList = js.Array[PlayerSession]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RESERVED
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.TIMEDOUT
    - java.lang.String
  */
  type PlayerSessionStatus = _PlayerSessionStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RuleBased
    - awsDashSdkLib.awsDashSdkLibStrings.TargetBased
    - java.lang.String
  */
  type PolicyType = _PolicyType | java.lang.String
  type PortNumber = scala.Double
  type PositiveInteger = scala.Double
  type PositiveLong = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NoProtection
    - awsDashSdkLib.awsDashSdkLibStrings.FullProtection
    - java.lang.String
  */
  type ProtectionPolicy = _ProtectionPolicy | java.lang.String
  type QueueArnsList = js.Array[ArnStringModel]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SIMPLE
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINAL
    - java.lang.String
  */
  type RoutingStrategyType = _RoutingStrategyType | java.lang.String
  type RuleSetBody = java.lang.String
  type RuleSetLimit = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ChangeInCapacity
    - awsDashSdkLib.awsDashSdkLibStrings.ExactCapacity
    - awsDashSdkLib.awsDashSdkLibStrings.PercentChangeInCapacity
    - java.lang.String
  */
  type ScalingAdjustmentType = _ScalingAdjustmentType | java.lang.String
  type ScalingPolicyList = js.Array[ScalingPolicy]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_REQUESTED
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_REQUESTED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - java.lang.String
  */
  type ScalingStatusType = _ScalingStatusType | java.lang.String
  type ScriptId = java.lang.String
  type ScriptList = js.Array[Script]
  type ServerProcessList = js.Array[ServerProcess]
  type SnsArnStringModel = java.lang.String
  type StringDoubleMap = org.scalablytyped.runtime.StringDictionary[DoubleObject]
  type StringList = js.Array[NonZeroAndMaxString]
  type StringModel = java.lang.String
  type Timestamp = stdLib.Date
  type VpcPeeringAuthorizationList = js.Array[VpcPeeringAuthorization]
  type VpcPeeringConnectionList = js.Array[VpcPeeringConnection]
  type WholeNumber = scala.Double
  type ZipBlob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-10-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
