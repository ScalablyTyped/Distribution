package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrafficMirrorSessionResult extends js.Object {
  /**
    * The ID of the deleted Traffic Mirror session.
    */
  var TrafficMirrorSessionId: js.UndefOr[String] = js.native
}

object DeleteTrafficMirrorSessionResult {
  @scala.inline
  def apply(TrafficMirrorSessionId: String = null): DeleteTrafficMirrorSessionResult = {
    val __obj = js.Dynamic.literal()
    if (TrafficMirrorSessionId != null) __obj.updateDynamic("TrafficMirrorSessionId")(TrafficMirrorSessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficMirrorSessionResult]
  }
}

