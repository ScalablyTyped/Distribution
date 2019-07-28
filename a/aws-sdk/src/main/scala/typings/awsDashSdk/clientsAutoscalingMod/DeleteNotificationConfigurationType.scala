package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNotificationConfigurationType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
    */
  var TopicARN: ResourceName
}

object DeleteNotificationConfigurationType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, TopicARN: ResourceName): DeleteNotificationConfigurationType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName, TopicARN = TopicARN)
  
    __obj.asInstanceOf[DeleteNotificationConfigurationType]
  }
}

