package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetLoadBasedAutoScalingRequest extends js.Object {
  /**
    * An AutoScalingThresholds object with the downscaling threshold configuration. If the load falls below these thresholds for a specified amount of time, AWS OpsWorks Stacks stops a specified number of instances.
    */
  var DownScaling: js.UndefOr[AutoScalingThresholds] = js.undefined
  /**
    * Enables load-based auto scaling for the layer.
    */
  var Enable: js.UndefOr[Boolean] = js.undefined
  /**
    * The layer ID.
    */
  var LayerId: String
  /**
    * An AutoScalingThresholds object with the upscaling threshold configuration. If the load exceeds these thresholds for a specified amount of time, AWS OpsWorks Stacks starts a specified number of instances.
    */
  var UpScaling: js.UndefOr[AutoScalingThresholds] = js.undefined
}

object SetLoadBasedAutoScalingRequest {
  @scala.inline
  def apply(
    LayerId: String,
    DownScaling: AutoScalingThresholds = null,
    Enable: js.UndefOr[scala.Boolean] = js.undefined,
    UpScaling: AutoScalingThresholds = null
  ): SetLoadBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(LayerId = LayerId)
    if (DownScaling != null) __obj.updateDynamic("DownScaling")(DownScaling)
    if (!js.isUndefined(Enable)) __obj.updateDynamic("Enable")(Enable)
    if (UpScaling != null) __obj.updateDynamic("UpScaling")(UpScaling)
    __obj.asInstanceOf[SetLoadBasedAutoScalingRequest]
  }
}

