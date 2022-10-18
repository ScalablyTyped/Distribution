package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.AUTO_SCALING
import typings.awsSdk.awsSdkStrings.CLAIMED
import typings.awsSdk.awsSdkStrings.HEALTHY
import typings.awsSdk.awsSdkStrings.INTERRUPTED
import typings.awsSdk.awsSdkStrings.PENDING_UPDATE
import typings.awsSdk.awsSdkStrings.REPLACE_INSTANCE_TYPES
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCEPT
  - typings.awsSdk.awsSdkStrings.REJECT
  - java.lang.String
*/
type AcceptanceType = _AcceptanceType | String

type AliasArn = String

type AliasId = String

type AliasIdOrArn = String

type AliasList = js.Array[Alias]

type AmazonResourceName = String

type ArnStringModel = String

type AutoScalingGroupArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTOMATIC
  - typings.awsSdk.awsSdkStrings.MANUAL
  - java.lang.String
*/
type BackfillMode = _BackfillMode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SPOT_ONLY
  - typings.awsSdk.awsSdkStrings.SPOT_PREFERRED
  - typings.awsSdk.awsSdkStrings.ON_DEMAND_ONLY
  - java.lang.String
*/
type BalancingStrategy = _BalancingStrategy | String

type BooleanModel = Boolean

type BuildArn = String

type BuildId = String

type BuildIdOrArn = String

type BuildList = js.Array[Build]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIALIZED
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type BuildStatus = _BuildStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.GENERATED
  - java.lang.String
