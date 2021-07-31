package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNotificationConfigurationType extends StObject {
  
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
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], TopicARN = TopicARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNotificationConfigurationType]
  }
  
  @scala.inline
  implicit class DeleteNotificationConfigurationTypeMutableBuilder[Self <: DeleteNotificationConfigurationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicARN(value: ResourceName): Self = StObject.set(x, "TopicARN", value.asInstanceOf[js.Any])
  }
}
