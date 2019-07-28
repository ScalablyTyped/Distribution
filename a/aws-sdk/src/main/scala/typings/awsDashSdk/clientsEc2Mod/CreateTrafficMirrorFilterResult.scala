package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTrafficMirrorFilterResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the Traffic Mirror filter.
    */
  var TrafficMirrorFilter: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TrafficMirrorFilter] = js.undefined
}

object CreateTrafficMirrorFilterResult {
  @scala.inline
  def apply(ClientToken: String = null, TrafficMirrorFilter: TrafficMirrorFilter = null): CreateTrafficMirrorFilterResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (TrafficMirrorFilter != null) __obj.updateDynamic("TrafficMirrorFilter")(TrafficMirrorFilter)
    __obj.asInstanceOf[CreateTrafficMirrorFilterResult]
  }
}

