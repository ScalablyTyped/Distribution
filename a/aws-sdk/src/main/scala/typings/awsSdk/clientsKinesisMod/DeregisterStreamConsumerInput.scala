package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterStreamConsumerInput extends StObject {
  
  /**
    * The ARN returned by Kinesis Data Streams when you registered the consumer. If you don't know the ARN of the consumer that you want to deregister, you can use the ListStreamConsumers operation to get a list of the descriptions of all the consumers that are currently registered with a given data stream. The description of a consumer contains its ARN.
    */
  var ConsumerARN: js.UndefOr[typings.awsSdk.clientsKinesisMod.ConsumerARN] = js.undefined
  
  /**
    * The name that you gave to the consumer.
    */
  var ConsumerName: js.UndefOr[typings.awsSdk.clientsKinesisMod.ConsumerName] = js.undefined
  
  /**
    * The ARN of the Kinesis data stream that the consumer is registered with. For more information, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces.
    */
  var StreamARN: js.UndefOr[typings.awsSdk.clientsKinesisMod.StreamARN] = js.undefined
}
object DeregisterStreamConsumerInput {
  
  inline def apply(): DeregisterStreamConsumerInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterStreamConsumerInput]
  }
  
  extension [Self <: DeregisterStreamConsumerInput](x: Self) {
    
    inline def setConsumerARN(value: ConsumerARN): Self = StObject.set(x, "ConsumerARN", value.asInstanceOf[js.Any])
    
    inline def setConsumerARNUndefined: Self = StObject.set(x, "ConsumerARN", js.undefined)
    
    inline def setConsumerName(value: ConsumerName): Self = StObject.set(x, "ConsumerName", value.asInstanceOf[js.Any])
    
    inline def setConsumerNameUndefined: Self = StObject.set(x, "ConsumerName", js.undefined)
    
    inline def setStreamARN(value: StreamARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
  }
}
