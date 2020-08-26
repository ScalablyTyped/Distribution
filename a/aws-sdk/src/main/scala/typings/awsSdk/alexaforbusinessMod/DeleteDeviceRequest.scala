package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeviceRequest extends js.Object {
  /**
    * The ARN of the device for which to request details.
    */
  var DeviceArn: Arn = js.native
}

object DeleteDeviceRequest {
  @scala.inline
  def apply(DeviceArn: Arn): DeleteDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeviceRequest]
  }
  @scala.inline
  implicit class DeleteDeviceRequestOps[Self <: DeleteDeviceRequest] (val x: Self) extends AnyVal {
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
  }
  
}

