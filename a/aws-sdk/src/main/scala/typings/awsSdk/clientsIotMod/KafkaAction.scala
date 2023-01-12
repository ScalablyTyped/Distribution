package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaAction extends StObject {
  
  /**
    * Properties of the Apache Kafka producer client.
    */
  var clientProperties: ClientProperties
  
  /**
    * The ARN of Kafka action's VPC TopicRuleDestination.
    */
  var destinationArn: AwsArn
  
  /**
    * The Kafka message key.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The Kafka message partition.
    */
  var partition: js.UndefOr[String] = js.undefined
  
  /**
    * The Kafka topic for messages to be sent to the Kafka broker.
    */
  var topic: String
}
object KafkaAction {
  
  inline def apply(clientProperties: ClientProperties, destinationArn: AwsArn, topic: String): KafkaAction = {
    val __obj = js.Dynamic.literal(clientProperties = clientProperties.asInstanceOf[js.Any], destinationArn = destinationArn.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KafkaAction] (val x: Self) extends AnyVal {
    
    inline def setClientProperties(value: ClientProperties): Self = StObject.set(x, "clientProperties", value.asInstanceOf[js.Any])
    
    inline def setDestinationArn(value: AwsArn): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
