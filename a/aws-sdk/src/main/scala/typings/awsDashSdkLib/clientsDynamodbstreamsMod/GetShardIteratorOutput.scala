package typings
package awsDashSdkLib.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetShardIteratorOutput extends js.Object {
  /**
    * The position in the shard from which to start reading stream records sequentially. A shard iterator specifies this position using the sequence number of a stream record in a shard.
    */
  var ShardIterator: js.UndefOr[ShardIterator] = js.undefined
}

object GetShardIteratorOutput {
  @scala.inline
  def apply(ShardIterator: ShardIterator = null): GetShardIteratorOutput = {
    val __obj = js.Dynamic.literal()
    if (ShardIterator != null) __obj.updateDynamic("ShardIterator")(ShardIterator)
    __obj.asInstanceOf[GetShardIteratorOutput]
  }
}

