package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFleetInput extends js.Object {
  /**
    * Unique identifier for a build to be deployed on the new fleet. The custom game server build must have been successfully uploaded to Amazon GameLift and be in a READY status. This fleet setting cannot be changed once the fleet is created.
    */
  var BuildId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.BuildId] = js.undefined
  var CertificateConfiguration: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.CertificateConfiguration] = js.undefined
  /**
    * Human-readable description of a fleet.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Range of IP addresses and port settings that permit inbound traffic to access game sessions that running on the fleet. For fleets using a custom game build, this parameter is required before game sessions running on the fleet can accept connections. For Realtime Servers fleets, Amazon GameLift automatically sets TCP and UDP ranges for use by the Realtime servers. You can specify multiple permission settings or add more by updating the fleet.
    */
  var EC2InboundPermissions: js.UndefOr[IpPermissionsList] = js.undefined
  /**
    * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions.
    */
  var EC2InstanceType: typings.awsDashSdk.clientsGameliftMod.EC2InstanceType
  /**
    * Indicates whether to use on-demand instances or spot instances for this fleet. If empty, the default is ON_DEMAND. Both categories of instances use identical hardware and configurations based on the instance type selected for this fleet. Learn more about  On-Demand versus Spot Instances. 
    */
  var FleetType: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.FleetType] = js.undefined
  /**
    * Unique identifier for an AWS IAM role that manages access to your AWS services. With an instance role ARN set, any application that runs on an instance in this fleet can assume the role, including install scripts, server processes, daemons (background processes). Create a role or look up a role's ARN using the IAM dashboard in the AWS Management Console. Learn more about using on-box credentials for your game servers at  Access external resources from a game server.
    */
  var InstanceRoleArn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * This parameter is no longer used. Instead, to specify where Amazon GameLift should store log files once a server process shuts down, use the Amazon GameLift server API ProcessReady() and specify one or more directory paths in logParameters. See more information in the Server API Reference. 
    */
  var LogPaths: js.UndefOr[StringList] = js.undefined
  /**
    * Name of an Amazon CloudWatch metric group to add this fleet to. A metric group aggregates the metrics for all fleets in the group. Specify an existing metric group name, or provide a new name to create a new metric group. A fleet can only be included in one metric group at a time. 
    */
  var MetricGroups: js.UndefOr[MetricGroupList] = js.undefined
  /**
    * Descriptive label that is associated with a fleet. Fleet names do not need to be unique.
    */
  var Name: NonZeroAndMaxString
  /**
    * Game session protection policy to apply to all instances in this fleet. If this parameter is not set, instances in this fleet default to no protection. You can change a fleet's protection policy using UpdateFleetAttributes, but this change will only affect sessions created after the policy change. You can also set protection for individual instances using UpdateGameSession.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined
  /**
    * Unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You can find your Account ID in the AWS Management Console under account settings. 
    */
  var PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same region where your fleet is deployed. Look up a VPC ID using the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets. 
    */
  var PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Policy that limits the number of game sessions an individual player can create over a span of time for this fleet.
    */
  var ResourceCreationLimitPolicy: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.ResourceCreationLimitPolicy] = js.undefined
  /**
    * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom game build executable or a Realtime Servers script. The run-time configuration lists the types of server processes to run on an instance and includes the following configuration settings: the server executable or launch script file, launch parameters, and the number of processes to run concurrently on each instance. A CreateFleet request must include a run-time configuration with at least one server process configuration.
    */
  var RuntimeConfiguration: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.RuntimeConfiguration] = js.undefined
  /**
    * Unique identifier for a Realtime script to be deployed on the new fleet. The Realtime script must have been successfully uploaded to Amazon GameLift. This fleet setting cannot be changed once the fleet is created.
    */
  var ScriptId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.ScriptId] = js.undefined
  /**
    * This parameter is no longer used. Instead, specify server launch parameters in the RuntimeConfiguration parameter. (Requests that specify a server launch path and launch parameters instead of a run-time configuration will continue to work.)
    */
  var ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * This parameter is no longer used. Instead, specify a server launch path using the RuntimeConfiguration parameter. (Requests that specify a server launch path and launch parameters instead of a run-time configuration will continue to work.)
    */
  var ServerLaunchPath: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object CreateFleetInput {
  @scala.inline
  def apply(
    EC2InstanceType: EC2InstanceType,
    Name: NonZeroAndMaxString,
    BuildId: BuildId = null,
    CertificateConfiguration: CertificateConfiguration = null,
    Description: NonZeroAndMaxString = null,
    EC2InboundPermissions: IpPermissionsList = null,
    FleetType: FleetType = null,
    InstanceRoleArn: NonEmptyString = null,
    LogPaths: StringList = null,
    MetricGroups: MetricGroupList = null,
    NewGameSessionProtectionPolicy: ProtectionPolicy = null,
    PeerVpcAwsAccountId: NonZeroAndMaxString = null,
    PeerVpcId: NonZeroAndMaxString = null,
    ResourceCreationLimitPolicy: ResourceCreationLimitPolicy = null,
    RuntimeConfiguration: RuntimeConfiguration = null,
    ScriptId: ScriptId = null,
    ServerLaunchParameters: NonZeroAndMaxString = null,
    ServerLaunchPath: NonZeroAndMaxString = null
  ): CreateFleetInput = {
    val __obj = js.Dynamic.literal(EC2InstanceType = EC2InstanceType.asInstanceOf[js.Any], Name = Name)
    if (BuildId != null) __obj.updateDynamic("BuildId")(BuildId)
    if (CertificateConfiguration != null) __obj.updateDynamic("CertificateConfiguration")(CertificateConfiguration)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EC2InboundPermissions != null) __obj.updateDynamic("EC2InboundPermissions")(EC2InboundPermissions)
    if (FleetType != null) __obj.updateDynamic("FleetType")(FleetType.asInstanceOf[js.Any])
    if (InstanceRoleArn != null) __obj.updateDynamic("InstanceRoleArn")(InstanceRoleArn)
    if (LogPaths != null) __obj.updateDynamic("LogPaths")(LogPaths)
    if (MetricGroups != null) __obj.updateDynamic("MetricGroups")(MetricGroups)
    if (NewGameSessionProtectionPolicy != null) __obj.updateDynamic("NewGameSessionProtectionPolicy")(NewGameSessionProtectionPolicy.asInstanceOf[js.Any])
    if (PeerVpcAwsAccountId != null) __obj.updateDynamic("PeerVpcAwsAccountId")(PeerVpcAwsAccountId)
    if (PeerVpcId != null) __obj.updateDynamic("PeerVpcId")(PeerVpcId)
    if (ResourceCreationLimitPolicy != null) __obj.updateDynamic("ResourceCreationLimitPolicy")(ResourceCreationLimitPolicy)
    if (RuntimeConfiguration != null) __obj.updateDynamic("RuntimeConfiguration")(RuntimeConfiguration)
    if (ScriptId != null) __obj.updateDynamic("ScriptId")(ScriptId)
    if (ServerLaunchParameters != null) __obj.updateDynamic("ServerLaunchParameters")(ServerLaunchParameters)
    if (ServerLaunchPath != null) __obj.updateDynamic("ServerLaunchPath")(ServerLaunchPath)
    __obj.asInstanceOf[CreateFleetInput]
  }
}