*/
type CertificateType = _CertificateType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
  - typings.awsSdk.awsSdkStrings.GreaterThanThreshold
  - typings.awsSdk.awsSdkStrings.LessThanThreshold
  - typings.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
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
  - typings.awsSdk.awsSdkStrings.t2Dotmicro
  - typings.awsSdk.awsSdkStrings.t2Dotsmall
  - typings.awsSdk.awsSdkStrings.t2Dotmedium
  - typings.awsSdk.awsSdkStrings.t2Dotlarge
  - typings.awsSdk.awsSdkStrings.c3Dotlarge
  - typings.awsSdk.awsSdkStrings.c3Dotxlarge
  - typings.awsSdk.awsSdkStrings.c3Dot2xlarge
  - typings.awsSdk.awsSdkStrings.c3Dot4xlarge
  - typings.awsSdk.awsSdkStrings.c3Dot8xlarge
  - typings.awsSdk.awsSdkStrings.c4Dotlarge
  - typings.awsSdk.awsSdkStrings.c4Dotxlarge
  - typings.awsSdk.awsSdkStrings.c4Dot2xlarge
  - typings.awsSdk.awsSdkStrings.c4Dot4xlarge
  - typings.awsSdk.awsSdkStrings.c4Dot8xlarge
  - typings.awsSdk.awsSdkStrings.c5Dotlarge
  - typings.awsSdk.awsSdkStrings.c5Dotxlarge
  - typings.awsSdk.awsSdkStrings.c5Dot2xlarge
  - typings.awsSdk.awsSdkStrings.c5Dot4xlarge
  - typings.awsSdk.awsSdkStrings.c5Dot9xlarge
  - typings.awsSdk.awsSdkStrings.c5Dot12xlarge
  - typings.awsSdk.awsSdkStrings.c5Dot18xlarge
  - typings.awsSdk.awsSdkStrings.c5Dot24xlarge
  - typings.awsSdk.awsSdkStrings.c5aDotlarge
  - typings.awsSdk.awsSdkStrings.c5aDotxlarge
  - typings.awsSdk.awsSdkStrings.c5aDot2xlarge
  - typings.awsSdk.awsSdkStrings.c5aDot4xlarge
  - typings.awsSdk.awsSdkStrings.c5aDot8xlarge
  - typings.awsSdk.awsSdkStrings.c5aDot12xlarge
  - typings.awsSdk.awsSdkStrings.c5aDot16xlarge
  - typings.awsSdk.awsSdkStrings.c5aDot24xlarge
  - typings.awsSdk.awsSdkStrings.r3Dotlarge
  - typings.awsSdk.awsSdkStrings.r3Dotxlarge
  - typings.awsSdk.awsSdkStrings.r3Dot2xlarge
  - typings.awsSdk.awsSdkStrings.r3Dot4xlarge
  - typings.awsSdk.awsSdkStrings.r3Dot8xlarge
  - typings.awsSdk.awsSdkStrings.r4Dotlarge
  - typings.awsSdk.awsSdkStrings.r4Dotxlarge
  - typings.awsSdk.awsSdkStrings.r4Dot2xlarge
  - typings.awsSdk.awsSdkStrings.r4Dot4xlarge
  - typings.awsSdk.awsSdkStrings.r4Dot8xlarge
  - typings.awsSdk.awsSdkStrings.r4Dot16xlarge
  - typings.awsSdk.awsSdkStrings.r5Dotlarge
  - typings.awsSdk.awsSdkStrings.r5Dotxlarge
  - typings.awsSdk.awsSdkStrings.r5Dot2xlarge
  - typings.awsSdk.awsSdkStrings.r5Dot4xlarge
  - typings.awsSdk.awsSdkStrings.r5Dot8xlarge
  - typings.awsSdk.awsSdkStrings.r5Dot12xlarge
  - typings.awsSdk.awsSdkStrings.r5Dot16xlarge
  - typings.awsSdk.awsSdkStrings.r5Dot24xlarge
  - typings.awsSdk.awsSdkStrings.r5aDotlarge
  - typings.awsSdk.awsSdkStrings.r5aDotxlarge
  - typings.awsSdk.awsSdkStrings.r5aDot2xlarge
  - typings.awsSdk.awsSdkStrings.r5aDot4xlarge
  - typings.awsSdk.awsSdkStrings.r5aDot8xlarge
  - typings.awsSdk.awsSdkStrings.r5aDot12xlarge
  - typings.awsSdk.awsSdkStrings.r5aDot16xlarge
  - typings.awsSdk.awsSdkStrings.r5aDot24xlarge
  - typings.awsSdk.awsSdkStrings.m3Dotmedium
  - typings.awsSdk.awsSdkStrings.m3Dotlarge
  - typings.awsSdk.awsSdkStrings.m3Dotxlarge
  - typings.awsSdk.awsSdkStrings.m3Dot2xlarge
  - typings.awsSdk.awsSdkStrings.m4Dotlarge
  - typings.awsSdk.awsSdkStrings.m4Dotxlarge
  - typings.awsSdk.awsSdkStrings.m4Dot2xlarge
  - typings.awsSdk.awsSdkStrings.m4Dot4xlarge
  - typings.awsSdk.awsSdkStrings.m4Dot10xlarge
  - typings.awsSdk.awsSdkStrings.m5Dotlarge
  - typings.awsSdk.awsSdkStrings.m5Dotxlarge
  - typings.awsSdk.awsSdkStrings.m5Dot2xlarge
  - typings.awsSdk.awsSdkStrings.m5Dot4xlarge
  - typings.awsSdk.awsSdkStrings.m5Dot8xlarge
  - typings.awsSdk.awsSdkStrings.m5Dot12xlarge
  - typings.awsSdk.awsSdkStrings.m5Dot16xlarge
  - typings.awsSdk.awsSdkStrings.m5Dot24xlarge
  - typings.awsSdk.awsSdkStrings.m5aDotlarge
  - typings.awsSdk.awsSdkStrings.m5aDotxlarge
  - typings.awsSdk.awsSdkStrings.m5aDot2xlarge
  - typings.awsSdk.awsSdkStrings.m5aDot4xlarge
  - typings.awsSdk.awsSdkStrings.m5aDot8xlarge
  - typings.awsSdk.awsSdkStrings.m5aDot12xlarge
  - typings.awsSdk.awsSdkStrings.m5aDot16xlarge
  - typings.awsSdk.awsSdkStrings.m5aDot24xlarge
  - typings.awsSdk.awsSdkStrings.c5dDotlarge
  - typings.awsSdk.awsSdkStrings.c5dDotxlarge
  - typings.awsSdk.awsSdkStrings.c5dDot2xlarge
  - typings.awsSdk.awsSdkStrings.c5dDot4xlarge
  - typings.awsSdk.awsSdkStrings.c5dDot9xlarge
  - typings.awsSdk.awsSdkStrings.c5dDot12xlarge
  - typings.awsSdk.awsSdkStrings.c5dDot18xlarge
  - typings.awsSdk.awsSdkStrings.c5dDot24xlarge
  - typings.awsSdk.awsSdkStrings.c6aDotlarge
  - typings.awsSdk.awsSdkStrings.c6aDotxlarge
  - typings.awsSdk.awsSdkStrings.c6aDot2xlarge
  - typings.awsSdk.awsSdkStrings.c6aDot4xlarge
  - typings.awsSdk.awsSdkStrings.c6aDot8xlarge
  - typings.awsSdk.awsSdkStrings.c6aDot12xlarge
  - typings.awsSdk.awsSdkStrings.c6aDot16xlarge
  - typings.awsSdk.awsSdkStrings.c6aDot24xlarge
  - typings.awsSdk.awsSdkStrings.c6iDotlarge
  - typings.awsSdk.awsSdkStrings.c6iDotxlarge
  - typings.awsSdk.awsSdkStrings.c6iDot2xlarge
  - typings.awsSdk.awsSdkStrings.c6iDot4xlarge
  - typings.awsSdk.awsSdkStrings.c6iDot8xlarge
  - typings.awsSdk.awsSdkStrings.c6iDot12xlarge
  - typings.awsSdk.awsSdkStrings.c6iDot16xlarge
  - typings.awsSdk.awsSdkStrings.c6iDot24xlarge
  - typings.awsSdk.awsSdkStrings.r5dDotlarge
  - typings.awsSdk.awsSdkStrings.r5dDotxlarge
  - typings.awsSdk.awsSdkStrings.r5dDot2xlarge
  - typings.awsSdk.awsSdkStrings.r5dDot4xlarge
  - typings.awsSdk.awsSdkStrings.r5dDot8xlarge
  - typings.awsSdk.awsSdkStrings.r5dDot12xlarge
  - typings.awsSdk.awsSdkStrings.r5dDot16xlarge
  - typings.awsSdk.awsSdkStrings.r5dDot24xlarge
  - java.lang.String
