package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeListenersInput extends js.Object {
  /**
    * The Amazon Resource Names (ARN) of the listeners.
    */
  var ListenerArns: js.UndefOr[ListenerArns] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[Marker] = js.undefined
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[PageSize] = js.undefined
}

object DescribeListenersInput {
  @scala.inline
  def apply(
    ListenerArns: ListenerArns = null,
    LoadBalancerArn: LoadBalancerArn = null,
    Marker: Marker = null,
    PageSize: js.UndefOr[PageSize] = js.undefined
  ): DescribeListenersInput = {
    val __obj = js.Dynamic.literal()
    if (ListenerArns != null) __obj.updateDynamic("ListenerArns")(ListenerArns)
    if (LoadBalancerArn != null) __obj.updateDynamic("LoadBalancerArn")(LoadBalancerArn)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    __obj.asInstanceOf[DescribeListenersInput]
  }
}

