package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterStandbyAnswer extends js.Object {
  /**
    * The activities related to moving instances into Standby mode.
    */
  var Activities: js.UndefOr[Activities] = js.undefined
}

object EnterStandbyAnswer {
  @scala.inline
  def apply(Activities: Activities = null): EnterStandbyAnswer = {
    val __obj = js.Dynamic.literal()
    if (Activities != null) __obj.updateDynamic("Activities")(Activities)
    __obj.asInstanceOf[EnterStandbyAnswer]
  }
}

