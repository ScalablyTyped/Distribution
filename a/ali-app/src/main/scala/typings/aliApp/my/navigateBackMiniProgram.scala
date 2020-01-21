package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.navigateBackMiniProgram")
@js.native
object navigateBackMiniProgram extends js.Object {
  /**
  	 * 跳转回上一个小程序，只有当另一个小程序跳转到当前小程序时才会能调用成功
  	 */
  def apply(options: NavigateBackMiniProgramOptions): Unit = js.native
}

