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
  def apply(
    fromPort: js.UndefOr[Port] = js.undefined,
    protocol: NetworkProtocol = null,
    toPort: js.UndefOr[Port] = js.undefined
  ): PortInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fromPort)) __obj.updateDynamic("fromPort")(fromPort)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(toPort)) __obj.updateDynamic("toPort")(toPort)
    __obj.asInstanceOf[PortInfo]
  }
}

