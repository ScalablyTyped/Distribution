package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceStateChange extends js.Object {
  /**
    * The current state of the instance.
    */
  var CurrentState: js.UndefOr[InstanceState] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The previous state of the instance.
    */
  var PreviousState: js.UndefOr[InstanceState] = js.native
}

object InstanceStateChange {
  @scala.inline
  def apply(CurrentState: InstanceState = null, InstanceId: String = null, PreviousState: InstanceState = null): InstanceStateChange = {
    val __obj = js.Dynamic.literal()
    if (CurrentState != null) __obj.updateDynamic("CurrentState")(CurrentState.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (PreviousState != null) __obj.updateDynamic("PreviousState")(PreviousState.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceStateChange]
  }
}

