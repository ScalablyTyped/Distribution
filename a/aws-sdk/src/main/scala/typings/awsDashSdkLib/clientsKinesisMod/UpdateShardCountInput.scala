package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateShardCountInput extends js.Object {
  /**
    * The scaling type. Uniform scaling creates shards of equal size.
    */
  var ScalingType: awsDashSdkLib.clientsKinesisMod.ScalingType
  /**
    * The name of the stream.
    */
  var StreamName: awsDashSdkLib.clientsKinesisMod.StreamName
  /**
    * The new number of shards.
    */
  var TargetShardCount: PositiveIntegerObject
}

object UpdateShardCountInput {
  @scala.inline
  def apply(ScalingType: ScalingType, StreamName: StreamName, TargetShardCount: PositiveIntegerObject): UpdateShardCountInput = {
    val __obj = js.Dynamic.literal(ScalingType = ScalingType.asInstanceOf[js.Any], StreamName = StreamName, TargetShardCount = TargetShardCount)
  
    __obj.asInstanceOf[UpdateShardCountInput]
  }
}