*/
type EC2InstanceType = _EC2InstanceType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GENERIC_EVENT
  - typings.awsSdk.awsSdkStrings.FLEET_CREATED
  - typings.awsSdk.awsSdkStrings.FLEET_DELETED
  - typings.awsSdk.awsSdkStrings.FLEET_SCALING_EVENT
  - typings.awsSdk.awsSdkStrings.FLEET_STATE_DOWNLOADING
  - typings.awsSdk.awsSdkStrings.FLEET_STATE_VALIDATING
  - typings.awsSdk.awsSdkStrings.FLEET_STATE_BUILDING
  - typings.awsSdk.awsSdkStrings.FLEET_STATE_ACTIVATING
  - typings.awsSdk.awsSdkStrings.FLEET_STATE_ACTIVE
  - typings.awsSdk.awsSdkStrings.FLEET_STATE_ERROR
  - typings.awsSdk.awsSdkStrings.FLEET_INITIALIZATION_FAILED
  - typings.awsSdk.awsSdkStrings.FLEET_BINARY_DOWNLOAD_FAILED
  - typings.awsSdk.awsSdkStrings.FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE
  - typings.awsSdk.awsSdkStrings.FLEET_VALIDATION_TIMED_OUT
  - typings.awsSdk.awsSdkStrings.FLEET_ACTIVATION_FAILED
  - typings.awsSdk.awsSdkStrings.FLEET_ACTIVATION_FAILED_NO_INSTANCES
  - typings.awsSdk.awsSdkStrings.FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED
  - typings.awsSdk.awsSdkStrings.SERVER_PROCESS_INVALID_PATH
  - typings.awsSdk.awsSdkStrings.SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT
  - typings.awsSdk.awsSdkStrings.SERVER_PROCESS_PROCESS_READY_TIMEOUT
  - typings.awsSdk.awsSdkStrings.SERVER_PROCESS_CRASHED
  - typings.awsSdk.awsSdkStrings.SERVER_PROCESS_TERMINATED_UNHEALTHY
  - typings.awsSdk.awsSdkStrings.SERVER_PROCESS_FORCE_TERMINATED
  - typings.awsSdk.awsSdkStrings.SERVER_PROCESS_PROCESS_EXIT_TIMEOUT
  - typings.awsSdk.awsSdkStrings.GAME_SESSION_ACTIVATION_TIMEOUT
  - typings.awsSdk.awsSdkStrings.FLEET_CREATION_EXTRACTING_BUILD
  - typings.awsSdk.awsSdkStrings.FLEET_CREATION_RUNNING_INSTALLER
  - typings.awsSdk.awsSdkStrings.FLEET_CREATION_VALIDATING_RUNTIME_CONFIG
  - typings.awsSdk.awsSdkStrings.FLEET_VPC_PEERING_SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FLEET_VPC_PEERING_FAILED
  - typings.awsSdk.awsSdkStrings.FLEET_VPC_PEERING_DELETED
  - typings.awsSdk.awsSdkStrings.INSTANCE_INTERRUPTED
  - java.lang.String
