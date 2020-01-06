package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetLoadBasedAutoScalingRequest extends js.Object {
  /**
    * An AutoScalingThresholds object with the downscaling threshold configuration. If the load falls below these thresholds for a specified amount of time, AWS OpsWorks Stacks stops a specified number of instances.
    */
  var DownScaling: js.UndefOr[AutoScalingThresholds] = js.native
  /**
    * Enables load-based auto scaling for the layer.
    */
  var Enable: js.UndefOr[Boolean] = js.native
  /**
    * The layer ID.
    */
  var LayerId: String = js.native
  /**
    * An AutoScalingThresholds object with the upscaling threshold configuration. If the load exceeds these thresholds for a specified amount of time, AWS OpsWorks Stacks starts a specified number of instances.
    */
  var UpScaling: js.UndefOr[AutoScalingThresholds] = js.native
}

object SetLoadBasedAutoScalingRequest {
  @scala.inline
  def apply(
    LayerId: String,
    DownScaling: AutoScalingThresholds = null,
    Enable: js.UndefOr[scala.Boolean] = js.undefined,
    UpScaling: AutoScalingThresholds = null
  ): SetLoadBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(LayerId = LayerId.asInstanceOf[js.Any])
    if (DownScaling != null) __obj.updateDynamic("DownScaling")(DownScaling.asInstanceOf[js.Any])
    if (!js.isUndefined(Enable)) __obj.updateDynamic("Enable")(Enable.asInstanceOf[js.Any])
    if (UpScaling != null) __obj.updateDynamic("UpScaling")(UpScaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLoadBasedAutoScalingRequest]
  }
}

