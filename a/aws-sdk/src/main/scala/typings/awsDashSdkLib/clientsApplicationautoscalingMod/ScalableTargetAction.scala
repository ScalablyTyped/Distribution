package typings
package awsDashSdkLib.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalableTargetAction extends js.Object {
  /**
    * The maximum capacity.
    */
  var MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined
  /**
    * The minimum capacity.
    */
  var MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined
}

object ScalableTargetAction {
  @scala.inline
  def apply(
    MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined,
    MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined
  ): ScalableTargetAction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxCapacity)) __obj.updateDynamic("MaxCapacity")(MaxCapacity)
    if (!js.isUndefined(MinCapacity)) __obj.updateDynamic("MinCapacity")(MinCapacity)
    __obj.asInstanceOf[ScalableTargetAction]
  }
}

