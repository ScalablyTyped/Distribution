package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.readBLECharacteristicValue")
@js.native
object readBLECharacteristicValue extends js.Object {
  /**
  	 * 读取低功耗蓝牙设备特征值中的数据。调用后在 my.onBLECharacteristicValueChange() 事件中接收数据返回。
  	 */
  def apply(options: ReadBLECharacteristicValueOptions): Unit = js.native
}

