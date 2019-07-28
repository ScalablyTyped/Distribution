package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalPortDetails extends js.Object {
  /**
    * Port number of the local connection.
    */
  var Port: js.UndefOr[Integer] = js.undefined
  /**
    * Port name of the local connection.
    */
  var PortName: js.UndefOr[String] = js.undefined
}

object LocalPortDetails {
  @scala.inline
  def apply(Port: js.UndefOr[Integer] = js.undefined, PortName: String = null): LocalPortDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (PortName != null) __obj.updateDynamic("PortName")(PortName)
    __obj.asInstanceOf[LocalPortDetails]
  }
}

