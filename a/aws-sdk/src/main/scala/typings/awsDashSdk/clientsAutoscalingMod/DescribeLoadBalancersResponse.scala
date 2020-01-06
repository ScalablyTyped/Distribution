package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancersResponse extends js.Object {
  /**
    * The load balancers.
    */
  var LoadBalancers: js.UndefOr[LoadBalancerStates] = js.native
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
}

object DescribeLoadBalancersResponse {
  @scala.inline
  def apply(LoadBalancers: LoadBalancerStates = null, NextToken: XmlString = null): DescribeLoadBalancersResponse = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancers != null) __obj.updateDynamic("LoadBalancers")(LoadBalancers.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoadBalancersResponse]
  }
}

