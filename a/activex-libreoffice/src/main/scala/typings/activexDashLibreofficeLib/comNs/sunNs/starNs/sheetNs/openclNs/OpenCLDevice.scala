package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.openclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenCLDevice extends js.Object {
  /** The driver version as returned by OpenCL */
  var Driver: java.lang.String
  /** The name of the device as returned by OpenCL */
  var Name: java.lang.String
  /** The vendor of the device as returned by OpenCL */
  var Vendor: java.lang.String
}

object OpenCLDevice {
  @scala.inline
  def apply(Driver: java.lang.String, Name: java.lang.String, Vendor: java.lang.String): OpenCLDevice = {
    val __obj = js.Dynamic.literal(Driver = Driver, Name = Name, Vendor = Vendor)
  
    __obj.asInstanceOf[OpenCLDevice]
  }
}

