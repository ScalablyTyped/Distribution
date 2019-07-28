package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupStatus extends js.Object {
  /**
    * The current state of the instance group.
    */
  var State: js.UndefOr[InstanceGroupState] = js.undefined
  /**
    * The status change reason details for the instance group.
    */
  var StateChangeReason: js.UndefOr[InstanceGroupStateChangeReason] = js.undefined
  /**
    * The timeline of the instance group status over time.
    */
  var Timeline: js.UndefOr[InstanceGroupTimeline] = js.undefined
}

object InstanceGroupStatus {
  @scala.inline
  def apply(
    State: InstanceGroupState = null,
    StateChangeReason: InstanceGroupStateChangeReason = null,
    Timeline: InstanceGroupTimeline = null
  ): InstanceGroupStatus = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateChangeReason != null) __obj.updateDynamic("StateChangeReason")(StateChangeReason)
    if (Timeline != null) __obj.updateDynamic("Timeline")(Timeline)
    __obj.asInstanceOf[InstanceGroupStatus]
  }
}

