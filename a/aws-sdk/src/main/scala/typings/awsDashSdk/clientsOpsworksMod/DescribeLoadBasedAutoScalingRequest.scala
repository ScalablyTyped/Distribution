package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLoadBasedAutoScalingRequest extends js.Object {
  /**
    * An array of layer IDs.
    */
  var LayerIds: Strings
}

object DescribeLoadBasedAutoScalingRequest {
  @scala.inline
  def apply(LayerIds: Strings): DescribeLoadBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(LayerIds = LayerIds)
  
    __obj.asInstanceOf[DescribeLoadBasedAutoScalingRequest]
  }
}

