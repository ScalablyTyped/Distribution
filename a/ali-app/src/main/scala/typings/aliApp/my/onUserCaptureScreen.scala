package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.onUserCaptureScreen")
@js.native
object onUserCaptureScreen extends js.Object {
  //#endregion
  //#region 用户截屏事件 https://docs.alipay.com/mini/api/user-capture-screen
  /**
  	 * 监听用户主动截屏事件，用户使用系统截屏按键截屏时触发此事件
  	 */
  def apply(): Unit = js.native
  def apply(callback: js.Function1[/* res */ js.Any, Unit]): Unit = js.native
}

