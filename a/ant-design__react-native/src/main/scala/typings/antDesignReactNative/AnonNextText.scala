package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNextText extends js.Object {
  /** 下一页 */
  var nextText: String
  /** 上一页 */
  var prevText: String
}

object AnonNextText {
  @scala.inline
  def apply(nextText: String, prevText: String): AnonNextText = {
    val __obj = js.Dynamic.literal(nextText = nextText.asInstanceOf[js.Any], prevText = prevText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNextText]
  }
}

