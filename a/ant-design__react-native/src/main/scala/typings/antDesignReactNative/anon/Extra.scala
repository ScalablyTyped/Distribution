package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extra extends js.Object {
  /** 取消 */
  var dismissText: String
  /** 请选择 */
  var extra: String
  /** 确定 */
  var okText: String
}

object Extra {
  @scala.inline
  def apply(dismissText: String, extra: String, okText: String): Extra = {
    val __obj = js.Dynamic.literal(dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extra]
  }
}

