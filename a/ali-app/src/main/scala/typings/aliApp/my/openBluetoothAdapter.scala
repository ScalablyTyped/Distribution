package typings.aliApp.my

import typings.aliApp.PartialOpenBluetoothAdapt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.openBluetoothAdapter")
@js.native
object openBluetoothAdapter extends js.Object {
  /**
  	 * 初始化小程序蓝牙模块，生效周期为调用 my.openBluetoothAdapter 至调用 my.closeBluetoothAdapter 或小程序被销毁为止。 在小程序蓝牙适配器模块生效期间，开发者可以正常调用下面的小程序API，并会收到蓝牙模块相关的 on 事件回调。
  	 */
  def apply(options: PartialOpenBluetoothAdapt): Unit = js.native
}

