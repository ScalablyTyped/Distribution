package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassicLoadBalancer extends js.Object {
  /**
    * The name of the load balancer.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object ClassicLoadBalancer {
  @scala.inline
  def apply(Name: String = null): ClassicLoadBalancer = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[ClassicLoadBalancer]
  }
}

