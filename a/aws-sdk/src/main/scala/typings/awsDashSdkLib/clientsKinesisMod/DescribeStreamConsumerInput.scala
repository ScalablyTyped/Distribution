package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamConsumerInput extends js.Object {
  /**
    * The ARN returned by Kinesis Data Streams when you registered the consumer.
    */
  var ConsumerARN: js.UndefOr[ConsumerARN] = js.undefined
  /**
    * The name that you gave to the consumer.
    */
  var ConsumerName: js.UndefOr[ConsumerName] = js.undefined
  /**
    * The ARN of the Kinesis data stream that the consumer is registered with. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var StreamARN: js.UndefOr[StreamARN] = js.undefined
}

object DescribeStreamConsumerInput {
  @scala.inline
  def apply(ConsumerARN: ConsumerARN = null, ConsumerName: ConsumerName = null, StreamARN: StreamARN = null): DescribeStreamConsumerInput = {
    val __obj = js.Dynamic.literal()
    if (ConsumerARN != null) __obj.updateDynamic("ConsumerARN")(ConsumerARN)
    if (ConsumerName != null) __obj.updateDynamic("ConsumerName")(ConsumerName)
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN)
    __obj.asInstanceOf[DescribeStreamConsumerInput]
  }
}

