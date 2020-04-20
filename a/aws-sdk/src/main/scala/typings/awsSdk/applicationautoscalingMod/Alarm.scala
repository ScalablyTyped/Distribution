package typings.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alarm extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmARN: ResourceId = js.native
  /**
    * The name of the alarm.
    */
  var AlarmName: ResourceId = js.native
}

object Alarm {
  @scala.inline
  def apply(AlarmARN: ResourceId, AlarmName: ResourceId): Alarm = {
    val __obj = js.Dynamic.literal(AlarmARN = AlarmARN.asInstanceOf[js.Any], AlarmName = AlarmName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alarm]
  }
}

