package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTrafficMirrorFilterRuleResult extends js.Object {
  /**
    * Modifies a Traffic Mirror rule.
    */
  var TrafficMirrorFilterRule: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TrafficMirrorFilterRule] = js.native
}

object ModifyTrafficMirrorFilterRuleResult {
  @scala.inline
  def apply(TrafficMirrorFilterRule: TrafficMirrorFilterRule = null): ModifyTrafficMirrorFilterRuleResult = {
    val __obj = js.Dynamic.literal()
    if (TrafficMirrorFilterRule != null) __obj.updateDynamic("TrafficMirrorFilterRule")(TrafficMirrorFilterRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTrafficMirrorFilterRuleResult]
  }
}

