package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTrafficMirrorSessionResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the Traffic Mirror session.
    */
  var TrafficMirrorSession: js.UndefOr[TrafficMirrorSession] = js.undefined
}

object CreateTrafficMirrorSessionResult {
  @scala.inline
  def apply(ClientToken: String = null, TrafficMirrorSession: TrafficMirrorSession = null): CreateTrafficMirrorSessionResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (TrafficMirrorSession != null) __obj.updateDynamic("TrafficMirrorSession")(TrafficMirrorSession)
    __obj.asInstanceOf[CreateTrafficMirrorSessionResult]
  }
}

