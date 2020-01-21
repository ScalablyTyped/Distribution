package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.notifyBLECharacteristicValueChanged")
@js.native
object notifyBLECharacteristicValueChanged extends js.Object {
  /**
  	 * 启用低功耗蓝牙设备特征值变化时的 notify 功能。注意：设备的特征值必须支持 notify/indicate 才可以成功调用，具体参照 characteristic 的 properties 属性 另外，必须先启用 notify 才能监听到设备 characteristicValueChange 事件。
  	 */
  def apply(options: NotifyBLECharacteristicValueChangedOptions): Unit = js.native
}

