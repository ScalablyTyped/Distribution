package typings
package awsDashSdkLib.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamInput extends js.Object {
  /**
    * The shard ID of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedShardId in the previous operation. 
    */
  var ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined
  /**
    * The maximum number of shard objects to return. The upper limit is 100.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var StreamArn: awsDashSdkLib.clientsDynamodbstreamsMod.StreamArn
}

object DescribeStreamInput {
  @scala.inline
  def apply(
    StreamArn: StreamArn,
    ExclusiveStartShardId: ShardId = null,
    Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
  ): DescribeStreamInput = {
    val __obj = js.Dynamic.literal(StreamArn = StreamArn)
    if (ExclusiveStartShardId != null) __obj.updateDynamic("ExclusiveStartShardId")(ExclusiveStartShardId)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    __obj.asInstanceOf[DescribeStreamInput]
  }
}

