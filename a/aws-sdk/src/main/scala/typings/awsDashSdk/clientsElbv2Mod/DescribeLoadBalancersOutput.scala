package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLoadBalancersOutput extends js.Object {
  /**
    * Information about the load balancers.
    */
  var LoadBalancers: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.LoadBalancers] = js.undefined
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}

object DescribeLoadBalancersOutput {
  @scala.inline
  def apply(LoadBalancers: LoadBalancers = null, NextMarker: Marker = null): DescribeLoadBalancersOutput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancers != null) __obj.updateDynamic("LoadBalancers")(LoadBalancers)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[DescribeLoadBalancersOutput]
  }
}

