package typings.awsSdk.autoscalingMod

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
  def apply(): DescribeLoadBalancersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancersResponse]
  }
  @scala.inline
  implicit class DescribeLoadBalancersResponseOps[Self <: DescribeLoadBalancersResponse] (val x: Self) extends AnyVal {
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
    def setLoadBalancersVarargs(value: LoadBalancerState*): Self = this.set("LoadBalancers", js.Array(value :_*))
    @scala.inline
    def setLoadBalancers(value: LoadBalancerStates): Self = this.set("LoadBalancers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancers: Self = this.set("LoadBalancers", js.undefined)
    @scala.inline
    def setNextToken(value: XmlString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

