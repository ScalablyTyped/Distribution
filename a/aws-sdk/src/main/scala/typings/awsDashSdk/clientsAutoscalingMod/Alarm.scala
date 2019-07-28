package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alarm extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmARN: js.UndefOr[ResourceName] = js.undefined
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[XmlStringMaxLen255] = js.undefined
}

object Alarm {
  @scala.inline
  def apply(AlarmARN: ResourceName = null, AlarmName: XmlStringMaxLen255 = null): Alarm = {
    val __obj = js.Dynamic.literal()
    if (AlarmARN != null) __obj.updateDynamic("AlarmARN")(AlarmARN)
    if (AlarmName != null) __obj.updateDynamic("AlarmName")(AlarmName)
    __obj.asInstanceOf[Alarm]
  }
}

