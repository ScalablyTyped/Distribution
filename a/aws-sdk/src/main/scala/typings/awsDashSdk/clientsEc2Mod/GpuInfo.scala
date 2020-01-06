package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GpuInfo extends js.Object {
  /**
    * Describes the GPU accelerators for the instance type.
    */
  var Gpus: js.UndefOr[GpuDeviceInfoList] = js.native
  /**
    * The total size of the memory for the GPU accelerators for the instance type.
    */
  var TotalGpuMemoryInMiB: js.UndefOr[totalGpuMemory] = js.native
}

object GpuInfo {
  @scala.inline
  def apply(Gpus: GpuDeviceInfoList = null, TotalGpuMemoryInMiB: Int | scala.Double = null): GpuInfo = {
    val __obj = js.Dynamic.literal()
    if (Gpus != null) __obj.updateDynamic("Gpus")(Gpus.asInstanceOf[js.Any])
    if (TotalGpuMemoryInMiB != null) __obj.updateDynamic("TotalGpuMemoryInMiB")(TotalGpuMemoryInMiB.asInstanceOf[js.Any])
    __obj.asInstanceOf[GpuInfo]
  }
}

