package typings.activexLibreoffice.com_.sun.star.sheet.opencl

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
    val __obj = js.Dynamic.literal(Devices = Devices.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Vendor = Vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCLPlatform]
  }
}

