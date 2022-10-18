package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepublishAction extends StObject {
  
  /**
    * The Quality of Service (QoS) level to use when republishing messages. The default value is 0.
    */
  var qos: js.UndefOr[Qos] = js.undefined
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn
  
  /**
    * The name of the MQTT topic.
    */
  var topic: TopicPattern
}
object RepublishAction {
  
  inline def apply(roleArn: AwsArn, topic: TopicPattern): RepublishAction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepublishAction]
  }
  
  extension [Self <: RepublishAction](x: Self) {
    
    inline def setQos(value: Qos): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    inline def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: TopicPattern): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
