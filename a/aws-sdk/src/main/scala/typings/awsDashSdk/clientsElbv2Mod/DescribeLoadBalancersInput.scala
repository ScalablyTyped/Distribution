package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLoadBalancersInput extends js.Object {
  /**
    * The Amazon Resource Names (ARN) of the load balancers. You can specify up to 20 load balancers in a single call.
    */
  var LoadBalancerArns: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.LoadBalancerArns] = js.undefined
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Marker] = js.undefined
  /**
    * The names of the load balancers.
    */
  var Names: js.UndefOr[LoadBalancerNames] = js.undefined
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.PageSize] = js.undefined
}

object DescribeLoadBalancersInput {
  @scala.inline
  def apply(
    LoadBalancerArns: LoadBalancerArns = null,
    Marker: Marker = null,
    Names: LoadBalancerNames = null,
    PageSize: js.UndefOr[PageSize] = js.undefined
  ): DescribeLoadBalancersInput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerArns != null) __obj.updateDynamic("LoadBalancerArns")(LoadBalancerArns)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Names != null) __obj.updateDynamic("Names")(Names)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    __obj.asInstanceOf[DescribeLoadBalancersInput]
  }
}

