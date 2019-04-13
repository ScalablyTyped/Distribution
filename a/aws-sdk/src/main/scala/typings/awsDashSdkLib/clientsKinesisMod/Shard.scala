package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shard extends js.Object {
  /**
    * The shard ID of the shard adjacent to the shard's parent.
    */
  var AdjacentParentShardId: js.UndefOr[ShardId] = js.undefined
  /**
    * The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.
    */
  var HashKeyRange: awsDashSdkLib.clientsKinesisMod.HashKeyRange
  /**
    * The shard ID of the shard's parent.
    */
  var ParentShardId: js.UndefOr[ShardId] = js.undefined
  /**
    * The range of possible sequence numbers for the shard.
    */
  var SequenceNumberRange: awsDashSdkLib.clientsKinesisMod.SequenceNumberRange
  /**
    * The unique identifier of the shard within the stream.
    */
  var ShardId: awsDashSdkLib.clientsKinesisMod.ShardId
}

object Shard {
  @scala.inline
  def apply(
    HashKeyRange: HashKeyRange,
    SequenceNumberRange: SequenceNumberRange,
    ShardId: ShardId,
    AdjacentParentShardId: ShardId = null,
    ParentShardId: ShardId = null
  ): Shard = {
    val __obj = js.Dynamic.literal(HashKeyRange = HashKeyRange, SequenceNumberRange = SequenceNumberRange, ShardId = ShardId)
    if (AdjacentParentShardId != null) __obj.updateDynamic("AdjacentParentShardId")(AdjacentParentShardId)
    if (ParentShardId != null) __obj.updateDynamic("ParentShardId")(ParentShardId)
    __obj.asInstanceOf[Shard]
  }
}

