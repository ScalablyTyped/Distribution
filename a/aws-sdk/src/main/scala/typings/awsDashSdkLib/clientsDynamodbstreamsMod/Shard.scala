package typings
package awsDashSdkLib.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shard extends js.Object {
  /**
    * The shard ID of the current shard's parent.
    */
  var ParentShardId: js.UndefOr[ShardId] = js.undefined
  /**
    * The range of possible sequence numbers for the shard.
    */
  var SequenceNumberRange: js.UndefOr[SequenceNumberRange] = js.undefined
  /**
    * The system-generated identifier for this shard.
    */
  var ShardId: js.UndefOr[ShardId] = js.undefined
}

object Shard {
  @scala.inline
  def apply(
    ParentShardId: ShardId = null,
    SequenceNumberRange: SequenceNumberRange = null,
    ShardId: ShardId = null
  ): Shard = {
    val __obj = js.Dynamic.literal()
    if (ParentShardId != null) __obj.updateDynamic("ParentShardId")(ParentShardId)
    if (SequenceNumberRange != null) __obj.updateDynamic("SequenceNumberRange")(SequenceNumberRange)
    if (ShardId != null) __obj.updateDynamic("ShardId")(ShardId)
    __obj.asInstanceOf[Shard]
  }
}

