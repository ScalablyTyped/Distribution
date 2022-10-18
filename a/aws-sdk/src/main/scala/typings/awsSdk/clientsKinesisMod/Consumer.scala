package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Consumer extends StObject {
  
  /**
    * When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able to call SubscribeToShard. If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's because consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM policies that reference consumer ARNs.
    */
  var ConsumerARN: typings.awsSdk.clientsKinesisMod.ConsumerARN
  
  /**
    * 
    */
  var ConsumerCreationTimestamp: js.Date
  
  /**
    * The name of the consumer is something you choose when you register the consumer.
    */
  var ConsumerName: typings.awsSdk.clientsKinesisMod.ConsumerName
  
  /**
    * A consumer can't read data while in the CREATING or DELETING states.
    */
  var ConsumerStatus: typings.awsSdk.clientsKinesisMod.ConsumerStatus
}
object Consumer {
  
  inline def apply(
    ConsumerARN: ConsumerARN,
    ConsumerCreationTimestamp: js.Date,
    ConsumerName: ConsumerName,
    ConsumerStatus: ConsumerStatus
  ): Consumer = {
    val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN.asInstanceOf[js.Any], ConsumerCreationTimestamp = ConsumerCreationTimestamp.asInstanceOf[js.Any], ConsumerName = ConsumerName.asInstanceOf[js.Any], ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consumer]
  }
  
  extension [Self <: Consumer](x: Self) {
    
    inline def setConsumerARN(value: ConsumerARN): Self = StObject.set(x, "ConsumerARN", value.asInstanceOf[js.Any])
    
    inline def setConsumerCreationTimestamp(value: js.Date): Self = StObject.set(x, "ConsumerCreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setConsumerName(value: ConsumerName): Self = StObject.set(x, "ConsumerName", value.asInstanceOf[js.Any])
    
    inline def setConsumerStatus(value: ConsumerStatus): Self = StObject.set(x, "ConsumerStatus", value.asInstanceOf[js.Any])
  }
}
