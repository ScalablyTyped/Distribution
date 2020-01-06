package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficMirrorFilterRuleResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The Traffic Mirror rule.
    */
  var TrafficMirrorFilterRule: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TrafficMirrorFilterRule] = js.native
}

object CreateTrafficMirrorFilterRuleResult {
  @scala.inline
  def apply(ClientToken: String = null, TrafficMirrorFilterRule: TrafficMirrorFilterRule = null): CreateTrafficMirrorFilterRuleResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (TrafficMirrorFilterRule != null) __obj.updateDynamic("TrafficMirrorFilterRule")(TrafficMirrorFilterRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficMirrorFilterRuleResult]
  }
}

