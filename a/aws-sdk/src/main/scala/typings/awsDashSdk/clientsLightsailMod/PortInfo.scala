package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortInfo extends js.Object {
  /**
    * The first port in the range.
    */
  var fromPort: js.UndefOr[Port] = js.undefined
  /**
    * The protocol. 
    */
  var protocol: js.UndefOr[NetworkProtocol] = js.undefined
  /**
    * The last port in the range.
    */
  var toPort: js.UndefOr[Port] = js.undefined
}

object PortInfo {
  @scala.inline
  def apply(fromPort: Int | Double = null, protocol: NetworkProtocol = null, toPort: Int | Double = null): PortInfo = {
    val __obj = js.Dynamic.literal()
    if (fromPort != null) __obj.updateDynamic("fromPort")(fromPort.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (toPort != null) __obj.updateDynamic("toPort")(toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortInfo]
  }
}

