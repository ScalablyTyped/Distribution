package typings
package awsDashSdkLib.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamOutput extends js.Object {
  /**
    * A complete description of the stream, including its creation date and time, the DynamoDB table associated with the stream, the shard IDs within the stream, and the beginning and ending sequence numbers of stream records within the shards.
    */
  var StreamDescription: js.UndefOr[StreamDescription] = js.undefined
}

object DescribeStreamOutput {
  @scala.inline
  def apply(StreamDescription: StreamDescription = null): DescribeStreamOutput = {
    val __obj = js.Dynamic.literal()
    if (StreamDescription != null) __obj.updateDynamic("StreamDescription")(StreamDescription)
    __obj.asInstanceOf[DescribeStreamOutput]
  }
}

