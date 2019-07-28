package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs.openclNs

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenCLPlatform extends js.Object {
  var Devices: SafeArray[OpenCLDevice]
  /** The name of the platform as returned by OpenCL */
  var Name: String
  var Vendor: String
}

object OpenCLPlatform {
  @scala.inline
  def apply(Devices: SafeArray[OpenCLDevice], Name: String, Vendor: String): OpenCLPlatform = {
    val __obj = js.Dynamic.literal(Devices = Devices, Name = Name, Vendor = Vendor)
  
    __obj.asInstanceOf[OpenCLPlatform]
  }
}

