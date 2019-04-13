package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalPortDetails extends js.Object {
  /**
    * Port number of the local connection.
    */
  var Port: js.UndefOr[__integer] = js.undefined
  /**
    * Port name of the local connection.
    */
  var PortName: js.UndefOr[__string] = js.undefined
}

object LocalPortDetails {
  @scala.inline
  def apply(Port: js.UndefOr[__integer] = js.undefined, PortName: __string = null): LocalPortDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (PortName != null) __obj.updateDynamic("PortName")(PortName)
    __obj.asInstanceOf[LocalPortDetails]
  }
}

