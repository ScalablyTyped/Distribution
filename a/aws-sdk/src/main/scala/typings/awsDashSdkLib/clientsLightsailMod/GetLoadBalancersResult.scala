package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancersResult extends js.Object {
  /**
    * An array of LoadBalancer objects describing your load balancers.
    */
  var loadBalancers: js.UndefOr[LoadBalancerList] = js.undefined
  /**
    * A token used for advancing to the next page of results from your GetLoadBalancers request.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object GetLoadBalancersResult {
  @scala.inline
  def apply(loadBalancers: LoadBalancerList = null, nextPageToken: java.lang.String = null): GetLoadBalancersResult = {
    val __obj = js.Dynamic.literal()
    if (loadBalancers != null) __obj.updateDynamic("loadBalancers")(loadBalancers)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[GetLoadBalancersResult]
  }
}

