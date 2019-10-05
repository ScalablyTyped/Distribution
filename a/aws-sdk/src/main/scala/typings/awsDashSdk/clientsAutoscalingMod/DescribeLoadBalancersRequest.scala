package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLoadBalancersRequest extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * The maximum number of items to return with this call. The default value is 100 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.MaxRecords] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}

object DescribeLoadBalancersRequest {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, MaxRecords: Int | Double = null, NextToken: XmlString = null): DescribeLoadBalancersRequest = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName)
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeLoadBalancersRequest]
  }
}

