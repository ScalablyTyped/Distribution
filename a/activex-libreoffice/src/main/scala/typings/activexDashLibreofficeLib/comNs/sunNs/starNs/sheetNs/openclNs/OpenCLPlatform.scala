package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.openclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenCLPlatform extends js.Object {
  var Devices: activexDashInteropLib.SafeArray[OpenCLDevice]
  /** The name of the platform as returned by OpenCL */
  var Name: java.lang.String
  var Vendor: java.lang.String
}

object OpenCLPlatform {
  @scala.inline
  def apply(
    Devices: activexDashInteropLib.SafeArray[OpenCLDevice],
    Name: java.lang.String,
    Vendor: java.lang.String
  ): OpenCLPlatform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Devices")(Devices)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Vendor")(Vendor)
    __obj.asInstanceOf[OpenCLPlatform]
  }
}

