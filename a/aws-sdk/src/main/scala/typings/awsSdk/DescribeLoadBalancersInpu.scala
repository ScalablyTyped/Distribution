package typings.awsSdk

import typings.awsSdk.elbv2Mod.LoadBalancerArns
import typings.awsSdk.elbv2Mod.LoadBalancerNames
import typings.awsSdk.elbv2Mod.Marker
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/elbv2.DescribeLoadBalancersInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeLoadBalancersInpu extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The Amazon Resource Names (ARN) of the load balancers. You can specify up to 20 load balancers in a single call.
    */
  var LoadBalancerArns: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancerArns] = js.native
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsSdk.elbv2Mod.Marker] = js.native
  /**
    * The names of the load balancers.
    */
  var Names: js.UndefOr[LoadBalancerNames] = js.native
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.elbv2Mod.PageSize] = js.native
}

object DescribeLoadBalancersInpu {
  @scala.inline
  def apply(
    $waiter: WaiterConfiguration = null,
    LoadBalancerArns: LoadBalancerArns = null,
    Marker: Marker = null,
    Names: LoadBalancerNames = null,
    PageSize: Int | Double = null
  ): DescribeLoadBalancersInpu = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (LoadBalancerArns != null) __obj.updateDynamic("LoadBalancerArns")(LoadBalancerArns.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoadBalancersInpu]
  }
}

