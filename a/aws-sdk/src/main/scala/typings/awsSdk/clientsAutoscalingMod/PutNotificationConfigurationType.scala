package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutNotificationConfigurationType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * The type of event that causes the notification to be sent. To query the notification types supported by Amazon EC2 Auto Scaling, call the DescribeAutoScalingNotificationTypes API.
    */
  var NotificationTypes: AutoScalingNotificationTypes
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic.
    */
  var TopicARN: XmlStringMaxLen255
}
object PutNotificationConfigurationType {
  
  inline def apply(
    AutoScalingGroupName: XmlStringMaxLen255,
    NotificationTypes: AutoScalingNotificationTypes,
    TopicARN: XmlStringMaxLen255
  ): PutNotificationConfigurationType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], NotificationTypes = NotificationTypes.asInstanceOf[js.Any], TopicARN = TopicARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutNotificationConfigurationType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutNotificationConfigurationType] (val x: Self) extends AnyVal {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setNotificationTypes(value: AutoScalingNotificationTypes): Self = StObject.set(x, "NotificationTypes", value.asInstanceOf[js.Any])
    
    inline def setNotificationTypesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "NotificationTypes", js.Array(value*))
    
    inline def setTopicARN(value: XmlStringMaxLen255): Self = StObject.set(x, "TopicARN", value.asInstanceOf[js.Any])
  }
}
