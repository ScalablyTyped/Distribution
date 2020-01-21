package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterStandbyAnswer extends js.Object {
  /**
    * The activities related to moving instances into Standby mode.
    */
  var Activities: js.UndefOr[typings.awsSdk.autoscalingMod.Activities] = js.native
}

object EnterStandbyAnswer {
  @scala.inline
  def apply(Activities: Activities = null): EnterStandbyAnswer = {
    val __obj = js.Dynamic.literal()
    if (Activities != null) __obj.updateDynamic("Activities")(Activities.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterStandbyAnswer]
  }
}

