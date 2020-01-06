package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alarm extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmARN: js.UndefOr[ResourceName] = js.native
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[XmlStringMaxLen255] = js.native
}

object Alarm {
  @scala.inline
  def apply(AlarmARN: ResourceName = null, AlarmName: XmlStringMaxLen255 = null): Alarm = {
    val __obj = js.Dynamic.literal()
    if (AlarmARN != null) __obj.updateDynamic("AlarmARN")(AlarmARN.asInstanceOf[js.Any])
    if (AlarmName != null) __obj.updateDynamic("AlarmName")(AlarmName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alarm]
  }
}

