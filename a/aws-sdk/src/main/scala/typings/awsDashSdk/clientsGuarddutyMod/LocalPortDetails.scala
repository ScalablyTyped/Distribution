package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalPortDetails extends js.Object {
  /**
    * Port number of the local connection.
    */
  var Port: js.UndefOr[Integer] = js.native
  /**
    * Port name of the local connection.
    */
  var PortName: js.UndefOr[String] = js.native
}

object LocalPortDetails {
  @scala.inline
  def apply(Port: Int | scala.Double = null, PortName: String = null): LocalPortDetails = {
    val __obj = js.Dynamic.literal()
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (PortName != null) __obj.updateDynamic("PortName")(PortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalPortDetails]
  }
}

