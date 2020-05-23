package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Closed extends js.Object {
  var closed: Boolean
  var closing: Boolean
}

object Closed {
  @scala.inline
  def apply(closed: Boolean, closing: Boolean): Closed = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closed]
  }
}

