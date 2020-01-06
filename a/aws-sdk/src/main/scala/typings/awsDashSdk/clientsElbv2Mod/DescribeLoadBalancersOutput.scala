package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancersOutput extends js.Object {
  /**
    * Information about the load balancers.
    */
  var LoadBalancers: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.LoadBalancers] = js.native
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}

object DescribeLoadBalancersOutput {
  @scala.inline
  def apply(LoadBalancers: LoadBalancers = null, NextMarker: Marker = null): DescribeLoadBalancersOutput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancers != null) __obj.updateDynamic("LoadBalancers")(LoadBalancers.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoadBalancersOutput]
  }
}

