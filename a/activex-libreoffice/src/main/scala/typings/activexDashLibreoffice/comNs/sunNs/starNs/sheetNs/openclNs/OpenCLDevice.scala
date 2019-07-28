package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs.openclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenCLDevice extends js.Object {
  /** The driver version as returned by OpenCL */
  var Driver: String
  /** The name of the device as returned by OpenCL */
  var Name: String
  /** The vendor of the device as returned by OpenCL */
  var Vendor: String
}

object OpenCLDevice {
  @scala.inline
  def apply(Driver: String, Name: String, Vendor: String): OpenCLDevice = {
    val __obj = js.Dynamic.literal(Driver = Driver, Name = Name, Vendor = Vendor)
  
    __obj.asInstanceOf[OpenCLDevice]
  }
}

