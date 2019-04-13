package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceNetworking extends js.Object {
  /**
    * The amount of data in GB allocated for monthly data transfers.
    */
  var monthlyTransfer: js.UndefOr[MonthlyTransfer] = js.undefined
  /**
    * An array of key-value pairs containing information about the ports on the instance.
    */
  var ports: js.UndefOr[InstancePortInfoList] = js.undefined
}

object InstanceNetworking {
  @scala.inline
  def apply(monthlyTransfer: MonthlyTransfer = null, ports: InstancePortInfoList = null): InstanceNetworking = {
    val __obj = js.Dynamic.literal()
    if (monthlyTransfer != null) __obj.updateDynamic("monthlyTransfer")(monthlyTransfer)
    if (ports != null) __obj.updateDynamic("ports")(ports)
    __obj.asInstanceOf[InstanceNetworking]
  }
}

