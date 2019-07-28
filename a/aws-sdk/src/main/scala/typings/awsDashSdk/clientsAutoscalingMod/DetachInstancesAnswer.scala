package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachInstancesAnswer extends js.Object {
  /**
    * The activities related to detaching the instances from the Auto Scaling group.
    */
  var Activities: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.Activities] = js.undefined
}

object DetachInstancesAnswer {
  @scala.inline
  def apply(Activities: Activities = null): DetachInstancesAnswer = {
    val __obj = js.Dynamic.literal()
    if (Activities != null) __obj.updateDynamic("Activities")(Activities)
    __obj.asInstanceOf[DetachInstancesAnswer]
  }
}

