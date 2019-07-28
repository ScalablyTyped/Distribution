package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * Type of event being logged. The following events are currently in use:  Fleet creation events:    FLEET_CREATED -- A fleet record was successfully created with a status of NEW. Event messaging includes the fleet ID.   FLEET_STATE_DOWNLOADING -- Fleet status changed from NEW to DOWNLOADING. The compressed build has started downloading to a fleet instance for installation.    FLEET_BINARY_DOWNLOAD_FAILED -- The build failed to download to the fleet instance.   FLEET_CREATION_EXTRACTING_BUILD – The game server build was successfully downloaded to an instance, and the build files are now being extracted from the uploaded build and saved to an instance. Failure at this stage prevents a fleet from moving to ACTIVE status. Logs for this stage display a list of the files that are extracted and saved on the instance. Access the logs by using the URL in PreSignedLogUrl.   FLEET_CREATION_RUNNING_INSTALLER – The game server build files were successfully extracted, and the Amazon GameLift is now running the build's install script (if one is included). Failure in this stage prevents a fleet from moving to ACTIVE status. Logs for this stage list the installation steps and whether or not the install completed successfully. Access the logs by using the URL in PreSignedLogUrl.    FLEET_CREATION_VALIDATING_RUNTIME_CONFIG -- The build process was successful, and the Amazon GameLift is now verifying that the game server launch paths, which are specified in the fleet's run-time configuration, exist. If any listed launch path exists, Amazon GameLift tries to launch a game server process and waits for the process to report ready. Failures in this stage prevent a fleet from moving to ACTIVE status. Logs for this stage list the launch paths in the run-time configuration and indicate whether each is found. Access the logs by using the URL in PreSignedLogUrl.    FLEET_STATE_VALIDATING -- Fleet status changed from DOWNLOADING to VALIDATING.    FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND -- Validation of the run-time configuration failed because the executable specified in a launch path does not exist on the instance.   FLEET_STATE_BUILDING -- Fleet status changed from VALIDATING to BUILDING.   FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE -- Validation of the run-time configuration failed because the executable specified in a launch path failed to run on the fleet instance.   FLEET_STATE_ACTIVATING -- Fleet status changed from BUILDING to ACTIVATING.     FLEET_ACTIVATION_FAILED - The fleet failed to successfully complete one of the steps in the fleet activation process. This event code indicates that the game build was successfully downloaded to a fleet instance, built, and validated, but was not able to start a server process. A possible reason for failure is that the game server is not reporting "process ready" to the Amazon GameLift service.   FLEET_STATE_ACTIVE -- The fleet's status changed from ACTIVATING to ACTIVE. The fleet is now ready to host game sessions.    VPC peering events:    FLEET_VPC_PEERING_SUCCEEDED -- A VPC peering connection has been established between the VPC for an Amazon GameLift fleet and a VPC in your AWS account.   FLEET_VPC_PEERING_FAILED -- A requested VPC peering connection has failed. Event details and status information (see DescribeVpcPeeringConnections) provide additional detail. A common reason for peering failure is that the two VPCs have overlapping CIDR blocks of IPv4 addresses. To resolve this, change the CIDR block for the VPC in your AWS account. For more information on VPC peering failures, see https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html    FLEET_VPC_PEERING_DELETED -- A VPC peering connection has been successfully deleted.    Spot instance events:     INSTANCE_INTERRUPTED -- A spot instance was interrupted by EC2 with a two-minute notification.    Other fleet events:    FLEET_SCALING_EVENT -- A change was made to the fleet's capacity settings (desired instances, minimum/maximum scaling limits). Event messaging includes the new capacity settings.   FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED -- A change was made to the fleet's game session protection policy setting. Event messaging includes both the old and new policy setting.    FLEET_DELETED -- A request to delete a fleet was initiated.    GENERIC_EVENT -- An unspecified event has occurred.  
    */
  var EventCode: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.EventCode] = js.undefined
  /**
    * Unique identifier for a fleet event.
    */
  var EventId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var EventTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Additional information related to the event.
    */
  var Message: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Location of stored logs with additional detail that is related to the event. This is useful for debugging issues. The URL is valid for 15 minutes. You can also access fleet creation logs through the Amazon GameLift console.
    */
  var PreSignedLogUrl: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Unique identifier for an event resource, such as a fleet ID.
    */
  var ResourceId: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    EventCode: EventCode = null,
    EventId: NonZeroAndMaxString = null,
    EventTime: Timestamp = null,
    Message: NonEmptyString = null,
    PreSignedLogUrl: NonZeroAndMaxString = null,
    ResourceId: NonZeroAndMaxString = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (EventCode != null) __obj.updateDynamic("EventCode")(EventCode.asInstanceOf[js.Any])
    if (EventId != null) __obj.updateDynamic("EventId")(EventId)
    if (EventTime != null) __obj.updateDynamic("EventTime")(EventTime)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (PreSignedLogUrl != null) __obj.updateDynamic("PreSignedLogUrl")(PreSignedLogUrl)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    __obj.asInstanceOf[Event]
  }
}

