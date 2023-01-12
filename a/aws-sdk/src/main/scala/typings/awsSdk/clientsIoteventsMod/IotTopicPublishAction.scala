package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IotTopicPublishAction extends StObject {
  
  /**
    * The MQTT topic of the message. You can use a string expression that includes variables ($variable.&lt;variable-name&gt;) and input values ($input.&lt;input-name&gt;.&lt;path-to-datum&gt;) as the topic string.
    */
  var mqttTopic: MQTTTopic
  
  /**
    * You can configure the action payload when you publish a message to an AWS IoT Core topic.
    */
  var payload: js.UndefOr[Payload] = js.undefined
}
object IotTopicPublishAction {
  
  inline def apply(mqttTopic: MQTTTopic): IotTopicPublishAction = {
    val __obj = js.Dynamic.literal(mqttTopic = mqttTopic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotTopicPublishAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IotTopicPublishAction] (val x: Self) extends AnyVal {
    
    inline def setMqttTopic(value: MQTTTopic): Self = StObject.set(x, "mqttTopic", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
