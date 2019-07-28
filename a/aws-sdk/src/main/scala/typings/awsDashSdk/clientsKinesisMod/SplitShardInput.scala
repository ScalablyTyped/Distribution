package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitShardInput extends js.Object {
  /**
    * A hash key value for the starting hash key of one of the child shards created by the split. The hash key range for a given shard constitutes a set of ordered contiguous positive integers. The value for NewStartingHashKey must be in the range of hash keys being mapped into the shard. The NewStartingHashKey hash key value and all higher hash key values in hash key range are distributed to one of the child shards. All the lower hash key values in the range are distributed to the other child shard.
    */
  var NewStartingHashKey: HashKey
  /**
    * The shard ID of the shard to split.
    */
  var ShardToSplit: ShardId
  /**
    * The name of the stream for the shard split.
    */
  var StreamName: typings.awsDashSdk.clientsKinesisMod.StreamName
}

object SplitShardInput {
  @scala.inline
  def apply(NewStartingHashKey: HashKey, ShardToSplit: ShardId, StreamName: StreamName): SplitShardInput = {
    val __obj = js.Dynamic.literal(NewStartingHashKey = NewStartingHashKey, ShardToSplit = ShardToSplit, StreamName = StreamName)
  
    __obj.asInstanceOf[SplitShardInput]
  }
}

