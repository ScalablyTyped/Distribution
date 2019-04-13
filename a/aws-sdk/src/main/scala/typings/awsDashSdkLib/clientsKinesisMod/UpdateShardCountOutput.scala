package typings
package awsDashSdkLib.clientsKinesisMod

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
  var StreamName: js.UndefOr[StreamName] = js.undefined
  /**
    * The updated number of shards.
    */
  var TargetShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined
}

object UpdateShardCountOutput {
  @scala.inline
  def apply(
    CurrentShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined,
    StreamName: StreamName = null,
    TargetShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined
  ): UpdateShardCountOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CurrentShardCount)) __obj.updateDynamic("CurrentShardCount")(CurrentShardCount)
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName)
    if (!js.isUndefined(TargetShardCount)) __obj.updateDynamic("TargetShardCount")(TargetShardCount)
    __obj.asInstanceOf[UpdateShardCountOutput]
  }
}

