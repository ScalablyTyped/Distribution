package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeShardsInput extends js.Object {
  /**
    * The shard ID of the adjacent shard for the merge.
    */
  var AdjacentShardToMerge: ShardId
  /**
    * The shard ID of the shard to combine with the adjacent shard for the merge.
    */
  var ShardToMerge: ShardId
  /**
    * The name of the stream for the merge.
    */
  var StreamName: typings.awsDashSdk.clientsKinesisMod.StreamName
}

object MergeShardsInput {
  @scala.inline
  def apply(AdjacentShardToMerge: ShardId, ShardToMerge: ShardId, StreamName: StreamName): MergeShardsInput = {
    val __obj = js.Dynamic.literal(AdjacentShardToMerge = AdjacentShardToMerge, ShardToMerge = ShardToMerge, StreamName = StreamName)
  
    __obj.asInstanceOf[MergeShardsInput]
  }
}

