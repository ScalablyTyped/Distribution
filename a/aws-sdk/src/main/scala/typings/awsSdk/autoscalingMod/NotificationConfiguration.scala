package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConfiguration extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.native
  /**
    * One of the following event notification types:    autoscaling:EC2_INSTANCE_LAUNCH     autoscaling:EC2_INSTANCE_LAUNCH_ERROR     autoscaling:EC2_INSTANCE_TERMINATE     autoscaling:EC2_INSTANCE_TERMINATE_ERROR     autoscaling:TEST_NOTIFICATION   
    */
  var NotificationType: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
    */
  var TopicARN: js.UndefOr[ResourceName] = js.native
}

object NotificationConfiguration {
  @scala.inline
  def apply(): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfiguration]
  }
  @scala.inline
  implicit class NotificationConfigurationOps[Self <: NotificationConfiguration] (val x: Self) extends AnyVal {
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
    def setAutoScalingGroupName(value: ResourceName): Self = this.set("AutoScalingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingGroupName: Self = this.set("AutoScalingGroupName", js.undefined)
    @scala.inline
    def setNotificationType(value: XmlStringMaxLen255): Self = this.set("NotificationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationType: Self = this.set("NotificationType", js.undefined)
    @scala.inline
    def setTopicARN(value: ResourceName): Self = this.set("TopicARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicARN: Self = this.set("TopicARN", js.undefined)
  }
  
}

