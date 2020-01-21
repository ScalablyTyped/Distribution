package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNotificationConfigurationType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
    */
  var TopicARN: ResourceName = js.native
}

object DeleteNotificationConfigurationType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, TopicARN: ResourceName): DeleteNotificationConfigurationType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], TopicARN = TopicARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteNotificationConfigurationType]
  }
}

