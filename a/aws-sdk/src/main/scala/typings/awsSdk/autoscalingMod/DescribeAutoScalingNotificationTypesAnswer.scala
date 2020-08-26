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
  def apply(): DescribeAutoScalingNotificationTypesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAutoScalingNotificationTypesAnswer]
  }
  @scala.inline
  implicit class DescribeAutoScalingNotificationTypesAnswerOps[Self <: DescribeAutoScalingNotificationTypesAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoScalingNotificationTypesVarargs(value: XmlStringMaxLen255*): Self = this.set("AutoScalingNotificationTypes", js.Array(value :_*))
    @scala.inline
    def setAutoScalingNotificationTypes(value: AutoScalingNotificationTypes): Self = this.set("AutoScalingNotificationTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingNotificationTypes: Self = this.set("AutoScalingNotificationTypes", js.undefined)
  }
  
}

