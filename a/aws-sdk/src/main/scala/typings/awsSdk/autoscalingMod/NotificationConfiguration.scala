package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationConfiguration extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * One of the following event notification types:    autoscaling:EC2_INSTANCE_LAUNCH     autoscaling:EC2_INSTANCE_LAUNCH_ERROR     autoscaling:EC2_INSTANCE_TERMINATE     autoscaling:EC2_INSTANCE_TERMINATE_ERROR     autoscaling:TEST_NOTIFICATION   
    */
  var NotificationType: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
    */
  var TopicARN: js.UndefOr[ResourceName] = js.undefined
}
object NotificationConfiguration {
  
  @scala.inline
  def apply(): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfiguration]
  }
  
  @scala.inline
  implicit class NotificationConfigurationMutableBuilder[Self <: NotificationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "AutoScalingGroupName", js.undefined)
    
    @scala.inline
    def setNotificationType(value: XmlStringMaxLen255): Self = StObject.set(x, "NotificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTypeUndefined: Self = StObject.set(x, "NotificationType", js.undefined)
    
    @scala.inline
    def setTopicARN(value: ResourceName): Self = StObject.set(x, "TopicARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicARNUndefined: Self = StObject.set(x, "TopicARN", js.undefined)
  }
}
