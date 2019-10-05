package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTargetGroupsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.LoadBalancerArn] = js.undefined
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Marker] = js.undefined
  /**
    * The names of the target groups.
    */
  var Names: js.UndefOr[TargetGroupNames] = js.undefined
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.PageSize] = js.undefined
  /**
    * The Amazon Resource Names (ARN) of the target groups.
    */
  var TargetGroupArns: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.TargetGroupArns] = js.undefined
}

object DescribeTargetGroupsInput {
  @scala.inline
  def apply(
    LoadBalancerArn: LoadBalancerArn = null,
    Marker: Marker = null,
    Names: TargetGroupNames = null,
    PageSize: Int | Double = null,
    TargetGroupArns: TargetGroupArns = null
  ): DescribeTargetGroupsInput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerArn != null) __obj.updateDynamic("LoadBalancerArn")(LoadBalancerArn)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Names != null) __obj.updateDynamic("Names")(Names)
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (TargetGroupArns != null) __obj.updateDynamic("TargetGroupArns")(TargetGroupArns)
    __obj.asInstanceOf[DescribeTargetGroupsInput]
  }
}

