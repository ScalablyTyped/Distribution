package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTimeBasedAutoScalingRequest extends js.Object {
  /**
    * An array of instance IDs.
    */
  var InstanceIds: Strings
}

object DescribeTimeBasedAutoScalingRequest {
  @scala.inline
  def apply(InstanceIds: Strings): DescribeTimeBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds)
  
    __obj.asInstanceOf[DescribeTimeBasedAutoScalingRequest]
  }
}

