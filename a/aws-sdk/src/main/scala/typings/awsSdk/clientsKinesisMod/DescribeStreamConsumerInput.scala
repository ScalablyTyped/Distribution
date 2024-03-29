package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamConsumerInput extends StObject {
  
  /**
    * The ARN returned by Kinesis Data Streams when you registered the consumer.
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
object DescribeStreamConsumerInput {
  
  inline def apply(): DescribeStreamConsumerInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamConsumerInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStreamConsumerInput] (val x: Self) extends AnyVal {
    
    inline def setConsumerARN(value: ConsumerARN): Self = StObject.set(x, "ConsumerARN", value.asInstanceOf[js.Any])
    
    inline def setConsumerARNUndefined: Self = StObject.set(x, "ConsumerARN", js.undefined)
    
    inline def setConsumerName(value: ConsumerName): Self = StObject.set(x, "ConsumerName", value.asInstanceOf[js.Any])
    
    inline def setConsumerNameUndefined: Self = StObject.set(x, "ConsumerName", js.undefined)
    
    inline def setStreamARN(value: StreamARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
  }
}
