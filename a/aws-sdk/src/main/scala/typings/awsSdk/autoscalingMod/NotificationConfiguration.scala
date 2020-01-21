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
  def apply(
    AutoScalingGroupName: ResourceName = null,
    NotificationType: XmlStringMaxLen255 = null,
    TopicARN: ResourceName = null
  ): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingGroupName != null) __obj.updateDynamic("AutoScalingGroupName")(AutoScalingGroupName.asInstanceOf[js.Any])
    if (NotificationType != null) __obj.updateDynamic("NotificationType")(NotificationType.asInstanceOf[js.Any])
    if (TopicARN != null) __obj.updateDynamic("TopicARN")(TopicARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConfiguration]
  }
}

