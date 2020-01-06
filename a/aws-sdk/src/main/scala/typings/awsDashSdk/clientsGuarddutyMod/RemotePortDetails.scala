package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemotePortDetails extends js.Object {
  /**
    * Port number of the remote connection.
    */
  var Port: js.UndefOr[Integer] = js.native
  /**
    * Port name of the remote connection.
    */
  var PortName: js.UndefOr[String] = js.native
}

object RemotePortDetails {
  @scala.inline
  def apply(Port: Int | scala.Double = null, PortName: String = null): RemotePortDetails = {
    val __obj = js.Dynamic.literal()
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (PortName != null) __obj.updateDynamic("PortName")(PortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemotePortDetails]
  }
}

