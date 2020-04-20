package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClosed extends js.Object {
  var closed: Boolean
  var closing: Boolean
}

object AnonClosed {
  @scala.inline
  def apply(closed: Boolean, closing: Boolean): AnonClosed = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClosed]
  }
}

