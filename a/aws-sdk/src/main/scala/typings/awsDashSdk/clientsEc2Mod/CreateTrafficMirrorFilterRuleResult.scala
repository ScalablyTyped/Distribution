package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTrafficMirrorFilterRuleResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The Traffic Mirror rule.
    */
  var TrafficMirrorFilterRule: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TrafficMirrorFilterRule] = js.undefined
}

object CreateTrafficMirrorFilterRuleResult {
  @scala.inline
  def apply(ClientToken: String = null, TrafficMirrorFilterRule: TrafficMirrorFilterRule = null): CreateTrafficMirrorFilterRuleResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (TrafficMirrorFilterRule != null) __obj.updateDynamic("TrafficMirrorFilterRule")(TrafficMirrorFilterRule)
    __obj.asInstanceOf[CreateTrafficMirrorFilterRuleResult]
  }
}

