package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTrafficMirrorTargetResult extends js.Object {
  /**
    * The ID of the deleted Traffic Mirror target.
    */
  var TrafficMirrorTargetId: js.UndefOr[String] = js.undefined
}

object DeleteTrafficMirrorTargetResult {
  @scala.inline
  def apply(TrafficMirrorTargetId: String = null): DeleteTrafficMirrorTargetResult = {
    val __obj = js.Dynamic.literal()
    if (TrafficMirrorTargetId != null) __obj.updateDynamic("TrafficMirrorTargetId")(TrafficMirrorTargetId)
    __obj.asInstanceOf[DeleteTrafficMirrorTargetResult]
  }
}

