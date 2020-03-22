package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtra extends js.Object {
  /** 取消 */
  var dismissText: String
  /** 请选择 */
  var extra: String
  /** 确定 */
  var okText: String
}

object AnonExtra {
  @scala.inline
  def apply(dismissText: String, extra: String, okText: String): AnonExtra = {
    val __obj = js.Dynamic.literal(dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExtra]
  }
}

