package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VmServerAddress extends js.Object {
  /**
    * The identifier of the VM.
    */
  var vmId: js.UndefOr[VmId] = js.native
  /**
    * The identifier of the VM manager.
    */
  var vmManagerId: js.UndefOr[VmManagerId] = js.native
}

object VmServerAddress {
  @scala.inline
  def apply(vmId: VmId = null, vmManagerId: VmManagerId = null): VmServerAddress = {
    val __obj = js.Dynamic.literal()
    if (vmId != null) __obj.updateDynamic("vmId")(vmId.asInstanceOf[js.Any])
    if (vmManagerId != null) __obj.updateDynamic("vmManagerId")(vmManagerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VmServerAddress]
  }
}

