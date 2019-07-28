package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DismissText extends js.Object {
  /** 取消 */
  var dismissText: String
  /** 请选择 */
  var extra: String
  /** 确定 */
  var okText: String
}

object Anon_DismissText {
  @scala.inline
  def apply(dismissText: String, extra: String, okText: String): Anon_DismissText = {
    val __obj = js.Dynamic.literal(dismissText = dismissText, extra = extra, okText = okText)
  
    __obj.asInstanceOf[Anon_DismissText]
  }
}

