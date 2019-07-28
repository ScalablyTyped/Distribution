package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficMirrorPortRangeRequest extends js.Object {
  /**
    * The first port in the Traffic Mirror port range. This applies to the TCP and UDP protocols.
    */
  var FromPort: js.UndefOr[Integer] = js.undefined
  /**
    * The last port in the Traffic Mirror port range. This applies to the TCP and UDP protocols.
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
}

object TrafficMirrorPortRangeRequest {
  @scala.inline
  def apply(FromPort: js.UndefOr[Integer] = js.undefined, ToPort: js.UndefOr[Integer] = js.undefined): TrafficMirrorPortRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FromPort)) __obj.updateDynamic("FromPort")(FromPort)
    if (!js.isUndefined(ToPort)) __obj.updateDynamic("ToPort")(ToPort)
    __obj.asInstanceOf[TrafficMirrorPortRangeRequest]
  }
}

