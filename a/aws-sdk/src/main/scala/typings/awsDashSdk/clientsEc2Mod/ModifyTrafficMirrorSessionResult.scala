package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTrafficMirrorSessionResult extends js.Object {
  /**
    * Information about the Traffic Mirror session.
    */
  var TrafficMirrorSession: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TrafficMirrorSession] = js.native
}

object ModifyTrafficMirrorSessionResult {
  @scala.inline
  def apply(TrafficMirrorSession: TrafficMirrorSession = null): ModifyTrafficMirrorSessionResult = {
    val __obj = js.Dynamic.literal()
    if (TrafficMirrorSession != null) __obj.updateDynamic("TrafficMirrorSession")(TrafficMirrorSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTrafficMirrorSessionResult]
  }
}

