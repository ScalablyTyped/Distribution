package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterAVSDeviceResponse extends js.Object {
  /**
    * The ARN of the device.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
}

object RegisterAVSDeviceResponse {
  @scala.inline
  def apply(): RegisterAVSDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterAVSDeviceResponse]
  }
  @scala.inline
  implicit class RegisterAVSDeviceResponseOps[Self <: RegisterAVSDeviceResponse] (val x: Self) extends AnyVal {
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
    def deleteDeviceArn: Self = this.set("DeviceArn", js.undefined)
  }
  
}

