package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterStreamConsumerInput extends js.Object {
  /**
    * For a given Kinesis data stream, each consumer must have a unique name. However, consumer names don't have to be unique across data streams.
    */
  var ConsumerName: typings.awsDashSdk.clientsKinesisMod.ConsumerName
  /**
    * The ARN of the Kinesis data stream that you want to register the consumer with. For more info, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var StreamARN: typings.awsDashSdk.clientsKinesisMod.StreamARN
}

object RegisterStreamConsumerInput {
  @scala.inline
  def apply(ConsumerName: ConsumerName, StreamARN: StreamARN): RegisterStreamConsumerInput = {
    val __obj = js.Dynamic.literal(ConsumerName = ConsumerName, StreamARN = StreamARN)
  
    __obj.asInstanceOf[RegisterStreamConsumerInput]
  }
}

