package typings.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalableTargetAction extends js.Object {
  /**
    * The maximum capacity.
    */
  var MaxCapacity: js.UndefOr[ResourceCapacity] = js.native
  /**
    * The minimum capacity. For Lambda provisioned concurrency, the minimum value allowed is 0. For all other resources, the minimum value allowed is 1.
    */
  var MinCapacity: js.UndefOr[ResourceCapacity] = js.native
}

object ScalableTargetAction {
  @scala.inline
  def apply(
    MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined,
    MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined
  ): ScalableTargetAction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxCapacity)) __obj.updateDynamic("MaxCapacity")(MaxCapacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinCapacity)) __obj.updateDynamic("MinCapacity")(MinCapacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalableTargetAction]
  }
}

