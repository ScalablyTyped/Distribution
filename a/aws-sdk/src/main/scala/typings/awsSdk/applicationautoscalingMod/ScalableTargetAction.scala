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
  def apply(): ScalableTargetAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalableTargetAction]
  }
  @scala.inline
  implicit class ScalableTargetActionOps[Self <: ScalableTargetAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxCapacity(value: ResourceCapacity): Self = this.set("MaxCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCapacity: Self = this.set("MaxCapacity", js.undefined)
    @scala.inline
    def setMinCapacity(value: ResourceCapacity): Self = this.set("MinCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinCapacity: Self = this.set("MinCapacity", js.undefined)
  }
  
}

