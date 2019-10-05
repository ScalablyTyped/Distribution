package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccessPointsInput extends js.Object {
  /**
    * The names of the load balancers.
    */
  var LoadBalancerNames: js.UndefOr[typings.awsDashSdk.clientsElbMod.LoadBalancerNames] = js.undefined
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsElbMod.Marker] = js.undefined
  /**
    * The maximum number of results to return with this call (a number from 1 to 400). The default is 400.
    */
  var PageSize: js.UndefOr[typings.awsDashSdk.clientsElbMod.PageSize] = js.undefined
}

object DescribeAccessPointsInput {
  @scala.inline
  def apply(LoadBalancerNames: LoadBalancerNames = null, Marker: Marker = null, PageSize: Int | Double = null): DescribeAccessPointsInput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerNames != null) __obj.updateDynamic("LoadBalancerNames")(LoadBalancerNames)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccessPointsInput]
  }
}

