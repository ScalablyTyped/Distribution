package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTrafficMirrorTargetResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the Traffic Mirror target.
    */
  var TrafficMirrorTarget: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TrafficMirrorTarget] = js.undefined
}

object CreateTrafficMirrorTargetResult {
  @scala.inline
  def apply(ClientToken: String = null, TrafficMirrorTarget: TrafficMirrorTarget = null): CreateTrafficMirrorTargetResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (TrafficMirrorTarget != null) __obj.updateDynamic("TrafficMirrorTarget")(TrafficMirrorTarget)
    __obj.asInstanceOf[CreateTrafficMirrorTargetResult]
  }
}

