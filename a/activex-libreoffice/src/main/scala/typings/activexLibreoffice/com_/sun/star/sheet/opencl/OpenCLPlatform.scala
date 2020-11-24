package typings.activexLibreoffice.com_.sun.star.sheet.opencl

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenCLPlatform extends js.Object {
  
  var Devices: SafeArray[OpenCLDevice] = js.native
  
  /** The name of the platform as returned by OpenCL */
  var Name: String = js.native
  
  var Vendor: String = js.native
}
object OpenCLPlatform {
  
  @scala.inline
  def apply(Devices: SafeArray[OpenCLDevice], Name: String, Vendor: String): OpenCLPlatform = {
    val __obj = js.Dynamic.literal(Devices = Devices.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Vendor = Vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCLPlatform]
  }
  
  @scala.inline
  implicit class OpenCLPlatformOps[Self <: OpenCLPlatform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDevices(value: SafeArray[OpenCLDevice]): Self = this.set("Devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor(value: String): Self = this.set("Vendor", value.asInstanceOf[js.Any])
  }
}
