package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNotificationConfigurationType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic.
    */
  var TopicARN: XmlStringMaxLen255
}
object DeleteNotificationConfigurationType {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255, TopicARN: XmlStringMaxLen255): DeleteNotificationConfigurationType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], TopicARN = TopicARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNotificationConfigurationType]
  }
  
  extension [Self <: DeleteNotificationConfigurationType](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setTopicARN(value: XmlStringMaxLen255): Self = StObject.set(x, "TopicARN", value.asInstanceOf[js.Any])
  }
}
