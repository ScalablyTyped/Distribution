package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessesType extends js.Object {
  /**
    * The names of the process types.
    */
  var Processes: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.Processes] = js.undefined
}

object ProcessesType {
  @scala.inline
  def apply(Processes: Processes = null): ProcessesType = {
    val __obj = js.Dynamic.literal()
    if (Processes != null) __obj.updateDynamic("Processes")(Processes)
    __obj.asInstanceOf[ProcessesType]
  }
}

