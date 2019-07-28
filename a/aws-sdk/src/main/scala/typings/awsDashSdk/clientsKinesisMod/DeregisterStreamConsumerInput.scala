package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterStreamConsumerInput extends js.Object {
  /**
    * The ARN returned by Kinesis Data Streams when you registered the consumer. If you don't know the ARN of the consumer that you want to deregister, you can use the ListStreamConsumers operation to get a list of the descriptions of all the consumers that are currently registered with a given data stream. The description of a consumer contains its ARN.
    */
  var ConsumerARN: js.UndefOr[typings.awsDashSdk.clientsKinesisMod.ConsumerARN] = js.undefined
  /**
    * The name that you gave to the consumer.
    */
  var ConsumerName: js.UndefOr[typings.awsDashSdk.clientsKinesisMod.ConsumerName] = js.undefined
  /**
    * The ARN of the Kinesis data stream that the consumer is registered with. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var StreamARN: js.UndefOr[typings.awsDashSdk.clientsKinesisMod.StreamARN] = js.undefined
}

object DeregisterStreamConsumerInput {
  @scala.inline
  def apply(ConsumerARN: ConsumerARN = null, ConsumerName: ConsumerName = null, StreamARN: StreamARN = null): DeregisterStreamConsumerInput = {
    val __obj = js.Dynamic.literal()
    if (ConsumerARN != null) __obj.updateDynamic("ConsumerARN")(ConsumerARN)
    if (ConsumerName != null) __obj.updateDynamic("ConsumerName")(ConsumerName)
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN)
    __obj.asInstanceOf[DeregisterStreamConsumerInput]
  }
}

