package typings.activexLibreoffice.com_.sun.star.sheet.opencl

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
    val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Vendor = Vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCLDevice]
  }
}

