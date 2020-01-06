package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shard extends js.Object {
  /**
    * The shard ID of the shard adjacent to the shard's parent.
    */
  var AdjacentParentShardId: js.UndefOr[ShardId] = js.native
  /**
    * The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.
    */
  var HashKeyRange: typings.awsDashSdk.clientsKinesisMod.HashKeyRange = js.native
  /**
    * The shard ID of the shard's parent.
    */
  var ParentShardId: js.UndefOr[ShardId] = js.native
  /**
    * The range of possible sequence numbers for the shard.
    */
  var SequenceNumberRange: typings.awsDashSdk.clientsKinesisMod.SequenceNumberRange = js.native
  /**
    * The unique identifier of the shard within the stream.
    */
  var ShardId: typings.awsDashSdk.clientsKinesisMod.ShardId = js.native
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
    val __obj = js.Dynamic.literal(HashKeyRange = HashKeyRange.asInstanceOf[js.Any], SequenceNumberRange = SequenceNumberRange.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
    if (AdjacentParentShardId != null) __obj.updateDynamic("AdjacentParentShardId")(AdjacentParentShardId.asInstanceOf[js.Any])
    if (ParentShardId != null) __obj.updateDynamic("ParentShardId")(ParentShardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shard]
  }
}

