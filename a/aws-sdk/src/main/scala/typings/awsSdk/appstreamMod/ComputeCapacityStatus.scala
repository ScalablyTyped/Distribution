package typings.awsSdk.appstreamMod

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
    Available: js.UndefOr[Integer] = js.undefined,
    InUse: js.UndefOr[Integer] = js.undefined,
    Running: js.UndefOr[Integer] = js.undefined
  ): ComputeCapacityStatus = {
    val __obj = js.Dynamic.literal(Desired = Desired.asInstanceOf[js.Any])
    if (!js.isUndefined(Available)) __obj.updateDynamic("Available")(Available.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InUse)) __obj.updateDynamic("InUse")(InUse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Running)) __obj.updateDynamic("Running")(Running.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeCapacityStatus]
  }
}

