package typings.awsSdk.autoscalingMod

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
  def apply(): DescribeLoadBalancerTargetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerTargetGroupsResponse]
  }
  @scala.inline
  implicit class DescribeLoadBalancerTargetGroupsResponseOps[Self <: DescribeLoadBalancerTargetGroupsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoadBalancerTargetGroupsVarargs(value: LoadBalancerTargetGroupState*): Self = this.set("LoadBalancerTargetGroups", js.Array(value :_*))
    @scala.inline
    def setLoadBalancerTargetGroups(value: LoadBalancerTargetGroupStates): Self = this.set("LoadBalancerTargetGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancerTargetGroups: Self = this.set("LoadBalancerTargetGroups", js.undefined)
    @scala.inline
    def setNextToken(value: XmlString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

