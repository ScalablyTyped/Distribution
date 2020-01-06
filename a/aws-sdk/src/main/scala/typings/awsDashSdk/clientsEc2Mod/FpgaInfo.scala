package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FpgaInfo extends js.Object {
  /**
    * Describes the FPGAs for the instance type.
    */
  var Fpgas: js.UndefOr[FpgaDeviceInfoList] = js.native
  /**
    * The total memory of all FPGA accelerators for the instance type.
    */
  var TotalFpgaMemoryInMiB: js.UndefOr[totalFpgaMemory] = js.native
}

object FpgaInfo {
  @scala.inline
  def apply(Fpgas: FpgaDeviceInfoList = null, TotalFpgaMemoryInMiB: Int | scala.Double = null): FpgaInfo = {
    val __obj = js.Dynamic.literal()
    if (Fpgas != null) __obj.updateDynamic("Fpgas")(Fpgas.asInstanceOf[js.Any])
    if (TotalFpgaMemoryInMiB != null) __obj.updateDynamic("TotalFpgaMemoryInMiB")(TotalFpgaMemoryInMiB.asInstanceOf[js.Any])
    __obj.asInstanceOf[FpgaInfo]
  }
}

