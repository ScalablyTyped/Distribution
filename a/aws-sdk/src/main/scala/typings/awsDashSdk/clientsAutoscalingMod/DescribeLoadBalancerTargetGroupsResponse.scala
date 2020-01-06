package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancerTargetGroupsResponse extends js.Object {
  /**
    * Information about the target groups.
    */
  var LoadBalancerTargetGroups: js.UndefOr[LoadBalancerTargetGroupStates] = js.native
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
}

object DescribeLoadBalancerTargetGroupsResponse {
  @scala.inline
  def apply(LoadBalancerTargetGroups: LoadBalancerTargetGroupStates = null, NextToken: XmlString = null): DescribeLoadBalancerTargetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerTargetGroups != null) __obj.updateDynamic("LoadBalancerTargetGroups")(LoadBalancerTargetGroups.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoadBalancerTargetGroupsResponse]
  }
}

