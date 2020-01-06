package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrafficMirrorFilterRuleResult extends js.Object {
  /**
    * The ID of the deleted Traffic Mirror rule.
    */
  var TrafficMirrorFilterRuleId: js.UndefOr[String] = js.native
}

object DeleteTrafficMirrorFilterRuleResult {
  @scala.inline
  def apply(TrafficMirrorFilterRuleId: String = null): DeleteTrafficMirrorFilterRuleResult = {
    val __obj = js.Dynamic.literal()
    if (TrafficMirrorFilterRuleId != null) __obj.updateDynamic("TrafficMirrorFilterRuleId")(TrafficMirrorFilterRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficMirrorFilterRuleResult]
  }
}

