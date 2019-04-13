package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccessPointsOutput extends js.Object {
  /**
    * Information about the load balancers.
    */
  var LoadBalancerDescriptions: js.UndefOr[LoadBalancerDescriptions] = js.undefined
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}

object DescribeAccessPointsOutput {
  @scala.inline
  def apply(LoadBalancerDescriptions: LoadBalancerDescriptions = null, NextMarker: Marker = null): DescribeAccessPointsOutput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerDescriptions != null) __obj.updateDynamic("LoadBalancerDescriptions")(LoadBalancerDescriptions)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[DescribeAccessPointsOutput]
  }
}

