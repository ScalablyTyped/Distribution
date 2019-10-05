package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeListenersInput extends js.Object {
  /**
    * The Amazon Resource Names (ARN) of the listeners.
    */
  var ListenerArns: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.ListenerArns] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.LoadBalancerArn] = js.undefined
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Marker] = js.undefined
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.PageSize] = js.undefined
}

object DescribeListenersInput {
  @scala.inline
  def apply(
    ListenerArns: ListenerArns = null,
    LoadBalancerArn: LoadBalancerArn = null,
    Marker: Marker = null,
    PageSize: Int | Double = null
  ): DescribeListenersInput = {
    val __obj = js.Dynamic.literal()
    if (ListenerArns != null) __obj.updateDynamic("ListenerArns")(ListenerArns)
    if (LoadBalancerArn != null) __obj.updateDynamic("LoadBalancerArn")(LoadBalancerArn)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeListenersInput]
  }
}

