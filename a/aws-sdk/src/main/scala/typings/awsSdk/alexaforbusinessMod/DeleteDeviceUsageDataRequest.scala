package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDeviceUsageDataRequest extends js.Object {
  
  /**
    * The ARN of the device.
    */
  var DeviceArn: Arn = js.native
  
  /**
    * The type of usage data to delete.
    */
  var DeviceUsageType: typings.awsSdk.alexaforbusinessMod.DeviceUsageType = js.native
}
object DeleteDeviceUsageDataRequest {
  
  @scala.inline
  def apply(DeviceArn: Arn, DeviceUsageType: DeviceUsageType): DeleteDeviceUsageDataRequest = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn.asInstanceOf[js.Any], DeviceUsageType = DeviceUsageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeviceUsageDataRequest]
  }
  
  @scala.inline
  implicit class DeleteDeviceUsageDataRequestOps[Self <: DeleteDeviceUsageDataRequest] (val x: Self) extends AnyVal {
    
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
    def setDeviceArn(value: Arn): Self = this.set("DeviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUsageType(value: DeviceUsageType): Self = this.set("DeviceUsageType", value.asInstanceOf[js.Any])
  }
}
