package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTrafficMirrorSessionResult extends js.Object {
  /**
    * The ID of the deleted Traffic Mirror session.
    */
  var TrafficMirrorSessionId: js.UndefOr[String] = js.undefined
}

object DeleteTrafficMirrorSessionResult {
  @scala.inline
  def apply(TrafficMirrorSessionId: String = null): DeleteTrafficMirrorSessionResult = {
    val __obj = js.Dynamic.literal()
    if (TrafficMirrorSessionId != null) __obj.updateDynamic("TrafficMirrorSessionId")(TrafficMirrorSessionId)
    __obj.asInstanceOf[DeleteTrafficMirrorSessionResult]
  }
}

