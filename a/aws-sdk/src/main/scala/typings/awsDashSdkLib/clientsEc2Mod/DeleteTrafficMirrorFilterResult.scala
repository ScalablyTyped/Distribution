package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTrafficMirrorFilterResult extends js.Object {
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: js.UndefOr[String] = js.undefined
}

object DeleteTrafficMirrorFilterResult {
  @scala.inline
  def apply(TrafficMirrorFilterId: String = null): DeleteTrafficMirrorFilterResult = {
    val __obj = js.Dynamic.literal()
    if (TrafficMirrorFilterId != null) __obj.updateDynamic("TrafficMirrorFilterId")(TrafficMirrorFilterId)
    __obj.asInstanceOf[DeleteTrafficMirrorFilterResult]
  }
}

