package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateShardCountInput extends js.Object {
  /**
    * The scaling type. Uniform scaling creates shards of equal size.
    */
  var ScalingType: typings.awsDashSdk.clientsKinesisMod.ScalingType = js.native
  /**
    * The name of the stream.
    */
  var StreamName: typings.awsDashSdk.clientsKinesisMod.StreamName = js.native
  /**
    * The new number of shards.
    */
  var TargetShardCount: PositiveIntegerObject = js.native
}

object UpdateShardCountInput {
  @scala.inline
  def apply(ScalingType: ScalingType, StreamName: StreamName, TargetShardCount: PositiveIntegerObject): UpdateShardCountInput = {
    val __obj = js.Dynamic.literal(ScalingType = ScalingType.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], TargetShardCount = TargetShardCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateShardCountInput]
  }
}

