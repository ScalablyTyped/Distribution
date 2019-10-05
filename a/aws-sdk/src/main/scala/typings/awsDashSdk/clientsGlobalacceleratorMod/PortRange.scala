package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortRange extends js.Object {
  /**
    * The first port in the range of ports, inclusive.
    */
  var FromPort: js.UndefOr[PortNumber] = js.undefined
  /**
    * The last port in the range of ports, inclusive.
    */
  var ToPort: js.UndefOr[PortNumber] = js.undefined
}

object PortRange {
  @scala.inline
  def apply(FromPort: Int | Double = null, ToPort: Int | Double = null): PortRange = {
    val __obj = js.Dynamic.literal()
    if (FromPort != null) __obj.updateDynamic("FromPort")(FromPort.asInstanceOf[js.Any])
    if (ToPort != null) __obj.updateDynamic("ToPort")(ToPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortRange]
  }
}

