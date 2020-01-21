package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAutoScalingNotificationTypesAnswer extends js.Object {
  /**
    * The notification types.
    */
  var AutoScalingNotificationTypes: js.UndefOr[typings.awsSdk.autoscalingMod.AutoScalingNotificationTypes] = js.native
}

object DescribeAutoScalingNotificationTypesAnswer {
  @scala.inline
  def apply(AutoScalingNotificationTypes: AutoScalingNotificationTypes = null): DescribeAutoScalingNotificationTypesAnswer = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingNotificationTypes != null) __obj.updateDynamic("AutoScalingNotificationTypes")(AutoScalingNotificationTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutoScalingNotificationTypesAnswer]
  }
}

