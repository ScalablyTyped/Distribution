package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.navigateBack")
@js.native
object navigateBack extends js.Object {
  /**
  	 * 关闭当前页面，返回上一级或多级页面。可通过 getCurrentPages 获取当前的页面栈信息，决定需要返回几层。
  	 */
  def apply(): Unit = js.native
  def apply(options: NavigateBackOptions): Unit = js.native
}

