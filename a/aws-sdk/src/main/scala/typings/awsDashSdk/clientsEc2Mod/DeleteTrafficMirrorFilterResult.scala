package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrafficMirrorFilterResult extends js.Object {
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: js.UndefOr[String] = js.native
}

object DeleteTrafficMirrorFilterResult {
  @scala.inline
  def apply(TrafficMirrorFilterId: String = null): DeleteTrafficMirrorFilterResult = {
    val __obj = js.Dynamic.literal()
    if (TrafficMirrorFilterId != null) __obj.updateDynamic("TrafficMirrorFilterId")(TrafficMirrorFilterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficMirrorFilterResult]
  }
}

