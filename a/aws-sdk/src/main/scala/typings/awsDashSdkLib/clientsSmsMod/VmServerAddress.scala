package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VmServerAddress extends js.Object {
  /**
    * The identifier of the VM.
    */
  var vmId: js.UndefOr[VmId] = js.undefined
  /**
    * The identifier of the VM manager.
    */
  var vmManagerId: js.UndefOr[VmManagerId] = js.undefined
}

object VmServerAddress {
  @scala.inline
  def apply(vmId: VmId = null, vmManagerId: VmManagerId = null): VmServerAddress = {
    val __obj = js.Dynamic.literal()
    if (vmId != null) __obj.updateDynamic("vmId")(vmId)
    if (vmManagerId != null) __obj.updateDynamic("vmManagerId")(vmManagerId)
    __obj.asInstanceOf[VmServerAddress]
  }
}

