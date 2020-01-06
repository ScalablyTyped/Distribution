package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceCount extends js.Object {
  /**
    * The number of listed Reserved Instances in the state specified by the state.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The states of the listed Reserved Instances.
    */
  var State: js.UndefOr[ListingState] = js.native
}

object InstanceCount {
  @scala.inline
  def apply(InstanceCount: Int | scala.Double = null, State: ListingState = null): InstanceCount = {
    val __obj = js.Dynamic.literal()
    if (InstanceCount != null) __obj.updateDynamic("InstanceCount")(InstanceCount.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceCount]
  }
}

