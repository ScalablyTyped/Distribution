package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExitStandbyAnswer extends js.Object {
  /**
    * The activities related to moving instances out of Standby mode.
    */
  var Activities: js.UndefOr[Activities] = js.undefined
}

object ExitStandbyAnswer {
  @scala.inline
  def apply(Activities: Activities = null): ExitStandbyAnswer = {
    val __obj = js.Dynamic.literal()
    if (Activities != null) __obj.updateDynamic("Activities")(Activities)
    __obj.asInstanceOf[ExitStandbyAnswer]
  }
}

