package typings.aliApp.my

import typings.aliApp.PartialChooseCityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.chooseCity")
@js.native
object chooseCity extends js.Object {
  /**
  	 * 打开城市选择列表
  	 *
  	 * 如果用户没有选择任何城市直接点击了返回，将不会触发回调函数。
  	 */
  def apply(options: PartialChooseCityOptions): Unit = js.native
}

