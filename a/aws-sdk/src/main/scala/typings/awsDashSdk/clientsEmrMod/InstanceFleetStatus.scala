package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceFleetStatus extends js.Object {
  /**
    * A code representing the instance fleet status.    PROVISIONING—The instance fleet is provisioning EC2 resources and is not yet ready to run jobs.    BOOTSTRAPPING—EC2 instances and other resources have been provisioned and the bootstrap actions specified for the instances are underway.    RUNNING—EC2 instances and other resources are running. They are either executing jobs or waiting to execute jobs.    RESIZING—A resize operation is underway. EC2 instances are either being added or removed.    SUSPENDED—A resize operation could not complete. Existing EC2 instances are running, but instances can't be added or removed.    TERMINATING—The instance fleet is terminating EC2 instances.    TERMINATED—The instance fleet is no longer active, and all EC2 instances have been terminated.  
    */
  var State: js.UndefOr[InstanceFleetState] = js.undefined
  /**
    * Provides status change reason details for the instance fleet.
    */
  var StateChangeReason: js.UndefOr[InstanceFleetStateChangeReason] = js.undefined
  /**
    * Provides historical timestamps for the instance fleet, including the time of creation, the time it became ready to run jobs, and the time of termination.
    */
  var Timeline: js.UndefOr[InstanceFleetTimeline] = js.undefined
}

object InstanceFleetStatus {
  @scala.inline
  def apply(
    State: InstanceFleetState = null,
    StateChangeReason: InstanceFleetStateChangeReason = null,
    Timeline: InstanceFleetTimeline = null
  ): InstanceFleetStatus = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateChangeReason != null) __obj.updateDynamic("StateChangeReason")(StateChangeReason)
    if (Timeline != null) __obj.updateDynamic("Timeline")(Timeline)
    __obj.asInstanceOf[InstanceFleetStatus]
  }
}

