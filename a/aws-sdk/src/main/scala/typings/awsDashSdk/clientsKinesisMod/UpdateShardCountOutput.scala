package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateShardCountOutput extends js.Object {
  /**
    * The current number of shards.
    */
  var CurrentShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined
  /**
    * The name of the stream.
    */
  var StreamName: js.UndefOr[typings.awsDashSdk.clientsKinesisMod.StreamName] = js.undefined
  /**
    * The updated number of shards.
    */
  var TargetShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined
}

object UpdateShardCountOutput {
  @scala.inline
  def apply(
    CurrentShardCount: Int | Double = null,
    StreamName: StreamName = null,
    TargetShardCount: Int | Double = null
  ): UpdateShardCountOutput = {
    val __obj = js.Dynamic.literal()
    if (CurrentShardCount != null) __obj.updateDynamic("CurrentShardCount")(CurrentShardCount.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName)
    if (TargetShardCount != null) __obj.updateDynamic("TargetShardCount")(TargetShardCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateShardCountOutput]
  }
}

