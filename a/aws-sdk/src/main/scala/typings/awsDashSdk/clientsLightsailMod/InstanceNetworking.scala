package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceNetworking extends js.Object {
  /**
    * The amount of data in GB allocated for monthly data transfers.
    */
  var monthlyTransfer: js.UndefOr[MonthlyTransfer] = js.native
  /**
    * An array of key-value pairs containing information about the ports on the instance.
    */
  var ports: js.UndefOr[InstancePortInfoList] = js.native
}

object InstanceNetworking {
  @scala.inline
  def apply(monthlyTransfer: MonthlyTransfer = null, ports: InstancePortInfoList = null): InstanceNetworking = {
    val __obj = js.Dynamic.literal()
    if (monthlyTransfer != null) __obj.updateDynamic("monthlyTransfer")(monthlyTransfer.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceNetworking]
  }
}

