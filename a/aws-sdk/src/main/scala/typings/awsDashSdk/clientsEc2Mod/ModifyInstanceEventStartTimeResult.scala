package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceEventStartTimeResult extends js.Object {
  var Event: js.UndefOr[InstanceStatusEvent] = js.native
}

object ModifyInstanceEventStartTimeResult {
  @scala.inline
  def apply(Event: InstanceStatusEvent = null): ModifyInstanceEventStartTimeResult = {
    val __obj = js.Dynamic.literal()
    if (Event != null) __obj.updateDynamic("Event")(Event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceEventStartTimeResult]
  }
}

