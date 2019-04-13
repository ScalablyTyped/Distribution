package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancersRequest extends js.Object {
  /**
    * A token used for paginating the results from your GetLoadBalancers request.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
}

object GetLoadBalancersRequest {
  @scala.inline
  def apply(pageToken: java.lang.String = null): GetLoadBalancersRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetLoadBalancersRequest]
  }
}

