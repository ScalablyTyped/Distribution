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
    * The minimum capacity.
    */
  var MinCapacity: js.UndefOr[ResourceCapacity] = js.native
}

object ScalableTargetAction {
  @scala.inline
  def apply(MaxCapacity: Int | Double = null, MinCapacity: Int | Double = null): ScalableTargetAction = {
    val __obj = js.Dynamic.literal()
    if (MaxCapacity != null) __obj.updateDynamic("MaxCapacity")(MaxCapacity.asInstanceOf[js.Any])
    if (MinCapacity != null) __obj.updateDynamic("MinCapacity")(MinCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalableTargetAction]
  }
}

