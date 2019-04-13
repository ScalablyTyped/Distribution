package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficRoute extends js.Object {
  /**
    *  The ARN of one listener. The listener identifies the route between a target group and a load balancer. This is an array of strings with a maximum size of one. 
    */
  var listenerArns: js.UndefOr[ListenerArnList] = js.undefined
}

object TrafficRoute {
  @scala.inline
  def apply(listenerArns: ListenerArnList = null): TrafficRoute = {
    val __obj = js.Dynamic.literal()
    if (listenerArns != null) __obj.updateDynamic("listenerArns")(listenerArns)
    __obj.asInstanceOf[TrafficRoute]
  }
}

