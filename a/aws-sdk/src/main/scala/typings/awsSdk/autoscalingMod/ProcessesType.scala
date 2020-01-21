package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessesType extends js.Object {
  /**
    * The names of the process types.
    */
  var Processes: js.UndefOr[typings.awsSdk.autoscalingMod.Processes] = js.native
}

object ProcessesType {
  @scala.inline
  def apply(Processes: Processes = null): ProcessesType = {
    val __obj = js.Dynamic.literal()
    if (Processes != null) __obj.updateDynamic("Processes")(Processes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessesType]
  }
}