*/
type EventCode = _EventCode | String

type EventList = js.Array[Event]

type FleetAction = AUTO_SCALING | String

type FleetActionList = js.Array[FleetAction]

type FleetArn = String

type FleetAttributesList = js.Array[FleetAttributes]

type FleetCapacityList = js.Array[FleetCapacity]

type FleetId = String

type FleetIdList = js.Array[FleetId]

type FleetIdOrArn = String

type FleetIdOrArnList = js.Array[FleetIdOrArn]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NEW
  - typings.awsSdk.awsSdkStrings.DOWNLOADING
  - typings.awsSdk.awsSdkStrings.VALIDATING
  - typings.awsSdk.awsSdkStrings.BUILDING
  - typings.awsSdk.awsSdkStrings.ACTIVATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.TERMINATED
  - java.lang.String
*/
type FleetStatus = _FleetStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ON_DEMAND
  - typings.awsSdk.awsSdkStrings.SPOT
  - java.lang.String
*/
type FleetType = _FleetType | String

type FleetUtilizationList = js.Array[FleetUtilization]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDALONE
  - typings.awsSdk.awsSdkStrings.WITH_QUEUE
  - java.lang.String
*/
type FlexMatchMode = _FlexMatchMode | String

type Float = scala.Double

type FreeText = String

type GamePropertyKey = String

type GamePropertyList = js.Array[GameProperty]

type GamePropertyValue = String

type GameServerClaimStatus = CLAIMED | String

type GameServerConnectionInfo = String

type GameServerData = String

type GameServerGroupAction = REPLACE_INSTANCE_TYPES | String

type GameServerGroupActions = js.Array[GameServerGroupAction]

type GameServerGroupArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SAFE_DELETE
  - typings.awsSdk.awsSdkStrings.FORCE_DELETE
  - typings.awsSdk.awsSdkStrings.RETAIN
  - java.lang.String
