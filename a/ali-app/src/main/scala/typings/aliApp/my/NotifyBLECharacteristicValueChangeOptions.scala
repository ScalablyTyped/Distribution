package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyBLECharacteristicValueChangeOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 蓝牙特征值的 uuid
    */
  var characteristicId: String = js.native
  /**
    * notify 的 descriptor 的 uuid （只有android 会用到，非必填，默认值00002902-0000-10008000-00805f9b34fb）
    */
  var descriptorId: js.UndefOr[String] = js.native
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String = js.native
  /**
    * 蓝牙特征值对应 service 的 uuid
    */
  var serviceId: String = js.native
  /**
    * 是否启用notify或indicate
    */
  var state: js.UndefOr[Boolean] = js.native
}

object NotifyBLECharacteristicValueChangeOptions {
  @scala.inline
  def apply(characteristicId: String, deviceId: String, serviceId: String): NotifyBLECharacteristicValueChangeOptions = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyBLECharacteristicValueChangeOptions]
  }
  @scala.inline
  implicit class NotifyBLECharacteristicValueChangeOptionsOps[Self <: NotifyBLECharacteristicValueChangeOptions] (val x: Self) extends AnyVal {
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
    def setCharacteristicId(value: String): Self = this.set("characteristicId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescriptorId(value: String): Self = this.set("descriptorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptorId: Self = this.set("descriptorId", js.undefined)
    @scala.inline
    def setState(value: Boolean): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

