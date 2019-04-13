package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetAttributes extends js.Object {
  /**
    * Unique identifier for a build.
    */
  var BuildId: js.UndefOr[BuildId] = js.undefined
  /**
    * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Human-readable description of the fleet.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Identifier for a fleet that is unique across all regions.
    */
  var FleetArn: js.UndefOr[ArnStringModel] = js.undefined
  /**
    * Unique identifier for a fleet.
    */
  var FleetId: js.UndefOr[FleetId] = js.undefined
  /**
    * Indicates whether the fleet uses on-demand or spot instances. A spot instance in use may be interrupted with a two-minute notification.
    */
  var FleetType: js.UndefOr[FleetType] = js.undefined
  /**
    * Unique identifier for an AWS IAM role that manages access to your AWS services. Any application that runs on an instance in this fleet can assume the role, including install scripts, server processs, daemons (background processes). Create a role or look up a role's ARN using the IAM dashboard in the AWS Management Console. Learn more about using on-box credentials for your game servers at  Access external resources from a game server.
    */
  var InstanceRoleArn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * EC2 instance type indicating the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. See Amazon EC2 Instance Types for detailed descriptions.
    */
  var InstanceType: js.UndefOr[EC2InstanceType] = js.undefined
  /**
    * Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any log files in this location. These logs are in addition to game session logs; see more on game session logs in the Amazon GameLift Developer Guide. If no default log path for a fleet is specified, Amazon GameLift automatically uploads logs that are stored on each instance at C:\game\logs (for Windows) or /local/game/logs (for Linux). Use the Amazon GameLift console to access stored logs. 
    */
  var LogPaths: js.UndefOr[StringList] = js.undefined
  /**
    * Names of metric groups that this fleet is included in. In Amazon CloudWatch, you can view metrics for an individual fleet or aggregated metrics for fleets that are in a fleet metric group. A fleet can be included in only one metric group at a time.
    */
  var MetricGroups: js.UndefOr[MetricGroupList] = js.undefined
  /**
    * Descriptive label that is associated with a fleet. Fleet names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Type of game session protection to set for all new instances started in the fleet.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined
  /**
    * Operating system of the fleet's computing resources. A fleet's operating system depends on the OS specified for the build that is deployed on this fleet.
    */
  var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
  /**
    * Fleet policy to limit the number of game sessions an individual player can create over a span of time.
    */
  var ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy] = js.undefined
  /**
    * Game server launch parameters specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16). Server launch parameters for fleets created after this date are specified in the fleet's RuntimeConfiguration.
    */
  var ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Path to a game server executable in the fleet's build, specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16). Server launch paths for fleets created after this date are specified in the fleet's RuntimeConfiguration.
    */
  var ServerLaunchPath: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Current status of the fleet. Possible fleet statuses include the following:    NEW -- A new fleet has been defined and desired instances is set to 1.     DOWNLOADING/VALIDATING/BUILDING/ACTIVATING -- Amazon GameLift is setting up the new fleet, creating new instances with the game build and starting server processes.    ACTIVE -- Hosts can now accept game sessions.    ERROR -- An error occurred when downloading, validating, building, or activating the fleet.    DELETING -- Hosts are responding to a delete fleet request.    TERMINATED -- The fleet no longer exists.  
    */
  var Status: js.UndefOr[FleetStatus] = js.undefined
  /**
    * List of fleet actions that have been suspended using StopFleetActions. This includes auto-scaling.
    */
  var StoppedActions: js.UndefOr[FleetActionList] = js.undefined
  /**
    * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var TerminationTime: js.UndefOr[Timestamp] = js.undefined
}

object FleetAttributes {
  @scala.inline
  def apply(
    BuildId: BuildId = null,
    CreationTime: Timestamp = null,
    Description: NonZeroAndMaxString = null,
    FleetArn: ArnStringModel = null,
    FleetId: FleetId = null,
    FleetType: FleetType = null,
    InstanceRoleArn: NonEmptyString = null,
    InstanceType: EC2InstanceType = null,
    LogPaths: StringList = null,
    MetricGroups: MetricGroupList = null,
    Name: NonZeroAndMaxString = null,
    NewGameSessionProtectionPolicy: ProtectionPolicy = null,
    OperatingSystem: OperatingSystem = null,
    ResourceCreationLimitPolicy: ResourceCreationLimitPolicy = null,
    ServerLaunchParameters: NonZeroAndMaxString = null,
    ServerLaunchPath: NonZeroAndMaxString = null,
    Status: FleetStatus = null,
    StoppedActions: FleetActionList = null,
    TerminationTime: Timestamp = null
  ): FleetAttributes = {
    val __obj = js.Dynamic.literal()
    if (BuildId != null) __obj.updateDynamic("BuildId")(BuildId)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (FleetArn != null) __obj.updateDynamic("FleetArn")(FleetArn)
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    if (FleetType != null) __obj.updateDynamic("FleetType")(FleetType.asInstanceOf[js.Any])
    if (InstanceRoleArn != null) __obj.updateDynamic("InstanceRoleArn")(InstanceRoleArn)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (LogPaths != null) __obj.updateDynamic("LogPaths")(LogPaths)
    if (MetricGroups != null) __obj.updateDynamic("MetricGroups")(MetricGroups)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NewGameSessionProtectionPolicy != null) __obj.updateDynamic("NewGameSessionProtectionPolicy")(NewGameSessionProtectionPolicy.asInstanceOf[js.Any])
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    if (ResourceCreationLimitPolicy != null) __obj.updateDynamic("ResourceCreationLimitPolicy")(ResourceCreationLimitPolicy)
    if (ServerLaunchParameters != null) __obj.updateDynamic("ServerLaunchParameters")(ServerLaunchParameters)
    if (ServerLaunchPath != null) __obj.updateDynamic("ServerLaunchPath")(ServerLaunchPath)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StoppedActions != null) __obj.updateDynamic("StoppedActions")(StoppedActions)
    if (TerminationTime != null) __obj.updateDynamic("TerminationTime")(TerminationTime)
    __obj.asInstanceOf[FleetAttributes]
  }
}