*/
type GameServerGroupDeleteOption = _GameServerGroupDeleteOption | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.c4Dotlarge
  - typings.awsSdk.awsSdkStrings.c4Dotxlarge
  - typings.awsSdk.awsSdkStrings.c4Dot2xlarge
  - typings.awsSdk.awsSdkStrings.c4Dot4xlarge
  - typings.awsSdk.awsSdkStrings.c4Dot8xlarge
  - typings.awsSdk.awsSdkStrings.c5Dotlarge
  - typings.awsSdk.awsSdkStrings.c5Dotxlarge
  - typings.awsSdk.awsSdkStrings.c5Dot2xlarge
  - typings.awsSdk.awsSdkStrings.c5Dot4xlarge
  - typings.awsSdk.awsSdkStrings.c5Dot9xlarge
  - typings.awsSdk.awsSdkStrings.c5Dot12xlarge
  - typings.awsSdk.awsSdkStrings.c5Dot18xlarge
  - typings.awsSdk.awsSdkStrings.c5Dot24xlarge
  - typings.awsSdk.awsSdkStrings.c5aDotlarge
  - typings.awsSdk.awsSdkStrings.c5aDotxlarge
  - typings.awsSdk.awsSdkStrings.c5aDot2xlarge
  - typings.awsSdk.awsSdkStrings.c5aDot4xlarge
  - typings.awsSdk.awsSdkStrings.c5aDot8xlarge
  - typings.awsSdk.awsSdkStrings.c5aDot12xlarge
  - typings.awsSdk.awsSdkStrings.c5aDot16xlarge
  - typings.awsSdk.awsSdkStrings.c5aDot24xlarge
  - typings.awsSdk.awsSdkStrings.c6gDotmedium
  - typings.awsSdk.awsSdkStrings.c6gDotlarge
  - typings.awsSdk.awsSdkStrings.c6gDotxlarge
  - typings.awsSdk.awsSdkStrings.c6gDot2xlarge
  - typings.awsSdk.awsSdkStrings.c6gDot4xlarge
  - typings.awsSdk.awsSdkStrings.c6gDot8xlarge
  - typings.awsSdk.awsSdkStrings.c6gDot12xlarge
  - typings.awsSdk.awsSdkStrings.c6gDot16xlarge
  - typings.awsSdk.awsSdkStrings.r4Dotlarge
  - typings.awsSdk.awsSdkStrings.r4Dotxlarge
  - typings.awsSdk.awsSdkStrings.r4Dot2xlarge
  - typings.awsSdk.awsSdkStrings.r4Dot4xlarge
  - typings.awsSdk.awsSdkStrings.r4Dot8xlarge
  - typings.awsSdk.awsSdkStrings.r4Dot16xlarge
  - typings.awsSdk.awsSdkStrings.r5Dotlarge
  - typings.awsSdk.awsSdkStrings.r5Dotxlarge
  - typings.awsSdk.awsSdkStrings.r5Dot2xlarge
  - typings.awsSdk.awsSdkStrings.r5Dot4xlarge
  - typings.awsSdk.awsSdkStrings.r5Dot8xlarge
  - typings.awsSdk.awsSdkStrings.r5Dot12xlarge
  - typings.awsSdk.awsSdkStrings.r5Dot16xlarge
  - typings.awsSdk.awsSdkStrings.r5Dot24xlarge
  - typings.awsSdk.awsSdkStrings.r5aDotlarge
  - typings.awsSdk.awsSdkStrings.r5aDotxlarge
  - typings.awsSdk.awsSdkStrings.r5aDot2xlarge
  - typings.awsSdk.awsSdkStrings.r5aDot4xlarge
  - typings.awsSdk.awsSdkStrings.r5aDot8xlarge
  - typings.awsSdk.awsSdkStrings.r5aDot12xlarge
  - typings.awsSdk.awsSdkStrings.r5aDot16xlarge
  - typings.awsSdk.awsSdkStrings.r5aDot24xlarge
  - typings.awsSdk.awsSdkStrings.r6gDotmedium
  - typings.awsSdk.awsSdkStrings.r6gDotlarge
  - typings.awsSdk.awsSdkStrings.r6gDotxlarge
  - typings.awsSdk.awsSdkStrings.r6gDot2xlarge
  - typings.awsSdk.awsSdkStrings.r6gDot4xlarge
  - typings.awsSdk.awsSdkStrings.r6gDot8xlarge
  - typings.awsSdk.awsSdkStrings.r6gDot12xlarge
  - typings.awsSdk.awsSdkStrings.r6gDot16xlarge
  - typings.awsSdk.awsSdkStrings.m4Dotlarge
  - typings.awsSdk.awsSdkStrings.m4Dotxlarge
  - typings.awsSdk.awsSdkStrings.m4Dot2xlarge
  - typings.awsSdk.awsSdkStrings.m4Dot4xlarge
  - typings.awsSdk.awsSdkStrings.m4Dot10xlarge
  - typings.awsSdk.awsSdkStrings.m5Dotlarge
  - typings.awsSdk.awsSdkStrings.m5Dotxlarge
  - typings.awsSdk.awsSdkStrings.m5Dot2xlarge
  - typings.awsSdk.awsSdkStrings.m5Dot4xlarge
  - typings.awsSdk.awsSdkStrings.m5Dot8xlarge
  - typings.awsSdk.awsSdkStrings.m5Dot12xlarge
  - typings.awsSdk.awsSdkStrings.m5Dot16xlarge
  - typings.awsSdk.awsSdkStrings.m5Dot24xlarge
  - typings.awsSdk.awsSdkStrings.m5aDotlarge
  - typings.awsSdk.awsSdkStrings.m5aDotxlarge
  - typings.awsSdk.awsSdkStrings.m5aDot2xlarge
  - typings.awsSdk.awsSdkStrings.m5aDot4xlarge
  - typings.awsSdk.awsSdkStrings.m5aDot8xlarge
  - typings.awsSdk.awsSdkStrings.m5aDot12xlarge
  - typings.awsSdk.awsSdkStrings.m5aDot16xlarge
  - typings.awsSdk.awsSdkStrings.m5aDot24xlarge
  - typings.awsSdk.awsSdkStrings.m6gDotmedium
  - typings.awsSdk.awsSdkStrings.m6gDotlarge
  - typings.awsSdk.awsSdkStrings.m6gDotxlarge
  - typings.awsSdk.awsSdkStrings.m6gDot2xlarge
  - typings.awsSdk.awsSdkStrings.m6gDot4xlarge
  - typings.awsSdk.awsSdkStrings.m6gDot8xlarge
  - typings.awsSdk.awsSdkStrings.m6gDot12xlarge
  - typings.awsSdk.awsSdkStrings.m6gDot16xlarge
  - java.lang.String
