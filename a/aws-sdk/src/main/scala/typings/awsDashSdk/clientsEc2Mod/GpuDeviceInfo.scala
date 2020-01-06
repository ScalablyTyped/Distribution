package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GpuDeviceInfo extends js.Object {
  /**
    * The number of GPUs for the instance type.
    */
  var Count: js.UndefOr[GpuDeviceCount] = js.native
  /**
    * The manufacturer of the GPU accelerator.
    */
  var Manufacturer: js.UndefOr[GpuDeviceManufacturerName] = js.native
  /**
    * Describes the memory available to the GPU accelerator.
    */
  var MemoryInfo: js.UndefOr[GpuDeviceMemoryInfo] = js.native
  /**
    * The name of the GPU accelerator.
    */
  var Name: js.UndefOr[GpuDeviceName] = js.native
}

object GpuDeviceInfo {
  @scala.inline
  def apply(
    Count: Int | scala.Double = null,
    Manufacturer: GpuDeviceManufacturerName = null,
    MemoryInfo: GpuDeviceMemoryInfo = null,
    Name: GpuDeviceName = null
  ): GpuDeviceInfo = {
    val __obj = js.Dynamic.literal()
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (Manufacturer != null) __obj.updateDynamic("Manufacturer")(Manufacturer.asInstanceOf[js.Any])
    if (MemoryInfo != null) __obj.updateDynamic("MemoryInfo")(MemoryInfo.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GpuDeviceInfo]
  }
}

