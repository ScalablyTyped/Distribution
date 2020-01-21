package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExitStandbyAnswer extends js.Object {
  /**
    * The activities related to moving instances out of Standby mode.
    */
  var Activities: js.UndefOr[typings.awsSdk.autoscalingMod.Activities] = js.native
}

object ExitStandbyAnswer {
  @scala.inline
  def apply(Activities: Activities = null): ExitStandbyAnswer = {
    val __obj = js.Dynamic.literal()
    if (Activities != null) __obj.updateDynamic("Activities")(Activities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitStandbyAnswer]
  }
}

