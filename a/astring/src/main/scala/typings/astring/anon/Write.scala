package typings.astring.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Write extends js.Object {
  def write(s: String): Unit
}

object Write {
  @scala.inline
  def apply(write: String => Unit): Write = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Write]
  }
}

