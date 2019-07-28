package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancersConfig extends js.Object {
  /**
    * The Classic Load Balancers.
    */
  var ClassicLoadBalancersConfig: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ClassicLoadBalancersConfig] = js.undefined
  /**
    * The target groups.
    */
  var TargetGroupsConfig: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TargetGroupsConfig] = js.undefined
}

object LoadBalancersConfig {
  @scala.inline
  def apply(
    ClassicLoadBalancersConfig: ClassicLoadBalancersConfig = null,
    TargetGroupsConfig: TargetGroupsConfig = null
  ): LoadBalancersConfig = {
    val __obj = js.Dynamic.literal()
    if (ClassicLoadBalancersConfig != null) __obj.updateDynamic("ClassicLoadBalancersConfig")(ClassicLoadBalancersConfig)
    if (TargetGroupsConfig != null) __obj.updateDynamic("TargetGroupsConfig")(TargetGroupsConfig)
    __obj.asInstanceOf[LoadBalancersConfig]
  }
}

