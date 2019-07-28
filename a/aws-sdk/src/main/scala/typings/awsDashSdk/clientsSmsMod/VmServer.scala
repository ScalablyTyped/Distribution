package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VmServer extends js.Object {
  /**
    * The name of the VM manager.
    */
  var vmManagerName: js.UndefOr[VmManagerName] = js.undefined
  /**
    * The type of VM management product.
    */
  var vmManagerType: js.UndefOr[VmManagerType] = js.undefined
  /**
    * The name of the VM.
    */
  var vmName: js.UndefOr[VmName] = js.undefined
  /**
    * The VM folder path in the vCenter Server virtual machine inventory tree.
    */
  var vmPath: js.UndefOr[VmPath] = js.undefined
  /**
    * Information about the VM server location.
    */
  var vmServerAddress: js.UndefOr[VmServerAddress] = js.undefined
}

object VmServer {
  @scala.inline
  def apply(
    vmManagerName: VmManagerName = null,
    vmManagerType: VmManagerType = null,
    vmName: VmName = null,
    vmPath: VmPath = null,
    vmServerAddress: VmServerAddress = null
  ): VmServer = {
    val __obj = js.Dynamic.literal()
    if (vmManagerName != null) __obj.updateDynamic("vmManagerName")(vmManagerName)
    if (vmManagerType != null) __obj.updateDynamic("vmManagerType")(vmManagerType.asInstanceOf[js.Any])
    if (vmName != null) __obj.updateDynamic("vmName")(vmName)
    if (vmPath != null) __obj.updateDynamic("vmPath")(vmPath)
    if (vmServerAddress != null) __obj.updateDynamic("vmServerAddress")(vmServerAddress)
    __obj.asInstanceOf[VmServer]
  }
}

