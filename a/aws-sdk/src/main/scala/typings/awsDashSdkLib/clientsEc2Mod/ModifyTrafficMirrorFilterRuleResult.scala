package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyTrafficMirrorFilterRuleResult extends js.Object {
  /**
    * Modifies a Traffic Mirror rule.
    */
  var TrafficMirrorFilterRule: js.UndefOr[TrafficMirrorFilterRule] = js.undefined
}

object ModifyTrafficMirrorFilterRuleResult {
  @scala.inline
  def apply(TrafficMirrorFilterRule: TrafficMirrorFilterRule = null): ModifyTrafficMirrorFilterRuleResult = {
    val __obj = js.Dynamic.literal()
    if (TrafficMirrorFilterRule != null) __obj.updateDynamic("TrafficMirrorFilterRule")(TrafficMirrorFilterRule)
    __obj.asInstanceOf[ModifyTrafficMirrorFilterRuleResult]
  }
}

