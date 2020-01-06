package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsGameliftMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.AUTO_SCALING
  import typings.awsDashSdk.awsDashSdkStrings.INTERRUPTED
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACCEPT
    - typings.awsDashSdk.awsDashSdkStrings.REJECT
    - java.lang.String
  */
  type AcceptanceType = _AcceptanceType | String
  type AliasId = String
  type AliasList = js.Array[Alias]
  type AmazonResourceName = String
  type ArnStringModel = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AUTOMATIC
    - typings.awsDashSdk.awsDashSdkStrings.MANUAL
    - java.lang.String
  */
  type BackfillMode = _BackfillMode | String
  type BooleanModel = Boolean
  type BuildArn = String
  type BuildId = String
  type BuildList = js.Array[Build]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INITIALIZED
    - typings.awsDashSdk.awsDashSdkStrings.READY
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type BuildStatus = _BuildStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.GENERATED
    - java.lang.String
  */
  type CertificateType = _CertificateType | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThanOrEqualToThreshold
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThanThreshold
    - typings.awsDashSdk.awsDashSdkStrings.LessThanThreshold
    - typings.awsDashSdk.awsDashSdkStrings.LessThanOrEqualToThreshold
    - java.lang.String
  */
  type ComparisonOperatorType = _ComparisonOperatorType | String
  type CustomEventData = String
  type DesiredPlayerSessionList = js.Array[DesiredPlayerSession]
  type DnsName = String
  type Double = scala.Double
  type DoubleObject = scala.Double
  type EC2InstanceLimitList = js.Array[EC2InstanceLimit]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.t2Dotmicro
    - typings.awsDashSdk.awsDashSdkStrings.t2Dotsmall
    - typings.awsDashSdk.awsDashSdkStrings.t2Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.t2Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.c3Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.c3Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.c3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c3Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c3Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c4Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.c4Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.c4Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c4Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c4Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dot9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dot18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r3Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.r3Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r3Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r3Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m3Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.m3Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.m3Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4Dot10xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dot24xlarge
    - java.lang.String
  */
  type EC2InstanceType = _EC2InstanceType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GENERIC_EVENT
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_CREATED
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_DELETED
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_SCALING_EVENT
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_STATE_DOWNLOADING
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_STATE_VALIDATING
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_STATE_BUILDING
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_STATE_ACTIVATING
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_STATE_ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_STATE_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_INITIALIZATION_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_BINARY_DOWNLOAD_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_VALIDATION_TIMED_OUT
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_ACTIVATION_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_ACTIVATION_FAILED_NO_INSTANCES
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED
    - typings.awsDashSdk.awsDashSdkStrings.SERVER_PROCESS_INVALID_PATH
    - typings.awsDashSdk.awsDashSdkStrings.SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT
    - typings.awsDashSdk.awsDashSdkStrings.SERVER_PROCESS_PROCESS_READY_TIMEOUT
    - typings.awsDashSdk.awsDashSdkStrings.SERVER_PROCESS_CRASHED
    - typings.awsDashSdk.awsDashSdkStrings.SERVER_PROCESS_TERMINATED_UNHEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.SERVER_PROCESS_FORCE_TERMINATED
    - typings.awsDashSdk.awsDashSdkStrings.SERVER_PROCESS_PROCESS_EXIT_TIMEOUT
    - typings.awsDashSdk.awsDashSdkStrings.GAME_SESSION_ACTIVATION_TIMEOUT
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_CREATION_EXTRACTING_BUILD
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_CREATION_RUNNING_INSTALLER
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_CREATION_VALIDATING_RUNTIME_CONFIG
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_VPC_PEERING_SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_VPC_PEERING_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.FLEET_VPC_PEERING_DELETED
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE_INTERRUPTED
    - java.lang.String
  */
  type EventCode = _EventCode | String
  type EventList = js.Array[Event]
  type FleetAction = AUTO_SCALING | String
  type FleetActionList = js.Array[FleetAction]
  type FleetAttributesList = js.Array[FleetAttributes]
  type FleetCapacityList = js.Array[FleetCapacity]
  type FleetId = String
  type FleetIdList = js.Array[FleetId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NEW
    - typings.awsDashSdk.awsDashSdkStrings.DOWNLOADING
    - typings.awsDashSdk.awsDashSdkStrings.VALIDATING
    - typings.awsDashSdk.awsDashSdkStrings.BUILDING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATED
    - java.lang.String
  */
  type FleetStatus = _FleetStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ON_DEMAND
    - typings.awsDashSdk.awsDashSdkStrings.SPOT
    - java.lang.String
  */
  type FleetType = _FleetType | String
  type FleetUtilizationList = js.Array[FleetUtilization]
  type Float = scala.Double
  type FreeText = String
  type GamePropertyKey = String
  type GamePropertyList = js.Array[GameProperty]
  type GamePropertyValue = String
  type GameSessionActivationTimeoutSeconds = scala.Double
  type GameSessionData = String
  type GameSessionDetailList = js.Array[GameSessionDetail]
  type GameSessionList = js.Array[GameSession]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.FULFILLED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - typings.awsDashSdk.awsDashSdkStrings.TIMED_OUT
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type GameSessionPlacementState = _GameSessionPlacementState | String
  type GameSessionQueueDestinationList = js.Array[GameSessionQueueDestination]
  type GameSessionQueueList = js.Array[GameSessionQueue]
  type GameSessionQueueName = String
  type GameSessionQueueNameList = js.Array[GameSessionQueueName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVATING
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATED
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATING
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - java.lang.String
  */
  type GameSessionStatus = _GameSessionStatus | String
  type GameSessionStatusReason = INTERRUPTED | String
  type IdStringModel = String
  type InstanceId = String
  type InstanceList = js.Array[Instance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATING
    - java.lang.String
  */
  type InstanceStatus = _InstanceStatus | String
  type Integer = scala.Double
  type IpAddress = String
  type IpPermissionsList = js.Array[IpPermission]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TCP
    - typings.awsDashSdk.awsDashSdkStrings.UDP
    - java.lang.String
  */
  type IpProtocol = _IpProtocol | String
  type LatencyMap = StringDictionary[PositiveInteger]
  type MatchedPlayerSessionList = js.Array[MatchedPlayerSession]
  type MatchmakerData = String
  type MatchmakingAcceptanceTimeoutInteger = scala.Double
  type MatchmakingConfigurationArn = String
  type MatchmakingConfigurationList = js.Array[MatchmakingConfiguration]
  type MatchmakingConfigurationName = String
  type MatchmakingConfigurationNameList = js.Array[MatchmakingConfigurationName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.PLACING
    - typings.awsDashSdk.awsDashSdkStrings.QUEUED
    - typings.awsDashSdk.awsDashSdkStrings.REQUIRES_ACCEPTANCE
    - typings.awsDashSdk.awsDashSdkStrings.SEARCHING
    - typings.awsDashSdk.awsDashSdkStrings.TIMED_OUT
    - java.lang.String
  */
  type MatchmakingConfigurationStatus = _MatchmakingConfigurationStatus | String
  type MatchmakingIdList = js.Array[MatchmakingIdStringModel]
  type MatchmakingIdStringModel = String
  type MatchmakingRequestTimeoutInteger = scala.Double
  type MatchmakingRuleSetArn = String
  type MatchmakingRuleSetList = js.Array[MatchmakingRuleSet]
  type MatchmakingRuleSetName = String
  type MatchmakingRuleSetNameList = js.Array[MatchmakingRuleSetName]
  type MatchmakingTicketList = js.Array[MatchmakingTicket]
  type MaxConcurrentGameSessionActivations = scala.Double
  type MetricGroup = String
  type MetricGroupList = js.Array[MetricGroup]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ActivatingGameSessions
    - typings.awsDashSdk.awsDashSdkStrings.ActiveGameSessions
    - typings.awsDashSdk.awsDashSdkStrings.ActiveInstances
    - typings.awsDashSdk.awsDashSdkStrings.AvailableGameSessions
    - typings.awsDashSdk.awsDashSdkStrings.AvailablePlayerSessions
    - typings.awsDashSdk.awsDashSdkStrings.CurrentPlayerSessions
    - typings.awsDashSdk.awsDashSdkStrings.IdleInstances
    - typings.awsDashSdk.awsDashSdkStrings.PercentAvailableGameSessions
    - typings.awsDashSdk.awsDashSdkStrings.PercentIdleInstances
    - typings.awsDashSdk.awsDashSdkStrings.QueueDepth
    - typings.awsDashSdk.awsDashSdkStrings.WaitTime
    - java.lang.String
  */
  type MetricName = _MetricName | String
  type NonBlankAndLengthConstraintString = String
  type NonBlankString = String
  type NonEmptyString = String
  type NonZeroAndMaxString = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WINDOWS_2012
    - typings.awsDashSdk.awsDashSdkStrings.AMAZON_LINUX
    - typings.awsDashSdk.awsDashSdkStrings.AMAZON_LINUX_2
    - java.lang.String
  */
  type OperatingSystem = _OperatingSystem | String
  type PlacedPlayerSessionList = js.Array[PlacedPlayerSession]
  type PlayerAttributeMap = StringDictionary[AttributeValue]
  type PlayerData = String
  type PlayerDataMap = StringDictionary[PlayerData]
  type PlayerIdList = js.Array[NonZeroAndMaxString]
  type PlayerLatencyList = js.Array[PlayerLatency]
  type PlayerLatencyPolicyList = js.Array[PlayerLatencyPolicy]
  type PlayerList = js.Array[Player]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACCEPT_ALL
    - typings.awsDashSdk.awsDashSdkStrings.DENY_ALL
    - java.lang.String
  */
  type PlayerSessionCreationPolicy = _PlayerSessionCreationPolicy | String
  type PlayerSessionId = String
  type PlayerSessionList = js.Array[PlayerSession]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RESERVED
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.TIMEDOUT
    - java.lang.String
  */
  type PlayerSessionStatus = _PlayerSessionStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RuleBased
    - typings.awsDashSdk.awsDashSdkStrings.TargetBased
    - java.lang.String
  */
  type PolicyType = _PolicyType | String
  type PortNumber = scala.Double
  type PositiveInteger = scala.Double
  type PositiveLong = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NoProtection
    - typings.awsDashSdk.awsDashSdkStrings.FullProtection
    - java.lang.String
  */
  type ProtectionPolicy = _ProtectionPolicy | String
  type QueueArnsList = js.Array[ArnStringModel]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SIMPLE
    - typings.awsDashSdk.awsDashSdkStrings.TERMINAL
    - java.lang.String
  */
  type RoutingStrategyType = _RoutingStrategyType | String
  type RuleSetBody = String
  type RuleSetLimit = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ChangeInCapacity
    - typings.awsDashSdk.awsDashSdkStrings.ExactCapacity
    - typings.awsDashSdk.awsDashSdkStrings.PercentChangeInCapacity
    - java.lang.String
  */
  type ScalingAdjustmentType = _ScalingAdjustmentType | String
  type ScalingPolicyList = js.Array[ScalingPolicy]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_REQUESTED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_REQUESTED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - java.lang.String
  */
  type ScalingStatusType = _ScalingStatusType | String
  type ScriptArn = String
  type ScriptId = String
  type ScriptList = js.Array[Script]
  type ServerProcessList = js.Array[ServerProcess]
  type SnsArnStringModel = String
  type StringDoubleMap = StringDictionary[DoubleObject]
  type StringList = js.Array[NonZeroAndMaxString]
  type StringModel = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = Date
  type VpcPeeringAuthorizationList = js.Array[VpcPeeringAuthorization]
  type VpcPeeringConnectionList = js.Array[VpcPeeringConnection]
  type WholeNumber = scala.Double
  type ZipBlob = Buffer | Uint8Array | Blob | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-10-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
