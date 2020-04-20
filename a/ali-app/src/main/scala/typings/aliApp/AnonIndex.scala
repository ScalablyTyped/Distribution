package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  /**
  			 * 用户点击的按钮，从上到下的顺序，从0开始
  			 */
  var index: Double
}

object AnonIndex {
  @scala.inline
  def apply(index: Double): AnonIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex]
  }
}

