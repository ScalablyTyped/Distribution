package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassicLoadBalancersConfig extends js.Object {
  /**
    * One or more Classic Load Balancers.
    */
  var ClassicLoadBalancers: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ClassicLoadBalancers] = js.native
}

object ClassicLoadBalancersConfig {
  @scala.inline
  def apply(ClassicLoadBalancers: ClassicLoadBalancers = null): ClassicLoadBalancersConfig = {
    val __obj = js.Dynamic.literal()
    if (ClassicLoadBalancers != null) __obj.updateDynamic("ClassicLoadBalancers")(ClassicLoadBalancers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassicLoadBalancersConfig]
  }
}

