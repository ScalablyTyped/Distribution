package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeCapacityStatus extends js.Object {
  /**
    * The number of currently available instances that can be used to stream sessions.
    */
  var Available: js.UndefOr[Integer] = js.native
  /**
    * The desired number of streaming instances.
    */
  var Desired: Integer = js.native
  /**
    * The number of instances in use for streaming.
    */
  var InUse: js.UndefOr[Integer] = js.native
  /**
    * The total number of simultaneous streaming instances that are running.
    */
  var Running: js.UndefOr[Integer] = js.native
}

object ComputeCapacityStatus {
  @scala.inline
  def apply(
    Desired: Integer,
    Available: Int | Double = null,
    InUse: Int | Double = null,
    Running: Int | Double = null
  ): ComputeCapacityStatus = {
    val __obj = js.Dynamic.literal(Desired = Desired.asInstanceOf[js.Any])
    if (Available != null) __obj.updateDynamic("Available")(Available.asInstanceOf[js.Any])
    if (InUse != null) __obj.updateDynamic("InUse")(InUse.asInstanceOf[js.Any])
    if (Running != null) __obj.updateDynamic("Running")(Running.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeCapacityStatus]
  }
}

