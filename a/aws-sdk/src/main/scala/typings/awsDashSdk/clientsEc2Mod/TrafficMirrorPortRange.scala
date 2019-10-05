package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficMirrorPortRange extends js.Object {
  /**
    * The start of the Traffic Mirror port range. This applies to the TCP and UDP protocols.
    */
  var FromPort: js.UndefOr[Integer] = js.undefined
  /**
    * The end of the Traffic Mirror port range. This applies to the TCP and UDP protocols.
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
}

object TrafficMirrorPortRange {
  @scala.inline
  def apply(FromPort: Int | scala.Double = null, ToPort: Int | scala.Double = null): TrafficMirrorPortRange = {
    val __obj = js.Dynamic.literal()
    if (FromPort != null) __obj.updateDynamic("FromPort")(FromPort.asInstanceOf[js.Any])
    if (ToPort != null) __obj.updateDynamic("ToPort")(ToPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorPortRange]
  }
}

