package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputeCapacityStatus extends js.Object {
  /**
    * The number of currently available instances that can be used to stream sessions.
    */
  var Available: js.UndefOr[Integer] = js.undefined
  /**
    * The desired number of streaming instances.
    */
  var Desired: Integer
  /**
    * The number of instances in use for streaming.
    */
  var InUse: js.UndefOr[Integer] = js.undefined
  /**
    * The total number of simultaneous streaming instances that are running.
    */
  var Running: js.UndefOr[Integer] = js.undefined
}

object ComputeCapacityStatus {
  @scala.inline
  def apply(
    Desired: Integer,
    Available: js.UndefOr[Integer] = js.undefined,
    InUse: js.UndefOr[Integer] = js.undefined,
    Running: js.UndefOr[Integer] = js.undefined
  ): ComputeCapacityStatus = {
    val __obj = js.Dynamic.literal(Desired = Desired)
    if (!js.isUndefined(Available)) __obj.updateDynamic("Available")(Available)
    if (!js.isUndefined(InUse)) __obj.updateDynamic("InUse")(InUse)
    if (!js.isUndefined(Running)) __obj.updateDynamic("Running")(Running)
    __obj.asInstanceOf[ComputeCapacityStatus]
  }
}

