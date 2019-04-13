package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAutoScalingNotificationTypesAnswer extends js.Object {
  /**
    * The notification types.
    */
  var AutoScalingNotificationTypes: js.UndefOr[AutoScalingNotificationTypes] = js.undefined
}

object DescribeAutoScalingNotificationTypesAnswer {
  @scala.inline
  def apply(AutoScalingNotificationTypes: AutoScalingNotificationTypes = null): DescribeAutoScalingNotificationTypesAnswer = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingNotificationTypes != null) __obj.updateDynamic("AutoScalingNotificationTypes")(AutoScalingNotificationTypes)
    __obj.asInstanceOf[DescribeAutoScalingNotificationTypesAnswer]
  }
}

