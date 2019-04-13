package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyInstanceEventStartTimeResult extends js.Object {
  var Event: js.UndefOr[InstanceStatusEvent] = js.undefined
}

object ModifyInstanceEventStartTimeResult {
  @scala.inline
  def apply(Event: InstanceStatusEvent = null): ModifyInstanceEventStartTimeResult = {
    val __obj = js.Dynamic.literal()
    if (Event != null) __obj.updateDynamic("Event")(Event)
    __obj.asInstanceOf[ModifyInstanceEventStartTimeResult]
  }
}

