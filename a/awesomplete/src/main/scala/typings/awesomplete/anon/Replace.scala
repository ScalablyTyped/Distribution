package typings.awesomplete.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Replace extends js.Object {
  def replace(arg0: RegExp, arg1: String): Unit
}

object Replace {
  @scala.inline
  def apply(replace: (RegExp, String) => Unit): Replace = {
    val __obj = js.Dynamic.literal(replace = js.Any.fromFunction2(replace))
    __obj.asInstanceOf[Replace]
  }
}

