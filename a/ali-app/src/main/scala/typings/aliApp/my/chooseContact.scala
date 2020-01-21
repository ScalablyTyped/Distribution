package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.chooseContact")
@js.native
object chooseContact extends js.Object {
  /**
  	 * 唤起选人组件，默认只包含支付宝联系人，可以通过修改参数包含手机通讯录联系人或者双向通讯录联系人。
  	 */
  def apply(options: ChooseContactOptions): Unit = js.native
}

