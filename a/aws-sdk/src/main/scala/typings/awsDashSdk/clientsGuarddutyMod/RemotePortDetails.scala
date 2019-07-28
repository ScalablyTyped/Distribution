package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemotePortDetails extends js.Object {
  /**
    * Port number of the remote connection.
    */
  var Port: js.UndefOr[Integer] = js.undefined
  /**
    * Port name of the remote connection.
    */
  var PortName: js.UndefOr[String] = js.undefined
}

object RemotePortDetails {
  @scala.inline
  def apply(Port: js.UndefOr[Integer] = js.undefined, PortName: String = null): RemotePortDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (PortName != null) __obj.updateDynamic("PortName")(PortName)
    __obj.asInstanceOf[RemotePortDetails]
  }
}

