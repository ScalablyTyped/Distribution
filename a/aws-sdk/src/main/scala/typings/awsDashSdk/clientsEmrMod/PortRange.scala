package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortRange extends js.Object {
  /**
    * The smallest port number in a specified range of port numbers.
    */
  var MaxRange: js.UndefOr[Port] = js.undefined
  /**
    * The smallest port number in a specified range of port numbers.
    */
  var MinRange: Port
}

object PortRange {
  @scala.inline
  def apply(MinRange: Port, MaxRange: js.UndefOr[Port] = js.undefined): PortRange = {
    val __obj = js.Dynamic.literal(MinRange = MinRange)
    if (!js.isUndefined(MaxRange)) __obj.updateDynamic("MaxRange")(MaxRange)
    __obj.asInstanceOf[PortRange]
  }
}

