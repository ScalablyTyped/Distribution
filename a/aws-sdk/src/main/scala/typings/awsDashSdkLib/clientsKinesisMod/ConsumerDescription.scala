package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerDescription extends js.Object {
  /**
    * When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able to call SubscribeToShard. If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's because consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM policies that reference consumer ARNs.
    */
  var ConsumerARN: awsDashSdkLib.clientsKinesisMod.ConsumerARN
  /**
    * 
    */
  var ConsumerCreationTimestamp: Timestamp
  /**
    * The name of the consumer is something you choose when you register the consumer.
    */
  var ConsumerName: awsDashSdkLib.clientsKinesisMod.ConsumerName
  /**
    * A consumer can't read data while in the CREATING or DELETING states.
    */
  var ConsumerStatus: awsDashSdkLib.clientsKinesisMod.ConsumerStatus
  /**
    * The ARN of the stream with which you registered the consumer.
    */
  var StreamARN: awsDashSdkLib.clientsKinesisMod.StreamARN
}

object ConsumerDescription {
  @scala.inline
  def apply(
    ConsumerARN: ConsumerARN,
    ConsumerCreationTimestamp: Timestamp,
    ConsumerName: ConsumerName,
    ConsumerStatus: ConsumerStatus,
    StreamARN: StreamARN
  ): ConsumerDescription = {
    val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN, ConsumerCreationTimestamp = ConsumerCreationTimestamp, ConsumerName = ConsumerName, ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any], StreamARN = StreamARN)
  
    __obj.asInstanceOf[ConsumerDescription]
  }
}

