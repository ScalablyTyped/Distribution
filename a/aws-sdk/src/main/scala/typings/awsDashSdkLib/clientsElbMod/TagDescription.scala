package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagDescription extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object TagDescription {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName = null, Tags: TagList = null): TagDescription = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerName != null) __obj.updateDynamic("LoadBalancerName")(LoadBalancerName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[TagDescription]
  }
}

