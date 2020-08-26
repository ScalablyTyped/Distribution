package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceStatusDetail extends js.Object {
  /**
    * The device status detail code.
    */
  var Code: js.UndefOr[DeviceStatusDetailCode] = js.native
  /**
    * The list of available features on the device.
    */
  var Feature: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Feature] = js.native
}

object DeviceStatusDetail {
  @scala.inline
  def apply(): DeviceStatusDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceStatusDetail]
  }
  @scala.inline
  implicit class DeviceStatusDetailOps[Self <: DeviceStatusDetail] (val x: Self) extends AnyVal {
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
    def setCode(value: DeviceStatusDetailCode): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    @scala.inline
    def setFeature(value: Feature): Self = this.set("Feature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeature: Self = this.set("Feature", js.undefined)
  }
  
}

