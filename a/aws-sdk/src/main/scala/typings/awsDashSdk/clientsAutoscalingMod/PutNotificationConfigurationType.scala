package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutNotificationConfigurationType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * The type of event that causes the notification to be sent. For more information about notification types supported by Amazon EC2 Auto Scaling, see DescribeAutoScalingNotificationTypes.
    */
  var NotificationTypes: AutoScalingNotificationTypes
  /**
    * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
    */
  var TopicARN: ResourceName
}

object PutNotificationConfigurationType {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    NotificationTypes: AutoScalingNotificationTypes,
    TopicARN: ResourceName
  ): PutNotificationConfigurationType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName, NotificationTypes = NotificationTypes, TopicARN = TopicARN)
  
    __obj.asInstanceOf[PutNotificationConfigurationType]
  }
}

