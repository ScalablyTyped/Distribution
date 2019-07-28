package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceStatus extends js.Object {
  /**
    * The current state of the instance.
    */
  var State: js.UndefOr[InstanceState] = js.undefined
  /**
    * The details of the status change reason for the instance.
    */
  var StateChangeReason: js.UndefOr[InstanceStateChangeReason] = js.undefined
  /**
    * The timeline of the instance status over time.
    */
  var Timeline: js.UndefOr[InstanceTimeline] = js.undefined
}

object InstanceStatus {
  @scala.inline
  def apply(
    State: InstanceState = null,
    StateChangeReason: InstanceStateChangeReason = null,
    Timeline: InstanceTimeline = null
  ): InstanceStatus = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateChangeReason != null) __obj.updateDynamic("StateChangeReason")(StateChangeReason)
    if (Timeline != null) __obj.updateDynamic("Timeline")(Timeline)
    __obj.asInstanceOf[InstanceStatus]
  }
}

