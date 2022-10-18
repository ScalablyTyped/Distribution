package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaEventSource extends StObject {
  
  /**
    * The topic to which to subscribe to receive event messages.
    */
  var topic: TopicString
  
  /**
    * The type of event source. Choose from the following options:    PUB_SUB – Subscribe to local publish/subscribe messages. This event source type doesn't support MQTT wildcards (+ and #) in the event source topic.    IOT_CORE – Subscribe to Amazon Web Services IoT Core MQTT messages. This event source type supports MQTT wildcards (+ and #) in the event source topic.  
    */
  var `type`: LambdaEventSourceType
}
object LambdaEventSource {
  
  inline def apply(topic: TopicString, `type`: LambdaEventSourceType): LambdaEventSource = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaEventSource]
  }
  
  extension [Self <: LambdaEventSource](x: Self) {
    
    inline def setTopic(value: TopicString): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setType(value: LambdaEventSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