*/
type GameServerGroupInstanceType = _GameServerGroupInstanceType | String

type GameServerGroupName = String

type GameServerGroupNameOrArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NEW
  - typings.awsSdk.awsSdkStrings.ACTIVATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETE_SCHEDULED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type GameServerGroupStatus = _GameServerGroupStatus | String

type GameServerGroups = js.Array[GameServerGroup]

type GameServerHealthCheck = HEALTHY | String

type GameServerId = String

type GameServerInstanceId = String

type GameServerInstanceIds = js.Array[GameServerInstanceId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DRAINING
  - typings.awsSdk.awsSdkStrings.SPOT_TERMINATING
  - java.lang.String
*/
type GameServerInstanceStatus = _GameServerInstanceStatus | String

type GameServerInstances = js.Array[GameServerInstance]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NO_PROTECTION
  - typings.awsSdk.awsSdkStrings.FULL_PROTECTION
  - java.lang.String
*/
type GameServerProtectionPolicy = _GameServerProtectionPolicy | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.UTILIZED
  - java.lang.String
*/
type GameServerUtilizationStatus = _GameServerUtilizationStatus | String

type GameServers = js.Array[GameServer]

type GameSessionActivationTimeoutSeconds = scala.Double

type GameSessionData = String

type GameSessionDetailList = js.Array[GameSessionDetail]

type GameSessionList = js.Array[GameSession]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.FULFILLED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type GameSessionPlacementState = _GameSessionPlacementState | String

type GameSessionQueueArn = String

type GameSessionQueueDestinationList = js.Array[GameSessionQueueDestination]

type GameSessionQueueList = js.Array[GameSessionQueue]

type GameSessionQueueName = String

type GameSessionQueueNameOrArn = String

type GameSessionQueueNameOrArnList = js.Array[GameSessionQueueNameOrArn]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.ACTIVATING
  - typings.awsSdk.awsSdkStrings.TERMINATED
  - typings.awsSdk.awsSdkStrings.TERMINATING
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type GameSessionStatus = _GameSessionStatus | String

type GameSessionStatusReason = INTERRUPTED | String

type IamRoleArn = String

type IdStringModel = String

type InstanceDefinitions = js.Array[InstanceDefinition]

type InstanceId = String

type InstanceList = js.Array[Instance]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.TERMINATING
  - java.lang.String
*/
type InstanceStatus = _InstanceStatus | String

type Integer = scala.Double

type IpAddress = String

type IpPermissionsList = js.Array[IpPermission]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TCP
  - typings.awsSdk.awsSdkStrings.UDP
  - java.lang.String
*/
type IpProtocol = _IpProtocol | String

type LargeGameSessionData = String

type LatencyMap = StringDictionary[PositiveInteger]

type LaunchParametersStringModel = String

type LaunchPathStringModel = String

type LaunchTemplateId = String

type LaunchTemplateName = String

type LaunchTemplateVersion = String

type LocationAttributesList = js.Array[LocationAttributes]

type LocationConfigurationList = js.Array[LocationConfiguration]

type LocationList = js.Array[LocationStringModel]

type LocationStateList = js.Array[LocationState]

type LocationStringModel = String

type LocationUpdateStatus = PENDING_UPDATE | String

type MatchedPlayerSessionList = js.Array[MatchedPlayerSession]

type MatchmakerData = String

type MatchmakingAcceptanceTimeoutInteger = scala.Double

type MatchmakingConfigurationArn = String

type MatchmakingConfigurationList = js.Array[MatchmakingConfiguration]

type MatchmakingConfigurationName = String

type MatchmakingConfigurationNameList = js.Array[MatchmakingConfigurationName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.PLACING
  - typings.awsSdk.awsSdkStrings.QUEUED
  - typings.awsSdk.awsSdkStrings.REQUIRES_ACCEPTANCE
  - typings.awsSdk.awsSdkStrings.SEARCHING
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
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
  - typings.awsSdk.awsSdkStrings.ActivatingGameSessions
  - typings.awsSdk.awsSdkStrings.ActiveGameSessions
  - typings.awsSdk.awsSdkStrings.ActiveInstances
  - typings.awsSdk.awsSdkStrings.AvailableGameSessions
  - typings.awsSdk.awsSdkStrings.AvailablePlayerSessions
  - typings.awsSdk.awsSdkStrings.CurrentPlayerSessions
  - typings.awsSdk.awsSdkStrings.IdleInstances
  - typings.awsSdk.awsSdkStrings.PercentAvailableGameSessions
  - typings.awsSdk.awsSdkStrings.PercentIdleInstances
  - typings.awsSdk.awsSdkStrings.QueueDepth
  - typings.awsSdk.awsSdkStrings.WaitTime
  - java.lang.String
*/
type MetricName = _MetricName | String

type NonBlankAndLengthConstraintString = String

type NonBlankString = String

type NonEmptyString = String

type NonNegativeDouble = scala.Double

type NonZeroAndMaxString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WINDOWS_2012
  - typings.awsSdk.awsSdkStrings.AMAZON_LINUX
  - typings.awsSdk.awsSdkStrings.AMAZON_LINUX_2
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
  - typings.awsSdk.awsSdkStrings.ACCEPT_ALL
  - typings.awsSdk.awsSdkStrings.DENY_ALL
  - java.lang.String
*/
type PlayerSessionCreationPolicy = _PlayerSessionCreationPolicy | String

type PlayerSessionId = String

type PlayerSessionList = js.Array[PlayerSession]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RESERVED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.TIMEDOUT
  - java.lang.String
*/
type PlayerSessionStatus = _PlayerSessionStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RuleBased
  - typings.awsSdk.awsSdkStrings.TargetBased
  - java.lang.String
*/
type PolicyType = _PolicyType | String

type PortNumber = scala.Double

type PositiveInteger = scala.Double

type PositiveLong = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LATENCY
  - typings.awsSdk.awsSdkStrings.COST
  - typings.awsSdk.awsSdkStrings.DESTINATION
  - typings.awsSdk.awsSdkStrings.LOCATION
  - java.lang.String
*/
type PriorityType = _PriorityType | String

type PriorityTypeList = js.Array[PriorityType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NoProtection
  - typings.awsSdk.awsSdkStrings.FullProtection
  - java.lang.String
*/
type ProtectionPolicy = _ProtectionPolicy | String

type QueueArnsList = js.Array[ArnStringModel]

type QueueCustomEventData = String

type QueueSnsArnStringModel = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SIMPLE
  - typings.awsSdk.awsSdkStrings.TERMINAL
  - java.lang.String
*/
type RoutingStrategyType = _RoutingStrategyType | String

type RuleSetBody = String

type RuleSetLimit = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ChangeInCapacity
  - typings.awsSdk.awsSdkStrings.ExactCapacity
  - typings.awsSdk.awsSdkStrings.PercentChangeInCapacity
  - java.lang.String
*/
type ScalingAdjustmentType = _ScalingAdjustmentType | String

type ScalingPolicyList = js.Array[ScalingPolicy]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UPDATE_REQUESTED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETE_REQUESTED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type ScalingStatusType = _ScalingStatusType | String

type ScriptArn = String

type ScriptId = String

type ScriptIdOrArn = String

type ScriptList = js.Array[Script]

type ServerProcessList = js.Array[ServerProcess]

type SnsArnStringModel = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | String

type StringDoubleMap = StringDictionary[DoubleObject]

type StringList = js.Array[NonZeroAndMaxString]

type StringModel = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type Timestamp = js.Date

type VpcPeeringAuthorizationList = js.Array[VpcPeeringAuthorization]

type VpcPeeringConnectionList = js.Array[VpcPeeringConnection]

type VpcSubnet = String

type VpcSubnets = js.Array[VpcSubnet]

type WeightedCapacity = String

type WholeNumber = scala.Double

type ZipBlob = Buffer | js.typedarray.Uint8Array | Blob | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-10-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
